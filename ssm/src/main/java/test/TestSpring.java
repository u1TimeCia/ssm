package test;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AccountServiceImpl;

public class TestSpring {


    @Test
    public void run1(){
        //加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountServiceImpl service = (AccountServiceImpl)context.getBean("accountService");
        service.findAll();

    }
}
