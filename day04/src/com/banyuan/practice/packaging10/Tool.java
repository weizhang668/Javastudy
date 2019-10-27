package com.banyuan.practice.packaging10;

/**
 * @Auther: 张伟
 * @Date: 2019/10/27
 * @Description: com.banyuan.practice.packaging10
 * @version: 1.0
 */
public class Tool {
    public static Student[] find(Student[]students,Student[] stuSame){//查找重名功能
        int x=0;
        for(int i=0;i<students.length-1;i++){
            for(int j=i+1;j<students.length-1;j++){
                if (students[i].getName().equals(students[j].getName())){
                    stuSame[x]=students[i];
                    x++;
                    stuSame[x]=students[j];
                    x++;

                }

            }

        }

        return stuSame;
    }
    public static void outPut(Student[] stuSame){
        if (stuSame[0]!=null){//表示有重名的对象
            for(int i=0;i<stuSame.length;i++){//去除空指针
                if (stuSame[i]!=null){
                    System.out.println(stuSame[i]);//输出信息
                }

            }
        }

    }

}
