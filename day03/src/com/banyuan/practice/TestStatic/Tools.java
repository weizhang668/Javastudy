package com.banyuan.practice.TestStatic;

/**
 * @Auther: 张伟
 * @Date: 2019/10/24
 * @Description: com.banyuan.practice.TestStatic
 * @version: 1.0
 */
public class Tools {
    public static Person[] person=new Person[10];
    public static int age=10;
    static{
        for (int i = 0; i <3; i++) {
            person[i]=new Person();
            person[i].setName("Tom"+i);
            person[i].setAdress("峡谷之巅"+i);
            person[i].setAge(18+i);


        }
    }
//    public static int ;

//    static {
//        for(int i=0;i<person.length;i++){
//
//
//        }

//    }
}
