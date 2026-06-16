package com.pragma.chat.infrastructure.adapter;

import com.pragma.chat.domain.model.Message;

public class MessageAdapter {
    public void sendMessage(Message message) {
        // Simulate sending message
        System.out.println("Message sent: " + message);
    }
}