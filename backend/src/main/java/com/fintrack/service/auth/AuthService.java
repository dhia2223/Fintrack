package com.fintrack.service.auth;

import com.fintrack.domain.account.Account;
import com.fintrack.domain.category.Category;
import com.fintrack.domain.user.User;
import com.fintrack.persistence.account.AccountRepository;
import com.fintrack.persistence.category.CategoryRepository;
import com.fintrack.persistence.user.UserRepository;
import com.fintrack.web.dto.auth.LoginRequest;
import com.fintrack.web.dto.auth.RegisterRequest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Service
@Transactional
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AccountRepository accountRepository;
    private final CategoryRepository categoryRepository;

    public AuthService(AuthenticationManager authenticationManager,
                       UserRepository userRepository,
                       PasswordEncoder passwordEncoder,
                       AccountRepository accountRepository,
                       CategoryRepository categoryRepository) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.accountRepository = accountRepository;
        this.categoryRepository = categoryRepository;
    }

    public void register(RegisterRequest registerRequest) {
        if (userRepository.existsByEmail(registerRequest.getEmail())) {
            throw new RuntimeException("Error: Email is already taken!");
        }

        // Create new user's account
        User user = new User(
                registerRequest.getEmail(),
                passwordEncoder.encode(registerRequest.getPassword()),
                registerRequest.getFirstName(),
                registerRequest.getLastName());

        User savedUser = userRepository.save(user);

        // Create default accounts for the user
        createDefaultAccounts(savedUser);

        // Create user-specific categories
        createUserCategories(savedUser);
    }

    public Authentication authenticate(LoginRequest loginRequest) {
        try {
            return authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("Invalid email or password");
        }
    }

    public User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated()) {
            throw new RuntimeException("User not authenticated");
        }

        String email = authentication.getName();
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    private void createDefaultAccounts(User user) {
        List<Account> defaultAccounts = Arrays.asList(
                new Account(user, "Cash", Account.AccountType.CASH, BigDecimal.valueOf(500.00), "USD"),
                new Account(user, "Main Checking", Account.AccountType.CHECKING, BigDecimal.valueOf(2500.00), "USD"),
                new Account(user, "Savings Account", Account.AccountType.SAVINGS, BigDecimal.valueOf(5000.00), "USD"),
                new Account(user, "Credit Card", Account.AccountType.CREDIT_CARD, BigDecimal.valueOf(0.00), "USD")
        );

        accountRepository.saveAll(defaultAccounts);
    }

    private void createUserCategories(User user) {
        // Create some user-specific categories
        List<Category> userCategories = Arrays.asList(
                new Category(user, "Salary", "Monthly salary income", "#10B981", false),
                new Category(user, "Freelance", "Freelance income", "#10B981", false),
                new Category(user, "Rent", "Monthly rent payment", "#EF4444", false),
                new Category(user, "Utilities", "Electricity, water, internet", "#EF4444", false)
        );

        categoryRepository.saveAll(userCategories);
    }
}