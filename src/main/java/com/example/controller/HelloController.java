package com.example.controller;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello Git!";
    }
}
