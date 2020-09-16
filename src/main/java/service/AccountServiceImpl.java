package service;

import dao.AccountDao;
import domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层,Query for all accounts information");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("Service layer, save account");
        accountDao.saveAccount(account);
    }
}
