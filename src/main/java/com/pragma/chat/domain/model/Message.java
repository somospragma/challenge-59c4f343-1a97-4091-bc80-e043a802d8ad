package com.pragma.chat.domain.model;

public record Message(String sender, String content, long timestamp) {}