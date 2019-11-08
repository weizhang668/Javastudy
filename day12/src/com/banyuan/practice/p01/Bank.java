package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/11/6
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class Bank {
    //提供账户1000
    static int money=1000;
    public void atm(int money){
        //money取的金额
        Bank.money=Bank.money-money;
        System.out.println("ATM取钱"+money+"元，"+"余额："+Bank.money+"元。");
    }
    public void count(int money){
        //money取的金额
        Bank.money=Bank.money-money;
        System.out.println("柜台取钱"+money+"元，"+"余额："+Bank.money+"元。");
    }
}
