package com.banyuan.example.e01;

/**
 * @Auther: 张伟
 * @Date: 2019/10/29
 * @Description: com.banyuan.example.e01
 * @version: 1.0
 */
public class Person {
    private String name;
    private int age;
    private String adress;
    private String phone;

    @Override
    public boolean equals(Object object){
        boolean flage=false;
        if (object==null) {
            return flage;
        }
        if (this.getClass()!=object) {
            return flage;
        }
        if (this==object){
            flage=true;
            return flage;
        }
        Person p=(Person)object;
        if (p.getName()!=null&&this.getName()!=null){
            if (p.getName().equals(this.getName())) {
                flage=true;

            }else {
                flage=false;
            }

        }
        if (p.getAdress()!=null&&this.getAdress()!=null){
            if (p.getAdress().equals(this.getAdress())) {
                flage=true;

            }else {
                flage=false;
            }

        }
        if (p.getPhone()!=null&&this.getPhone()!=null){
            if (p.getPhone().equals(this.getPhone())) {
                flage=true;
            }else {
                flage=false;
            }
        }
        return flage;
    }

    public Person() {

    }

    public Person(String name, int age, String adress, String phone) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
