package com.banyuan.practice.p04;

/**
 * @Auther: 张伟
 * @Date: 2019/11/3
 * @Description: com.banyuan.practice.p04
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Ming xm=new Ming();
        xm.method();
        System.out.println("=========================");
        Person xl=new Li();
        Person xw=new Wang();
        xl.method();
        System.out.println("=========================");

        xw.method();

    }
}
