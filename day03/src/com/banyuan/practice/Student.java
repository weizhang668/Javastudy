package com.banyuan.practice;

/**
 * @Auther: 张伟
 * @Date: 2019/10/24
 * @Description: com.banyuan.practice
 * @version: 1.0
 */
public class Student {
    private String name;
    private String sex;
    private int age;
    public static String country="中国";

    public Student() {
    }

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
