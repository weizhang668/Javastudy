package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/11/7
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class Threadbuy implements Runnable {
    Trade trade;

    public Threadbuy(Trade trade) {
        this.trade = trade;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Thread.class) {
                System.out.println(Thread.currentThread().getName()+"-----------buy-----------"+trade.toString());
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
