package com.fintrack.web.dto.budget;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BudgetResponse {

    private Long id;
    private Long categoryId;
    private String categoryName;
    private String categoryColor;
    private BigDecimal amount;
    private LocalDate month;
    private BigDecimal spentAmount;
    private BigDecimal remainingAmount;
    private Double percentageUsed;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Constructors
    public BudgetResponse() {}

    public BudgetResponse(Long id, Long categoryId, String categoryName, String categoryColor,
                          BigDecimal amount, LocalDate month, BigDecimal spentAmount,
                          LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryColor = categoryColor;
        this.amount = amount;
        this.month = month;
        this.spentAmount = spentAmount != null ? spentAmount : BigDecimal.ZERO;
        this.remainingAmount = amount.subtract(this.spentAmount);
        this.percentageUsed = amount.compareTo(BigDecimal.ZERO) > 0 ?
                this.spentAmount.divide(amount, 4, java.math.RoundingMode.HALF_UP).doubleValue() * 100 : 0.0;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getCategoryId() { return categoryId; }
    public void setCategoryId(Long categoryId) { this.categoryId = categoryId; }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }

    public String getCategoryColor() { return categoryColor; }
    public void setCategoryColor(String categoryColor) { this.categoryColor = categoryColor; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public LocalDate getMonth() { return month; }
    public void setMonth(LocalDate month) { this.month = month; }

    public BigDecimal getSpentAmount() { return spentAmount; }
    public void setSpentAmount(BigDecimal spentAmount) { this.spentAmount = spentAmount; }

    public BigDecimal getRemainingAmount() { return remainingAmount; }
    public void setRemainingAmount(BigDecimal remainingAmount) { this.remainingAmount = remainingAmount; }

    public Double getPercentageUsed() { return percentageUsed; }
    public void setPercentageUsed(Double percentageUsed) { this.percentageUsed = percentageUsed; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}