package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/11/6
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class ThreadB implements Runnable {
    Bank bank;

    public ThreadB(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (Bank.money >= 100) {
                    bank.atm(100);
                }
            }
        }
    }
}

