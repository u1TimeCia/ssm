package service;

import domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Override
    public List<Account> findAll() {
        System.out.println("Query for all accounts information");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("Service layer, save account");
    }
}
