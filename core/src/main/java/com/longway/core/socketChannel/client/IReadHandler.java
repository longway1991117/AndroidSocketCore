package com.longway.core.socketChannel.client;

import java.io.IOException;
import java.nio.channels.SocketChannel;

/**
 * Created by longway on 16/7/2.
 * Email:longway1991117@sina.com
 */

public interface IReadHandler {
    void handlerRead(SocketChannel socketChannel) throws IOException;
}
