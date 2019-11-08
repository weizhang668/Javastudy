package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/11/6
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class ThreadA implements Runnable {
    Bank bank;

    public ThreadA(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (new Bank()) {
                if (Bank.money >= 100) {
                    bank.atm(100);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}

