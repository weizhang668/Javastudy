package com.banyuan.practice.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/11/3
 * @Description: com.banyuan.practice.p02
 * @version: 1.0
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal chick=new Chick("杰克","黄","小鸡");
        Frog frog=new Frog("汤姆","黑","青蛙");
        chick.eat();
        chick.shout();
        frog.shout();
        frog.eat();
        frog.swim();

    }
}
