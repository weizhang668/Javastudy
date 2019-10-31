package com.banyuan.practice.p09;

import javax.xml.stream.events.StartDocument;
import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/30
 * @Description: com.banyuan.practice.p09
 * @version: 1.0
 */
public class TestStudent {
    public static void main(String[] args) {
        Student[] stu=new Student[4];
        stu[0]=new Student(1,"张三",23);
        stu[1]=new Student(2,"张五",34);
        stu[2]=new Student(3,"田七",23);
        stu[3]=new Student(4,"李四",12);

        //Student student=TestStudent.select(stu);

        //System.out.println(student);

        System.out.println(TestStudent.sam(stu));
        System.out.println(TestStudent.max(stu));
        System.out.println(TestStudent.min(stu));

        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i]);
        }
        System.out.println("=====================================");
        Student[] students=TestStudent.s(stu);
        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i]);

        }


    }
    /**查询里面有没有叫田七的学生如果存在则打印学生的具体信息*/
     public static Student select(Student[]students){
         Student student=new Student();
         Scanner scanner=new Scanner(System.in);
         System.out.println("输入：");

         String news=scanner.next();
         for(int i=0;i<students.length;i++){
             if (news.equals(students[i].getName())){
                 student=students[i];
             }

         }

         return student;

     }

     public static int sam(Student[]students){
         int x=0;
         for(int i=0;i<students.length;i++){
             x=x+students[i].getAge();
         }
         return x;
     }

    public static int max(Student[]students){
        int max=students[0].getAge();
        for(int i=1;i<students.length;i++){

            if (max<students[i].getAge()){
                max=students[i].getAge();
            }
        }
        return max;
    }

    public static int min(Student[]students){
        int min=students[0].getAge();
        for(int i=1;i<students.length;i++){

            if (min>students[i].getAge()){
                min=students[i].getAge();
            }
        }
        return min;
    }

    public static Student[] s(Student[]students){
         //Student []  student=new Student[students.length];

         for(int i=0;i<students.length;i++){
             if ("张三".equals(students[i].getName())){
                 students[i].setName("张兵");
             }

         }


         return students;
    }


}
