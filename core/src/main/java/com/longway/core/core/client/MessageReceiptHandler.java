package com.longway.core.core.client;

public interface MessageReceiptHandler {
    void onSendMessageFail(byte[] msg);
}
