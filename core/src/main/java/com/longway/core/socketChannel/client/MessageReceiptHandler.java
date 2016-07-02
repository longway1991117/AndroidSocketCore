package com.longway.core.socketChannel.client;

/*********************************
 * Created by longway on 16/7/1 上午9:55.
 * packageName:com.longway.multiprocess.socket.socketChannel.client
 * projectName:demo
 * Email:longway1991117@sina.com
 ********************************/
public interface MessageReceiptHandler {
    void onSendMessageFail(byte[] msg);
}
