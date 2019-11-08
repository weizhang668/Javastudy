package com.banyuan.example;

/**
 * @Auther: 张伟
 * @Date: 2019/10/23
 * @Description: com.banyuan.example
 * @version: 1.0
 */
public class Animal {
    private String name;
    private String color;
    private int age;

    public Animal() {//无参构造
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
