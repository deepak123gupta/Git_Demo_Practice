package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("this is my controller");
        System.out.println("this is my contoller");
        return "Hello Git!";
    }
}
