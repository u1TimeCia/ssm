package test;

import dao.AccountDao;
import domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void run1() throws Exception {
        Account account = new Account();
        account.setName("yyy");
        account.setMoney(200d);
        //加载mybatis配置文件
        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        AccountDao mapper = session.getMapper(AccountDao.class);
        mapper.saveAccount(account);
        List<Account> all = mapper.findAll();
        all.forEach(System.out::println);
        //提交事务
        session.commit();
        //关闭资源
        session.close();
        stream.close();
    }

}
