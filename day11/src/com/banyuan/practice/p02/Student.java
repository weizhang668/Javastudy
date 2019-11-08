package com.banyuan.practice.p02;

import java.io.Serializable;
// * 学生属性:学生编号 学生姓名 学生密码  学生年龄  学生班级

public class Student implements Serializable {

    private   String name;
    private  int   age;
    private String password;
    private int number;
    private String classnum;

    public String getClassnum() {
        return classnum;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum;
    }

    public Student(String name, int age, String password, int number, String classnum) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.number = number;
        this.classnum = classnum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", number=" + number +
                ", classnum='" + classnum + '\'' +
                '}';
    }
}
