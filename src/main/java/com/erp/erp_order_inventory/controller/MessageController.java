package com.erp.erp_order_inventory.controller;

import com.erp.erp_order_inventory.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/message")
    public String getMessage() {
        Message message = new Message();
        message.content = "안녕, 코드잇!";
        System.out.println(message.content);

        Message message1 = new Message();
        System.out.println(message1.content);

        return "message";
    }
}
