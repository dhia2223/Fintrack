package com.fintrack.web.auth;

import com.fintrack.config.security.JwtUtils;
import com.fintrack.domain.user.User;
import com.fintrack.service.auth.AuthService;
import com.fintrack.web.dto.auth.JwtResponse;
import com.fintrack.web.dto.auth.LoginRequest;
import com.fintrack.web.dto.auth.RegisterRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth") 
public class AuthController {

    private final AuthService authService;
    private final JwtUtils jwtUtils;

    public AuthController(AuthService authService, JwtUtils jwtUtils) {
        this.authService = authService;
        this.jwtUtils = jwtUtils;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody RegisterRequest registerRequest) {
        authService.register(registerRequest);
        return ResponseEntity.ok("User registered successfully!");
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        try {
            Authentication authentication = authService.authenticate(loginRequest);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtUtils.generateJwtToken(authentication);

            User user = authService.getCurrentUser();

            return ResponseEntity.ok(new JwtResponse(jwt,
                    user.getId(),  
                    user.getEmail(),
                    user.getFirstName(),
                    user.getLastName()));
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("error", "Invalid email or password"));
        }
    }

    @GetMapping("/me")
    public ResponseEntity<?> getCurrentUser() {
        User user = authService.getCurrentUser();
        return ResponseEntity.ok(new JwtResponse(null,
                user.getId(), user.getEmail(),
                user.getFirstName(),
                user.getLastName()));
    }
}