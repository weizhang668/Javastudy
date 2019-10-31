package com.banyuan.practice.p09;

/**
 * @Auther: 张伟
 * @Date: 2019/10/30
 * @Description: com.banyuan.practice.p09
 * @version: 1.0
 */
/**题目
*创建Student类，属性：学号 姓名 年龄
1将这些Student对象放进数组中
2.查询里面有没有叫田七的学生如果存在则打印学生的具体信息（封装成方法，键盘输入姓名）
3.计算所有学生的平均年龄，最大年龄，最小年龄
4.如果存在名字叫张三的将名字改为张兵
*/
public class Student {
    private int id;
    private String name;
    private int age;



    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
