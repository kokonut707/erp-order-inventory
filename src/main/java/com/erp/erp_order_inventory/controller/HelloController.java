package com.erp.erp_order_inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "{\"status\": \"OK\", \"message\": \"Hello, Spring Boot!\"}";
    }

    @GetMapping("/goodbye")
    public String sayGoodbye() {
        return "goodbye";
    }

    @GetMapping("/info")
    public String getInfo() {
        return "{\"name\": \"Spring Boot\", \"version\": 3.2, \"active\": true}";
    }
}