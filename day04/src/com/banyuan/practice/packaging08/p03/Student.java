package com.banyuan.practice.packaging08.p03;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging.p03
 * @version: 1.0
 */
/*题目
*1) 创建一个学生类
 2) 创建四个私有的字段:name,sex,age,dire
 3) 分别为私有的字段提供属性:name长度不能超过四位,sex只能是男或女,
 * age 1-60,dire方向只能是.net或java
 4) 测试:创建学生对象，设置属性，再分别在控制台打印该学生的基本信息
*/
public class Student {
    private String name="Tom";
    private String sex="男";
    private int age=0;
    private String dire="无";

    public Student() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()<5) {
            this.name = name;
        }else {
            System.out.println("输入内容不合法，取默认值");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex=="男"||sex=="女"){
            this.sex = sex;
        }else {
            System.out.println("输入内容不合法,取默认值");

        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0&&age<61){
            this.age = age;
        }else {
            System.out.println("输入内容不合法，取默认值");
        }

    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        if (dire.equals(".net")||dire.equals("java")){
            this.dire = dire;
        }else {
            System.out.println("输入内容不合法，取默认值");

        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dire='" + dire + '\'' +
                '}';
    }
}
