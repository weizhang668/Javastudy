package com.banyuan.practice.p03;

/**
 * @Auther: 张伟
 * @Date: 2019/11/7
 * @Description: com.banyuan.practice.p03
 * @version: 1.0
 */
public class ThreadB implements Runnable {
    Tools tools;

    @Override
    public void run() {
        while (true) {
            synchronized (tools) {
                System.out.println("b-------"+(tools.number));
            }
        }
    }
}
