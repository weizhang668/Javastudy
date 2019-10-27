package com.banyuan.practice.packaging;

import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/27
 * @Description: com.banyuan.practice.packaging
 * @version: 1.0
 */
public class StudentQuestionTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] stu=new Student[6];
        stu=StudentTitle.studentInfo();
        boolean bo=true;
        String stuNum;
        Student student=null;
        //System.out.println("qqqqqqqqqq");
        //System.out.println(stu[1].getStuNum());
        do {
            System.out.println("请输入你的学生编号：");
            stuNum=sc.next();
            for(int i=0;i<stu.length;i++){
                if (stuNum.equals(stu[i].getStuNum())){
                    System.out.println("编号正确，准许进入。");
                    student=stu[i];
                    bo=false;
                    break;
                }
                    //break;
            }
            while (bo){
                System.out.println("编号错误，请确认后再输入。");
                break;
            }

        }while (bo);
        //System.out.println("----------------");

        Question[] q=new Question[10];
        q= QuestionTitle.getQuestions(QuestionTitle.inputQuestions());//获取10条题目
        String[] answer=new String[10];
        for(int i=0;i<q.length;i++){
            System.out.println("第"+(i+1)+"题");
            System.out.println("问题");
            System.out.println(q[i].getTitle());
            System.out.println("选项");
            System.out.print("A."+q[i].getAnswerA());
            System.out.print(" B."+q[i].getAnswerB());
            System.out.print(" C."+q[i].getAnswerC());
            System.out.print(" D."+q[i].getAnswerD());
            System.out.print("请输入答案：");
            answer[i]=sc.next();

        }
        int score=0;
        for(int i=0;i<q.length;i++){
            if (answer[i].equals(q[i].getAnswer())){
                score+=10;
            }
        }
        student.setStuScore(score);
        System.out.println(student.toString());



    }
}
