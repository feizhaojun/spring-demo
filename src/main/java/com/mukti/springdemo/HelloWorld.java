package com.mukti.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String say() {
        return "Hello World!";
    }
}
