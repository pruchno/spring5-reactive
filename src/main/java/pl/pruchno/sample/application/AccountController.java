package pl.pruchno.sample.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pruchno.sample.core.Account;
import reactor.core.publisher.Flux;


@RestController
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping("/accounts")
    public Flux<Account> getAccountAlerts() {
        return Flux.fromArray(accountRepository.getAccountsList().toArray(new Account[]{}));
    }
}
