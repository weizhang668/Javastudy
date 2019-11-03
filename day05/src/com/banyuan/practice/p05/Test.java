package com.banyuan.practice.p05;

/**
 * @Auther: 张伟
 * @Date: 2019/11/3
 * @Description: com.banyuan.practice.p05
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Employee emp=new Employee("tom","男",23,"10万");
        Manager man=new Manager("jerry","女",25,"8万");

        emp.play();
        emp.sing();
        System.out.println(emp.toString());
        System.out.println("========================");

        System.out.println(man.toString());
    }
}
