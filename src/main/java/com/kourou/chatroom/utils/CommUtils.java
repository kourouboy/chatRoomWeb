package com.kourou.chatroom.utils;



import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * created by kourou on 2019/7/30
 */
public class CommUtils{
    private  CommUtils(){}


    public static Properties loadProperties(String fileName){
        Properties properties = new Properties();
        //获取当前文件的输入流
        InputStream in = CommUtils.class.getClassLoader().getResourceAsStream(fileName);
        //加载配置文件中的所有内容
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
