package com.kourou.chatroom.entity;

import lombok.Data;

/**
 * @Author： kourou
 * @Data： 2019/8/6 22:24
 * @Description:前端发送给后端的信息实体类
 * 群聊:{"msg":"777","type":1}
 * 私聊:{"to":"0-","msg":"33333","type":2}
 */
@Data
public class MessageFromClient {
    // 聊天信息
    private String msg;
    // 聊天类别: 1表示群聊 2表示私聊
    private String type;
    // 私聊的对象SessionID
    private String to;

    public String getTo() {
        return msg;
    }

    public void setTo(String to) {
        this.msg = to;
    }

    public String getMsg() {

        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = (String) type;
    }
}
