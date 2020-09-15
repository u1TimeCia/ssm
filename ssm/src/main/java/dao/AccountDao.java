package dao;

import domain.Account;

import java.util.List;

public interface AccountDao {

    //查询所有账户
    public List<Account> findAll();

    //保存账户
    public void saveAccount(Account account);

}
