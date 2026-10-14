package com.erp.erp_order_inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/welcome")
    public String sayWelcome(@RequestParam String name) {
        return "{\"message\": \"Welcome, " + name + "!\"}";
    }

    @GetMapping("/wave")
    public String tripleCount(@RequestParam(name = "hand") Integer count) {
        Integer tripleCount = count * 3;
        return "{\"message\": \"손을 " + tripleCount + "번 흔들었습니다.\"}";
    }

    @GetMapping("/books")
    public String getBooks(
            @RequestParam(required = false, defaultValue = "1") Integer page,
            @RequestParam(required = false, defaultValue = "1") Integer line
    ) {
        return "{\"message\": \"" + page + "번째 페이지, " + line + "번째 줄입니다.\"}";
    }
}