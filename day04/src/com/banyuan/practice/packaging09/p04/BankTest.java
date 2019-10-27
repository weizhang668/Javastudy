package com.banyuan.practice.packaging09.p04;

import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging09.p04
 * @version: 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请依次输入ID，姓名，开户时间，身份证号，金额");
        bank.setID(scanner.next());
        bank.setName(scanner.next());
        bank.setTime(scanner.next());
        bank.setIdCard(scanner.next());
        bank.setMoney(scanner.nextInt());

        System.out.println(bank.toString());

        bank.getMoneyInfo();
        System.out.print("输入要存入的金额：");
        bank.cunMoney(scanner.nextInt());
        System.out.print("输入要取出的金额：");
        bank.quMoney(scanner.nextInt());
        bank.getMoneyInfo();

    }
}
