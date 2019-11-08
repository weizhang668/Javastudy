package com.banyuan.practice.p02;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

/**2019.11.5周二
 * 练习2：将一个集合里面的学生对象存储到指定的文件中去，每个学生信息单独占一行，
 * 学生的属性之间用英文逗号隔开
 * 学生属性:学生编号 学生姓名 学生密码  学生年龄  学生班级
 * 要求:1.学生选择登陆功能,如果文件中没有该学生的信息那么就得注册
 * 2.根据输入的学生的姓名获取指定学生的所有信息
 * 3.根据所有学生的年龄进行降序排序
 */

public class p02 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //合并流：
        File file = new File("1.txt");
        Set<Student> set=new TreeSet<Student>();
        set.add(new Student("李四", 12, "1231", 101, "1班"));
        set.add(new Student("王五", 13, "1232", 201, "2班"));
        set.add(new Student("赵六", 34, "1233", 301, "3班"));
        set.add(new Student("卢齐", 23, "1234", 401, "4班"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        oos.writeObject(set);

        oos.close();

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Student ob = (Student) ois.readObject();
//        for (Student s:set) {
//
//        }


        System.out.println(ob.toString());

        ois.close();

    }

}
