package com.oneapp.security.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @PostMapping("/test")
    public String testSecurity() {
        return "SUCCESS";
    }
}
