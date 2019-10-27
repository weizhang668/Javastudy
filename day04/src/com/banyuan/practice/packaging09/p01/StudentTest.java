package com.banyuan.practice.packaging09.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging09.p01
 * @version: 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu1=new Student(0,"zhangsan","男");
        Student stu2=new Student(1,"李四","女",12);

        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
    }

}
