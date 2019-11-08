package com.banyuan.practice;

import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/23
 * @Description: com.banyuan.practice
 * @version: 1.0
 */
/*题目
.手动输入任意三个数，求三个数的和，差

Scanner sc=new  Scanner(System.in);
System.out.println("请输人第一个数");
int  num1=sc.nextInt();
* */
public class p01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int num1=sc.nextInt();
        System.out.print("请输入第二个数：");
        int num2=sc.nextInt();
        System.out.print("请输入第三个数：");
        int num3=sc.nextInt();
        System.out.println("num1+num2+num3="+(num1+num2+num3));
        System.out.println("num1-num2="+(num1-num2));
        System.out.println("num1-num3="+(num1-num3));
        System.out.println("num2-num3="+(num2-num3));
    }

}
