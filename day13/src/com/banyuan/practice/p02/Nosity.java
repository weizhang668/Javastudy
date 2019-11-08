package com.banyuan.practice.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/11/7
 * @Description: com.banyuan.practice.p02
 * @version: 1.0
 */
public class Nosity extends Thread {
    Tools tools;

    public Nosity(Tools tools) {
        this.tools = tools;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (tools) {
                tools.notify();
            }
        }
    }
}
