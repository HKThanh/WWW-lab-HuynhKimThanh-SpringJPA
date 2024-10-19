package sprint_jpa.repositories;

import org.springframework.stereotype.Repository;
import sprint_jpa.models.Account;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAccountByBalanceGreaterThan(double amount, Pageable pageable);
}
