package com.javabycode.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController { // <-- Renommé ici pour correspondre au fichier

    @GetMapping("/hello")
    public String sayHello() {
        return "<h1>Hello, Spring Boot!</h1>";
    }
}
