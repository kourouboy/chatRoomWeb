package com.kourou.chatroom.entity;

import lombok.Data;

/**
 * @Author： kourou
 * @Data： 2019/8/6 11:55
 * @Description：
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

