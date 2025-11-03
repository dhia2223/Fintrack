package com.fintrack.web.category;

import com.fintrack.domain.category.Category;
import com.fintrack.service.category.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
        List<Category> categories = categoryService.getUserCategories();
        return ResponseEntity.ok(categories);
    }

    @GetMapping("/custom")
    public ResponseEntity<List<Category>> getCustomCategories() {
        List<Category> categories = categoryService.getUserCustomCategories();
        return ResponseEntity.ok(categories);
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(
            @RequestParam String name,
            @RequestParam(required = false) String description,
            @RequestParam(required = false) String color) {

        if (color == null) color = "#3B82F6";
        Category category = categoryService.createCategory(name, description, color);
        return ResponseEntity.ok(category);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}