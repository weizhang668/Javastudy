package com.banyuan.practice;

/**
 * @Auther: 张伟
 * @Date: 2019/10/23
 * @Description: com.banyuan.practice
 * @version: 1.0
 */

/*题目
// 现有一群人n, 人的属性: 姓名  年龄   住址  性别
// 请根据这群人的年龄大小进行升序排序  并且把排序之后的人的相关信息在控制台显示
 */
public class TestPerson {
    public static void main(String[] args) {
        Person [] p=new Person[6];
        p[0]=new Person();
        p[1]=new Person();
        p[2]=new Person();
        p[3]=new Person();
        p[4]=new Person();
        p[5]=new Person();

        p[0].setName("张三");
        p[0].setAge(12);
        p[0].setAdress("南京");
        p[0].setSex("男");

        p[1].setName("李四");
        p[1].setAge(14);
        p[1].setAdress("南京");
        p[1].setSex("男");

        p[2].setName("王五");
        p[2].setAge(24);
        p[2].setAdress("南京");
        p[2].setSex("男");

        p[3].setName("赵六");
        p[3].setAge(20);
        p[3].setAdress("南京");
        p[3].setSex("男");

        p[4].setName("钱七");
        p[4].setAge(45);
        p[4].setAdress("南京");
        p[4].setSex("男");

        for(int i=0;i<p.length-1;i++){
            for(int j=0;j<p.length-i-2;j++){
                if (p[j].getAge()>p[j+1].getAge()){
                    p[p.length-1]=p[j];
                    p[j]=p[j+1];
                    p[j+1]=p[p.length-1];
                }

            }
//            String str=p[i].toString();
//            System.out.println(str);


        }
        for(int i=0;i<p.length-1;i++){
            System.out.println(p[i].toString());


        }
//
//        int[]ageArray=new int[p.length];
//        for(int i=0;i<p.length;i++){
//            ageArray[i]=p[i].getAge();
//
//        }


//        Person p1=new Person("张三",12,"南京","男");
//        Person p2=new Person("李四",15,"南京","男");
//        Person p3=new Person("王五",20,"南京","男");
//        Person p4=new Person("赵六",24,"南京","男");
//        Person p5=new Person("钱七",10,"南京","男");


    }
}
