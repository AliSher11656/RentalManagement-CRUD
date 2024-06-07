package com.techno.publishingnew.controller;

import com.techno.publishingnew.bean.Users;
import com.techno.publishingnew.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/saveUsers", method = RequestMethod.POST)
    public ModelAndView saveUsers(@ModelAttribute("command") Users users) {
        usersService.addUsers(users);
        return new ModelAndView("redirect:/addUsers.html");
    }

    @RequestMapping(value = "/addUsers", method = RequestMethod.GET)
    public ModelAndView addUsers(@ModelAttribute("command") Users users) {
        Map<String, Object> model = new HashMap<>();
        model.put("userss", usersService.getUserss());
        return new ModelAndView("addUsers", model);
    }

    @RequestMapping(value = "/deleteUsers", method = RequestMethod.GET)
    public ModelAndView deleteUsers(@ModelAttribute("command") Users users) {
        usersService.deleteUsers(users.getId());
        Map<String, Object> model = new HashMap<>();
        model.put("userss", usersService.getUserss());
        return new ModelAndView("addUsers", model);
    }

    @RequestMapping(value = "/editUsers", method = RequestMethod.GET)
    public ModelAndView editUsers(@ModelAttribute("command") Users users) {
        Map<String, Object> model = new HashMap<>();
        model.put("users", usersService.getUsers(users.getId()));
        model.put("userss", usersService.getUserss());
        return new ModelAndView("addUsers", model);
    }

    @RequestMapping(value = "/userss", method = RequestMethod.GET)
    public List<Users> getUserss() {
        return usersService.getUserss();
    }

    @GetMapping("/user")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/user")
    public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
        System.out.println("Login attempt with email: " + email);
        System.out.println("Password provided: " + password);

        Users user = usersService.findByEmail(email);
        if (user != null) {
            System.out.println("User found with email: " + email);
            if (password.equals(user.getPassword())) {
                System.out.println("Password matched for user: " + email);
                return "redirect:/home.html";
            } else {
                System.out.println("Password mismatch for user: " + email);
            }
        } else {
            System.out.println("No user found with email: " + email);
        }

        model.addAttribute("error", "Invalid email or password");
        return "login";
    }
}
