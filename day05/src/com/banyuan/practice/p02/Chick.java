package com.banyuan.practice.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/11/3
 * @Description: com.banyuan.practice.p02
 * @version: 1.0
 */
public class Chick extends Animal  {
    public Chick() {
    }

    public Chick(String name, String color, String type) {
        super(name, color, type);
    }

    @Override
    public void eat() {
        System.out.println("小鸡叽叽喳喳的吃");

    }

    @Override
    public void shout() {
        System.out.println("小鸡叽叽喳喳的叫");

    }

}
