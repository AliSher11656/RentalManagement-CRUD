package com.techno.publishingnew.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String defaultPage() {
        return "login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
