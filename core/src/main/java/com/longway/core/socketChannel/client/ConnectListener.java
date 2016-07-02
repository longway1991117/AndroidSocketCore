package com.longway.core.socketChannel.client;

public interface ConnectListener {
    void connectToServerFail(String reason);

    void connectToServerSuccess(String detail);
}
