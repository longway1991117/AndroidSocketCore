package com.longway.core.socketChannel.client;


public interface MessageInterceptor {
    byte[] onInterceptor(byte[] msg);
}
