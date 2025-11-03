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