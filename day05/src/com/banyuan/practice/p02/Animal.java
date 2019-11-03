package com.banyuan.practice.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/10/28
 * @Description: com.banyuan.practice.p02
 * @version: 1.0
 */
public abstract class Animal {
    private String name;

    private String color;

    private String type;

    public abstract void eat();

    public abstract void shout();

    public Animal() {
    }

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}



