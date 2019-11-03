package com.banyuan.practice.p05;

/**
 * @Auther: 张伟
 * @Date: 2019/11/3
 * @Description: com.banyuan.practice.p05
 * @version: 1.0
 */
public class Manager extends Employee {

    final String vehicle="开奔驰";


    public Manager(String salary) {
        super(salary);
    }

    public Manager(String name, String sex, int age, String salary) {
        super(name, sex, age, salary);
    }

    @Override
    public String toString() {
        return "Manager{" +super.toString()+
                "vehicle='" + vehicle + '\'' +
                '}';
    }
}
