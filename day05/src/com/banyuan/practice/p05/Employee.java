package com.banyuan.practice.p05;

/**
 * @Auther: 张伟
 * @Date: 2019/11/3
 * @Description: com.banyuan.practice.p05
 * @version: 1.0
 */
public class Employee extends Role {
    private String salary;
    static String ID;

    public Employee(String salary) {
        super();
        this.salary = salary;
    }

    public Employee(String name, String sex, int age, String salary) {
        super(name, sex, age);
        this.salary = salary;
    }

    public Employee() {

    }

    final void sing(){
        System.out.println("唱歌");
    }

    @Override
    public void play() {
        System.out.println("打球");

    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                "salary='" + salary + '\'' +
                '}';
    }
}
