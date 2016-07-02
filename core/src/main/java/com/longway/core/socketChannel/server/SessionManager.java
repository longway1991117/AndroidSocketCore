package com.longway.core.socketChannel.server;

import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*********************************
 * Created by longway on 16/6/30 下午10:33.
 * packageName:com.longway.multiprocess.socket.socketChannel.server
 * projectName:demo
 * Email:longway1991117@sina.com
 ********************************/
public class SessionManager {
    private static volatile SessionManager sInstance;
    private ConcurrentHashMap<String, SocketChannel> mSession = new ConcurrentHashMap<>();

    private SessionManager() {

    }

    public static SessionManager getInstance() {
        if (sInstance == null) {
            synchronized (SessionManager.class) {
                if (sInstance == null) {
                    sInstance = new SessionManager();
                }
            }
        }
        return sInstance;
    }

    public void addSession(String id, SocketChannel socketChannel) {
        mSession.put(id, socketChannel);
    }

    public void removeSession(String id) {
        mSession.remove(id);
    }

    public void removeSession(SocketChannel socketChannel) {
        Set<Map.Entry<String, SocketChannel>> entrySet = mSession.entrySet();
        for (Map.Entry<String, SocketChannel> entry : entrySet) {
            SocketChannel value = entry.getValue();
            if (value == socketChannel) {
                mSession.remove(entry.getKey());
                break;
            }
        }
    }

    public ArrayList<SocketChannel> getAllSessions() {
        ArrayList<SocketChannel> socketChannels = new ArrayList<>();
        Enumeration<SocketChannel> enumeration = mSession.elements();
        while (enumeration.hasMoreElements()) {
            socketChannels.add(enumeration.nextElement());
        }
        return socketChannels;
    }
}
