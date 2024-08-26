package com.lab4.OAuth_OpenID_Connect.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/home")
    public String home(Model model, HttpServletRequest request) {
        model.addAttribute("httpServletRequest", request);
        return "home";
    }

}
