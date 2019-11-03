package com.banyuan.practice.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/11/3
 * @Description: com.banyuan.practice.p02
 * @version: 1.0
 */
public class Frog extends Animal implements Swimming{
    public Frog() {
    }

    public Frog(String name, String color, String type) {
        super(name, color, type);
    }

    @Override
    public void eat() {
        System.out.println("青蛙呱呱的吃");

    }

    @Override
    public void shout() {
        System.out.println("青蛙呱呱的叫");

    }

    @Override
    public void swim() {
        System.out.println("青蛙会游泳");

    }
}
