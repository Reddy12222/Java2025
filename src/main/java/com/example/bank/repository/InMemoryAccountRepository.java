package com.example.bank.repository;

//package com.javatodev.finance.repository;


import com.example.bank.entity.Account;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryAccountRepository {

    private final Map<String, Account> accounts = new HashMap<>();

    public InMemoryAccountRepository() {
        // Sample accounts for testing
        accounts.put("A1", new Account("A1", new BigDecimal("1000.9")));
        accounts.put("A2", new Account("A2", new BigDecimal("10.0")));

    }

    public Optional<Account> findById(String id) {
        return Optional.ofNullable(accounts.get(id));
    }

    public void save(Account account) {
        accounts.put(account.getId(), account);
    }

    public Map<String, Account> findAll() {
        return accounts;
    }
}

