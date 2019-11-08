package com.banyuan.practice.p03;

/**
 * @Auther: 张伟
 * @Date: 2019/11/7
 * @Description: com.banyuan.practice.p03
 * @version: 1.0
 */
public class ThreadD implements Runnable {
    Tools tools;

    @Override
    public void run() {
        while (true) {
            //synchronized (tools) {
            try {
                Thread c = new Thread(new ThreadC());
                c.start();
                c.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("d-------" + (tools.number));
        //}
        }
    }
}
