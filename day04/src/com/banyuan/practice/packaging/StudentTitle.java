package com.banyuan.practice.packaging;

/**
 * @Auther: 张伟
 * @Date: 2019/10/27
 * @Description: com.banyuan.practice.packaging
 * @version: 1.0
 */
public class StudentTitle {
    public static Student[] studentInfo(){//存储学生信息，相当于一个数据库
        Student[] stu=new Student[6];
        stu[0]=new Student("001","Tom1","一年级");
        stu[1]=new Student("002","Tom2","二年级");
        stu[2]=new Student("003","Tom3","三年级");
        stu[3]=new Student("004","Tom4","四年级");
        stu[4]=new Student("005","Tom5","五年级");
        stu[5]=new Student("006","Tom6","六年级");

        return stu;
    }
}
