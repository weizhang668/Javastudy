package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/10/31
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */

import java.util.Random;
import java.util.Scanner;

/**
 * :需求：请设计一个方法，可以实现获取任意范围内的随机数。
 * */
public class p01 {
    public static int getRandom(int start,int end) {
        Random random = new Random();
        int s = random.nextInt(end)%(end-start+1) + start;
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数：");
        int start = sc.nextInt();
        System.out.println("请输入结束数：");
        int end = sc.nextInt();
        for(int i=0;i<20;i++){
            System.out.println(p01.getRandom(start,end));

        }

    }
}
