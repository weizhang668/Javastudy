package com.banyuan.practice.packaging08.p05;

import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging.p05
 * @version: 1.0
 */
public class TeacherTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请依次输入ID,name,sex,age,height");
        Teacher teacher=new Teacher();
        teacher.setId(scanner.nextInt());
        teacher.setName(scanner.next());
        teacher.setSex(scanner.next());
        teacher.setAge(scanner.nextInt());
        teacher.setHeight(scanner.nextDouble());
        teacher.ShowDate();
    }
}
