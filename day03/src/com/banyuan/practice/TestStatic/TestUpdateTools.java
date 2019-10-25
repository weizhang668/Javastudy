package com.banyuan.practice.TestStatic;

import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/24
 * @Description: com.banyuan.practice.TestStatic
 * @version: 1.0
 */
public class TestUpdateTools {
    static int count;
    static Scanner sc=new Scanner(System.in);
    public static int getLength(Person[] person){//获取数组有效长度

        for(int i=0;i<person.length;i++){
            if (person[i] == null){
                break;
            }
            count++;
        }

        return count;
    }

    public static Person[] add(Person[] person){//添加数组内容
        System.out.print("请输入要添加人的姓名：");
        person[count]=new Person();
        person[count].setName(sc.next());
        System.out.print("请输入要添加人的年龄：");
        person[count].setAge(sc.nextInt());
        System.out.print("请输入要添加人的住址：");
        person[count].setAdress(sc.next());
        System.out.println();

        return person;

    }

    public static Person[] update(Person[] person){//修改

        System.out.print("请输入要修改信息的位置下标：");
        int x=sc.nextInt();
        System.out.print("请输入修改后的名字：");
        person[x].setName(sc.next());
        System.out.print("请输入修改后的年龄：");
        person[x].setAge(sc.nextInt());
        System.out.print("请输入修改后的住址：");
        person[x].setAdress(sc.next());

        return person;
    }

    public static Person[] delate(Person[] person){//删除

        System.out.print("请输入要删除的位置下标：");
        int x=sc.nextInt();
        person[x]=null;
        for(int i=x+1;i<count;i++){
            person[x]=person[x+1];
        }
        return person;
    }

    public static void search(Person[] person){//查询

        System.out.print("请输入要查询的位置下标：");
        int x=sc.nextInt();
        System.out.println(person[x].toString());
    }

}
