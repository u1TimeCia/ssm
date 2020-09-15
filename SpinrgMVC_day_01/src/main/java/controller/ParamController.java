package controller;

import domain.Account;
import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username){
        System.out.println("执行了 "+username);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println(account.toString());
        return "success";
    }

    @RequestMapping("/saveUser")
    public String saveAccount(User user){
        System.out.println(user.toString());
        return "success";
    }

    @RequestMapping("/saveServlet")
    public String saveAccount(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request);
        System.out.println(response);
        return "success";
    }




}
