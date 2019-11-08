package com.banyuan.practice.concurrency.sisuo;

/**
 * @Auther: 张伟
 * @Date: 2019/11/6
 * @Description: com.banyuan.practice.concurrency.sisuo
 * @version: 1.0
 */
public class Dea extends Thread {

    private boolean flag;

    public Dea(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        super.run();
    }
}

