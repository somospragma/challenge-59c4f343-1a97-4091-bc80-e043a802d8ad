package com.pragma.chat.application.service;

import com.pragma.chat.domain.model.Message;
import com.pragma.chat.domain.service.MessageService;
import com.pragma.chat.infrastructure.adapter.MessageAdapter;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    private final MessageAdapter messageAdapter;

    public MessageServiceImpl(MessageAdapter messageAdapter) {
        this.messageAdapter = messageAdapter;
    }

    @Override
    public void sendMessage(Message message) {
        messageAdapter.sendMessage(message);
    }
}