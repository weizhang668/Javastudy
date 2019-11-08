package com.banyuan.practice.set.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/11/3
 * @Description: com.banyuan.practice.set.p01
 * @version: 1.0
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 1.编写一个程序，获取10个1至20的随机数，
 * 要求随机数不能重复。并把最终的随机数输出到控制台
 * */
public class p01 {
    public static void main(String[] args) {
        Set<Integer> sets=new HashSet<>();
        Random random=new Random();
        while(sets.size()<10){
            int x=random.nextInt(20);
            sets.add(x);
        }
        System.out.println(sets);


    }
}
