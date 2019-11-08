package com.banyuan.practice;

/**
 * @Auther: 张伟
 * @Date: 2019/10/23
 * @Description: com.banyuan.practice
 * @version: 1.0
 */
/*
* 10011101  转换成八进制  和十六进制
* */
public class p03 {
    public static void main(String[] args) {
        int a=0b10011101;
        /*
        Integer其中的方法
        static String toBinaryString(int i)
        以二进制（基数 2）无符号整数形式返回一个整数参数的字符串表示形式。
        static String toHexString(int i)
        以十六进制的无符号整数形式返回一个整数参数的字符串表示形式。
        static String toOctalString(int i)
        以八进制（基数 8）无符号整数形式返回一个整数参数的字符串表示形式。

        * */
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));
    }
}
