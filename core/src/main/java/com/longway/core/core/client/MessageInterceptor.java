package com.longway.core.core.client;


public interface MessageInterceptor {
    byte[] onInterceptor(byte[] msg);
}
