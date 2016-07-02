package com.longway.core.com.client;

public interface NetworkMonitor {
    void onConnect(int type);

    void onDisconnected(String reason);
}
