package com.fintrack.service.account;

import com.fintrack.domain.account.Account;
import com.fintrack.domain.user.User;
import com.fintrack.persistence.account.AccountRepository;
import com.fintrack.service.auth.AuthService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class AccountService {

    private final AccountRepository accountRepository;
    private final AuthService authService;

    public AccountService(AccountRepository accountRepository, AuthService authService) {
        this.accountRepository = accountRepository;
        this.authService = authService;
    }

    @Transactional(readOnly = true)
    public List<Account> getUserAccounts() {
        User currentUser = authService.getCurrentUser();
        return accountRepository.findByUserIdAndActiveTrueOrderByName(currentUser.getId());
    }

    @Transactional(readOnly = true)
    public Account getAccount(Long id) {
        User currentUser = authService.getCurrentUser();
        return accountRepository.findByIdAndUserId(id, currentUser.getId())
                .orElseThrow(() -> new RuntimeException("Account not found"));
    }

    @Transactional(readOnly = true)
    public BigDecimal getTotalBalance() {
        User currentUser = authService.getCurrentUser();
        return accountRepository.getTotalBalanceByUserId(currentUser.getId());
    }

    public Account createAccount(String name, Account.AccountType type, BigDecimal initialBalance, String currency) {
        User currentUser = authService.getCurrentUser();

        Account account = new Account(currentUser, name, type, initialBalance, currency);
        return accountRepository.save(account);
    }

    public Account updateAccount(Long id, String name, boolean active) {
        User currentUser = authService.getCurrentUser();

        Account account = accountRepository.findByIdAndUserId(id, currentUser.getId())
                .orElseThrow(() -> new RuntimeException("Account not found"));

        account.setName(name);
        account.setActive(active);

        return accountRepository.save(account);
    }

    public void deleteAccount(Long id) {
        User currentUser = authService.getCurrentUser();

        Account account = accountRepository.findByIdAndUserId(id, currentUser.getId())
                .orElseThrow(() -> new RuntimeException("Account not found"));

        account.setActive(false);
        accountRepository.save(account);
    }
}