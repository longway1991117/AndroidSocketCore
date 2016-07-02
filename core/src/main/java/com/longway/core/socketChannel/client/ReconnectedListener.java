package com.longway.core.socketChannel.client;

/*********************************
 * Created by longway on 16/6/26 上午11:07.
 * packageName:com.longway.multiprocess.socket.socketChannel
 * projectName:demo
 * Email:longway1991117@sina.com
 ********************************/
public interface ReconnectedListener {
    void retryAttemptAfter(int second);

    void retryAttemptFail(String reason);
}
