package controller;

import domain.User;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;
import java.util.Stack;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"}) //把msg存到session中
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){
        //@RequestParam(required = "name") 表示必须传入name
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id){
        System.out.println(id);
        return "success";
    }

    //@RequestHeader 获取请求头
    //@CookieValue 获取特定名字cookie的值

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("testModelAttribute "+user);
        return "success";
    }


    //ModelAttribute 用法
//    @ModelAttribute
//    public User showUser(String uname){
//        System.out.println("showUser");
//        User user = new User();
//        user.setUname(uname);
//        user.setAge(20);
//        user.setDate(new Date());
//        return user;
//    }

    @ModelAttribute
    public void showUser(String uname, Map<String ,User> map){
        System.out.println("showUser");
        User user = new User();
        user.setUname(uname);
        user.setAge(20);
        user.setDate(new Date());
        map.put("abc", user);
    }

    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(ModelMap modelMap){
        //底层会储存到request当中
        modelMap.addAttribute("msg","qhr");
        System.out.println("testSessionAttribute ");
        String msg = (String) modelMap.get("msg");
        return "success";
    }

    @RequestMapping("/testDeleteSession")
    public String testDeleteSession(SessionStatus status){
        System.out.println("testDeleteSession");
        //清除session缓存
        status.setComplete();
        return "success";
    }

    @Test
    public void test(){
        String s = "A man, a plan, a canal: Panama";
        char[] chars = s.toLowerCase().toCharArray();
        Stack order = new Stack();
        for(char c:chars){
            if((c >=65 && c <=90) || (c>=97 && c <=122) || (c>=48 && c<=57)){
                order.push(c);
            }
        }
        for(char c:chars){
            if((c >=65 && c <=90) || (c>=97 && c <=122)|| (c>=48 && c<=57)){
                if((char)order.pop() != c){
                }
            }
        }
    }
}
