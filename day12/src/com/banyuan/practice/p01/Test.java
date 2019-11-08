package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/11/6
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Bank bank=new Bank();
        ThreadA threadA=new ThreadA(bank);
        ThreadB threadB=new ThreadB(bank);
        Thread a1=new Thread(threadA);
        Thread b1=new Thread(threadB);
        a1.start();
        b1.start();
    }
}
