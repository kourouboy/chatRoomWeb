package com.kourou.chatroom.Service;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Author： kourou
 * @Data： 2019/8/6 22:00
 * @Description：
 */
@ServerEndpoint("/websocket")
public class Websocket {
    // 储存所有连接到后端的websocket
    private static CopyOnWriteArraySet<Websocket> client = new CopyOnWriteArraySet<>();
    //绑定当前websocket会话
    private Session session;

}
