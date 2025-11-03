package com.fintrack.config;

import com.fintrack.domain.category.Category;
import com.fintrack.persistence.category.CategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(DataInitializer.class);
    private final CategoryRepository categoryRepository;

    public DataInitializer(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        initializeSystemCategories();
    }

    private void initializeSystemCategories() {
        if (categoryRepository.findBySystemTrueOrderByName().isEmpty()) {
            logger.info("Initializing system categories...");

            List<Category> systemCategories = Arrays.asList(
                    new Category("Food & Dining", "Groceries, restaurants, food delivery", "#3B82F6", true),
                    new Category("Transportation", "Gas, public transport, rideshare", "#8B5CF6", true),
                    new Category("Entertainment", "Movies, concerts, hobbies", "#EC4899", true),
                    new Category("Utilities", "Electricity, water, internet, phone", "#06B6D4", true),
                    new Category("Healthcare", "Medical expenses, insurance", "#10B981", true),
                    new Category("Shopping", "Clothing, electronics, household items", "#F59E0B", true),
                    new Category("Income", "Salary, bonuses, investments", "#10B981", true),
                    new Category("Other", "Miscellaneous expenses", "#6B7280", true)
            );

            categoryRepository.saveAll(systemCategories);
            logger.info("System categories initialized successfully");
        }
    }
}