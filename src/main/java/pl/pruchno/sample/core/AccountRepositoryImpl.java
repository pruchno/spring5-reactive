package pl.pruchno.sample.core;

import org.springframework.stereotype.Component;
import pl.pruchno.sample.application.AccountRepository;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class AccountRepositoryImpl implements AccountRepository {

    @Override
    public List<Account> getAccountsList() {
        return new ArrayList<>(
                Arrays.asList(
                    new Account("1", "Franek"),
                    new Account("2", "Janek")
                )
        );
    }

    @Override
    public Flux<Account> getAccounts() {
        return null;
    }
}
