package sprint_jpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import sprint_jpa.models.Account;
import sprint_jpa.repositories.AccountRepository;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account save(Account account) {
        return accountRepository.save(account);
    }

    public List<Account> findAccountByBalanceGreaterThan(double amount, int pageNumber, int pageSize) {
        PageRequest pageable = PageRequest.of(pageNumber, pageSize);
        return accountRepository.findAccountByBalanceGreaterThan(amount, pageable);
    }

    public List<Account> findAll(int pageNumber) {
        PageRequest pageable = PageRequest.of(pageNumber, 10);
        return accountRepository.findAll(pageable).stream().toList();
    }
}
