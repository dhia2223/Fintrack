package com.fintrack.service.category;

import com.fintrack.domain.category.Category;
import com.fintrack.domain.user.User;
import com.fintrack.persistence.category.CategoryRepository;
import com.fintrack.service.auth.AuthService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final AuthService authService;

    public CategoryService(CategoryRepository categoryRepository, AuthService authService) {
        this.categoryRepository = categoryRepository;
        this.authService = authService;
    }

    @Transactional(readOnly = true)
    public List<Category> getUserCategories() {
        User currentUser = authService.getCurrentUser();
        return categoryRepository.findByUserIdIncludingSystem(currentUser.getId());
    }

    @Transactional(readOnly = true)
    public List<Category> getUserCustomCategories() {
        User currentUser = authService.getCurrentUser();
        return categoryRepository.findByUserIdAndSystemIsFalseOrderByName(currentUser.getId());
    }

    public Category createCategory(String name, String description, String color) {
        User currentUser = authService.getCurrentUser();

        if (categoryRepository.existsByUserIdAndName(currentUser.getId(), name)) {
            throw new RuntimeException("Category with this name already exists");
        }

        Category category = new Category(currentUser, name, description, color, false);
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        User currentUser = authService.getCurrentUser();

        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        if (category.isSystem()) {
            throw new RuntimeException("Cannot delete system category");
        }

        if (!category.getUser().getId().equals(currentUser.getId())) {
            throw new RuntimeException("Category not found");
        }

        categoryRepository.delete(category);
    }
}