package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/11/1
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class Person implements Comparable {
    private String name;
    private double dou;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDou() {
        return dou;
    }

    public void setDou(double dou) {
        this.dou = dou;
    }

    public Person(String name, double dou) {
        this.name = name;
        this.dou = dou;
    }

    public Person() {
    }

    @Override
    public int compareTo(Object o) {
        Person p=(Person)o;
        int i=this.getName().compareTo(p.getName());
        int newi= i==0 ? (int) (this.getDou() - p.getDou()) :i;
        return newi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dou=" + dou +
                '}';
    }
}
