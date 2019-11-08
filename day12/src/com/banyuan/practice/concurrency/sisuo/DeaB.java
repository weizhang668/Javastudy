package com.banyuan.practice.concurrency.sisuo;

/**
 * @Auther: 张伟
 * @Date: 2019/11/6
 * @Description: com.banyuan.practice.concurrency.sisuo
 * @version: 1.0
 */
public class DeaB extends Thread {

    @Override
    public void run() {
        synchronized (Stu.s1){
            System.out.println("我要苹果");
        }

        synchronized (Stu.s2){
            System.out.println("我要栗子");
        }
    }
}

