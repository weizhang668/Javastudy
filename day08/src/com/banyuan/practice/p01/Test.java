package com.banyuan.practice.p01;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/31
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Person> arrayPerson=new ArrayList<>();
        arrayPerson.add(new Person(1,"张1",11,"男","南京栖霞区"));
        arrayPerson.add(new Person(2,"李1",12,"男","南京海淀区"));
        arrayPerson.add(new Person(3,"张2",13,"男","苏州朝阳区"));
        arrayPerson.add(new Person(4,"李2",14,"男","苏州朝南区"));
        arrayPerson.add(new Person(5,"张3",15,"男","上海海曙区"));
        arrayPerson.add(new Person(6,"李3",16,"男","上海海南区"));
        arrayPerson.add(new Person(7,"张4",17,"男","镇江人民区"));
        arrayPerson.add(new Person(8,"李4",18,"男","镇江闸北区"));
        arrayPerson.add(new Person(9,"张5",19,"男","常州人民区"));
        arrayPerson.add(new Person(10,"李5",20,"男","常州闸北区"));

        //selsct(arrayPerson);
        ArrayList<Person>aaa=delete(arrayPerson);
        for (int i = 0; i <aaa.size() ; i++) {
            System.out.println(aaa.get(i));


        }
    }

    private static void selsct(ArrayList<Person> arrayPerson) {
        System.out.println("请输入城市");
        Scanner sc=new Scanner(System.in);
        String cs=sc.next();
        for(int i=0;i<arrayPerson.size();i++){
            if(arrayPerson.get(i).getAdress().startsWith(cs)){
                System.out.println(arrayPerson.get(i));
            }

        }
    }
    private static ArrayList delete(ArrayList<Person> arrayPerson) {
        System.out.println("请输入指定区");
        Scanner sc=new Scanner(System.in);
        String cs=sc.next();
        ArrayList<Person> arrayList=new ArrayList<>();
        for(int i=0;i<arrayPerson.size();i++){
            if(arrayPerson.get(i).getAdress().equals(cs)){
                arrayPerson.remove(i);
                i--;
                //System.out.println(arrayPerson.get(i));

            }else{
                arrayList.add(arrayPerson.get(i));
            }

        }
        return arrayList;
    }
}
