package sprint_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sprint_jpa.models.Account;
import sprint_jpa.services.AccountService;

import java.util.Random;

@SpringBootApplication
public class HuynhKimThanhSpringJpaApplication{

    public static void main(String[] args) {
        SpringApplication.run(HuynhKimThanhSpringJpaApplication.class, args);
    }

//    @Autowired
//    private AccountService accountService;

//    @Override
//    public void run(String... args) throws Exception {
//        Random random = new Random();
//
//        for (long i = 1; i < 100; i++) {
//            Account account = new Account(i, "Account #" + i, random.nextDouble(100000));
//            accountService.save(account);
//        }
//
//        accountService.findAccountByBalanceGreaterThan(50000, 0, 10)
//                .forEach(System.out::println);
//    }
}
