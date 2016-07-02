package com.longway.core.com.client;

public interface ConnectListener {
    void connectToServerFail(String reason);

    void connectToServerSuccess(String detail);
}
