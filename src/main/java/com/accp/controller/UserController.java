package com.accp.controller;

import com.accp.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {


    @RequestMapping(value = "/login")
    public String login(User user, HttpSession session){
        session.setAttribute("userSession",user);
        return "redirect:frame.html";
    }
    @RequestMapping("/frame.html")
    public String frame(){
        return "jsp/frame";
    }
    @RequestMapping("/userList")
    public String userList(){
        return "jsp/userlist";
    }
    @RequestMapping("/userModify")
    public String userModify(){
        return "jsp/usermodify";
    }
    @RequestMapping("/userAdd")
    public String userAdd(){
        return "jsp/useradd";
    }
    @RequestMapping("/userView")
    public String userView(){
        return "jsp/userview";
    }
    @RequestMapping("/userExit")
    public String userExit(HttpSession session){
       session.invalidate();
        return "redirect:login.html";
    }
    @RequestMapping("/login.html")
    public String exit(){
        return "jsp/login";
    }
}
