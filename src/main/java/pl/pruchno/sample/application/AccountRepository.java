package pl.pruchno.sample.application;

import pl.pruchno.sample.core.Account;
import reactor.core.publisher.Flux;

import java.util.List;

public interface AccountRepository {
    List<Account> getAccountsList();
    Flux<Account> getAccounts();
}
