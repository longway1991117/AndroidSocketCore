package com.longway.core.socketChannel.client;

/**
 * Created by longway on 16/6/26.
 * Email:longway1991117@sina.com
 */

public interface MessageInterceptor {
    byte[] onInterceptor(byte[] msg);
}
