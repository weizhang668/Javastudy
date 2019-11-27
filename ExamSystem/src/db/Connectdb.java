package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @Auther: 张伟
 * @Date: 2019/11/19
 * @Description: package01.controller
 * @version: 1.0
 */
public class Connectdb {
    public static Statement connect() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/project01";//驱动加载
            String dbUser = "root"; //数据库用户名
            String dbPassword = "banyuanzw";    //密码
            conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            System.out.println("JDBC连接数据库成功!");
            stmt = conn.createStatement(); //创建连接方法
        } catch (Exception e) {
            e.printStackTrace();//打印异常信息
        }
        return stmt;
    }

}
