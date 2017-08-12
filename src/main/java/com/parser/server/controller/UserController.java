package com.parser.server.controller;

import com.parser.server.model.entity.User;
import com.parser.server.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/user/create")
    public User createUser(String login, String password) {
        return userService.createUserIfNotExists(login, password);
    }
}
