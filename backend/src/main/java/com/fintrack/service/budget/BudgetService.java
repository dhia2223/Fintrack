package com.fintrack.service.budget;

import com.fintrack.domain.budget.Budget;
import com.fintrack.domain.category.Category;
import com.fintrack.domain.user.User;
import com.fintrack.persistence.budget.BudgetRepository;
import com.fintrack.persistence.category.CategoryRepository;
import com.fintrack.service.auth.AuthService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class BudgetService {

    private final BudgetRepository budgetRepository;
    private final CategoryRepository categoryRepository;
    private final AuthService authService;

    public BudgetService(BudgetRepository budgetRepository,
                         CategoryRepository categoryRepository,
                         AuthService authService) {
        this.budgetRepository = budgetRepository;
        this.categoryRepository = categoryRepository;
        this.authService = authService;
    }

    @Transactional(readOnly = true)
    public List<Budget> getUserBudgetsForMonth(LocalDate month) {
        User currentUser = authService.getCurrentUser();
        return budgetRepository.findByUserIdAndMonth(currentUser.getId(), month);
    }

    @Transactional(readOnly = true)
    public Budget getBudget(Long id) {
        User currentUser = authService.getCurrentUser();
        return budgetRepository.findById(id)
                .filter(budget -> budget.getUser().getId().equals(currentUser.getId()))
                .orElseThrow(() -> new RuntimeException("Budget not found"));
    }

    public Budget createBudget(Long categoryId, BigDecimal amount, LocalDate month) {
        User currentUser = authService.getCurrentUser();

        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        // Verify category belongs to user or is system category
        if (!category.isSystem() && category.getUser() != null && !category.getUser().getId().equals(currentUser.getId())) {
            throw new RuntimeException("Category not found");
        }

        // Check if budget already exists for this category and month
        if (budgetRepository.existsByUserIdAndCategoryIdAndMonth(currentUser.getId(), categoryId, month)) {
            throw new RuntimeException("Budget already exists for this category and month");
        }

        Budget budget = new Budget(currentUser, category, amount, month);
        return budgetRepository.save(budget);
    }

    public Budget updateBudget(Long id, BigDecimal amount) {
        User currentUser = authService.getCurrentUser();

        Budget budget = budgetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Budget not found"));

        if (!budget.getUser().getId().equals(currentUser.getId())) {
            throw new RuntimeException("Budget not found");
        }

        budget.setAmount(amount);
        return budgetRepository.save(budget);
    }

    public void deleteBudget(Long id) {
        User currentUser = authService.getCurrentUser();

        Budget budget = budgetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Budget not found"));

        if (!budget.getUser().getId().equals(currentUser.getId())) {
            throw new RuntimeException("Budget not found");
        }

        budgetRepository.delete(budget);
    }

    @Transactional(readOnly = true)
    public BigDecimal getTotalBudgetForMonth(LocalDate month) {
        User currentUser = authService.getCurrentUser();
        return budgetRepository.getTotalBudgetForMonth(currentUser.getId(), month);
    }
}