package com.banyuan.practice.concurrency.sisuo;

/**
 * @Auther: 张伟
 * @Date: 2019/11/6
 * @Description: com.banyuan.practice.concurrency.sisuo
 * @version: 1.0
 */
public class DeaA extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Fruit.apple) {
                System.out.println("a得到苹果");
                try {
                    Thread.sleep(10);
                    System.out.println("a要去拿香蕉了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (Fruit.banana) {
                    System.out.println("a得到香蕉");
                }
            }

        }
    }
}

