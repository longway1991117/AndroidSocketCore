package com.longway.core.com.client;


public interface MessageInterceptor {
    byte[] onInterceptor(byte[] msg);
}
