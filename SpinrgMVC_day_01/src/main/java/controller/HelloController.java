package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestScope;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user")
public class HelloController {
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello SpringMVC");
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping",method = {RequestMethod.GET},params = {"username"},headers = {"Accept"})
    public String testRequestMapping(String username){
        //params 参数 headers 请求头 method 请求方法
        System.out.println(username);
        System.out.println("test requestMapping annotation");
        return "success";
    }
}
