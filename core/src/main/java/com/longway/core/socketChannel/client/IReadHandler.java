package com.longway.core.socketChannel.client;

import java.io.IOException;
import java.nio.channels.SocketChannel;


public interface IReadHandler {
    void handlerRead(SocketChannel socketChannel) throws IOException;
}
