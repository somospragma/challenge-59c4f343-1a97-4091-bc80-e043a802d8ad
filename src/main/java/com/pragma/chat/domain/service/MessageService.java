package com.pragma.chat.domain.service;

import com.pragma.chat.domain.model.Message;

public interface MessageService {
    void sendMessage(Message message);
}