package com.oneapp.security.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.oneapp.security.model.Role;
import com.oneapp.security.model.User;
import com.oneapp.security.service.RoleServiceImpl;
import com.oneapp.security.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO 自定义注册url
@RestController
@RequestMapping("/signup")
public class SignupController {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private RoleServiceImpl roleService;

    @PostMapping("/user")
    public String signup(@RequestBody User user) {
        if (user == null || user.getUsername() ==null || user.getPassword() == null)
            return "INVALID";
        QueryWrapper<User> uqw = new QueryWrapper<>();
        uqw.eq("username", user.getUsername());
        if (userService.getOne(uqw) != null) return "EXIST";
        userService.save(user);
        roleService.save(new Role(user.getUsername(), "USER"));
        return "PASS";
    }
}
