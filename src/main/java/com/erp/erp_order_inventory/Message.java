package com.erp.erp_order_inventory;

public class Message {
    public String content = "안녕!";

    public Message(String content) {  // 생성자
        this.content = content;
        System.out.println("Message 객체 생성!");
    }

    public Message() {
        System.out.println("Message 객체 생성!");
    }

    public int getContentLength() {
        return this.content.length();
    }
}
