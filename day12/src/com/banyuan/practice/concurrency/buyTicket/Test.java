package com.banyuan.practice.concurrency.buyTicket;

/**
 * @Auther: 张伟
 * @Date: 2019/11/6
 * @Description: com.banyuan.practice.concurrency.buyTicket
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //Thread m=new Thread();
        Mythread m=new Mythread();
        //Mythread m2=new Mythread();
        Thread m1=new Thread(m);
        Thread m2=new Thread(m);
        //Thread m3=new Thread(m);
        //Thread m4=new Thread(m);
        m1.start();
        m2.start();
        //m3.start();
        //m4.start();
    }
}
