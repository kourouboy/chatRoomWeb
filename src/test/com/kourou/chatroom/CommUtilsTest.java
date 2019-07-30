package com.kourou.chatroom;

import com.kourou.chatroom.utils.CommUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Properties;

/**
 * created by kourou on 2019/7/30
 */
public class CommUtilsTest {

    @Test
    public void loadProperties(){
        String fileName = "db.properties";
        Properties properties = CommUtils.loadProperties(fileName);
        System.out.println(properties);
        String url = properties.getProperty("url");
        Assert.assertEquals("jdbc:mysql://localhost:3306/jdbc",url);
    }

}