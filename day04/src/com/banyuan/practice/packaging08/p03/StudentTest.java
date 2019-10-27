package com.banyuan.practice.packaging08.p03;

import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging.p03
 * @version: 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student student=new Student();
        System.out.println("请依次输入姓名，年龄，性别，方向：");
        student.setName(sc.next());
        student.setAge(sc.nextInt());
        student.setSex(sc.next());
        student.setDire(sc.next());
        student.toString();
        System.out.println(student.toString());

    }
}
