package com.longway.core.core.client;


public interface MessageHandler {
    void onReceiveMessage(byte[] message);
}
