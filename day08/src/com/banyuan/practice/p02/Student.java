package com.banyuan.practice.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/11/3
 * @Description: com.banyuan.practice.p02
 * @version: 1.0
 */
/**
 * 1.现在有学生类和学科类   学生类属性: 学生编号  学生姓名，
 * 学科类的属性:学科编号   学科名   学科成绩
 * 规定如下:   学科有 语文  数学  英语  物理 化学
 * 现在有n个学生，每个学生的每个学科都有成绩
 * a.现在要显示所有学生的所有的学科信息
 * b.根据每个学生的总成绩和进行降序排序
 * c.找出数学成绩前五的人的所有人信息和学科信息
 * d.将总成绩低于平均分的人，给他们的每个学科成绩各增加10分
 * */
public class Student {
    private int ID;
    private String name;


    public Student() {

    }

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
