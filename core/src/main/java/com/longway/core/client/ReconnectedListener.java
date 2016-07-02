package com.longway.core.com.client;

public interface ReconnectedListener {
    void retryAttemptAfter(int second);

    void retryAttemptFail(String reason);
}
