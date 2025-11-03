package com.fintrack.service.transaction;

import com.fintrack.domain.account.Account;
import com.fintrack.domain.category.Category;
import com.fintrack.domain.transaction.Transaction;
import com.fintrack.domain.user.User;
import com.fintrack.persistence.account.AccountRepository;
import com.fintrack.persistence.category.CategoryRepository;
import com.fintrack.persistence.transaction.TransactionRepository;
import com.fintrack.service.auth.AuthService;
import com.fintrack.web.dto.transaction.TransactionRequest;
import com.fintrack.web.dto.transaction.TransactionResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
@Transactional
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;
    private final CategoryRepository categoryRepository;
    private final AuthService authService;

    public TransactionService(TransactionRepository transactionRepository,
                              AccountRepository accountRepository,
                              CategoryRepository categoryRepository,
                              AuthService authService) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
        this.categoryRepository = categoryRepository;
        this.authService = authService;
    }

    public TransactionResponse createTransaction(TransactionRequest request) {
        User currentUser = authService.getCurrentUser();

        Account account = accountRepository.findByIdAndUserId(request.getAccountId(), currentUser.getId())
                .orElseThrow(() -> new RuntimeException("Account not found"));

        Category category = null;
        if (request.getCategoryId() != null) {
            category = categoryRepository.findById(request.getCategoryId())
                    .orElseThrow(() -> new RuntimeException("Category not found"));
            // Verify category belongs to user or is system category
            if (!category.isSystem() && category.getUser() != null && !category.getUser().getId().equals(currentUser.getId())) {
                throw new RuntimeException("Category not found");
            }
        }

        // Validate that expense transactions don't make balance negative
        if (request.getType() == Transaction.TransactionType.EXPENSE) {
            BigDecimal newBalance = account.getBalance().subtract(request.getAmount());
            if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
                throw new RuntimeException("Insufficient funds in account: " + account.getName() +
                        ". Current balance: " + account.getBalance() +
                        ", attempted expense: " + request.getAmount());
            }
        }

        Transaction transaction = new Transaction();
        transaction.setUser(currentUser);
        transaction.setAccount(account);
        transaction.setCategory(category);
        transaction.setAmount(request.getAmount());
        transaction.setDescription(request.getDescription());
        transaction.setType(request.getType());
        transaction.setTransactionDate(request.getTransactionDate());

        // Update account balance
        updateAccountBalance(account, request.getAmount(), request.getType());

        Transaction savedTransaction = transactionRepository.save(transaction);
        return mapToResponse(savedTransaction);
    }

    @Transactional(readOnly = true)
    public Page<TransactionResponse> getTransactions(Pageable pageable) {
        User currentUser = authService.getCurrentUser();
        Page<Transaction> transactions = transactionRepository.findByUserIdOrderByTransactionDateDesc(currentUser.getId(), pageable);
        return transactions.map(this::mapToResponse);
    }

    @Transactional(readOnly = true)
    public Page<TransactionResponse> getTransactionsWithFilters(Long accountId, Long categoryId,
                                                                Transaction.TransactionType type,
                                                                LocalDate startDate, LocalDate endDate,
                                                                Pageable pageable) {
        User currentUser = authService.getCurrentUser();

        if (startDate == null) {
            startDate = LocalDate.now().minusMonths(1);
        }
        if (endDate == null) {
            endDate = LocalDate.now();
        }

        Page<Transaction> transactions = transactionRepository.findByUserIdAndFilters(
                currentUser.getId(), accountId, categoryId, type, startDate, endDate, pageable);

        return transactions.map(this::mapToResponse);
    }

    @Transactional(readOnly = true)
    public TransactionResponse getTransaction(Long id) {
        User currentUser = authService.getCurrentUser();

        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        if (!transaction.getUser().getId().equals(currentUser.getId())) {
            throw new RuntimeException("Transaction not found");
        }

        return mapToResponse(transaction);
    }

    public TransactionResponse updateTransaction(Long id, TransactionRequest request) {
        User currentUser = authService.getCurrentUser();

        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        if (!transaction.getUser().getId().equals(currentUser.getId())) {
            throw new RuntimeException("Transaction not found");
        }

        // Revert old transaction amount from account
        updateAccountBalance(transaction.getAccount(), transaction.getAmount(),
                reverseTransactionType(transaction.getType()));

        // Update transaction details
        Account account = accountRepository.findByIdAndUserId(request.getAccountId(), currentUser.getId())
                .orElseThrow(() -> new RuntimeException("Account not found"));

        Category category = null;
        if (request.getCategoryId() != null) {
            category = categoryRepository.findById(request.getCategoryId())
                    .orElseThrow(() -> new RuntimeException("Category not found"));
            // Verify category belongs to user or is system category
            if (!category.isSystem() && category.getUser() != null && !category.getUser().getId().equals(currentUser.getId())) {
                throw new RuntimeException("Category not found");
            }
        }

        // Validate that expense transactions don't make balance negative
        if (request.getType() == Transaction.TransactionType.EXPENSE) {
            BigDecimal newBalance = account.getBalance().subtract(request.getAmount());
            if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
                throw new RuntimeException("Insufficient funds in account: " + account.getName() +
                        ". Current balance: " + account.getBalance() +
                        ", attempted expense: " + request.getAmount());
            }
        }

        transaction.setAccount(account);
        transaction.setCategory(category);
        transaction.setAmount(request.getAmount());
        transaction.setDescription(request.getDescription());
        transaction.setType(request.getType());
        transaction.setTransactionDate(request.getTransactionDate());

        // Apply new transaction amount to account
        updateAccountBalance(account, request.getAmount(), request.getType());

        Transaction updatedTransaction = transactionRepository.save(transaction);
        return mapToResponse(updatedTransaction);
    }

    public void deleteTransaction(Long id) {
        User currentUser = authService.getCurrentUser();

        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        if (!transaction.getUser().getId().equals(currentUser.getId())) {
            throw new RuntimeException("Transaction not found");
        }

        // Revert transaction amount from account
        updateAccountBalance(transaction.getAccount(), transaction.getAmount(),
                reverseTransactionType(transaction.getType()));

        transactionRepository.delete(transaction);
    }

    @Transactional(readOnly = true)
    public BigDecimal getTotalIncome(LocalDate startDate, LocalDate endDate) {
        User currentUser = authService.getCurrentUser();
        return transactionRepository.getTotalIncomeForPeriod(currentUser.getId(), startDate, endDate);
    }

    @Transactional(readOnly = true)
    public BigDecimal getTotalExpenses(LocalDate startDate, LocalDate endDate) {
        User currentUser = authService.getCurrentUser();
        return transactionRepository.getTotalExpensesForPeriod(currentUser.getId(), startDate, endDate);
    }

    private void updateAccountBalance(Account account, BigDecimal amount, Transaction.TransactionType type) {
        BigDecimal newBalance;
        if (type == Transaction.TransactionType.INCOME) {
            newBalance = account.getBalance().add(amount);
        } else {
            newBalance = account.getBalance().subtract(amount);

            // Additional safety check - should never be negative due to validation above
            if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
                throw new RuntimeException("Insufficient funds. This should not happen due to prior validation.");
            }
        }
        account.setBalance(newBalance);
        accountRepository.save(account);
    }

    private Transaction.TransactionType reverseTransactionType(Transaction.TransactionType type) {
        return type == Transaction.TransactionType.INCOME ?
                Transaction.TransactionType.EXPENSE : Transaction.TransactionType.INCOME;
    }

    private TransactionResponse mapToResponse(Transaction transaction) {
        String categoryName = null;
        String categoryColor = null;
        if (transaction.getCategory() != null) {
            categoryName = transaction.getCategory().getName();
            categoryColor = transaction.getCategory().getColor();
        }

        return new TransactionResponse(
                transaction.getId(),
                transaction.getAccount().getId(),
                transaction.getAccount().getName(),
                transaction.getCategory() != null ? transaction.getCategory().getId() : null,
                categoryName,
                categoryColor,
                transaction.getAmount(),
                transaction.getDescription(),
                transaction.getType(),
                transaction.getTransactionDate(),
                transaction.getCreatedAt(),
                transaction.getUpdatedAt()
        );
    }
}