package com.banyuan.practice.p03;

/**
 * @Auther: 张伟
 * @Date: 2019/11/3
 * @Description: com.banyuan.practice.p03
 * @version: 1.0
 */
public class Student extends Person implements Study,Work {

    @Override
    public void study() {
        System.out.println("在学校学习");

    }

    @Override
    public void work() {
        System.out.println("现在还没工作");

    }
}
