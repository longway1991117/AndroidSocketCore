package com.longway.core.socketChannel.client;

public interface NetworkMonitor {
    void onConnect(int type);

    void onDisconnected(String reason);
}
