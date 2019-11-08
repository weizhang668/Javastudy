package com.banyuan.practice.concurrency.buyTicket;

/**
 * @Auther: 张伟
 * @Date: 2019/11/6
 * @Description: com.banyuan.practice.concurrency.buyTicket
 * @version: 1.0
 */
public class Mythread extends Thread {
    //线程：买票窗口

     private int ticket=100;
    Object someObject=new Object();


    @Override
    public void run(){
        while (true) {
            synchronized (someObject) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "----------" + "第" + (ticket--) + "张票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
