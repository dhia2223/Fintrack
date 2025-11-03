# Project Source Code Documentation

**Generated on:** 2025-10-31 15:56:23
**Project Root:** `D:\Desktop\SpringBoot\fintrack`
**Total Files:** 81
**Total Size:** 172.2 KB

---

📁 Project Structure:
├── 📁 fintrack/
│   ├── 📁 .github/
│   │   └── 📁 workflows/
│   │       └── 📄 backend-ci.yml
│   ├── 📄 README.md
│   ├── 📁 backend/
│   │   ├── 📄 Dockerfile
│   │   ├── 📄 Dockerfile.dev
│   │   ├── 📄 HELP.md
│   │   ├── 📄 pom.xml
│   │   └── 📁 src/
│   │       ├── 📁 main/
│   │       │   ├── 📁 java/
│   │       │   │   └── 📁 com/
│   │       │   │       └── 📁 fintrack/
│   │       │   │           ├── 📄 FinTrackApplication.java
│   │       │   │           ├── 📁 config/
│   │       │   │           │   ├── 📄 DataInitializer.java
│   │       │   │           │   ├── 📄 DatabaseConfig.java
│   │       │   │           │   ├── 📄 GlobalExceptionHandler.java
│   │       │   │           │   ├── 📄 RequestLoggingFilter.java
│   │       │   │           │   ├── 📄 SecurityConfig.java
│   │       │   │           │   └── 📁 security/
│   │       │   │           │       ├── 📄 AuthTokenFilter.java
│   │       │   │           │       ├── 📄 JwtProperties.java
│   │       │   │           │       ├── 📄 JwtUtils.java
│   │       │   │           │       └── 📄 UserDetailsServiceImpl.java
│   │       │   │           ├── 📁 domain/
│   │       │   │           │   ├── 📁 account/
│   │       │   │           │   │   └── 📄 Account.java
│   │       │   │           │   ├── 📁 category/
│   │       │   │           │   │   └── 📄 Category.java
│   │       │   │           │   ├── 📁 transaction/
│   │       │   │           │   │   └── 📄 Transaction.java
│   │       │   │           │   └── 📁 user/
│   │       │   │           │       └── 📄 User.java
│   │       │   │           ├── 📁 persistence/
│   │       │   │           │   ├── 📁 account/
│   │       │   │           │   │   └── 📄 AccountRepository.java
│   │       │   │           │   ├── 📁 category/
│   │       │   │           │   │   └── 📄 CategoryRepository.java
│   │       │   │           │   ├── 📁 transaction/
│   │       │   │           │   │   └── 📄 TransactionRepository.java
│   │       │   │           │   └── 📁 user/
│   │       │   │           │       └── 📄 UserRepository.java
│   │       │   │           ├── 📁 service/
│   │       │   │           │   ├── 📁 account/
│   │       │   │           │   │   └── 📄 AccountService.java
│   │       │   │           │   ├── 📁 auth/
│   │       │   │           │   │   └── 📄 AuthService.java
│   │       │   │           │   ├── 📁 category/
│   │       │   │           │   │   └── 📄 CategoryService.java
│   │       │   │           │   └── 📁 transaction/
│   │       │   │           │       └── 📄 TransactionService.java
│   │       │   │           └── 📁 web/
│   │       │   │               ├── 📄 HealthController.java
│   │       │   │               ├── 📁 account/
│   │       │   │               │   └── 📄 AccountController.java
│   │       │   │               ├── 📁 auth/
│   │       │   │               │   └── 📄 AuthController.java
│   │       │   │               ├── 📁 category/
│   │       │   │               │   └── 📄 CategoryController.java
│   │       │   │               ├── 📁 dto/
│   │       │   │               │   ├── 📁 auth/
│   │       │   │               │   │   ├── 📄 JwtResponse.java
│   │       │   │               │   │   ├── 📄 LoginRequest.java
│   │       │   │               │   │   └── 📄 RegisterRequest.java
│   │       │   │               │   └── 📁 transaction/
│   │       │   │               │       ├── 📄 TransactionRequest.java
│   │       │   │               │       └── 📄 TransactionResponse.java
│   │       │   │               └── 📁 transaction/
│   │       │   │                   └── 📄 TransactionController.java
│   │       │   └── 📁 resources/
│   │       │       ├── 📄 application-docker.yml
│   │       │       ├── 📄 application.properties
│   │       │       ├── 📄 application.yml
│   │       │       └── 📁 db/
│   │       │           └── 📁 migration/
│   │       │               └── 📄 V1__Initial_schema.sql
│   │       └── 📁 test/
│   │           └── 📁 java/
│   │               └── 📁 com/
│   │                   └── 📁 fintrack/
│   │                       ├── 📄 FinTrackApplicationTests.java
│   │                       └── 📁 web/
│   │                           └── 📄 HealthControllerTest.java
│   ├── 📄 docker-compose.dev.yml
│   ├── 📄 docker-compose.yml
│   ├── 📁 frontend/
│   │   ├── 📄 Dockerfile
│   │   ├── 📄 Dockerfile.dev
│   │   ├── 📄 README.md
│   │   ├── 📄 eslint.config.js
│   │   ├── 📄 index.html
│   │   ├── 📄 package.json
│   │   ├── 📁 public/
│   │   ├── 📁 src/
│   │   │   ├── 📄 App.tsx
│   │   │   ├── 📁 assets/
│   │   │   ├── 📁 components/
│   │   │   │   ├── 📄 ErrorBoundary.tsx
│   │   │   │   ├── 📁 Layout/
│   │   │   │   │   ├── 📄 Header.tsx
│   │   │   │   │   ├── 📄 Layout.tsx
│   │   │   │   │   └── 📄 Sidebar.tsx
│   │   │   │   ├── 📄 ProtectedRoute.tsx
│   │   │   │   └── 📁 ui/
│   │   │   │       ├── 📄 LoadingSpinner.tsx
│   │   │   │       └── 📄 index.ts
│   │   │   ├── 📁 contexts/
│   │   │   │   └── 📄 AuthContext.tsx
│   │   │   ├── 📄 index.css
│   │   │   ├── 📄 main.tsx
│   │   │   ├── 📁 pages/
│   │   │   │   ├── 📄 Accounts.tsx
│   │   │   │   ├── 📄 Dashboard.tsx
│   │   │   │   ├── 📄 Login.tsx
│   │   │   │   ├── 📄 Register.tsx
│   │   │   │   └── 📄 Transactions.tsx
│   │   │   ├── 📁 services/
│   │   │   │   ├── 📄 accountService.ts
│   │   │   │   ├── 📄 api.ts
│   │   │   │   ├── 📄 authService.ts
│   │   │   │   ├── 📄 categoryService.ts
│   │   │   │   └── 📄 transactionService.ts
│   │   │   ├── 📁 types/
│   │   │   │   ├── 📄 auth.ts
│   │   │   │   └── 📄 transaction.ts
│   │   │   └── 📁 validations/
│   │   │       ├── 📄 auth.ts
│   │   │       └── 📄 transaction.ts
│   │   ├── 📄 tsconfig.app.json
│   │   ├── 📄 tsconfig.json
│   │   ├── 📄 tsconfig.node.json
│   │   └── 📄 vite.config.ts

---

# Source Files

## 📄 `.github\workflows\backend-ci.yml`
* **Size:** 1.7 KB
* **Language:** yaml

```yaml
name: Backend CI

on:
  push:
    branches: [ main, develop ]
  pull_request:
    branches: [ main ]

jobs:
  test:
    runs-on: ubuntu-latest
    services:
      postgres:
        image: postgres:15-alpine
        env:
          POSTGRES_USER: test_user
          POSTGRES_PASSWORD: test_password
          POSTGRES_DB: fintrack_test
        options: >-
          --health-cmd pg_isready
          --health-interval 10s
          --health-timeout 5s
          --health-retries 5
        ports:
          - 5432:5432

    steps:
    - uses: actions/checkout@v4
    
    - name: Set up JDK 17
      uses: actions/setup-java@v4
      with:
        java-version: '17'
        distribution: 'temurin'
        cache: maven
        
    - name: Build and test with Maven
      run: mvn clean test
      env:
        SPRING_DATASOURCE_URL: jdbc:postgresql://localhost:5432/fintrack_test
        SPRING_DATASOURCE_USERNAME: test_user
        SPRING_DATASOURCE_PASSWORD: test_password
        
    - name: Upload test results
      uses: actions/upload-artifact@v4
      if: failure()
      with:
        name: test-results
        path: backend/target/surefire-reports/

  build:
    runs-on: ubuntu-latest
    needs: test
    if: github.ref == 'refs/heads/main'
    
    steps:
    - uses: actions/checkout@v4
    
    - name: Set up JDK 17
      uses: actions/setup-java@v4
      with:
        java-version: '17'
        distribution: 'temurin'
        cache: maven
        
    - name: Build with Maven
      run: mvn clean package -DskipTests
      
    - name: Upload JAR artifact
      uses: actions/upload-artifact@v4
      with:
        name: fintrack-backend
        path: backend/target/*.jar
```

---

## 📄 `README.md`
* **Size:** 43.0 B
* **Language:** markdown

```markdown
"# FinTrack - Personal Finance Platform" 

```

---

## 📄 `backend\Dockerfile`
* **Size:** 787.0 B
* **Language:** dockerfile

```dockerfile
# Build stage
FROM maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
# Copy source code
COPY src ./src
RUN mvn clean package -DskipTests

# Runtime stage
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Install wait-for-it script for container dependencies
RUN apk add --no-cache bash postgresql-client curl

# Copy the built JAR - fix the path to match actual output
COPY --from=builder /app/target/fintrack-backend-1.0.0.jar app.jar

# Create non-root user
RUN addgroup -S spring && adduser -S spring -G spring
USER spring

EXPOSE 8080

# Health check
HEALTHCHECK --interval=30s --timeout=3s --start-period=60s --retries=3 \
    CMD curl -f http://localhost:8080/api/actuator/health || exit 1

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
```

---

## 📄 `backend\Dockerfile.dev`
* **Size:** 344.0 B
* **Language:** dockerfile

```dockerfile
FROM maven:3.9-eclipse-temurin-17

WORKDIR /app

# Copy Maven files for dependency caching
COPY pom.xml .

# Download dependencies first (cached layer)
RUN mvn dependency:go-offline -B

# Copy source code
COPY src ./src

# Expose port
EXPOSE 8080

# Default command (can be overridden in compose)
CMD ["mvn", "spring-boot:run"]
```

---

## 📄 `backend\HELP.md`
* **Size:** 828.0 B
* **Language:** markdown

```markdown
# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.7/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.7/maven-plugin/build-image.html)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.


```

---

## 📄 `backend\pom.xml`
* **Size:** 6.1 KB
* **Language:** xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.0</version>
        <relativePath/>
    </parent>

    <groupId>com.fintrack</groupId>
    <artifactId>fintrack-backend</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>

    <name>FinTrack Backend</name>
    <description>Personal Finance Management Backend</description>

    <properties>
        <java.version>17</java.version>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <flyway.version>9.22.0</flyway.version>
        <testcontainers.version>1.19.0</testcontainers.version>
        <mapstruct.version>1.5.5.Final</mapstruct.version>
        <jjwt.version>0.11.5</jjwt.version>
        <springdoc.version>2.2.0</springdoc.version>
    </properties>

    <dependencies>
        <!-- Spring Boot Starters -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>

        <!-- Database -->
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.flywaydb</groupId>
            <artifactId>flyway-core</artifactId>
        </dependency>

        <!-- JWT Authentication -->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-api</artifactId>
            <version>${jjwt.version}</version>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-impl</artifactId>
            <version>${jjwt.version}</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-jackson</artifactId>
            <version>${jjwt.version}</version>
            <scope>runtime</scope>
        </dependency>

        <!-- Mapping -->
        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct</artifactId>
            <version>${mapstruct.version}</version>
        </dependency>

        <!-- Password Hashing -->
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-crypto</artifactId>
        </dependency>

        <!-- OpenAPI Documentation -->
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>${springdoc.version}</version>
        </dependency>

        <!-- Testing -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.testcontainers</groupId>
            <artifactId>junit-jupiter</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.testcontainers</groupId>
            <artifactId>postgresql</artifactId>
            <scope>test</scope>
        </dependency>

        <!-- Development -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.11.0</version>
                <configuration>
                    <annotationProcessorPaths>
                        <path>
                            <groupId>org.mapstruct</groupId>
                            <artifactId>mapstruct-processor</artifactId>
                            <version>${mapstruct.version}</version>
                        </path>
                    </annotationProcessorPaths>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.flywaydb</groupId>
                <artifactId>flyway-maven-plugin</artifactId>
                <version>${flyway.version}</version>
            </plugin>
        </plugins>
    </build>
</project>
```

---

## 📄 `backend\src\main\java\com\fintrack\FinTrackApplication.java`
* **Size:** 318.0 B
* **Language:** java

```java
package com.fintrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinTrackApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinTrackApplication.class, args);
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\config\DataInitializer.java`
* **Size:** 2.0 KB
* **Language:** java

```java
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
```

---

## 📄 `backend\src\main\java\com\fintrack\config\DatabaseConfig.java`
* **Size:** 287.0 B
* **Language:** java

```java
package com.fintrack.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class DatabaseConfig {
    // JPA auditing and other DB configurations
}
```

---

## 📄 `backend\src\main\java\com\fintrack\config\GlobalExceptionHandler.java`
* **Size:** 1.9 KB
* **Language:** java

```java
package com.fintrack.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleException(Exception ex) {
        logger.error("Unhandled exception: ", ex);

        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", "Internal Server Error");
        errorResponse.put("message", ex.getMessage());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, String>> handleRuntimeException(RuntimeException ex) {
        logger.error("Runtime exception: ", ex);

        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", "Bad Request");
        errorResponse.put("message", ex.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<Map<String, String>> handleBadCredentialsException(BadCredentialsException ex) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", "Unauthorized");
        errorResponse.put("message", "Invalid email or password");

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorResponse);
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\config\RequestLoggingFilter.java`
* **Size:** 1.1 KB
* **Language:** java

```java
package com.fintrack.config;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RequestLoggingFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(RequestLoggingFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;

        logger.debug("=== REQUEST DEBUG ===");
        logger.debug("Method: {}", httpRequest.getMethod());
        logger.debug("Request URI: {}", httpRequest.getRequestURI());
        logger.debug("Context Path: {}", httpRequest.getContextPath());
        logger.debug("Servlet Path: {}", httpRequest.getServletPath());
        logger.debug("Path Info: {}", httpRequest.getPathInfo());
        logger.debug("=== END REQUEST DEBUG ===");

        chain.doFilter(request, response);
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\config\SecurityConfig.java`
* **Size:** 4.8 KB
* **Language:** java

```java
package com.fintrack.config;

import com.fintrack.config.security.AuthTokenFilter;
import com.fintrack.config.security.JwtUtils;
import com.fintrack.config.security.UserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final UserDetailsServiceImpl userDetailsService;
    private final JwtUtils jwtUtils;

    public SecurityConfig(UserDetailsServiceImpl userDetailsService, JwtUtils jwtUtils) {
        this.userDetailsService = userDetailsService;
        this.jwtUtils = jwtUtils;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .cors(cors -> cors.configurationSource(corsConfigurationSource()))
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authz -> authz
                        // Public endpoints - NOTE: These are WITHOUT the /api prefix
                        // Spring Security sees paths AFTER context path is applied
                        .requestMatchers("/auth/**").permitAll()
                        .requestMatchers("/health/**").permitAll()
                        .requestMatchers("/actuator/health").permitAll()
                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**", "/swagger-ui.html").permitAll()
                        // All other endpoints require authentication
                        .anyRequest().authenticated()
                )
                .authenticationProvider(authenticationProvider())
                .addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    @Bean
    public AuthTokenFilter authenticationJwtTokenFilter() {
        return new AuthTokenFilter(jwtUtils, userDetailsService);
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Updated CORS configuration in SecurityConfig.java
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOriginPatterns(Arrays.asList(
                "http://localhost:3000",
                "http://localhost:8080",
                "http://127.0.0.1:3000"
        ));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
        configuration.setAllowedHeaders(Arrays.asList(
                "Authorization",
                "Content-Type",
                "X-Requested-With",
                "Accept",
                "X-XSRF-TOKEN"
        ));
        configuration.setExposedHeaders(Arrays.asList(
                "Authorization",
                "X-XSRF-TOKEN"
        ));
        configuration.setAllowCredentials(true);
        configuration.setMaxAge(3600L);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\config\security\AuthTokenFilter.java`
* **Size:** 2.5 KB
* **Language:** java

```java
package com.fintrack.config.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class AuthTokenFilter extends OncePerRequestFilter {
    private static final Logger logger = LoggerFactory.getLogger(AuthTokenFilter.class);

    private final JwtUtils jwtUtils;
    private final UserDetailsServiceImpl userDetailsService;

    public AuthTokenFilter(JwtUtils jwtUtils, UserDetailsServiceImpl userDetailsService) {
        this.jwtUtils = jwtUtils;
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        try {
            String jwt = parseJwt(request);
            if (jwt != null && jwtUtils.validateJwtToken(jwt)) {
                String username = jwtUtils.getUserNameFromJwtToken(jwt);

                UserDetails userDetails = userDetailsService.loadUserByUsername(username);
                UsernamePasswordAuthenticationToken authentication =
                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        } catch (Exception e) {
            logger.error("Cannot set user authentication: {}", e.getMessage());
        }

        filterChain.doFilter(request, response);
    }

    private String parseJwt(HttpServletRequest request) {
        String headerAuth = request.getHeader("Authorization");

        if (StringUtils.hasText(headerAuth) && headerAuth.startsWith("Bearer ")) {
            return headerAuth.substring(7);
        }

        return null;
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\config\security\JwtProperties.java`
* **Size:** 969.0 B
* **Language:** java

```java
package com.fintrack.config.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app.jwt")
public class JwtProperties {

    private String secretKey = "defaultSecretKeyChangeInProduction1234567890";
    private long expirationMs = 86400000; // 24 hours
    private long refreshExpirationMs = 604800000; // 7 days

    // Getters and setters
    public String getSecretKey() { return secretKey; }
    public void setSecretKey(String secretKey) { this.secretKey = secretKey; }

    public long getExpirationMs() { return expirationMs; }
    public void setExpirationMs(long expirationMs) { this.expirationMs = expirationMs; }

    public long getRefreshExpirationMs() { return refreshExpirationMs; }
    public void setRefreshExpirationMs(long refreshExpirationMs) { this.refreshExpirationMs = refreshExpirationMs; }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\config\security\JwtUtils.java`
* **Size:** 2.8 KB
* **Language:** java

```java
package com.fintrack.config.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtUtils {
    private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    private final JwtProperties jwtProperties;
    private final SecretKey secretKey;

    public JwtUtils(JwtProperties jwtProperties) {
        this.jwtProperties = jwtProperties;
        this.secretKey = Keys.hmacShaKeyFor(jwtProperties.getSecretKey().getBytes());
    }

    public String generateJwtToken(Authentication authentication) {
        UserDetails userPrincipal = (UserDetails) authentication.getPrincipal();

        return Jwts.builder()
                .setSubject((userPrincipal.getUsername()))
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + jwtProperties.getExpirationMs()))
                .signWith(secretKey, SignatureAlgorithm.HS256)
                .compact();
    }

    public String generateTokenFromUsername(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + jwtProperties.getExpirationMs()))
                .signWith(secretKey, SignatureAlgorithm.HS256)
                .compact();
    }

    public String getUserNameFromJwtToken(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(secretKey)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public boolean validateJwtToken(String authToken) {
        try {
            Jwts.parserBuilder()
                    .setSigningKey(secretKey)
                    .build()
                    .parseClaimsJws(authToken);
            return true;
        } catch (SecurityException e) {
            logger.error("Invalid JWT signature: {}", e.getMessage());
        } catch (MalformedJwtException e) {
            logger.error("Invalid JWT token: {}", e.getMessage());
        } catch (ExpiredJwtException e) {
            logger.error("JWT token is expired: {}", e.getMessage());
        } catch (UnsupportedJwtException e) {
            logger.error("JWT token is unsupported: {}", e.getMessage());
        } catch (IllegalArgumentException e) {
            logger.error("JWT claims string is empty: {}", e.getMessage());
        }

        return false;
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\config\security\UserDetailsServiceImpl.java`
* **Size:** 1.3 KB
* **Language:** java

```java
package com.fintrack.config.security;

import com.fintrack.domain.user.User;
import com.fintrack.persistence.user.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findActiveUserByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with email: " + email));

        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPasswordHash(),
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\domain\account\Account.java`
* **Size:** 3.8 KB
* **Language:** java

```java
package com.fintrack.domain.account;

import com.fintrack.domain.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "accounts")
@EntityListeners(AuditingEntityListener.class)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String name;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private AccountType type;

    @NotNull
    @DecimalMin(value = "0.00", message = "Balance cannot be negative")
    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal balance = BigDecimal.ZERO;

    @Column(length = 3)
    private String currency = "USD";

    @Column(name = "is_active", nullable = false)
    private boolean active = true;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public enum AccountType {
        CHECKING, SAVINGS, CREDIT_CARD, CASH, INVESTMENT
    }

    // Constructors
    public Account() {}

    public Account(User user, String name, AccountType type, BigDecimal balance, String currency) {
        this.user = user;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.currency = currency;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public AccountType getType() { return type; }
    public void setType(AccountType type) { this.type = type; }

    public BigDecimal getBalance() { return balance; }
    public void setBalance(BigDecimal balance) { this.balance = balance; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) && Objects.equals(user, account.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\domain\category\Category.java`
* **Size:** 3.5 KB
* **Language:** java

```java
package com.fintrack.domain.category;

import com.fintrack.domain.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "categories")
@EntityListeners(AuditingEntityListener.class)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")  // Removed nullable = false
    private User user;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 500)
    private String description;

    @Column(length = 7)
    private String color = "#3B82F6";

    @Column(name = "is_system", nullable = false)
    private boolean system = false;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // Constructors
    public Category() {}

    // For system categories (user is null)
    public Category(String name, String description, String color, boolean system) {
        this.name = name;
        this.description = description;
        this.color = color;
        this.system = system;
    }

    // For user categories
    public Category(User user, String name, String description, String color, boolean system) {
        this.user = user;
        this.name = name;
        this.description = description;
        this.color = color;
        this.system = system;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isSystem() { return system; }
    public void setSystem(boolean system) { this.system = system; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(user, category.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", system=" + system +
                '}';
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\domain\transaction\Transaction.java`
* **Size:** 4.7 KB
* **Language:** java

```java
package com.fintrack.domain.transaction;

import com.fintrack.domain.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "transactions")
@EntityListeners(AuditingEntityListener.class)
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private com.fintrack.domain.account.Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private com.fintrack.domain.category.Category category;

    @NotNull
    @DecimalMin(value = "0.01", message = "Amount must be greater than 0")
    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal amount;

    @NotBlank
    @Column(nullable = false, length = 500)
    private String description;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private TransactionType type;

    @NotNull
    @Column(name = "transaction_date", nullable = false)
    private LocalDate transactionDate;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public enum TransactionType {
        INCOME, EXPENSE
    }

    // Constructors
    public Transaction() {}

    public Transaction(User user, com.fintrack.domain.account.Account account,
                       com.fintrack.domain.category.Category category, BigDecimal amount,
                       String description, TransactionType type, LocalDate transactionDate) {
        this.user = user;
        this.account = account;
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.type = type;
        this.transactionDate = transactionDate;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public com.fintrack.domain.account.Account getAccount() { return account; }
    public void setAccount(com.fintrack.domain.account.Account account) { this.account = account; }

    public com.fintrack.domain.category.Category getCategory() { return category; }
    public void setCategory(com.fintrack.domain.category.Category category) { this.category = category; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public TransactionType getType() { return type; }
    public void setType(TransactionType type) { this.type = type; }

    public LocalDate getTransactionDate() { return transactionDate; }
    public void setTransactionDate(LocalDate transactionDate) { this.transactionDate = transactionDate; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\domain\user\User.java`
* **Size:** 3.3 KB
* **Language:** java

```java
package com.fintrack.domain.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank
    @Size(min = 6)
    @Column(nullable = false)
    private String passwordHash;

    @NotBlank
    @Column(nullable = false)
    private String firstName;

    @NotBlank
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private boolean enabled = true;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // Constructors
    public User() {}

    public User(String email, String passwordHash, String firstName, String lastName) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\persistence\account\AccountRepository.java`
* **Size:** 813.0 B
* **Language:** java

```java
package com.fintrack.persistence.account;

import com.fintrack.domain.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findByUserIdAndActiveTrueOrderByName(Long userId);

    Optional<Account> findByIdAndUserId(Long id, Long userId);

    @Query("SELECT COALESCE(SUM(a.balance), 0) FROM Account a WHERE a.user.id = :userId AND a.active = true")
    BigDecimal getTotalBalanceByUserId(@Param("userId") Long userId);
}
```

---

## 📄 `backend\src\main\java\com\fintrack\persistence\category\CategoryRepository.java`
* **Size:** 1.2 KB
* **Language:** java

```java
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

    // Find system categories
    List<Category> findBySystemTrueOrderByName();

    // Find categories by user ID (including system categories)
    @Query("SELECT c FROM Category c WHERE c.user.id = :userId OR c.user IS NULL ORDER BY c.name")
    List<Category> findAvailableCategoriesForUser(@Param("userId") Long userId);
}
```

---

## 📄 `backend\src\main\java\com\fintrack\persistence\transaction\TransactionRepository.java`
* **Size:** 2.5 KB
* **Language:** java

```java
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
```

---

## 📄 `backend\src\main\java\com\fintrack\persistence\user\UserRepository.java`
* **Size:** 670.0 B
* **Language:** java

```java
package com.fintrack.persistence.user;

import com.fintrack.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.email = :email AND u.enabled = true")
    Optional<User> findActiveUserByEmail(@Param("email") String email);
}
```

---

## 📄 `backend\src\main\java\com\fintrack\service\account\AccountService.java`
* **Size:** 2.6 KB
* **Language:** java

```java
package com.fintrack.service.account;

import com.fintrack.domain.account.Account;
import com.fintrack.domain.user.User;
import com.fintrack.persistence.account.AccountRepository;
import com.fintrack.service.auth.AuthService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class AccountService {

    private final AccountRepository accountRepository;
    private final AuthService authService;

    public AccountService(AccountRepository accountRepository, AuthService authService) {
        this.accountRepository = accountRepository;
        this.authService = authService;
    }

    @Transactional(readOnly = true)
    public List<Account> getUserAccounts() {
        User currentUser = authService.getCurrentUser();
        return accountRepository.findByUserIdAndActiveTrueOrderByName(currentUser.getId());
    }

    @Transactional(readOnly = true)
    public Account getAccount(Long id) {
        User currentUser = authService.getCurrentUser();
        return accountRepository.findByIdAndUserId(id, currentUser.getId())
                .orElseThrow(() -> new RuntimeException("Account not found"));
    }

    @Transactional(readOnly = true)
    public BigDecimal getTotalBalance() {
        User currentUser = authService.getCurrentUser();
        return accountRepository.getTotalBalanceByUserId(currentUser.getId());
    }

    public Account createAccount(String name, Account.AccountType type, BigDecimal initialBalance, String currency) {
        User currentUser = authService.getCurrentUser();

        Account account = new Account(currentUser, name, type, initialBalance, currency);
        return accountRepository.save(account);
    }

    public Account updateAccount(Long id, String name, boolean active) {
        User currentUser = authService.getCurrentUser();

        Account account = accountRepository.findByIdAndUserId(id, currentUser.getId())
                .orElseThrow(() -> new RuntimeException("Account not found"));

        account.setName(name);
        account.setActive(active);

        return accountRepository.save(account);
    }

    public void deleteAccount(Long id) {
        User currentUser = authService.getCurrentUser();

        Account account = accountRepository.findByIdAndUserId(id, currentUser.getId())
                .orElseThrow(() -> new RuntimeException("Account not found"));

        account.setActive(false);
        accountRepository.save(account);
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\service\auth\AuthService.java`
* **Size:** 4.8 KB
* **Language:** java

```java
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
```

---

## 📄 `backend\src\main\java\com\fintrack\service\category\CategoryService.java`
* **Size:** 2.2 KB
* **Language:** java

```java
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
```

---

## 📄 `backend\src\main\java\com\fintrack\service\transaction\TransactionService.java`
* **Size:** 11.1 KB
* **Language:** java

```java
package com.fintrack.service.transaction;

import com.fintrack.domain.account.Account;
import com.fintrack.domain.category.Category;
import com.fintrack.domain.transaction.Transaction;
import com.fintrack.domain.user.User;
import com.fintrack.persistence.account.AccountRepository;
import com.fintrack.persistence.category.CategoryRepository;
import com.fintrack.persistence.transaction.TransactionRepository;
import com.fintrack.service.auth.AuthService;
import com.fintrack.web.dto.transaction.TransactionRequest;
import com.fintrack.web.dto.transaction.TransactionResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
@Transactional
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;
    private final CategoryRepository categoryRepository;
    private final AuthService authService;

    public TransactionService(TransactionRepository transactionRepository,
                              AccountRepository accountRepository,
                              CategoryRepository categoryRepository,
                              AuthService authService) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
        this.categoryRepository = categoryRepository;
        this.authService = authService;
    }

    public TransactionResponse createTransaction(TransactionRequest request) {
        User currentUser = authService.getCurrentUser();

        Account account = accountRepository.findByIdAndUserId(request.getAccountId(), currentUser.getId())
                .orElseThrow(() -> new RuntimeException("Account not found"));

        Category category = null;
        if (request.getCategoryId() != null) {
            category = categoryRepository.findById(request.getCategoryId())
                    .orElseThrow(() -> new RuntimeException("Category not found"));
            // Verify category belongs to user or is system category
            if (!category.isSystem() && category.getUser() != null && !category.getUser().getId().equals(currentUser.getId())) {
                throw new RuntimeException("Category not found");
            }
        }

        // Validate that expense transactions don't make balance negative
        if (request.getType() == Transaction.TransactionType.EXPENSE) {
            BigDecimal newBalance = account.getBalance().subtract(request.getAmount());
            if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
                throw new RuntimeException("Insufficient funds in account: " + account.getName() +
                        ". Current balance: " + account.getBalance() +
                        ", attempted expense: " + request.getAmount());
            }
        }

        Transaction transaction = new Transaction();
        transaction.setUser(currentUser);
        transaction.setAccount(account);
        transaction.setCategory(category);
        transaction.setAmount(request.getAmount());
        transaction.setDescription(request.getDescription());
        transaction.setType(request.getType());
        transaction.setTransactionDate(request.getTransactionDate());

        // Update account balance
        updateAccountBalance(account, request.getAmount(), request.getType());

        Transaction savedTransaction = transactionRepository.save(transaction);
        return mapToResponse(savedTransaction);
    }

    @Transactional(readOnly = true)
    public Page<TransactionResponse> getTransactions(Pageable pageable) {
        User currentUser = authService.getCurrentUser();
        Page<Transaction> transactions = transactionRepository.findByUserIdOrderByTransactionDateDesc(currentUser.getId(), pageable);
        return transactions.map(this::mapToResponse);
    }

    @Transactional(readOnly = true)
    public Page<TransactionResponse> getTransactionsWithFilters(Long accountId, Long categoryId,
                                                                Transaction.TransactionType type,
                                                                LocalDate startDate, LocalDate endDate,
                                                                Pageable pageable) {
        User currentUser = authService.getCurrentUser();

        if (startDate == null) {
            startDate = LocalDate.now().minusMonths(1);
        }
        if (endDate == null) {
            endDate = LocalDate.now();
        }

        Page<Transaction> transactions = transactionRepository.findByUserIdAndFilters(
                currentUser.getId(), accountId, categoryId, type, startDate, endDate, pageable);

        return transactions.map(this::mapToResponse);
    }

    @Transactional(readOnly = true)
    public TransactionResponse getTransaction(Long id) {
        User currentUser = authService.getCurrentUser();

        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        if (!transaction.getUser().getId().equals(currentUser.getId())) {
            throw new RuntimeException("Transaction not found");
        }

        return mapToResponse(transaction);
    }

    public TransactionResponse updateTransaction(Long id, TransactionRequest request) {
        User currentUser = authService.getCurrentUser();

        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        if (!transaction.getUser().getId().equals(currentUser.getId())) {
            throw new RuntimeException("Transaction not found");
        }

        // Revert old transaction amount from account
        updateAccountBalance(transaction.getAccount(), transaction.getAmount(),
                reverseTransactionType(transaction.getType()));

        // Update transaction details
        Account account = accountRepository.findByIdAndUserId(request.getAccountId(), currentUser.getId())
                .orElseThrow(() -> new RuntimeException("Account not found"));

        Category category = null;
        if (request.getCategoryId() != null) {
            category = categoryRepository.findById(request.getCategoryId())
                    .orElseThrow(() -> new RuntimeException("Category not found"));
            // Verify category belongs to user or is system category
            if (!category.isSystem() && category.getUser() != null && !category.getUser().getId().equals(currentUser.getId())) {
                throw new RuntimeException("Category not found");
            }
        }

        // Validate that expense transactions don't make balance negative
        if (request.getType() == Transaction.TransactionType.EXPENSE) {
            BigDecimal newBalance = account.getBalance().subtract(request.getAmount());
            if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
                throw new RuntimeException("Insufficient funds in account: " + account.getName() +
                        ". Current balance: " + account.getBalance() +
                        ", attempted expense: " + request.getAmount());
            }
        }

        transaction.setAccount(account);
        transaction.setCategory(category);
        transaction.setAmount(request.getAmount());
        transaction.setDescription(request.getDescription());
        transaction.setType(request.getType());
        transaction.setTransactionDate(request.getTransactionDate());

        // Apply new transaction amount to account
        updateAccountBalance(account, request.getAmount(), request.getType());

        Transaction updatedTransaction = transactionRepository.save(transaction);
        return mapToResponse(updatedTransaction);
    }

    public void deleteTransaction(Long id) {
        User currentUser = authService.getCurrentUser();

        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        if (!transaction.getUser().getId().equals(currentUser.getId())) {
            throw new RuntimeException("Transaction not found");
        }

        // Revert transaction amount from account
        updateAccountBalance(transaction.getAccount(), transaction.getAmount(),
                reverseTransactionType(transaction.getType()));

        transactionRepository.delete(transaction);
    }

    @Transactional(readOnly = true)
    public BigDecimal getTotalIncome(LocalDate startDate, LocalDate endDate) {
        User currentUser = authService.getCurrentUser();
        return transactionRepository.getTotalIncomeForPeriod(currentUser.getId(), startDate, endDate);
    }

    @Transactional(readOnly = true)
    public BigDecimal getTotalExpenses(LocalDate startDate, LocalDate endDate) {
        User currentUser = authService.getCurrentUser();
        return transactionRepository.getTotalExpensesForPeriod(currentUser.getId(), startDate, endDate);
    }

    private void updateAccountBalance(Account account, BigDecimal amount, Transaction.TransactionType type) {
        BigDecimal newBalance;
        if (type == Transaction.TransactionType.INCOME) {
            newBalance = account.getBalance().add(amount);
        } else {
            newBalance = account.getBalance().subtract(amount);

            // Additional safety check - should never be negative due to validation above
            if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
                throw new RuntimeException("Insufficient funds. This should not happen due to prior validation.");
            }
        }
        account.setBalance(newBalance);
        accountRepository.save(account);
    }

    private Transaction.TransactionType reverseTransactionType(Transaction.TransactionType type) {
        return type == Transaction.TransactionType.INCOME ?
                Transaction.TransactionType.EXPENSE : Transaction.TransactionType.INCOME;
    }

    private TransactionResponse mapToResponse(Transaction transaction) {
        String categoryName = null;
        String categoryColor = null;
        if (transaction.getCategory() != null) {
            categoryName = transaction.getCategory().getName();
            categoryColor = transaction.getCategory().getColor();
        }

        return new TransactionResponse(
                transaction.getId(),
                transaction.getAccount().getId(),
                transaction.getAccount().getName(),
                transaction.getCategory() != null ? transaction.getCategory().getId() : null,
                categoryName,
                categoryColor,
                transaction.getAmount(),
                transaction.getDescription(),
                transaction.getType(),
                transaction.getTransactionDate(),
                transaction.getCreatedAt(),
                transaction.getUpdatedAt()
        );
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\web\HealthController.java`
* **Size:** 685.0 B
* **Language:** java

```java
package com.fintrack.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/health") // Remove /api prefix
public class HealthController {

    @GetMapping
    public ResponseEntity<Map<String, String>> healthCheck() {
        return ResponseEntity.ok(Map.of(
                "status", "UP",
                "service", "FinTrack Backend",
                "timestamp", java.time.Instant.now().toString()
        ));
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\web\account\AccountController.java`
* **Size:** 2.1 KB
* **Language:** java

```java
package com.fintrack.web.account;

import com.fintrack.domain.account.Account;
import com.fintrack.service.account.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAccounts() {
        List<Account> accounts = accountService.getUserAccounts();
        return ResponseEntity.ok(accounts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable Long id) {
        Account account = accountService.getAccount(id);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/balance/total")
    public ResponseEntity<BigDecimal> getTotalBalance() {
        BigDecimal totalBalance = accountService.getTotalBalance();
        return ResponseEntity.ok(totalBalance);
    }

    @PostMapping
    public ResponseEntity<Account> createAccount(
            @RequestParam String name,
            @RequestParam Account.AccountType type,
            @RequestParam(defaultValue = "0.00") BigDecimal initialBalance,
            @RequestParam(defaultValue = "USD") String currency) {

        Account account = accountService.createAccount(name, type, initialBalance, currency);
        return ResponseEntity.ok(account);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Account> updateAccount(
            @PathVariable Long id,
            @RequestParam String name,
            @RequestParam boolean active) {

        Account account = accountService.updateAccount(id, name, active);
        return ResponseEntity.ok(account);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return ResponseEntity.noContent().build();
    }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\web\auth\AuthController.java`
* **Size:** 2.5 KB
* **Language:** java

```java
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
@RequestMapping("/auth") // Remove /api prefix - it's handled by context path
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
                    user.getId(),  // Add user ID
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
```

---

## 📄 `backend\src\main\java\com\fintrack\web\category\CategoryController.java`
* **Size:** 1.6 KB
* **Language:** java

```java
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
```

---

## 📄 `backend\src\main\java\com\fintrack\web\dto\auth\JwtResponse.java`
* **Size:** 1.3 KB
* **Language:** java

```java
package com.fintrack.web.dto.auth;

public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long userId;  // Add this field
    private String email;
    private String firstName;
    private String lastName;

    public JwtResponse(String token, Long userId, String email, String firstName, String lastName) {
        this.token = token;
        this.userId = userId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\web\dto\auth\LoginRequest.java`
* **Size:** 602.0 B
* **Language:** java

```java
package com.fintrack.web.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class LoginRequest {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;

    // Default constructor
    public LoginRequest() {}

    // Getters and setters
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\web\dto\auth\RegisterRequest.java`
* **Size:** 1.0 KB
* **Language:** java

```java
package com.fintrack.web.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RegisterRequest {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 6)
    private String password;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    // Default constructor
    public RegisterRequest() {}

    // Getters and setters
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\web\dto\transaction\TransactionRequest.java`
* **Size:** 1.7 KB
* **Language:** java

```java
package com.fintrack.web.dto.transaction;

import com.fintrack.domain.transaction.Transaction;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TransactionRequest {

    @NotNull
    private Long accountId;

    private Long categoryId;

    @NotNull
    @DecimalMin(value = "0.01", message = "Amount must be greater than 0")
    private BigDecimal amount;

    @NotBlank
    private String description;

    @NotNull
    private Transaction.TransactionType type;

    @NotNull
    private LocalDate transactionDate;

    // Default constructor
    public TransactionRequest() {}

    // Getters and setters
    public Long getAccountId() { return accountId; }
    public void setAccountId(Long accountId) { this.accountId = accountId; }

    public Long getCategoryId() { return categoryId; }
    public void setCategoryId(Long categoryId) { this.categoryId = categoryId; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Transaction.TransactionType getType() { return type; }
    public void setType(Transaction.TransactionType type) { this.type = type; }

    public LocalDate getTransactionDate() { return transactionDate; }
    public void setTransactionDate(LocalDate transactionDate) { this.transactionDate = transactionDate; }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\web\dto\transaction\TransactionResponse.java`
* **Size:** 3.2 KB
* **Language:** java

```java
package com.fintrack.web.dto.transaction;

import com.fintrack.domain.transaction.Transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TransactionResponse {

    private Long id;
    private Long accountId;
    private String accountName;
    private Long categoryId;
    private String categoryName;
    private String categoryColor;
    private BigDecimal amount;
    private String description;
    private Transaction.TransactionType type;
    private LocalDate transactionDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Constructors
    public TransactionResponse() {}

    public TransactionResponse(Long id, Long accountId, String accountName,
                               Long categoryId, String categoryName, String categoryColor,
                               BigDecimal amount, String description, Transaction.TransactionType type,
                               LocalDate transactionDate, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.accountId = accountId;
        this.accountName = accountName;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryColor = categoryColor;
        this.amount = amount;
        this.description = description;
        this.type = type;
        this.transactionDate = transactionDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getAccountId() { return accountId; }
    public void setAccountId(Long accountId) { this.accountId = accountId; }

    public String getAccountName() { return accountName; }
    public void setAccountName(String accountName) { this.accountName = accountName; }

    public Long getCategoryId() { return categoryId; }
    public void setCategoryId(Long categoryId) { this.categoryId = categoryId; }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }

    public String getCategoryColor() { return categoryColor; }
    public void setCategoryColor(String categoryColor) { this.categoryColor = categoryColor; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Transaction.TransactionType getType() { return type; }
    public void setType(Transaction.TransactionType type) { this.type = type; }

    public LocalDate getTransactionDate() { return transactionDate; }
    public void setTransactionDate(LocalDate transactionDate) { this.transactionDate = transactionDate; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
```

---

## 📄 `backend\src\main\java\com\fintrack\web\transaction\TransactionController.java`
* **Size:** 4.2 KB
* **Language:** java

```java
package com.fintrack.web.transaction;

import com.fintrack.domain.transaction.Transaction;
import com.fintrack.service.transaction.TransactionService;
import com.fintrack.web.dto.transaction.TransactionRequest;
import com.fintrack.web.dto.transaction.TransactionResponse;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<TransactionResponse> createTransaction(@Valid @RequestBody TransactionRequest request) {
        TransactionResponse response = transactionService.createTransaction(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<Page<TransactionResponse>> getTransactions(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(required = false) Long accountId,
            @RequestParam(required = false) Long categoryId,
            @RequestParam(required = false) Transaction.TransactionType type,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {

        Pageable pageable = PageRequest.of(page, size, Sort.by("transactionDate").descending());
        Page<TransactionResponse> transactions = transactionService.getTransactionsWithFilters(
                accountId, categoryId, type, startDate, endDate, pageable);
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionResponse> getTransaction(@PathVariable Long id) {
        TransactionResponse response = transactionService.getTransaction(id);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TransactionResponse> updateTransaction(
            @PathVariable Long id, @Valid @RequestBody TransactionRequest request) {
        TransactionResponse response = transactionService.updateTransaction(id, request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable Long id) {
        transactionService.deleteTransaction(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/summary/income")
    public ResponseEntity<BigDecimal> getTotalIncome(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {

        if (startDate == null) startDate = LocalDate.now().withDayOfMonth(1);
        if (endDate == null) endDate = LocalDate.now();

        BigDecimal totalIncome = transactionService.getTotalIncome(startDate, endDate);
        return ResponseEntity.ok(totalIncome);
    }

    @GetMapping("/summary/expenses")
    public ResponseEntity<BigDecimal> getTotalExpenses(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {

        if (startDate == null) startDate = LocalDate.now().withDayOfMonth(1);
        if (endDate == null) endDate = LocalDate.now();

        BigDecimal totalExpenses = transactionService.getTotalExpenses(startDate, endDate);
        return ResponseEntity.ok(totalExpenses);
    }
}
```

---

## 📄 `backend\src\main\resources\application-docker.yml`
* **Size:** 399.0 B
* **Language:** yaml

```yaml
spring:
  datasource:
    url: jdbc:postgresql://postgres:5432/fintrack
    username: fintrack_user
    password: secure_password
  jpa:
    hibernate:
      ddl-auto: validate
    show-sql: true
    properties:
      hibernate:
        format_sql: true

logging:
  level:
    com.fintrack: DEBUG
    org.hibernate.SQL: DEBUG
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE
```

---

## 📄 `backend\src\main\resources\application.properties`
* **Size:** 44.0 B
* **Language:** properties

```properties
spring.application.name=FinTrackApplication

```

---

## 📄 `backend\src\main\resources\application.yml`
* **Size:** 1.4 KB
* **Language:** yaml

```yaml
spring:
  application:
    name: fintrack
  profiles:
    active: dev
  datasource:
    url: jdbc:postgresql://localhost:5432/fintrack
    username: ${DB_USERNAME:fintrack_user}
    password: ${DB_PASSWORD:secure_password}
    hikari:
      maximum-pool-size: 10
      minimum-idle: 2
      connection-timeout: 30000
  jpa:
    hibernate:
      ddl-auto: validate
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
        format_sql: true
    show-sql: false
  flyway:
    locations: classpath:db/migration
    baseline-on-migrate: true
    enabled: true

server:
  port: 8080
  servlet:
    context-path: /api

logging:
  level:
    com.fintrack: DEBUG
    org.springframework.security: TRACE
    org.springframework.web: TRACE
  pattern:
    console: "%d{yyyy-MM-dd HH:mm:ss} - %logger{36} - %msg%n"

management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics,prometheus
  endpoint:
    health:
      show-details: when-authorized
      show-components: when-authorized

app:
  jwt:
    secretKey: ${JWT_SECRET:yourSuperSecretKeyForJWTGenerationChangeThisInProduction1234567890}
    expirationMs: 86400000    # 24 hours
    refreshExpirationMs: 604800000  # 7 days

springdoc:
  api-docs:
    path: /v3/api-docs
  swagger-ui:
    path: /swagger-ui.html
    operations-sorter: method
    tags-sorter: alpha
```

---

## 📄 `backend\src\main\resources\db\migration\V1__Initial_schema.sql`
* **Size:** 5.6 KB
* **Language:** sql

```sql
-- Users table
CREATE TABLE users (
                       id BIGSERIAL PRIMARY KEY,
                       email VARCHAR(255) NOT NULL UNIQUE,
                       password_hash VARCHAR(255) NOT NULL,
                       first_name VARCHAR(100) NOT NULL,
                       last_name VARCHAR(100) NOT NULL,
                       enabled BOOLEAN NOT NULL DEFAULT TRUE,
                       created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                       updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- Categories table - user_id can be NULL for system categories
CREATE TABLE categories (
                            id BIGSERIAL PRIMARY KEY,
                            user_id BIGINT,
                            name VARCHAR(100) NOT NULL,
                            description TEXT,
                            color VARCHAR(7) DEFAULT '#3B82F6',
                            is_system BOOLEAN DEFAULT FALSE,
                            created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                            updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                            FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
                            CONSTRAINT unique_category_name_per_user UNIQUE (user_id, name)
);

-- Accounts table (bank accounts, cash, credit cards)
CREATE TABLE accounts (
                          id BIGSERIAL PRIMARY KEY,
                          user_id BIGINT NOT NULL,
                          name VARCHAR(100) NOT NULL,
                          type VARCHAR(50) NOT NULL CHECK (type IN ('CHECKING', 'SAVINGS', 'CREDIT_CARD', 'CASH', 'INVESTMENT')),
                          balance DECIMAL(15,2) NOT NULL DEFAULT 0.00,
                          currency VARCHAR(3) DEFAULT 'USD',
                          is_active BOOLEAN DEFAULT TRUE,
                          created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                          updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                          FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

-- Transactions table
CREATE TABLE transactions (
                              id BIGSERIAL PRIMARY KEY,
                              user_id BIGINT NOT NULL,
                              account_id BIGINT NOT NULL,
                              category_id BIGINT,
                              amount DECIMAL(15,2) NOT NULL,
                              type VARCHAR(20) NOT NULL CHECK (type IN ('INCOME', 'EXPENSE')),
                              description VARCHAR(500) NOT NULL,
                              transaction_date DATE NOT NULL,
                              created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                              updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                              FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
                              FOREIGN KEY (account_id) REFERENCES accounts(id) ON DELETE CASCADE,
                              FOREIGN KEY (category_id) REFERENCES categories(id) ON DELETE SET NULL
);

-- Budgets table
CREATE TABLE budgets (
                         id BIGSERIAL PRIMARY KEY,
                         user_id BIGINT NOT NULL,
                         category_id BIGINT NOT NULL,
                         amount DECIMAL(15,2) NOT NULL,
                         month DATE NOT NULL,
                         created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
                         FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
                         FOREIGN KEY (category_id) REFERENCES categories(id) ON DELETE CASCADE,
                         UNIQUE(user_id, category_id, month)
);

-- Indexes for performance
CREATE INDEX idx_transactions_user_date ON transactions(user_id, transaction_date);
CREATE INDEX idx_transactions_account ON transactions(account_id);
CREATE INDEX idx_transactions_category ON transactions(category_id);
CREATE INDEX idx_categories_user ON categories(user_id);
CREATE INDEX idx_accounts_user ON accounts(user_id);
CREATE INDEX idx_budgets_user_month ON budgets(user_id, month);

-- Insert system categories (user_id is NULL for system categories)
INSERT INTO categories (user_id, name, description, color, is_system) VALUES
                                                                          (NULL, 'Food & Dining', 'Groceries, restaurants, food delivery', '#3B82F6', true),
                                                                          (NULL, 'Transportation', 'Gas, public transport, rideshare', '#8B5CF6', true),
                                                                          (NULL, 'Entertainment', 'Movies, concerts, hobbies', '#EC4899', true),
                                                                          (NULL, 'Utilities', 'Electricity, water, internet, phone', '#06B6D4', true),
                                                                          (NULL, 'Healthcare', 'Medical expenses, insurance', '#10B981', true),
                                                                          (NULL, 'Shopping', 'Clothing, electronics, household items', '#F59E0B', true),
                                                                          (NULL, 'Income', 'Salary, bonuses, investments', '#10B981', true),
                                                                          (NULL, 'Other', 'Miscellaneous expenses', '#6B7280', true);
```

---

## 📄 `backend\src\test\java\com\fintrack\FinTrackApplicationTests.java`
* **Size:** 565.0 B
* **Language:** java

```java
package com.fintrack;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FinTrackApplicationTests {

    @Test
    void contextLoads(ApplicationContext context) {
        assertThat(context).isNotNull();
    }

    @Test
    void mainMethodStartsApplication() {
        FinTrackApplication.main(new String[] {});
        // If we reach here, application started successfully
    }
}
```

---

## 📄 `backend\src\test\java\com\fintrack\web\HealthControllerTest.java`
* **Size:** 935.0 B
* **Language:** java

```java
package com.fintrack.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class HealthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void healthCheck_ReturnsOkStatus() throws Exception {
        mockMvc.perform(get("/api/health"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("UP"))
                .andExpect(jsonPath("$.service").value("FinTrack Backend"));
    }
}
```

---

## 📄 `docker-compose.dev.yml`
* **Size:** 1.9 KB
* **Language:** yaml

```yaml
version: '3.8'

services:
  postgres:
    image: postgres:15-alpine
    container_name: fintrack-db
    environment:
      POSTGRES_DB: fintrack
      POSTGRES_USER: fintrack_user
      POSTGRES_PASSWORD: secure_password
    ports:
      - "5432:5432"
    volumes:
      - postgres_data:/var/lib/postgresql/data
      - ./backend/src/main/resources/db/migration:/docker-entrypoint-initdb.d
    networks:
      - fintrack-network
    healthcheck:
      test: ["CMD-SHELL", "pg_isready -U fintrack_user -d fintrack"]
      interval: 10s
      timeout: 5s
      retries: 5

  backend:
    build: 
      context: ./backend
      dockerfile: Dockerfile.dev
    container_name: fintrack-backend-dev
    environment:
      SPRING_PROFILES_ACTIVE: dev,docker
      DB_USERNAME: fintrack_user
      DB_PASSWORD: secure_password
      SPRING_DATASOURCE_URL: jdbc:postgresql://postgres:5432/fintrack
      SPRING_JPA_HIBERNATE_DDL_AUTO: validate
      SPRING_JPA_SHOW_SQL: "true"
    ports:
      - "8080:8080"
    depends_on:
      postgres:
        condition: service_healthy
    networks:
      - fintrack-network
    volumes:
      - ./backend/src:/app/src
      - ./backend/pom.xml:/app/pom.xml
      - maven-repo:/root/.m2
    command: mvn spring-boot:run -Dspring-boot.run.jvmArguments="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"

  frontend:
    build:
      context: ./frontend
      dockerfile: Dockerfile.dev
    container_name: fintrack-frontend-dev
    environment:
      - CHOKIDAR_USEPOLLING=true
      - VITE_API_BASE_URL=http://localhost:8080/api
    ports:
      - "3000:3000"
    volumes:
      - ./frontend:/app
      - /app/node_modules  # Important for node_modules isolation
    networks:
      - fintrack-network
    command: npm run dev -- --host 0.0.0.0

volumes:
  postgres_data:
  maven-repo:

networks:
  fintrack-network:
    driver: bridge
```

---

## 📄 `docker-compose.yml`
* **Size:** 2.0 KB
* **Language:** yaml

```yaml
version: '3.8'

services:
  postgres:
    image: postgres:15-alpine
    container_name: fintrack-db
    environment:
      POSTGRES_DB: fintrack
      POSTGRES_USER: fintrack_user
      POSTGRES_PASSWORD: secure_password
    ports:
      - "5432:5432"
    volumes:
      - postgres_data:/var/lib/postgresql/data
      - ./backend/src/main/resources/db/migration:/docker-entrypoint-initdb.d
    networks:
      - fintrack-network
    healthcheck:
      test: ["CMD-SHELL", "pg_isready -U fintrack_user -d fintrack"]
      interval: 10s
      timeout: 5s
      retries: 5

  backend:
    build: 
      context: ./backend
      dockerfile: Dockerfile.dev
    container_name: fintrack-backend-dev
    environment:
      SPRING_PROFILES_ACTIVE: dev
      DB_USERNAME: fintrack_user
      DB_PASSWORD: secure_password
      SPRING_DATASOURCE_URL: jdbc:postgresql://postgres:5432/fintrack
      SPRING_JPA_HIBERNATE_DDL_AUTO: validate
      SPRING_JPA_SHOW_SQL: "true"
    ports:
      - "8080:8080"
    depends_on:
      postgres:
        condition: service_healthy
    networks:
      - fintrack-network
    volumes:
      - ./backend/src:/app/src
      - ./backend/pom.xml:/app/pom.xml
      - maven-repo:/root/.m2
    command: mvn spring-boot:run

  frontend:
    build:
      context: ./frontend
      dockerfile: Dockerfile.dev
    container_name: fintrack-frontend-dev
    ports:
      - "3000:3000"
    volumes:
      - ./frontend/src:/app/src
      - ./frontend/public:/app/public
      - ./frontend/index.html:/app/index.html
      - ./frontend/package.json:/app/package.json
      - ./frontend/vite.config.ts:/app/vite.config.ts
      - ./frontend/tailwind.config.js:/app/tailwind.config.js
      - /app/node_modules  # Anonymous volume to preserve node_modules
    depends_on:
      - backend
    networks:
      - fintrack-network
    environment:
      - VITE_API_BASE_URL=http://localhost:8080/api

volumes:
  postgres_data:
  maven-repo:

networks:
  fintrack-network:
    driver: bridge
```

---

## 📄 `frontend\Dockerfile`
* **Size:** 370.0 B
* **Language:** dockerfile

```dockerfile
# Build stage - Use Node 20 LTS
FROM node:20-alpine AS builder
WORKDIR /app
COPY package*.json ./
RUN npm ci --only=production

# Copy source and build
COPY . .
RUN npm run build

# Production stage
FROM nginx:alpine
COPY --from=builder /app/dist /usr/share/nginx/html
COPY nginx.conf /etc/nginx/nginx.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
```

---

## 📄 `frontend\Dockerfile.dev`
* **Size:** 228.0 B
* **Language:** dockerfile

```dockerfile
FROM node:20-alpine

WORKDIR /app

# Copy package files
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy source code
COPY . .

EXPOSE 3000

CMD ["npm", "run", "dev", "--", "--host", "0.0.0.0"]
```

---

## 📄 `frontend\README.md`
* **Size:** 2.5 KB
* **Language:** markdown

```markdown
# React + TypeScript + Vite

This template provides a minimal setup to get React working in Vite with HMR and some ESLint rules.

Currently, two official plugins are available:

- [@vitejs/plugin-react](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react) uses [Babel](https://babeljs.io/) (or [oxc](https://oxc.rs) when used in [rolldown-vite](https://vite.dev/guide/rolldown)) for Fast Refresh
- [@vitejs/plugin-react-swc](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react-swc) uses [SWC](https://swc.rs/) for Fast Refresh

## React Compiler

The React Compiler is not enabled on this template because of its impact on dev & build performances. To add it, see [this documentation](https://react.dev/learn/react-compiler/installation).

## Expanding the ESLint configuration

If you are developing a production application, we recommend updating the configuration to enable type-aware lint rules:

```js
export default defineConfig([
  globalIgnores(['dist']),
  {
    files: ['**/*.{ts,tsx}'],
    extends: [
      // Other configs...

      // Remove tseslint.configs.recommended and replace with this
      tseslint.configs.recommendedTypeChecked,
      // Alternatively, use this for stricter rules
      tseslint.configs.strictTypeChecked,
      // Optionally, add this for stylistic rules
      tseslint.configs.stylisticTypeChecked,

      // Other configs...
    ],
    languageOptions: {
      parserOptions: {
        project: ['./tsconfig.node.json', './tsconfig.app.json'],
        tsconfigRootDir: import.meta.dirname,
      },
      // other options...
    },
  },
])
```

You can also install [eslint-plugin-react-x](https://github.com/Rel1cx/eslint-react/tree/main/packages/plugins/eslint-plugin-react-x) and [eslint-plugin-react-dom](https://github.com/Rel1cx/eslint-react/tree/main/packages/plugins/eslint-plugin-react-dom) for React-specific lint rules:

```js
// eslint.config.js
import reactX from 'eslint-plugin-react-x'
import reactDom from 'eslint-plugin-react-dom'

export default defineConfig([
  globalIgnores(['dist']),
  {
    files: ['**/*.{ts,tsx}'],
    extends: [
      // Other configs...
      // Enable lint rules for React
      reactX.configs['recommended-typescript'],
      // Enable lint rules for React DOM
      reactDom.configs.recommended,
    ],
    languageOptions: {
      parserOptions: {
        project: ['./tsconfig.node.json', './tsconfig.app.json'],
        tsconfigRootDir: import.meta.dirname,
      },
      // other options...
    },
  },
])
```

```

---

## 📄 `frontend\eslint.config.js`
* **Size:** 621.0 B
* **Language:** javascript

```javascript
import js from '@eslint/js'
import globals from 'globals'
import reactHooks from 'eslint-plugin-react-hooks'
import reactRefresh from 'eslint-plugin-react-refresh'
import tseslint from 'typescript-eslint'
import { defineConfig, globalIgnores } from 'eslint/config'

export default defineConfig([
  globalIgnores(['dist']),
  {
    files: ['**/*.{ts,tsx}'],
    extends: [
      js.configs.recommended,
      tseslint.configs.recommended,
      reactHooks.configs['recommended-latest'],
      reactRefresh.configs.vite,
    ],
    languageOptions: {
      ecmaVersion: 2020,
      globals: globals.browser,
    },
  },
])

```

---

## 📄 `frontend\index.html`
* **Size:** 357.0 B
* **Language:** html

```html
<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link rel="icon" type="image/svg+xml" href="/vite.svg" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>frontend</title>
  </head>
  <body>
    <div id="root"></div>
    <script type="module" src="/src/main.tsx"></script>
  </body>
</html>

```

---

## 📄 `frontend\package.json`
* **Size:** 962.0 B
* **Language:** json

```json
{
  "name": "frontend",
  "private": true,
  "version": "0.0.0",
  "type": "module",
  "scripts": {
    "dev": "vite",
    "build": "tsc -b && vite build",
    "lint": "eslint .",
    "preview": "vite preview"
  },
  "dependencies": {
    "@hookform/resolvers": "^5.2.2",
    "axios": "^1.13.1",
    "react": "^19.1.1",
    "react-dom": "^19.1.1",
    "react-hook-form": "^7.65.0",
    "react-router-dom": "^7.9.4",
    "zod": "^4.1.12"
  },
  "devDependencies": {
    "@eslint/js": "^9.36.0",
    "@tailwindcss/oxide": "^4.1.16",
    "@tailwindcss/vite": "^4.1.16",
    "@types/node": "^24.6.0",
    "@types/react": "^19.2.2",
    "@types/react-dom": "^19.2.2",
    "@vitejs/plugin-react": "^5.0.4",
    "eslint": "^9.36.0",
    "eslint-plugin-react-hooks": "^5.2.0",
    "eslint-plugin-react-refresh": "^0.4.22",
    "globals": "^16.4.0",
    "tailwindcss": "^4.1.16",
    "typescript": "~5.9.3",
    "typescript-eslint": "^8.45.0",
    "vite": "^7.1.7"
  }
}

```

---

## 📄 `frontend\src\App.tsx`
* **Size:** 1.4 KB
* **Language:** typescript

```typescript
import { Routes, Route, Navigate } from 'react-router-dom';
import { AuthProvider } from './contexts/AuthContext';
import ErrorBoundary from './components/ErrorBoundary';
import ProtectedRoute from './components/ProtectedRoute';
import Layout from './components/Layout/Layout';
import Dashboard from './pages/Dashboard';
import Accounts from './pages/Accounts';
import Transactions from './pages/Transactions';
import Login from './pages/Login';
import Register from './pages/Register';

function App() {
  return (
    <ErrorBoundary>
      <AuthProvider>
        <Routes>
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route
            path="/"
            element={
              <ProtectedRoute>
                <Layout />
              </ProtectedRoute>
            }
          >
            <Route index element={<Dashboard />} />
            <Route path="accounts" element={<Accounts />} />
            <Route path="transactions" element={<Transactions />} />
            <Route path="categories" element={<div>Categories Page - Coming Soon</div>} />
            <Route path="budgets" element={<div>Budgets Page - Coming Soon</div>} />
          </Route>
          <Route path="*" element={<Navigate to="/" replace />} />
        </Routes>
      </AuthProvider>
    </ErrorBoundary>
  );
}

export default App;
```

---

## 📄 `frontend\src\components\ErrorBoundary.tsx`
* **Size:** 1.8 KB
* **Language:** typescript

```typescript
import React from 'react';

interface ErrorBoundaryState {
  hasError: boolean;
  error?: Error;
}

interface ErrorBoundaryProps {
  children: React.ReactNode;
  fallback?: React.ComponentType<{ error: Error }>;
}

class ErrorBoundary extends React.Component<ErrorBoundaryProps, ErrorBoundaryState> {
  constructor(props: ErrorBoundaryProps) {
    super(props);
    this.state = { hasError: false };
  }

  static getDerivedStateFromError(error: Error): ErrorBoundaryState {
    return { hasError: true, error };
  }

  componentDidCatch(error: Error, errorInfo: React.ErrorInfo) {
    console.error('Error caught by boundary:', error, errorInfo);
  }

  render() {
    if (this.state.hasError) {
      if (this.props.fallback) {
        const FallbackComponent = this.props.fallback;
        return <FallbackComponent error={this.state.error!} />;
      }

      return (
        <div className="min-h-screen flex items-center justify-center bg-gray-50">
          <div className="max-w-md w-full bg-white p-8 rounded-lg shadow-lg border border-gray-200">
            <div className="text-center">
              <div className="text-6xl mb-4">😵</div>
              <h2 className="text-2xl font-bold text-gray-900 mb-2">Something went wrong</h2>
              <p className="text-gray-600 mb-4">
                We encountered an unexpected error. Please try refreshing the page.
              </p>
              <button
                onClick={() => window.location.reload()}
                className="bg-primary-500 text-white px-6 py-2 rounded-lg hover:bg-primary-600 transition-colors"
              >
                Refresh Page
              </button>
            </div>
          </div>
        </div>
      );
    }

    return this.props.children;
  }
}

export default ErrorBoundary;
```

---

## 📄 `frontend\src\components\Layout\Header.tsx`
* **Size:** 2.1 KB
* **Language:** typescript

```typescript
import { useState } from 'react';
import { useAuth } from '../../contexts/AuthContext';

const Header = () => {
  const { user, logout } = useAuth();
  const [isDropdownOpen, setIsDropdownOpen] = useState(false);

  const handleLogout = () => {
    logout();
  };

  return (
    <header className="bg-white shadow-sm border-b border-gray-200 px-6 py-4">
      <div className="flex items-center justify-between">
        <div>
          <h1 className="text-2xl font-bold text-gray-900">FinTrack</h1>
          <p className="text-sm text-gray-600">Your personal finance dashboard</p>
        </div>
        <div className="flex items-center space-x-4">
          <div className="text-right">
            <p className="font-medium text-gray-900">
              {user?.firstName} {user?.lastName}
            </p>
            <p className="text-sm text-gray-600">{user?.email}</p>
          </div>
          <div className="relative">
            <button
              onClick={() => setIsDropdownOpen(!isDropdownOpen)}
              className="w-10 h-10 bg-primary-500 rounded-full flex items-center justify-center cursor-pointer hover:bg-primary-600 transition-colors focus:outline-none focus:ring-2 focus:ring-primary-300"
            >
              <span className="text-white font-semibold">
                {user?.firstName?.[0]}{user?.lastName?.[0]}
              </span>
            </button>
            
            {isDropdownOpen && (
              <div className="absolute right-0 mt-2 w-48 bg-white rounded-lg shadow-lg border border-gray-200 z-50">
                <button
                  onClick={handleLogout}
                  className="w-full text-left px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 rounded-lg transition-colors"
                >
                  Sign out
                </button>
              </div>
            )}
          </div>
        </div>
      </div>
      
      {isDropdownOpen && (
        <div 
          className="fixed inset-0 z-40" 
          onClick={() => setIsDropdownOpen(false)}
        />
      )}
    </header>
  );
};

export default Header;
```

---

## 📄 `frontend\src\components\Layout\Layout.tsx`
* **Size:** 431.0 B
* **Language:** typescript

```typescript
import { Outlet } from 'react-router-dom'
import Header from './Header'
import Sidebar from './Sidebar'

const Layout = () => {
  return (
    <div className="min-h-screen bg-gray-50 flex">
      <Sidebar />
      <div className="flex-1 flex flex-col">
        <Header />
        <main className="flex-1 p-6 overflow-auto">
          <Outlet />
        </main>
      </div>
    </div>
  )
}

export default Layout
```

---

## 📄 `frontend\src\components\Layout\Sidebar.tsx`
* **Size:** 1.2 KB
* **Language:** typescript

```typescript
import { NavLink } from 'react-router-dom'

const Sidebar = () => {
  const navigation = [
    { name: 'Dashboard', href: '/', icon: '📊' },
    { name: 'Accounts', href: '/accounts', icon: '🏦' },
    { name: 'Transactions', href: '/transactions', icon: '💰' },
    { name: 'Categories', href: '/categories', icon: '📁' },
    { name: 'Budgets', href: '/budgets', icon: '🎯' },
  ]

  return (
    <div className="w-64 bg-white shadow-lg">
      <nav className="mt-8 px-4">
        <ul className="space-y-2">
          {navigation.map((item) => (
            <li key={item.name}>
              <NavLink
                to={item.href}
                className={({ isActive }) =>
                  `flex items-center px-4 py-3 text-sm font-medium rounded-lg transition-colors ${
                    isActive
                      ? 'bg-primary-50 text-primary-700 border-r-2 border-primary-700'
                      : 'text-gray-700 hover:bg-gray-100'
                  }`
                }
              >
                <span className="mr-3 text-lg">{item.icon}</span>
                {item.name}
              </NavLink>
            </li>
          ))}
        </ul>
      </nav>
    </div>
  )
}

export default Sidebar
```

---

## 📄 `frontend\src\components\ProtectedRoute.tsx`
* **Size:** 709.0 B
* **Language:** typescript

```typescript
import type { ReactNode } from 'react';
import { Navigate } from 'react-router-dom';
import { useAuth } from '../contexts/AuthContext';

interface ProtectedRouteProps {
  children: ReactNode;
}

const ProtectedRoute: React.FC<ProtectedRouteProps> = ({ children }) => {
  const { isAuthenticated, isLoading } = useAuth();

  if (isLoading) {
    return (
      <div className="min-h-screen flex items-center justify-center">
        <div className="animate-spin rounded-full h-12 w-12 border-b-2 border-primary-500"></div>
      </div>
    );
  }

  if (!isAuthenticated) {
    return <Navigate to="/login" replace />;
  }

  return <>{children}</>;
};

export default ProtectedRoute;
```

---

## 📄 `frontend\src\components\ui\LoadingSpinner.tsx`
* **Size:** 421.0 B
* **Language:** typescript

```typescript
const LoadingSpinner = ({ size = 'md' }: { size?: 'sm' | 'md' | 'lg' }) => {
  const sizeClasses = {
    sm: 'h-4 w-4',
    md: 'h-8 w-8',
    lg: 'h-12 w-12'
  };

  return (
    <div className="flex items-center justify-center">
      <div
        className={`animate-spin rounded-full border-b-2 border-primary-500 ${sizeClasses[size]}`}
      ></div>
    </div>
  );
};

export default LoadingSpinner;
```

---

## 📄 `frontend\src\components\ui\index.ts`
* **Size:** 61.0 B
* **Language:** typescript

```typescript
export { default as LoadingSpinner } from './LoadingSpinner';
```

---

## 📄 `frontend\src\contexts\AuthContext.tsx`
* **Size:** 2.4 KB
* **Language:** typescript

```typescript
import React, { createContext, useContext, useState, useEffect, type ReactNode } from 'react';
import type { AuthContextType, User, LoginRequest, RegisterRequest } from '../types/auth';
import { authService } from '../services/authService'; // Fixed import

const AuthContext = createContext<AuthContextType | undefined>(undefined);

interface AuthProviderProps {
  children: ReactNode;
}

export const AuthProvider: React.FC<AuthProviderProps> = ({ children }) => {
  const [user, setUser] = useState<User | null>(null);
  const [token, setToken] = useState<string | null>(null);
  const [isLoading, setIsLoading] = useState(true);

  // Initialize auth state from localStorage
  useEffect(() => {
    const initializeAuth = async () => {
      const { token: storedToken, user: storedUser } = authService.getStoredAuthData();
      
      if (storedToken && storedUser) {
        setToken(storedToken);
        setUser(storedUser);
        
        // Verify token is still valid by fetching current user
        try {
          await authService.getCurrentUser();
        } catch {
          // Token is invalid, clear stored data
          authService.clearAuthData();
          setToken(null);
          setUser(null);
        }
      }
      
      setIsLoading(false);
    };

    initializeAuth();
  }, []);

  const login = async (credentials: LoginRequest): Promise<void> => {
    const response = await authService.login(credentials);
    const { token: authToken, email, firstName, lastName } = response;
    
    const userData = { email, firstName, lastName };
    
    setToken(authToken);
    setUser(userData);
    authService.saveAuthData(authToken, userData);
  };

  const register = async (userData: RegisterRequest): Promise<void> => {
    await authService.register(userData);
  };

  const logout = (): void => {
    setUser(null);
    setToken(null);
    authService.clearAuthData();
    window.location.href = '/login';
  };

  const value: AuthContextType = {
    user,
    token,
    isLoading,
    login,
    register,
    logout,
    isAuthenticated: !!token && !!user,
  };

  return <AuthContext.Provider value={value}>{children}</AuthContext.Provider>;
};

export const useAuth = (): AuthContextType => {
  const context = useContext(AuthContext);
  if (context === undefined) {
    throw new Error('useAuth must be used within an AuthProvider');
  }
  return context;
};
```

---

## 📄 `frontend\src\index.css`
* **Size:** 698.0 B
* **Language:** css

```css
@import "tailwindcss";

/* Define your custom theme */
@theme {
  --color-primary-50: #f0f9ff;
  --color-primary-500: #3b82f6;
  --color-primary-600: #2563eb;
  --color-primary-700: #1d4ed8;
  
  --color-success-500: #10b981;
  --color-success-600: #059669;
  
  --color-warning-500: #f59e0b;
  --color-warning-600: #d97706;
  
  --color-danger-500: #ef4444;
  --color-danger-600: #dc2626;
}

/* Ensure base styles are applied */
@layer base {
  * {
    box-sizing: border-box;
  }
  
  body {
    margin: 0;
    font-family: 'Inter', system-ui, -apple-system, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
  }
  
  button {
    cursor: pointer;
  }
}
```

---

## 📄 `frontend\src\main.tsx`
* **Size:** 327.0 B
* **Language:** typescript

```typescript
import React from 'react'
import ReactDOM from 'react-dom/client'
import { BrowserRouter } from 'react-router-dom'
import App from './App.tsx'
import './index.css'

ReactDOM.createRoot(document.getElementById('root')!).render(
  <React.StrictMode>
    <BrowserRouter>
      <App />
    </BrowserRouter>
  </React.StrictMode>,
)
```

---

## 📄 `frontend\src\pages\Accounts.tsx`
* **Size:** 9.5 KB
* **Language:** typescript

```typescript
import { useState, useEffect } from 'react';
import { accountService, type Account } from '../services/accountService';
import LoadingSpinner from '../components/ui/LoadingSpinner';

const Accounts = () => {
  const [accounts, setAccounts] = useState<Account[]>([]);
  const [isLoading, setIsLoading] = useState(true);
  const [error, setError] = useState('');
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [isSubmitting, setIsSubmitting] = useState(false);

  const [formData, setFormData] = useState({
    name: '',
    type: 'CHECKING' as Account['type'],
    initialBalance: '0',
  });

  useEffect(() => {
    loadAccounts();
  }, []);

  const loadAccounts = async () => {
    try {
      setIsLoading(true);
      setError('');
      const accountsData = await accountService.getAccounts();
      setAccounts(accountsData);
    } catch (err: unknown) {
      const errorMessage = err instanceof Error ? err.message : 'Failed to load accounts';
      setError(errorMessage);
    } finally {
      setIsLoading(false);
    }
  };

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    try {
      setIsSubmitting(true);
      await accountService.createAccount({
        name: formData.name,
        type: formData.type,
        initialBalance: parseFloat(formData.initialBalance) || 0,
      });
      await loadAccounts();
      setIsModalOpen(false);
      setFormData({ name: '', type: 'CHECKING', initialBalance: '0' });
    } catch (err: unknown) {
      const errorMessage = err instanceof Error ? err.message : 'Failed to create account';
      setError(errorMessage);
    } finally {
      setIsSubmitting(false);
    }
  };

  const formatCurrency = (amount: number): string => {
    return new Intl.NumberFormat('en-US', {
      style: 'currency',
      currency: 'USD',
    }).format(amount);
  };

  const getAccountTypeColor = (type: Account['type']) => {
    const colors = {
      CHECKING: 'bg-blue-100 text-blue-800',
      SAVINGS: 'bg-green-100 text-green-800',
      CREDIT_CARD: 'bg-orange-100 text-orange-800',
      CASH: 'bg-gray-100 text-gray-800',
      INVESTMENT: 'bg-purple-100 text-purple-800',
    };
    return colors[type];
  };

  if (isLoading) {
    return (
      <div className="space-y-6">
        <div className="flex items-center justify-between">
          <h2 className="text-3xl font-bold text-gray-900">Accounts</h2>
        </div>
        <div className="flex items-center justify-center h-64">
          <LoadingSpinner size="lg" />
        </div>
      </div>
    );
  }

  return (
    <div className="space-y-6">
      {/* Header */}
      <div className="flex items-center justify-between">
        <h2 className="text-3xl font-bold text-gray-900">Accounts</h2>
        <button
          onClick={() => setIsModalOpen(true)}
          className="bg-primary-500 text-white px-6 py-3 rounded-lg hover:bg-primary-600 transition-colors shadow-sm font-medium"
        >
          Add Account
        </button>
      </div>

      {/* Error Display */}
      {error && (
        <div className="bg-red-50 border border-red-200 text-red-700 px-4 py-3 rounded-lg">
          {error}
        </div>
      )}

      {/* Accounts Grid */}
      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
        {accounts.map((account) => (
          <div
            key={account.id}
            className="bg-white p-6 rounded-xl shadow-sm border border-gray-200 hover:shadow-md transition-shadow"
          >
            <div className="flex items-start justify-between mb-4">
              <div>
                <h3 className="text-lg font-semibold text-gray-900">{account.name}</h3>
                <span
                  className={`inline-block mt-1 px-2 py-1 text-xs font-medium rounded-full ${getAccountTypeColor(
                    account.type
                  )}`}
                >
                  {account.type.replace('_', ' ')}
                </span>
              </div>
              <div className="text-2xl">
                {account.type === 'CREDIT_CARD' ? '💳' : '💰'}
              </div>
            </div>
            
            <div className="space-y-2">
              <div className="flex justify-between items-center">
                <span className="text-sm text-gray-600">Balance</span>
                <span
                  className={`text-lg font-bold ${
                    account.balance >= 0 ? 'text-green-600' : 'text-red-600'
                  }`}
                >
                  {formatCurrency(account.balance)}
                </span>
              </div>
              <div className="flex justify-between items-center">
                <span className="text-sm text-gray-600">Currency</span>
                <span className="text-sm font-medium text-gray-900">{account.currency}</span>
              </div>
              <div className="flex justify-between items-center">
                <span className="text-sm text-gray-600">Status</span>
                <span
                  className={`text-sm font-medium ${
                    account.active ? 'text-green-600' : 'text-red-600'
                  }`}
                >
                  {account.active ? 'Active' : 'Inactive'}
                </span>
              </div>
            </div>
          </div>
        ))}
      </div>

      {/* Empty State */}
      {accounts.length === 0 && (
        <div className="bg-white rounded-xl shadow-sm border border-gray-200 p-8 text-center">
          <div className="text-6xl mb-4">🏦</div>
          <h3 className="text-xl font-semibold text-gray-900 mb-2">No accounts yet</h3>
          <p className="text-gray-600 mb-6">
            Start by creating your first account to track your finances.
          </p>
          <button
            onClick={() => setIsModalOpen(true)}
            className="bg-primary-500 text-white px-6 py-3 rounded-lg hover:bg-primary-600 transition-colors"
          >
            Create Your First Account
          </button>
        </div>
      )}

      {/* Add Account Modal */}
      {isModalOpen && (
        <div className="fixed inset-0 bg-black bg-opacity-50 flex items-center justify-center p-4 z-50">
          <div className="bg-white rounded-xl shadow-lg max-w-md w-full">
            <div className="p-6 border-b border-gray-200">
              <h3 className="text-lg font-semibold text-gray-900">Create New Account</h3>
            </div>

            <form onSubmit={handleSubmit} className="p-6 space-y-4">
              <div>
                <label className="block text-sm font-medium text-gray-700 mb-1">
                  Account Name *
                </label>
                <input
                  type="text"
                  value={formData.name}
                  onChange={(e) => setFormData({ ...formData, name: e.target.value })}
                  className="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-primary-500"
                  placeholder="e.g., Main Checking Account"
                  required
                />
              </div>

              <div>
                <label className="block text-sm font-medium text-gray-700 mb-1">
                  Account Type *
                </label>
                <select
                  value={formData.type}
                  onChange={(e) => setFormData({ ...formData, type: e.target.value as Account['type'] })}
                  className="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-primary-500"
                >
                  <option value="CHECKING">Checking</option>
                  <option value="SAVINGS">Savings</option>
                  <option value="CREDIT_CARD">Credit Card</option>
                  <option value="CASH">Cash</option>
                  <option value="INVESTMENT">Investment</option>
                </select>
              </div>

              <div>
                <label className="block text-sm font-medium text-gray-700 mb-1">
                  Initial Balance
                </label>
                <input
                  type="number"
                  step="0.01"
                  value={formData.initialBalance}
                  onChange={(e) => setFormData({ ...formData, initialBalance: e.target.value })}
                  className="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-primary-500"
                  placeholder="0.00"
                />
              </div>

              <div className="flex space-x-3 pt-4">
                <button
                  type="button"
                  onClick={() => setIsModalOpen(false)}
                  className="flex-1 px-4 py-2 border border-gray-300 text-gray-700 rounded-lg hover:bg-gray-50 transition-colors"
                >
                  Cancel
                </button>
                <button
                  type="submit"
                  disabled={isSubmitting || !formData.name.trim()}
                  className="flex-1 bg-primary-500 text-white px-4 py-2 rounded-lg hover:bg-primary-600 transition-colors disabled:opacity-50"
                >
                  {isSubmitting ? <LoadingSpinner size="sm" /> : 'Create Account'}
                </button>
              </div>
            </form>
          </div>
        </div>
      )}
    </div>
  );
};

export default Accounts;
```

---

## 📄 `frontend\src\pages\Dashboard.tsx`
* **Size:** 6.4 KB
* **Language:** typescript

```typescript
import { useEffect, useState } from 'react';
import { accountService } from '../services/accountService';
import { transactionService } from '../services/transactionService';

interface DashboardStats {
  totalBalance: number;
  monthlyIncome: number;
  monthlyExpenses: number;
  savingsRate: number;
}

const Dashboard = () => {
  const [stats, setStats] = useState<DashboardStats>({
    totalBalance: 0,
    monthlyIncome: 0,
    monthlyExpenses: 0,
    savingsRate: 0,
  });
  const [isLoading, setIsLoading] = useState(true);
  const [error, setError] = useState('');

  useEffect(() => {
    const loadDashboardData = async () => {
      try {
        setIsLoading(true);
        setError('');

        // Get current month dates
        const now = new Date();
        const startOfMonth = new Date(now.getFullYear(), now.getMonth(), 1)
          .toISOString()
          .split('T')[0];
        const endOfMonth = new Date(now.getFullYear(), now.getMonth() + 1, 0)
          .toISOString()
          .split('T')[0];

        const [totalBalance, monthlyIncome, monthlyExpenses] = await Promise.all([
          accountService.getTotalBalance(),
          transactionService.getTotalIncome(startOfMonth, endOfMonth),
          transactionService.getTotalExpenses(startOfMonth, endOfMonth),
        ]);

        const savingsRate = monthlyIncome > 0 
          ? ((monthlyIncome - monthlyExpenses) / monthlyIncome) * 100 
          : 0;

        setStats({
          totalBalance,
          monthlyIncome,
          monthlyExpenses,
          savingsRate: Math.round(savingsRate),
        });
      } catch (err: unknown) {
        const errorMessage = err instanceof Error ? err.message : 'Failed to load dashboard data';
        setError(errorMessage);
        console.error('Dashboard error:', err);
      } finally {
        setIsLoading(false);
      }
    };

    loadDashboardData();
  }, []);

  const formatCurrency = (amount: number): string => {
    return new Intl.NumberFormat('en-US', {
      style: 'currency',
      currency: 'USD',
    }).format(amount);
  };

  if (isLoading) {
    return (
      <div className="space-y-6">
        <div className="flex items-center justify-between">
          <h2 className="text-3xl font-bold text-gray-900">Dashboard</h2>
        </div>
        <div className="flex items-center justify-center h-64">
          <div className="animate-spin rounded-full h-12 w-12 border-b-2 border-primary-500"></div>
        </div>
      </div>
    );
  }

  if (error) {
    return (
      <div className="space-y-6">
        <div className="flex items-center justify-between">
          <h2 className="text-3xl font-bold text-gray-900">Dashboard</h2>
        </div>
        <div className="bg-red-50 border border-red-200 text-red-700 px-4 py-3 rounded-lg">
          {error}
        </div>
      </div>
    );
  }

  return (
    <div className="space-y-6">
      <div className="flex items-center justify-between">
        <h2 className="text-3xl font-bold text-gray-900">Dashboard</h2>
        <button 
          className="bg-primary-500 text-white px-6 py-3 rounded-lg hover:bg-primary-600 transition-colors shadow-sm font-medium"
          onClick={() => window.location.href = '/transactions'}
        >
          Add Transaction
        </button>
      </div>

      {/* Stats Grid */}
      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6">
        <div className="bg-white p-6 rounded-xl shadow-sm border border-gray-200">
          <div className="flex items-center">
            <div className="p-2 bg-green-100 rounded-lg">
              <span className="text-2xl">💰</span>
            </div>
            <div className="ml-4">
              <p className="text-sm font-medium text-gray-600">Total Balance</p>
              <p className="text-2xl font-bold text-gray-900">
                {formatCurrency(stats.totalBalance)}
              </p>
            </div>
          </div>
        </div>

        <div className="bg-white p-6 rounded-xl shadow-sm border border-gray-200">
          <div className="flex items-center">
            <div className="p-2 bg-blue-100 rounded-lg">
              <span className="text-2xl">📈</span>
            </div>
            <div className="ml-4">
              <p className="text-sm font-medium text-gray-600">Monthly Income</p>
              <p className="text-2xl font-bold text-gray-900">
                {formatCurrency(stats.monthlyIncome)}
              </p>
            </div>
          </div>
        </div>

        <div className="bg-white p-6 rounded-xl shadow-sm border border-gray-200">
          <div className="flex items-center">
            <div className="p-2 bg-red-100 rounded-lg">
              <span className="text-2xl">📉</span>
            </div>
            <div className="ml-4">
              <p className="text-sm font-medium text-gray-600">Monthly Expenses</p>
              <p className="text-2xl font-bold text-gray-900">
                {formatCurrency(stats.monthlyExpenses)}
              </p>
            </div>
          </div>
        </div>

        <div className="bg-white p-6 rounded-xl shadow-sm border border-gray-200">
          <div className="flex items-center">
            <div className="p-2 bg-purple-100 rounded-lg">
              <span className="text-2xl">🎯</span>
            </div>
            <div className="ml-4">
              <p className="text-sm font-medium text-gray-600">Savings Rate</p>
              <p className="text-2xl font-bold text-gray-900">
                {stats.savingsRate}%
              </p>
            </div>
          </div>
        </div>
      </div>

      {/* Recent Transactions */}
      <div className="bg-white rounded-xl shadow-sm border border-gray-200">
        <div className="p-6 border-b border-gray-200">
          <h3 className="text-lg font-semibold text-gray-900">Recent Transactions</h3>
        </div>
        <div className="p-6">
          <p className="text-gray-600 text-center py-8">
            <button 
              onClick={() => window.location.href = '/transactions'}
              className="text-primary-500 hover:text-primary-600 font-medium"
            >
              Go to Transactions
            </button> to view and manage your transactions.
          </p>
        </div>
      </div>
    </div>
  );
};

export default Dashboard;
```

---

## 📄 `frontend\src\pages\Login.tsx`
* **Size:** 4.1 KB
* **Language:** typescript

```typescript
import { useState } from 'react';
import { Link, useNavigate } from 'react-router-dom';
import { useForm } from 'react-hook-form';
import { zodResolver } from '@hookform/resolvers/zod';
import { useAuth } from '../contexts/AuthContext';
import { loginSchema, type LoginFormData } from '../validations/auth';

interface ApiError {
  response?: {
    data?: {
      message?: string;
    };
  };
  message?: string;
}

const Login = () => {
  const [isLoading, setIsLoading] = useState(false);
  const [error, setError] = useState('');
  const { login } = useAuth();
  const navigate = useNavigate();

  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm<LoginFormData>({
    resolver: zodResolver(loginSchema),
  });

  const onSubmit = async (data: LoginFormData): Promise<void> => {
    setIsLoading(true);
    setError('');

    try {
      await login(data);
      navigate('/');
    } catch (err: unknown) {
      const apiError = err as ApiError;
      setError(apiError.response?.data?.message || apiError.message || 'Login failed. Please try again.');
    } finally {
      setIsLoading(false);
    }
  };

  return (
    <div className="min-h-screen bg-linear-to-br from-blue-50 to-indigo-100 flex items-center justify-center p-4">
      <div className="max-w-md w-full space-y-8 bg-white p-8 rounded-2xl shadow-lg border border-gray-200">
        <div className="text-center">
          <h2 className="text-3xl font-bold text-gray-900">Welcome back</h2>
          <p className="mt-2 text-gray-600">Sign in to your FinTrack account</p>
        </div>

        {error && (
          <div className="bg-red-50 border border-red-200 text-red-700 px-4 py-3 rounded-lg">
            {error}
          </div>
        )}

        <form className="mt-8 space-y-6" onSubmit={handleSubmit(onSubmit)}>
          <div>
            <label htmlFor="email" className="block text-sm font-medium text-gray-700">
              Email address
            </label>
            <input
              {...register('email')}
              type="email"
              className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-primary-500 focus:border-primary-500"
              placeholder="Enter your email"
            />
            {errors.email && (
              <p className="mt-1 text-sm text-red-600">{errors.email.message}</p>
            )}
          </div>

          <div>
            <label htmlFor="password" className="block text-sm font-medium text-gray-700">
              Password
            </label>
            <input
              {...register('password')}
              type="password"
              className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-primary-500 focus:border-primary-500"
              placeholder="Enter your password"
            />
            {errors.password && (
              <p className="mt-1 text-sm text-red-600">{errors.password.message}</p>
            )}
          </div>

          <button
            type="submit"
            disabled={isLoading}
            className="w-full flex justify-center py-3 px-4 border border-transparent rounded-lg shadow-sm text-sm font-medium text-white bg-primary-500 hover:bg-primary-600 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-primary-500 transition-colors disabled:opacity-50 disabled:cursor-not-allowed"
          >
            {isLoading ? (
              <div className="animate-spin rounded-full h-5 w-5 border-b-2 border-white"></div>
            ) : (
              'Sign in'
            )}
          </button>
        </form>

        <div className="text-center">
          <p className="text-sm text-gray-600">
            Don't have an account?{' '}
            <Link to="/register" className="font-medium text-primary-500 hover:text-primary-600">
              Sign up
            </Link>
          </p>
        </div>
      </div>
    </div>
  );
};

export default Login;
```

---

## 📄 `frontend\src\pages\Register.tsx`
* **Size:** 6.2 KB
* **Language:** typescript

```typescript
import { useState } from 'react';
import { Link, useNavigate } from 'react-router-dom';
import { useForm } from 'react-hook-form';
import { zodResolver } from '@hookform/resolvers/zod';
import { useAuth } from '../contexts/AuthContext';
import { registerSchema, type RegisterFormData } from '../validations/auth';

interface ApiError {
  response?: {
    data?: {
      message?: string;
    };
  };
  message?: string;
}

const Register = () => {
  const [isLoading, setIsLoading] = useState(false);
  const [error, setError] = useState('');
  const { register: registerUser } = useAuth();
  const navigate = useNavigate();

  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm<RegisterFormData>({
    resolver: zodResolver(registerSchema),
  });

  const onSubmit = async (data: RegisterFormData): Promise<void> => {
    setIsLoading(true);
    setError('');

    try {
      await registerUser(data);
      navigate('/login?message=Registration successful. Please login.');
    } catch (err: unknown) {
      const apiError = err as ApiError;
      setError(apiError.response?.data?.message || apiError.message || 'Registration failed. Please try again.');
    } finally {
      setIsLoading(false);
    }
  };

  return (
    <div className="min-h-screen bg-linear-to-br from-blue-50 to-indigo-100 flex items-center justify-center p-4">
      <div className="max-w-md w-full space-y-8 bg-white p-8 rounded-2xl shadow-lg border border-gray-200">
        <div className="text-center">
          <h2 className="text-3xl font-bold text-gray-900">Create account</h2>
          <p className="mt-2 text-gray-600">Join FinTrack to manage your finances</p>
        </div>

        {error && (
          <div className="bg-red-50 border border-red-200 text-red-700 px-4 py-3 rounded-lg">
            {error}
          </div>
        )}

        <form className="mt-8 space-y-6" onSubmit={handleSubmit(onSubmit)}>
          <div className="grid grid-cols-2 gap-4">
            <div>
              <label htmlFor="firstName" className="block text-sm font-medium text-gray-700">
                First name
              </label>
              <input
                {...register('firstName')}
                type="text"
                className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-primary-500 focus:border-primary-500"
                placeholder="John"
              />
              {errors.firstName && (
                <p className="mt-1 text-sm text-red-600">{errors.firstName.message}</p>
              )}
            </div>
            <div>
              <label htmlFor="lastName" className="block text-sm font-medium text-gray-700">
                Last name
              </label>
              <input
                {...register('lastName')}
                type="text"
                className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-primary-500 focus:border-primary-500"
                placeholder="Doe"
              />
              {errors.lastName && (
                <p className="mt-1 text-sm text-red-600">{errors.lastName.message}</p>
              )}
            </div>
          </div>

          <div>
            <label htmlFor="email" className="block text-sm font-medium text-gray-700">
              Email address
            </label>
            <input
              {...register('email')}
              type="email"
              className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-primary-500 focus:border-primary-500"
              placeholder="john@example.com"
            />
            {errors.email && (
              <p className="mt-1 text-sm text-red-600">{errors.email.message}</p>
            )}
          </div>

          <div>
            <label htmlFor="password" className="block text-sm font-medium text-gray-700">
              Password
            </label>
            <input
              {...register('password')}
              type="password"
              className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-primary-500 focus:border-primary-500"
              placeholder="Create a password"
            />
            {errors.password && (
              <p className="mt-1 text-sm text-red-600">{errors.password.message}</p>
            )}
          </div>

          <div>
            <label htmlFor="confirmPassword" className="block text-sm font-medium text-gray-700">
              Confirm Password
            </label>
            <input
              {...register('confirmPassword')}
              type="password"
              className="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-primary-500 focus:border-primary-500"
              placeholder="Confirm your password"
            />
            {errors.confirmPassword && (
              <p className="mt-1 text-sm text-red-600">{errors.confirmPassword.message}</p>
            )}
          </div>

          <button
            type="submit"
            disabled={isLoading}
            className="w-full flex justify-center py-3 px-4 border border-transparent rounded-lg shadow-sm text-sm font-medium text-white bg-primary-500 hover:bg-primary-600 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-primary-500 transition-colors disabled:opacity-50 disabled:cursor-not-allowed"
          >
            {isLoading ? (
              <div className="animate-spin rounded-full h-5 w-5 border-b-2 border-white"></div>
            ) : (
              'Create account'
            )}
          </button>
        </form>

        <div className="text-center">
          <p className="text-sm text-gray-600">
            Already have an account?{' '}
            <Link to="/login" className="font-medium text-primary-500 hover:text-primary-600">
              Sign in
            </Link>
          </p>
        </div>
      </div>
    </div>
  );
};

export default Register;
```

---

## 📄 `frontend\src\pages\Transactions.tsx`
* **Size:** 17.6 KB
* **Language:** typescript

```typescript
import { useState, useEffect } from 'react';
import { useForm } from 'react-hook-form';
import { zodResolver } from '@hookform/resolvers/zod';
import { transactionService } from '../services/transactionService';
import { accountService } from '../services/accountService';
import { categoryService } from '../services/categoryService';
import { transactionSchema, type TransactionFormData } from '../validations/transaction';
import type { Transaction, TransactionFilters } from '../services/transactionService';
import type { Account } from '../services/accountService';
import type { Category } from '../services/categoryService';

const Transactions = () => {
  const [transactions, setTransactions] = useState<Transaction[]>([]);
  const [accounts, setAccounts] = useState<Account[]>([]);
  const [categories, setCategories] = useState<Category[]>([]);
  const [isLoading, setIsLoading] = useState(true);
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [editingTransaction, setEditingTransaction] = useState<Transaction | null>(null);
  const [error, setError] = useState('');
  const [filters] = useState<TransactionFilters>({
    page: 0,
    size: 20,
  });

  const {
    register,
    handleSubmit,
    reset,
    setValue,
    watch,
    formState: { errors, isSubmitting },
  } = useForm<TransactionFormData>({
    resolver: zodResolver(transactionSchema),
    defaultValues: {
      type: 'EXPENSE',
      transactionDate: new Date().toISOString().split('T')[0],
    },
  });

  const transactionType = watch('type');

  // Load initial data
  useEffect(() => {
    loadInitialData();
  }, [filters]);

  const loadInitialData = async (): Promise<void> => {
    try {
      setIsLoading(true);
      setError('');

      const [transactionsData, accountsData, categoriesData] = await Promise.all([
        transactionService.getTransactions(filters),
        accountService.getAccounts(),
        categoryService.getCategories(),
      ]);

      setTransactions(transactionsData.content);
      setAccounts(accountsData);
      setCategories(categoriesData);
    } catch (err: unknown) {
      const errorMessage = err instanceof Error ? err.message : 'Failed to load transactions';
      setError(errorMessage);
      console.error('Transactions error:', err);
    } finally {
      setIsLoading(false);
    }
  };

  const openCreateModal = (): void => {
    setEditingTransaction(null);
    reset({
      type: 'EXPENSE',
      transactionDate: new Date().toISOString().split('T')[0],
    });
    setIsModalOpen(true);
  };

  const openEditModal = (transaction: Transaction): void => {
    setEditingTransaction(transaction);
    setValue('accountId', transaction.accountId);
    setValue('categoryId', transaction.categoryId || undefined);
    setValue('amount', transaction.amount);
    setValue('description', transaction.description);
    setValue('type', transaction.type);
    setValue('transactionDate', transaction.transactionDate);
    setIsModalOpen(true);
  };

  const closeModal = (): void => {
    setIsModalOpen(false);
    setEditingTransaction(null);
    reset();
  };

  const onSubmit = async (data: TransactionFormData): Promise<void> => {
    try {
      setError('');

      if (editingTransaction) {
        await transactionService.updateTransaction(editingTransaction.id, data);
      } else {
        await transactionService.createTransaction(data);
      }

      await loadInitialData();
      closeModal();
    } catch (err: unknown) {
      const errorMessage = err instanceof Error ? err.message : 'Failed to save transaction';
      setError(errorMessage);
    }
  };

  const handleDelete = async (id: number): Promise<void> => {
    if (!confirm('Are you sure you want to delete this transaction?')) {
      return;
    }

    try {
      setError('');
      await transactionService.deleteTransaction(id);
      await loadInitialData();
    } catch (err: unknown) {
      const errorMessage = err instanceof Error ? err.message : 'Failed to delete transaction';
      setError(errorMessage);
    }
  };

  const formatCurrency = (amount: number): string => {
    return new Intl.NumberFormat('en-US', {
      style: 'currency',
      currency: 'USD',
    }).format(amount);
  };

  const formatDate = (dateString: string): string => {
    return new Date(dateString).toLocaleDateString('en-US', {
      year: 'numeric',
      month: 'short',
      day: 'numeric',
    });
  };

  const getTransactionTypeColor = (type: 'INCOME' | 'EXPENSE'): string => {
    return type === 'INCOME' ? 'text-green-600' : 'text-red-600';
  };

  const getTransactionTypeBgColor = (type: 'INCOME' | 'EXPENSE'): string => {
    return type === 'INCOME' ? 'bg-green-100 text-green-800' : 'bg-red-100 text-red-800';
  };

  if (isLoading) {
    return (
      <div className="space-y-6">
        <div className="flex items-center justify-between">
          <h2 className="text-3xl font-bold text-gray-900">Transactions</h2>
        </div>
        <div className="flex items-center justify-center h-64">
          <div className="animate-spin rounded-full h-12 w-12 border-b-2 border-primary-500"></div>
        </div>
      </div>
    );
  }

  return (
    <div className="space-y-6">
      {/* Header */}
      <div className="flex items-center justify-between">
        <h2 className="text-3xl font-bold text-gray-900">Transactions</h2>
        <button
          onClick={openCreateModal}
          className="bg-primary-500 text-white px-6 py-3 rounded-lg hover:bg-primary-600 transition-colors shadow-sm font-medium"
        >
          Add Transaction
        </button>
      </div>

      {/* Error Display */}
      {error && (
        <div className="bg-red-50 border border-red-200 text-red-700 px-4 py-3 rounded-lg">
          {error}
        </div>
      )}

      {/* Transactions List */}
      <div className="bg-white rounded-xl shadow-sm border border-gray-200">
        <div className="p-6 border-b border-gray-200">
          <h3 className="text-lg font-semibold text-gray-900">All Transactions</h3>
        </div>
        
        {transactions.length === 0 ? (
          <div className="p-8 text-center">
            <div className="text-gray-500 mb-4">No transactions found</div>
            <button
              onClick={openCreateModal}
              className="bg-primary-500 text-white px-4 py-2 rounded-lg hover:bg-primary-600 transition-colors"
            >
              Create your first transaction
            </button>
          </div>
        ) : (
          <div className="overflow-x-auto">
            <table className="min-w-full divide-y divide-gray-200">
              <thead className="bg-gray-50">
                <tr>
                  <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                    Date
                  </th>
                  <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                    Description
                  </th>
                  <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                    Account
                  </th>
                  <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                    Category
                  </th>
                  <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                    Type
                  </th>
                  <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                    Amount
                  </th>
                  <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                    Actions
                  </th>
                </tr>
              </thead>
              <tbody className="bg-white divide-y divide-gray-200">
                {transactions.map((transaction) => (
                  <tr key={transaction.id} className="hover:bg-gray-50">
                    <td className="px-6 py-4 whitespace-nowrap text-sm text-gray-900">
                      {formatDate(transaction.transactionDate)}
                    </td>
                    <td className="px-6 py-4 text-sm text-gray-900 max-w-xs truncate">
                      {transaction.description}
                    </td>
                    <td className="px-6 py-4 whitespace-nowrap text-sm text-gray-900">
                      {transaction.accountName}
                    </td>
                    <td className="px-6 py-4 whitespace-nowrap text-sm">
                      {transaction.categoryName ? (
                        <span
                          className="inline-flex items-center px-2.5 py-0.5 rounded-full text-xs font-medium"
                          style={{
                            backgroundColor: `${transaction.categoryColor}20`,
                            color: transaction.categoryColor,
                          }}
                        >
                          {transaction.categoryName}
                        </span>
                      ) : (
                        <span className="text-gray-500">-</span>
                      )}
                    </td>
                    <td className="px-6 py-4 whitespace-nowrap text-sm">
                      <span
                        className={`inline-flex items-center px-2.5 py-0.5 rounded-full text-xs font-medium ${getTransactionTypeBgColor(
                          transaction.type
                        )}`}
                      >
                        {transaction.type}
                      </span>
                    </td>
                    <td
                      className={`px-6 py-4 whitespace-nowrap text-sm font-medium ${getTransactionTypeColor(
                        transaction.type
                      )}`}
                    >
                      {transaction.type === 'EXPENSE' ? '-' : ''}
                      {formatCurrency(transaction.amount)}
                    </td>
                    <td className="px-6 py-4 whitespace-nowrap text-sm font-medium space-x-2">
                      <button
                        onClick={() => openEditModal(transaction)}
                        className="text-primary-600 hover:text-primary-900"
                      >
                        Edit
                      </button>
                      <button
                        onClick={() => handleDelete(transaction.id)}
                        className="text-red-600 hover:text-red-900"
                      >
                        Delete
                      </button>
                    </td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        )}
      </div>

      {/* Create/Edit Modal */}
      {isModalOpen && (
        <div className="fixed inset-0 bg-black bg-opacity-50 flex items-center justify-center p-4 z-50">
          <div className="bg-white rounded-xl shadow-lg max-w-md w-full max-h-[90vh] overflow-y-auto">
            <div className="p-6 border-b border-gray-200">
              <h3 className="text-lg font-semibold text-gray-900">
                {editingTransaction ? 'Edit Transaction' : 'Create Transaction'}
              </h3>
            </div>

            <form onSubmit={handleSubmit(onSubmit)} className="p-6 space-y-4">
              {/* Account Selection */}
              <div>
                <label className="block text-sm font-medium text-gray-700 mb-1">
                  Account *
                </label>
                <select
                  {...register('accountId', { valueAsNumber: true })}
                  className="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-primary-500"
                >
                  <option value="">Select an account</option>
                  {accounts.map((account) => (
                    <option key={account.id} value={account.id}>
                      {account.name} ({formatCurrency(account.balance)})
                    </option>
                  ))}
                </select>
                {errors.accountId && (
                  <p className="mt-1 text-sm text-red-600">{errors.accountId.message}</p>
                )}
              </div>

              {/* Transaction Type */}
              <div>
                <label className="block text-sm font-medium text-gray-700 mb-1">
                  Type *
                </label>
                <div className="flex space-x-4">
                  <label className="inline-flex items-center">
                    <input
                      type="radio"
                      {...register('type')}
                      value="EXPENSE"
                      className="text-primary-600 focus:ring-primary-500"
                    />
                    <span className="ml-2">Expense</span>
                  </label>
                  <label className="inline-flex items-center">
                    <input
                      type="radio"
                      {...register('type')}
                      value="INCOME"
                      className="text-primary-600 focus:ring-primary-500"
                    />
                    <span className="ml-2">Income</span>
                  </label>
                </div>
                {errors.type && (
                  <p className="mt-1 text-sm text-red-600">{errors.type.message}</p>
                )}
              </div>

              {/* Amount */}
              <div>
                <label className="block text-sm font-medium text-gray-700 mb-1">
                  Amount *
                </label>
                <input
                  type="number"
                  step="0.01"
                  {...register('amount', { valueAsNumber: true })}
                  className="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-primary-500"
                  placeholder="0.00"
                />
                {errors.amount && (
                  <p className="mt-1 text-sm text-red-600">{errors.amount.message}</p>
                )}
              </div>

              {/* Description */}
              <div>
                <label className="block text-sm font-medium text-gray-700 mb-1">
                  Description *
                </label>
                <input
                  type="text"
                  {...register('description')}
                  className="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-primary-500"
                  placeholder="Enter description"
                />
                {errors.description && (
                  <p className="mt-1 text-sm text-red-600">{errors.description.message}</p>
                )}
              </div>

              {/* Category */}
              <div>
                <label className="block text-sm font-medium text-gray-700 mb-1">
                  Category
                </label>
                <select
                  {...register('categoryId', { valueAsNumber: true })}
                  className="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-primary-500"
                >
                  <option value="">No category</option>
                  {categories
                    .filter(cat => !cat.system || transactionType === 'INCOME' ? cat.name !== 'Income' : true)
                    .map((category) => (
                      <option key={category.id} value={category.id}>
                        {category.name}
                      </option>
                    ))}
                </select>
              </div>

              {/* Date */}
              <div>
                <label className="block text-sm font-medium text-gray-700 mb-1">
                  Date *
                </label>
                <input
                  type="date"
                  {...register('transactionDate')}
                  className="w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-primary-500"
                />
                {errors.transactionDate && (
                  <p className="mt-1 text-sm text-red-600">{errors.transactionDate.message}</p>
                )}
              </div>

              {/* Form Actions */}
              <div className="flex space-x-3 pt-4">
                <button
                  type="button"
                  onClick={closeModal}
                  className="flex-1 px-4 py-2 border border-gray-300 text-gray-700 rounded-lg hover:bg-gray-50 transition-colors"
                >
                  Cancel
                </button>
                <button
                  type="submit"
                  disabled={isSubmitting}
                  className="flex-1 bg-primary-500 text-white px-4 py-2 rounded-lg hover:bg-primary-600 transition-colors disabled:opacity-50"
                >
                  {isSubmitting ? (
                    <div className="animate-spin rounded-full h-5 w-5 border-b-2 border-white mx-auto"></div>
                  ) : editingTransaction ? (
                    'Update Transaction'
                  ) : (
                    'Create Transaction'
                  )}
                </button>
              </div>
            </form>
          </div>
        </div>
      )}
    </div>
  );
};

export default Transactions;
```

---

## 📄 `frontend\src\services\accountService.ts`
* **Size:** 1023.0 B
* **Language:** typescript

```typescript
import api from './api';

export interface Account {
  id: number;
  name: string;
  type: 'CHECKING' | 'SAVINGS' | 'CREDIT_CARD' | 'CASH' | 'INVESTMENT';
  balance: number;
  currency: string;
  active: boolean;
  createdAt: string;
  updatedAt: string;
}

export const accountService = {
  async getAccounts(): Promise<Account[]> {
    const response = await api.get<Account[]>('/accounts');
    return response.data;
  },

  async getAccount(id: number): Promise<Account> {
    const response = await api.get<Account>(`/accounts/${id}`);
    return response.data;
  },

  async getTotalBalance(): Promise<number> {
    const response = await api.get<number>('/accounts/balance/total');
    return response.data;
  },

  async createAccount(accountData: {
    name: string;
    type: Account['type'];
    initialBalance?: number;
    currency?: string;
  }): Promise<Account> {
    const response = await api.post<Account>('/accounts', accountData);
    return response.data;
  },
};
```

---

## 📄 `frontend\src\services\api.ts`
* **Size:** 1012.0 B
* **Language:** typescript

```typescript
import axios from 'axios';

const API_BASE_URL = import.meta.env.VITE_API_BASE_URL || 'http://localhost:8080/api';

// Create axios instance
export const api = axios.create({
  baseURL: API_BASE_URL,
  headers: {
    'Content-Type': 'application/json',
  },
  withCredentials: true,
});

// Request interceptor to add auth token
api.interceptors.request.use(
  (config) => {
    const token = localStorage.getItem('authToken');
    if (token) {
      config.headers.Authorization = `Bearer ${token}`;
    }
    return config;
  },
  (error) => {
    return Promise.reject(error);
  }
);

// Response interceptor to handle auth errors
api.interceptors.response.use(
  (response) => response,
  (error) => {
    if (error.response?.status === 401) {
      // Token expired or invalid
      localStorage.removeItem('authToken');
      localStorage.removeItem('user');
      window.location.href = '/login';
    }
    return Promise.reject(error);
  }
);

export default api;
```

---

## 📄 `frontend\src\services\authService.ts`
* **Size:** 1.4 KB
* **Language:** typescript

```typescript
import api from './api';
import type { LoginRequest, RegisterRequest, AuthResponse, User } from '../types/auth';

// Named export for authService
export const authService = {
  async login(credentials: LoginRequest): Promise<AuthResponse> {
    const response = await api.post<AuthResponse>('/auth/login', credentials);
    return response.data;
  },

  async register(userData: RegisterRequest): Promise<{ message: string }> {
    const response = await api.post<{ message: string }>('/auth/register', userData);
    return response.data;
  },

  async getCurrentUser(): Promise<User> {
    const response = await api.get<AuthResponse>('/auth/me');
    const { email, firstName, lastName } = response.data;
    return { email, firstName, lastName };
  },

  // Utility functions for token management
  saveAuthData(token: string, user: User): void {
    localStorage.setItem('authToken', token);
    localStorage.setItem('user', JSON.stringify(user));
  },

  getStoredAuthData(): { token: string | null; user: User | null } {
    const token = localStorage.getItem('authToken');
    const userStr = localStorage.getItem('user');
    const user = userStr ? JSON.parse(userStr) : null;
    return { token, user };
  },

  clearAuthData(): void {
    localStorage.removeItem('authToken');
    localStorage.removeItem('user');
  },
};

// Default export for backward compatibility
export default authService;
```

---

## 📄 `frontend\src\services\categoryService.ts`
* **Size:** 938.0 B
* **Language:** typescript

```typescript
import api from './api';

export interface Category {
  id: number;
  name: string;
  description?: string;
  color: string;
  system: boolean;
  createdAt: string;
  updatedAt: string;
}

export const categoryService = {
  async getCategories(): Promise<Category[]> {
    const response = await api.get<Category[]>('/categories');
    return response.data;
  },

  async getCustomCategories(): Promise<Category[]> {
    const response = await api.get<Category[]>('/categories/custom');
    return response.data;
  },

  async createCategory(name: string, description?: string, color?: string): Promise<Category> {
    const response = await api.post<Category>('/categories', null, {
      params: { name, description, color },
    });
    return response.data;
  },

  async deleteCategory(id: number): Promise<void> {
    await api.delete(`/categories/${id}`);
  },
};

export default categoryService;
```

---

## 📄 `frontend\src\services\transactionService.ts`
* **Size:** 2.3 KB
* **Language:** typescript

```typescript
import api from './api';

export interface Transaction {
  id: number;
  accountId: number;
  accountName: string;
  categoryId?: number;
  categoryName?: string;
  categoryColor?: string;
  amount: number;
  description: string;
  type: 'INCOME' | 'EXPENSE';
  transactionDate: string;
  createdAt: string;
  updatedAt: string;
}

export interface TransactionRequest {
  accountId: number;
  categoryId?: number;
  amount: number;
  description: string;
  type: 'INCOME' | 'EXPENSE';
  transactionDate: string;
}

export interface TransactionFilters {
  accountId?: number;
  categoryId?: number;
  type?: 'INCOME' | 'EXPENSE';
  startDate?: string;
  endDate?: string;
  page?: number;
  size?: number;
}

export const transactionService = {
  async getTransactions(filters: TransactionFilters = {}): Promise<{
    content: Transaction[];
    totalElements: number;
    totalPages: number;
    size: number;
    number: number;
  }> {
    const response = await api.get('/transactions', { params: filters });
    return response.data;
  },

  async getTransaction(id: number): Promise<Transaction> {
    const response = await api.get<Transaction>(`/transactions/${id}`);
    return response.data;
  },

  async createTransaction(transaction: TransactionRequest): Promise<Transaction> {
    const response = await api.post<Transaction>('/transactions', transaction);
    return response.data;
  },

  async updateTransaction(id: number, transaction: TransactionRequest): Promise<Transaction> {
    const response = await api.put<Transaction>(`/transactions/${id}`, transaction);
    return response.data;
  },

  async deleteTransaction(id: number): Promise<void> {
    await api.delete(`/transactions/${id}`);
  },

  async getTotalIncome(startDate?: string, endDate?: string): Promise<number> {
    const response = await api.get<number>('/transactions/summary/income', {
      params: { startDate, endDate },
    });
    return response.data;
  },

  async getTotalExpenses(startDate?: string, endDate?: string): Promise<number> {
    const response = await api.get<number>('/transactions/summary/expenses', {
      params: { startDate, endDate },
    });
    return response.data;
  },
};

export default transactionService;
```

---

## 📄 `frontend\src\types\auth.ts`
* **Size:** 738.0 B
* **Language:** typescript

```typescript
export interface User {
  userId?: number;
  email: string;
  firstName: string;
  lastName: string;
}

export interface LoginRequest {
  email: string;
  password: string;
}

export interface RegisterRequest {
  email: string;
  password: string;
  firstName: string;
  lastName: string;
}

export interface AuthResponse {
  token: string;
  type: string;
  userId: number;
  email: string;
  firstName: string;
  lastName: string;
}

export interface AuthContextType {
  user: User | null;
  token: string | null;
  isLoading: boolean;
  login: (credentials: LoginRequest) => Promise<void>;
  register: (userData: RegisterRequest) => Promise<void>;
  logout: () => void;
  isAuthenticated: boolean;
}
```

---

## 📄 `frontend\src\types\transaction.ts`
* **Size:** 905.0 B
* **Language:** typescript

```typescript
export interface Transaction {
  id: number;
  accountId: number;
  accountName: string;
  categoryId?: number;
  categoryName?: string;
  categoryColor?: string;
  amount: number;
  description: string;
  type: 'INCOME' | 'EXPENSE';
  transactionDate: string;
  createdAt: string;
  updatedAt: string;
}

export interface TransactionRequest {
  accountId: number;
  categoryId?: number;
  amount: number;
  description: string;
  type: 'INCOME' | 'EXPENSE';
  transactionDate: string;
}

export interface TransactionFilters {
  accountId?: number;
  categoryId?: number;
  type?: 'INCOME' | 'EXPENSE';
  startDate?: string;
  endDate?: string;
  page?: number;
  size?: number;
}

export interface TransactionFormData {
  accountId: number;
  categoryId?: number;
  amount: number;
  description: string;
  type: 'INCOME' | 'EXPENSE';
  transactionDate: string;
}
```

---

## 📄 `frontend\src\validations\auth.ts`
* **Size:** 775.0 B
* **Language:** typescript

```typescript
import { z } from 'zod';

export const loginSchema = z.object({
  email: z.string().email('Invalid email address'),
  password: z.string().min(6, 'Password must be at least 6 characters'),
});

export const registerSchema = z.object({
  firstName: z.string().min(1, 'First name is required'),
  lastName: z.string().min(1, 'Last name is required'),
  email: z.string().email('Invalid email address'),
  password: z.string().min(6, 'Password must be at least 6 characters'),
  confirmPassword: z.string(),
}).refine((data) => data.password === data.confirmPassword, {
  message: "Passwords don't match",
  path: ["confirmPassword"],
});

export type LoginFormData = z.infer<typeof loginSchema>;
export type RegisterFormData = z.infer<typeof registerSchema>;
```

---

## 📄 `frontend\src\validations\transaction.ts`
* **Size:** 511.0 B
* **Language:** typescript

```typescript
import { z } from 'zod';

export const transactionSchema = z.object({
  accountId: z.number().min(1, 'Account is required'),
  categoryId: z.number().optional(),
  amount: z.number().min(0.01, 'Amount must be greater than 0'),
  description: z.string().min(1, 'Description is required').max(500, 'Description too long'),
  type: z.enum(['INCOME', 'EXPENSE'] as const),
  transactionDate: z.string().min(1, 'Date is required'),
});

export type TransactionFormData = z.infer<typeof transactionSchema>;
```

---

## 📄 `frontend\tsconfig.app.json`
* **Size:** 732.0 B
* **Language:** json

```json
{
  "compilerOptions": {
    "tsBuildInfoFile": "./node_modules/.tmp/tsconfig.app.tsbuildinfo",
    "target": "ES2022",
    "useDefineForClassFields": true,
    "lib": ["ES2022", "DOM", "DOM.Iterable"],
    "module": "ESNext",
    "types": ["vite/client"],
    "skipLibCheck": true,

    /* Bundler mode */
    "moduleResolution": "bundler",
    "allowImportingTsExtensions": true,
    "verbatimModuleSyntax": true,
    "moduleDetection": "force",
    "noEmit": true,
    "jsx": "react-jsx",

    /* Linting */
    "strict": true,
    "noUnusedLocals": true,
    "noUnusedParameters": true,
    "erasableSyntaxOnly": true,
    "noFallthroughCasesInSwitch": true,
    "noUncheckedSideEffectImports": true
  },
  "include": ["src"]
}

```

---

## 📄 `frontend\tsconfig.json`
* **Size:** 119.0 B
* **Language:** json

```json
{
  "files": [],
  "references": [
    { "path": "./tsconfig.app.json" },
    { "path": "./tsconfig.node.json" }
  ]
}

```

---

## 📄 `frontend\tsconfig.node.json`
* **Size:** 653.0 B
* **Language:** json

```json
{
  "compilerOptions": {
    "tsBuildInfoFile": "./node_modules/.tmp/tsconfig.node.tsbuildinfo",
    "target": "ES2023",
    "lib": ["ES2023"],
    "module": "ESNext",
    "types": ["node"],
    "skipLibCheck": true,

    /* Bundler mode */
    "moduleResolution": "bundler",
    "allowImportingTsExtensions": true,
    "verbatimModuleSyntax": true,
    "moduleDetection": "force",
    "noEmit": true,

    /* Linting */
    "strict": true,
    "noUnusedLocals": true,
    "noUnusedParameters": true,
    "erasableSyntaxOnly": true,
    "noFallthroughCasesInSwitch": true,
    "noUncheckedSideEffectImports": true
  },
  "include": ["vite.config.ts"]
}

```

---

## 📄 `frontend\vite.config.ts`
* **Size:** 470.0 B
* **Language:** typescript

```typescript
import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'
import tailwindcss from '@tailwindcss/vite'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [
    react(),
    tailwindcss()
  ],
  server: {
    port: 3000,
    host: true,
    proxy: {
      '/api': {
        target: 'http://backend:8080',
        changeOrigin: true,
        secure: false,
      }
    }
  },
  build: {
    outDir: 'dist',
    sourcemap: true
  }
})
```

---
