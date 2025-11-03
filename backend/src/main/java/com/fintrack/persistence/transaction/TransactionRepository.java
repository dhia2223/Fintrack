package com.fintrack.persistence.transaction;

import com.fintrack.domain.transaction.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Page<Transaction> findByUserIdOrderByTransactionDateDesc(Long userId, Pageable pageable);

    List<Transaction> findByUserIdAndTransactionDateBetweenOrderByTransactionDateDesc(
            Long userId, LocalDate startDate, LocalDate endDate);

    @Query("SELECT t FROM Transaction t WHERE t.user.id = :userId AND " +
            "(:accountId IS NULL OR t.account.id = :accountId) AND " +
            "(:categoryId IS NULL OR t.category.id = :categoryId) AND " +
            "(:type IS NULL OR t.type = :type) AND " +
            "t.transactionDate BETWEEN :startDate AND :endDate " +
            "ORDER BY t.transactionDate DESC")
    Page<Transaction> findByUserIdAndFilters(
            @Param("userId") Long userId,
            @Param("accountId") Long accountId,
            @Param("categoryId") Long categoryId,
            @Param("type") Transaction.TransactionType type,
            @Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate,
            Pageable pageable);

    @Query("SELECT COALESCE(SUM(t.amount), 0) FROM Transaction t WHERE " +
            "t.user.id = :userId AND t.type = 'INCOME' AND " +
            "t.transactionDate BETWEEN :startDate AND :endDate")
    BigDecimal getTotalIncomeForPeriod(@Param("userId") Long userId,
                                       @Param("startDate") LocalDate startDate,
                                       @Param("endDate") LocalDate endDate);

    @Query("SELECT COALESCE(SUM(t.amount), 0) FROM Transaction t WHERE " +
            "t.user.id = :userId AND t.type = 'EXPENSE' AND " +
            "t.transactionDate BETWEEN :startDate AND :endDate")
    BigDecimal getTotalExpensesForPeriod(@Param("userId") Long userId,
                                         @Param("startDate") LocalDate startDate,
                                         @Param("endDate") LocalDate endDate);
}