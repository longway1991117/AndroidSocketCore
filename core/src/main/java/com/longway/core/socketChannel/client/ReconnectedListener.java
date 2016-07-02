package com.longway.core.socketChannel.client;

public interface ReconnectedListener {
    void retryAttemptAfter(int second);

    void retryAttemptFail(String reason);
}
