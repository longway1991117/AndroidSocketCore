package com.longway.core.socketChannel.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;


/*********************************
 * Created by longway on 16/6/23 下午1:56.
 * packageName:com.longway.multiprocess.socket.socketChannel
 * projectName:demo
 * Email:longway1991117@sina.com
 ********************************/
public class SocketService extends Service {
    private SocketChannelServer mServer;

    @Override
    public void onCreate() {
        super.onCreate();
        mServer = SocketChannelServer.start(8080);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        mServer.pause();
        super.onDestroy();
    }
}
