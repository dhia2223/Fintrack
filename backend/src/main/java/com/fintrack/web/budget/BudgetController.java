package com.fintrack.web.budget;

import com.fintrack.domain.budget.Budget;
import com.fintrack.service.budget.BudgetService;
import com.fintrack.web.dto.budget.BudgetRequest;
import com.fintrack.web.dto.budget.BudgetResponse;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/budgets")
public class BudgetController {

    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping
    public ResponseEntity<List<BudgetResponse>> getBudgets(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate month) {

        if (month == null) {
            month = LocalDate.now().withDayOfMonth(1); 
        }

        List<Budget> budgets = budgetService.getUserBudgetsForMonth(month);

        List<BudgetResponse> responses = budgets.stream()
                .map(budget -> new BudgetResponse(
                        budget.getId(),
                        budget.getCategory().getId(),
                        budget.getCategory().getName(),
                        budget.getCategory().getColor(),
                        budget.getAmount(),
                        budget.getMonth(),
                        BigDecimal.ZERO, 
                        budget.getCreatedAt(),
                        budget.getUpdatedAt()
                ))
                .collect(Collectors.toList());

        return ResponseEntity.ok(responses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BudgetResponse> getBudget(@PathVariable Long id) {
        Budget budget = budgetService.getBudget(id);

        BudgetResponse response = new BudgetResponse(
                budget.getId(),
                budget.getCategory().getId(),
                budget.getCategory().getName(),
                budget.getCategory().getColor(),
                budget.getAmount(),
                budget.getMonth(),
                BigDecimal.ZERO, 
                budget.getCreatedAt(),
                budget.getUpdatedAt()
        );

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<BudgetResponse> createBudget(@Valid @RequestBody BudgetRequest request) {
        Budget budget = budgetService.createBudget(request.getCategoryId(), request.getAmount(), request.getMonth());

        BudgetResponse response = new BudgetResponse(
                budget.getId(),
                budget.getCategory().getId(),
                budget.getCategory().getName(),
                budget.getCategory().getColor(),
                budget.getAmount(),
                budget.getMonth(),
                BigDecimal.ZERO, 
                budget.getCreatedAt(),
                budget.getUpdatedAt()
        );

        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BudgetResponse> updateBudget(
            @PathVariable Long id,
            @RequestParam BigDecimal amount) {

        Budget budget = budgetService.updateBudget(id, amount);

        BudgetResponse response = new BudgetResponse(
                budget.getId(),
                budget.getCategory().getId(),
                budget.getCategory().getName(),
                budget.getCategory().getColor(),
                budget.getAmount(),
                budget.getMonth(),
                BigDecimal.ZERO, 
                budget.getCreatedAt(),
                budget.getUpdatedAt()
        );

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBudget(@PathVariable Long id) {
        budgetService.deleteBudget(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/total")
    public ResponseEntity<BigDecimal> getTotalBudgetForMonth(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate month) {

        if (month == null) {
            month = LocalDate.now().withDayOfMonth(1);
        }

        BigDecimal total = budgetService.getTotalBudgetForMonth(month);
        return ResponseEntity.ok(total);
    }
}