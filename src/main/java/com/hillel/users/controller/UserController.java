package com.hillel.users.controller;


import com.hillel.users.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/users/add")
    public String userForm(User user) {
        return "add-user";
    }

    @GetMapping("/users")
    public String getUsers() {
        return "users";
    }
}