package com.banyuan.example.e01;

import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/29
 * @Description: com.banyuan.example.e01
 * @version: 1.0
 */
public class Test<i> {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        Person[] person=new Person[num];
        int i;
        person[0]=new Person(scanner.next(),scanner.nextInt(), scanner.next(),scanner.next());
        for(i=1;i<person.length;i++){
            person[i]=new Person(scanner.next(),scanner.nextInt(), scanner.next(),scanner.next());
            for(int j=0;j<i;j++){
                if (person[i].equals(person[j])){

                    System.out.println("数据重复");
                    i--;
                    break;
                }else {
                    System.out.println("数据成功录入");


                }

            }

        }
        for(i=0;i<person.length;i++){
            System.out.println(person[i]);

        }
    }
}

