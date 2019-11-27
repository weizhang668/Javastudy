package Server;

import dao.Connectdb;
import entity.Question;
import entity.User;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

/**
 * @Auther: 张伟
 * @Date: 2019/11/19
 * @Description: package01.controller.Server
 * @version: 1.0
 */
public class serverDemo {


    public static HashMap<String, String> userInfo = new HashMap<>();
    public static HashMap<String, String> stuInfo = new HashMap<>();
    public static ArrayList<Question> qList = new ArrayList<Question>();

    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    static PreparedStatement pstmt = null;

    static {


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
    }

    public static void getInfo() {
        try {
            String sql = "select t_id,t_password from teacherInfo";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                //System.out.println(rs.getString(1));
                String obid = rs.getString(1);
                String obpw = rs.getString(2);
                userInfo.put(obid, obpw);


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //存储学生信息
        try {
            String sql = "select s_id,s_password from studentInfo";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String obid = rs.getString(1);
                String obpw = rs.getString(2);
                stuInfo.put(obid, obpw);


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        /**
         * 功能描述:存储题目
         * @param:
         * @return:
         * @auther:
         * @date:
         */
        ResultSet rsq = null;
        Question t = null;
        String questionText = "";
        String standardKey = "";

        System.out.println("rdxftcgvyhbjnkml");
        try {
            String sSQL = "SELECT *  FROM  question WHERE id%3=0 ";//查询数据库表信息
            rsq = stmt.executeQuery(sSQL);//接收
            while (rsq.next()) {   //读取
                //System.out.print(rs.getString("tm")+"     ");
                questionText = rsq.getString("topic") + '\n' + "A." + rsq.getString(3)
                        + '\n' + "B." + rsq.getString(4) + '\n' + "C." + rsq.getString(5)
                        + '\n' + "D." + rsq.getString(6) + '\n';//获取表的列
                standardKey = rsq.getString("answer");
                //idExam=rs.getInt(1);
                t = new Question(questionText, standardKey);
                qList.add(t);
                //hmExam.put(idExam,standardKey);
            }
            System.out.println(qList.size());
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }


    }

    public static String adddb(String id, String name, String sex, String age) {
        try {
            pstmt = conn.prepareStatement("INSERT INTO studentInfo(s_ID,s_name,s_sex,s_age) VALUES(?,?,?,?)");
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, sex);
            pstmt.setString(4, age);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String str = new String("添加成功");
        return str;
    }

    public static String deletedb(String id) {
        try {
            pstmt = conn.prepareStatement
                    ("DELETE FROM studentInfo WHERE s_ID=?");
            pstmt.setString(1, id);
            int i = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String str = new String("添加成功");
        return str;
    }

    public static String updatedb(String id, String name, String sex, String age) {
        try {
            pstmt = conn.prepareStatement("UPDATE studentInfo SET s_name=?,s_sex=?,s_age=? WHERE s_ID=?");

            pstmt.setString(1, name);
            pstmt.setString(2, sex);
            pstmt.setString(3, age);
            pstmt.setString(4, id);
            int i = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String str = new String("添加成功");
        return str;
    }

    public static String selectdb(String id) {
        String str = new String();
        try {
            pstmt = conn.prepareStatement
                    ("SELECT * FROM studentInfo WHERE s_ID=?");
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                str = "学号：" + rs.getString(1) + "姓名：" + rs.getString(2)
                        + "性别：" + rs.getString(4) + "年龄：" + rs.getString(5)
                        + "成绩：" + rs.getString(6);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(str);
        return str;
    }

    public static String updatapassword(String id,String password) {
        try {
            pstmt = conn.prepareStatement
                    ("UPDATE studentInfo SET s_password=? WHERE s_ID=?");
            pstmt.setString(1, password);
            pstmt.setString(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String str = new String("修改成功");
        return str;
    }

    public static String updatascore(String id,String score) {
        try {
            pstmt = conn.prepareStatement
                    ("UPDATE studentInfo SET s_grade=? WHERE s_ID=?");
            pstmt.setString(1, score);
            pstmt.setString(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String str = new String("成绩修改成功");
        return str;
    }

    public static Vector getstudent() throws SQLException {
        Vector rowData = new Vector();
        String sSQL = "SELECT * FROM  studentInfo";//查询数据库表信息
        rs=stmt.executeQuery(sSQL);
        while (rs.next()) {
            //rowData可以存放多行;
            Vector hang = new Vector();
            hang.add(rs.getString(1));
            hang.add(rs.getString(2));
            hang.add(rs.getString(4));
            hang.add(rs.getString(5));
            hang.add(rs.getString(6));

            //加入到rowData
            rowData.add(hang);
        }
        return rowData;

    }


//    public static void main(String[] args) {
//        //new ExamFrame();
//        getInfo();
//        System.out.println("-----------------------");
//        System.out.println(userInfo);
//        userInfo.forEach((k,v) -> {
//            System.out.println(k+"---"+v);
//        });
//        for (String keyname : serverDemo.userInfo.keySet()) {
//            System.out.println(keyname);
//            System.out.println(serverDemo.userInfo.get(keyname));
//        }
    //}
}

