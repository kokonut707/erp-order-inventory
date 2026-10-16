package com.erp.erp_order_inventory;

public class Message {
    private String content = "안녕!";

    public Message(String content) {  // 생성자
        this.content = content;
        System.out.println("Message 객체 생성!");
    }

    public Message() {
        System.out.println("Message 객체 생성!");
    }

    public void setContent(String content) {
        if (content != null && content.contains("바보")) {
            return;
        }
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public int getContentLength() {
        return this.content.length();
    }
}
