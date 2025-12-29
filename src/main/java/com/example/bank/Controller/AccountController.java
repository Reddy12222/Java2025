package com.example.bank.Controller;



import com.example.bank.entity.Account;
import com.example.bank.repository.InMemoryAccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final InMemoryAccountRepository accountRepository;

    public AccountController(InMemoryAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @PostMapping
    public String createAccount(@RequestBody Account account) {
        accountRepository.save(account);
        return "Account created";
    }

    @GetMapping("/accounts")
    public Map<String, Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
