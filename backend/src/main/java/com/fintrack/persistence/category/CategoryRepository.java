package com.fintrack.persistence.category;

import com.fintrack.domain.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByUserIdOrderByName(Long userId);

    List<Category> findByUserIdAndSystemIsFalseOrderByName(Long userId);

    Optional<Category> findByUserIdAndName(Long userId, String name);

    boolean existsByUserIdAndName(Long userId, String name);

    @Query("SELECT c FROM Category c WHERE c.user.id = :userId OR c.system = true ORDER BY c.name")
    List<Category> findByUserIdIncludingSystem(@Param("userId") Long userId);

    List<Category> findBySystemTrueOrderByName();

    @Query("SELECT c FROM Category c WHERE c.user.id = :userId OR c.user IS NULL ORDER BY c.name")
    List<Category> findAvailableCategoriesForUser(@Param("userId") Long userId);
}