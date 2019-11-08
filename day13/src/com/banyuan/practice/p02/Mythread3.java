package com.banyuan.practice.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/11/7
 * @Description: com.banyuan.practice.p02
 * @version: 1.0
 */
public class Mythread3 extends Thread {
    Tools tools;

    public Mythread3(Tools tools) {

        this.tools = tools;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (tools) {
                if (tools.number <= 75) {
                    if (tools.n == 3) {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(Thread.currentThread().getName() + "-------" + (tools.number++));

                        }
                        tools.n = 1;
                    }
                    try {
                        tools.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
