package util;

import dao.Connectdb;
import entity.Question;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class QuestionReader {

//    private HashSet<Question> questionBox = new HashSet<>();

    Question t = null;
    String questionText = "";
    String standardKey = "";
    Vector<Question> qList = new Vector<Question>();
    Question t1;
    Question[] questions;
    int examtime;
    int p = 0;//设置题目数指针
    int topicnum = 0;
   // int right, error;      //答对和答错

    Statement stmt = Connectdb.connect();

    {
        try {
            String sSQL = "SELECT *  FROM  question where id%2=0";//查询数据库表信息
            ResultSet rs;//接收
            rs = stmt.executeQuery(sSQL);
            while (rs.next()) {   //读取
                //System.out.print(rs.getString("tm")+"     ");
                questionText = rs.getString("topic") + '\n' + rs.getString(3)
                        + '\n' + rs.getString(4) + '\n' + rs.getString(5)
                        + '\n' + rs.getString(6) + '\n';//获取表的列
                standardKey = rs.getString("answer");
                //idExam=rs.getInt(1);
                t = new Question(questionText, standardKey);
                qList.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }


        topicnum = qList.size();//确定题目数量
        questions = new Question[topicnum];
        for (
                int i = 0; i < qList.size(); i++) {
            questions[i] = qList.get(i);
        }
    }
}


