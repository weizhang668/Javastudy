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
        while (true) {
            synchronized (Fruit.banana) {
                System.out.println("b得到香蕉");
                try {
                    Thread.sleep(10);
                    System.out.println("b要去拿苹果了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (Fruit.apple) {
                    System.out.println("b得到苹果");
                }
            }

        }
    }
}

