package com.banyuan.practice.p03;

/**
 * @Auther: 张伟
 * @Date: 2019/11/7
 * @Description: com.banyuan.practice.p03
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        ThreadA threadA=new ThreadA();
        Thread a=new Thread(threadA);
        a.start();
        ThreadD threadD=new ThreadD();
        Thread d=new Thread(threadD);
        d.start();
    }
}
