package com.longway.core.core.client;

public interface NetworkMonitor {
    void onConnect(int type);

    void onDisconnected(String reason);
}
