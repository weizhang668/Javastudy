package com.banyuan.practice;

/**
 * @Auther: 张伟
 * @Date: 2019/10/23
 * @Description: com.banyuan.practice
 * @version: 1.0
 */



public class Person {
    private String name;
    private int age;
    private String adress;
    private String sex;

    public Person() {
    }

    public Person(String name, int age, String adress, String sex) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
