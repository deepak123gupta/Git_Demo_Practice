package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {

        System.out.println("hello");
        System.out.println("this is my controller");
        System.out.println("this is my contoller");
        System.out.println("This is my cerry pick");
        System.out.println("This is my feature/user-api branch");
        System.out.println("i am owner");
        return "Hello Git!";
    }
}
