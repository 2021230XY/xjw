package edu.soft1.controller;

import edu.soft1.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("---hello()---");
        return "hello";
    }
    @RequestMapping(value = "login")
    public String login(User user, HttpSession session,HttpSession request){
        System.out.println("----login()-----");

        int flag = 1;//调用业务层（业务层调用dao层），获取flag对象
        if(flag == 1){
            System.out.println("username="+user.getUsername());
            session.setAttribute("user",user);//登录对象
            return "welcome";//登录成功
        }
        System.out.println("登陆失败！，返回首页！");
        request.setAttribute("error","用户名或者密码不正确");
        return "redirect:/index.jsp";//登录失败，跳回首页
    }

@RequestMapping("/delete")
    public String delete(HttpServletRequest request){
    System.out.println("---执行delete()成功！---");
    request.setAttribute("CRUDmsg","删除功能执行完毕！");
    return "hello";
}

    @RequestMapping("/welcome")
    public String welcome(){
        System.out.println("---welcome()---");
        return "welcome";
    }

    @RequestMapping("/logout")//退出功能
    public String logout(HttpSession session){
        session.invalidate();
        System.out.println("已登出");
        return "redirect:/index.jsp";//重定向跳转至首页
    }




   /* @RequestMapping("reg")
    public String reg(User user){
        System.out.println("username="+user.getUsername());
        System.out.println("pwd="+user.getAge());
        System.out.println("birthday="+user.getBirthday());
        System.out.println("city="+user.getAddress().getCity());
        System.out.println("street="+user.getAddress().getStreet());
        System.out.println("phone="+user.getAddress().getPhone());
        return "hello";
    }*/
}
