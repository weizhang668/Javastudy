package com.banyuan.practice.packaging10;

/**
 * @Auther: 张伟
 * @Date: 2019/10/27
 * @Description: com.banyuan.practice.packaging10
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student[] students=new Student[9];
        Student[] stuSame=new Student[students.length];
        Grade grade1=new Grade("奥数班",01);
        Grade grade2=new Grade("古文班",02);
        Grade grade3=new Grade("外语班",03);
        students[0]=new Student("Tom",13,1,grade1);
        students[1]=new Student("Tom",124,2,grade2);
        students[2]=new Student("jerry",78,3,grade1);
        students[3]=new Student("libai",23,4,grade1);
        students[4]=new Student("杜甫",14,5,grade2);
        students[5]=new Student("杜甫",18,6,grade2);
        students[6]=new Student("白居易",15,7,grade3);
        students[7]=new Student("白展堂",16,8,grade3);
        students[8]=new Student("白起",17,9,grade1);

        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
        System.out.println("----------------------------");
        Tool.find(students,stuSame);
        Tool.outPut(stuSame);

    }
}
