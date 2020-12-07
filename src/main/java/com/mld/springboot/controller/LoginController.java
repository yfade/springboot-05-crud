package com.mld.springboot.controller;

import com.mld.springboot.exception.UserNotExistException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(String userName, String password, Model model, HttpSession session) {
        if (StringUtils.isBlank(userName) || StringUtils.isBlank(password)) {
            model.addAttribute("tip", "请输入用户名或密码");
        }
        if (!"admin".equals(userName) || !"123456".equals(password)) {
            model.addAttribute("tip", "用户名或密码错误");
            return "login";
        }
        session.setAttribute("userName", userName);
        return "redirect:/main.html";
    }


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(String userName) {
        if ("aaa".equals(userName)) {
            throw new UserNotExistException();
        }
        return "hello world";

    }

}
