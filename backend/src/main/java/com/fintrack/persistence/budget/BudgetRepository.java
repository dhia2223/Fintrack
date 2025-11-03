package com.fintrack.persistence.budget;

import com.fintrack.domain.budget.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {

    List<Budget> findByUserIdAndMonthOrderByCategoryName(Long userId, LocalDate month);

    Optional<Budget> findByUserIdAndCategoryIdAndMonth(Long userId, Long categoryId, LocalDate month);

    // Fixed query - removed the incorrect method
    List<Budget> findByUserIdAndMonth(Long userId, LocalDate month);

    boolean existsByUserIdAndCategoryIdAndMonth(Long userId, Long categoryId, LocalDate month);

    @Query("SELECT COALESCE(SUM(b.amount), 0) FROM Budget b WHERE b.user.id = :userId AND b.month = :month")
    BigDecimal getTotalBudgetForMonth(@Param("userId") Long userId, @Param("month") LocalDate month);
}