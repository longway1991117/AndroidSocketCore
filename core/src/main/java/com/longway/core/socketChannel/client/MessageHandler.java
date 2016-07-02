package com.longway.core.socketChannel.client;


public interface MessageHandler {
    void onReceiveMessage(byte[] message);
}
