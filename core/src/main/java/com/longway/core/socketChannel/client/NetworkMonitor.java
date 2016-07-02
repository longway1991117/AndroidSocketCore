package com.longway.core.socketChannel.client;

/*********************************
 * Created by longway on 16/6/26 上午9:58.
 * packageName:com.longway.multiprocess.socket.socketChannel
 * projectName:demo
 * Email:longway1991117@sina.com
 ********************************/
public interface NetworkMonitor {
    void onConnect(int type);

    void onDisconnected(String reason);
}
