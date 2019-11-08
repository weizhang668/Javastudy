package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/11/1
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */

import java.util.TreeSet;

/**根据英文字母排序存储，如果相同以成绩存储*/
public class p01 {
    public static void main(String[] args) {
        TreeSet<Person> treep=new TreeSet<>();
        treep.add(new Person("tom",12));
        treep.add(new Person("jerry",12));
        treep.add(new Person("tom",13));
        treep.add(new Person("tom",12));


        //System.out.println(treep.toString());
        for (Person p:treep) {
            System.out.println(p.toString());
        }
    }
}
