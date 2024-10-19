package sprint_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sprint_jpa.models.Account;
import sprint_jpa.services.AccountService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/accounts/{pageNumber}")
    public List<Account> getAccounts(@PathVariable(name = "pageNumber") int pageNumber) {
        return accountService.findAll(pageNumber);
    }
}
