package com.kourou.chatroom.utils;

import org.junit.Test;

import java.sql.*;
import java.util.Properties;

/**
 * created by kourou on 2019/7/30
 */
public class JDBCUtils {
    private static String driverName;
    private static String url;
    private static String userName;
    private static String passWord;

    static {
        Properties properties = CommUtils.loadProperties("db.properties");
        driverName = properties.getProperty("driverName");
        url = properties.getProperty("url");
        userName = properties.getProperty("userName");
        passWord = properties.getProperty("password");
        //加载驱动
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            System.err.println("加载驱动出错");
        }
    }
    public static  Connection getConnection(){
        try {
            return DriverManager.getConnection(url,userName,passWord);
        } catch (SQLException e) {
            System.err.println("获取连接出错");
        }
        return null;
    }

    public static void closeResource(Connection connection, Statement statement){
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void closeResource(Connection connection,Statement statement,ResultSet resultSet){
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                closeResource(connection,statement);
            }
        }
    }

    @Test
    public void testQuery(){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

    }
}
