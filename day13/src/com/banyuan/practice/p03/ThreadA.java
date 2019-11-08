package com.banyuan.practice.p03;

/**
 * @Auther: 张伟
 * @Date: 2019/11/7
 * @Description: com.banyuan.practice.p03
 * @version: 1.0
 */
public class ThreadA implements Runnable {
    Tools tools;

    @Override
    public void run() {
        while (true) {
            //synchronized (tools) {
            try {
                Thread b=new Thread(new ThreadB());
                b.start();
                b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("a-------"+(tools.number));
            //}
        }
    }
}
