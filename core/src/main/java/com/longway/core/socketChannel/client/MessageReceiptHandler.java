package com.longway.core.socketChannel.client;

public interface MessageReceiptHandler {
    void onSendMessageFail(byte[] msg);
}
