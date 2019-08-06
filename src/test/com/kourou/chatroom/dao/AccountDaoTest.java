package com.kourou.chatroom.dao;

import com.kourou.chatroom.entity.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author： kourou
 * @Data： 2019/8/6 16:20
 * @Description：
 */
public class AccountDaoTest {

    private AccountDao accountDao = new AccountDao();
    @Test
    public void userLogin() {
    }

    @Test
    public void userRegister() {
        User user = new User();
        user.setUserName("test");
        user.setPassword("123");
        boolean isSuccess = accountDao.userRegister(user);
        Assert.assertEquals(true,isSuccess);
    }
}