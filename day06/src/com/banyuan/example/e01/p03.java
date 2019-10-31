package com.banyuan.example.e01;

/**
 * @Auther: 张伟
 * @Date: 2019/10/29
 * @Description: com.banyuan.practice.p03
 * @version: 1.0
 */
public class p03 {
    public static void main(String[] args) {
        String str1="hello";
        //str1="helloword";
        foo(str1);
        //str1.equals(st)

//        char[] hello;
//        String str2=new String(hello);

        String str2=new String("nihao");
        foo(str2);
        str2="hhhhhh";
        str1.equals(str2);
        System.out.println(str1);
        System.out.println(str2);
    }
    public static void foo(String string){
        string="nihaoa";
    }
}
