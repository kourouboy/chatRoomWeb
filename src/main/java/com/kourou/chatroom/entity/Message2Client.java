package com.kourou.chatroom.entity;

import lombok.Data;

import java.util.Map;

/**
 * @Author： kourou
 * @Data： 2019/8/6 22:23
 * @Description：
 */
@Data
public class Message2Client {
    // 聊天内容
    private String content;
    // 服务端登录的所有用户列表
    private Map<String, String> names;

    public void setContent(String msg) {
        this.content = msg;
    }
    public void setContent(String userName,String msg) {
        this.content = userName + "说:" + msg;
    }

    public void setNames(Map<String, String> names) {
        this.names = names;
    }

    public Map<String, String> getNames() {
        return names;
    }
}
