package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/11/7
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //Thread th=new Thread();
        Trade th=new Trade();
        Threadsell threadsell=new Threadsell(th);
        Threadbuy threadbuy=new Threadbuy(th);
        Thread thread1=new Thread(threadsell);
        Thread thread2=new Thread(threadbuy);

        thread1.start();
        thread2.start();
    }
}
