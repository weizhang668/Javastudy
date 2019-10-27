package com.banyuan.practice.packaging10;

/**
 * @Auther: 张伟
 * @Date: 2019/10/27
 * @Description: com.banyuan.practice.packaging10
 * @version: 1.0
 */
/*题目
*现有学生和班级两个类
学生属性有:
姓名,年龄,学生编号,班级
班级：
班级名称,班级编号

现在在一个工具类 Tool里面有一个方法用来查找在三个不同班级里面的学生重名的功能
* 每个班级10个学生,如果查到学生姓名有一样的,
* 这个方法就返回所有的学生对象并且输出满足条件对象信息
*/
public class Student {
    private String name;
    private int age;
    private int id;
    private Grade grade;

    public Student() {
    }

    public Student(String name, int age, int id, Grade grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}
