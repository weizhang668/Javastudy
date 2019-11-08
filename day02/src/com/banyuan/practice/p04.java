package com.banyuan.practice;

import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/23
 * @Description: com.banyuan.practice
 * @version: 1.0
 */
/*给定一个任意的大写字母A~Z，转换为小写字母
* */
public class p04 {
    public static void main(String[] args) {
        System.out.println("请输入任一大写字母：");//a是97 A是65 差值32
        Scanner sc=new Scanner(System.in);

        String x=sc.next();//不能用char来创建
//        x.toCharArray();
        String a=x.toLowerCase();//toLowerCase()方法
        System.out.println(a);



//        double d1=2e20;
//        double d=d1*1+10;
//        System.out.println(d);

    }
}
