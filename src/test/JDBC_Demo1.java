import com.kourou.chatroom.utils.JDBCUtils;
import com.mysql.jdbc.Connection;
import org.junit.Test;
import java.sql.*;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * created by kourou on 2019/7/27
 */
public class JDBC_Demo1 {
    @Test
    //查询操作 （select）
    public void test() {

        //1.加载驱动(包名.类名)
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //2.获取连接（连接数据库）
            Connection connection = (Connection) DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/jdbc","root","123580");

            //3.执行SQL
            //要执行的语句
            String sql = "select * from user";
            //具体执行代码
            Statement statement = connection.createStatement();
            //封装查询的结果集(结果为执行语句后的表)
            ResultSet resultSet = statement.executeQuery(sql);

            //4.遍历结果
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String useName = resultSet.getString("username");
                String passWord = resultSet.getString("password");
                System.out.println("id为：" + id + ",用户名为：" + useName + ",密码为：" + passWord);
            }

            //5.释放资源
            connection.close();
            statement.close();
            resultSet.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    //insert -- 更新操作
    public void test2() {

        //1.加载驱动(包名.类名)
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //2.获取连接（连接数据库）
            Connection connection = (Connection) DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/jdbc","root","123580");

            //3.执行SQL
            //要执行的语句
            String sql = "insert into user (username,password)" + "values ('test','456')";
            //具体执行代码
            Statement statement = connection.createStatement();
            //封装查询的结果集(结果为执行语句后的表)
            int resultRows = statement.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
            System.out.println(resultRows);

            //5.释放资源
            connection.close();
            statement.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    //delete -- 删除
    public void test3() {

        //1.加载驱动(包名.类名)
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //2.获取连接（连接数据库）
            Connection connection = (Connection) DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/jdbc","root","123580");

            //3.执行SQL
            //要执行的语句
            String sql = "delete from user where id = 4";
            //具体执行代码
            Statement statement = connection.createStatement();
            //封装查询的结果集(结果为执行语句后的表)
            int resultRows = statement.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
            System.out.println(resultRows);

            //5.释放资源
            connection.close();
            statement.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    //查询操作 （select）
    public void test4() {

        //1.加载驱动(包名.类名)
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //2.获取连接（连接数据库
            Connection connection = (Connection) DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/jdbc","root","123580");

            //3.执行SQL
            //要执行的语句
            String username = "zs";
            String password = "dhuds";
            String sql = "select * from user where username = '" +username+" " + "and password = '"+password+"' ";
            //具体执行代码
            Statement statement = connection.createStatement();
            //封装查询的结果集(结果为执行语句后的表)
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()){
                System.out.println("登陆成功");
            }else{
                System.out.println("登陆失败");
            }

            //5.释放资源
            connection.close();
            statement.close();
            resultSet.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test5(){
        //加载资源
        java.sql.Connection connection = JDBCUtils.getConnection();
    }
}
