package com.banyuan.practice;

/**
 * @Auther: 张伟
 * @Date: 2019/10/23
 * @Description: com.banyuan.practice
 * @version: 1.0
 */
/*题目
.求BCD+2F的值
  BCD
   2F
* */
public class p02 {
    public static void main(String[] args) {
        int a=0xBCD;//进制输入方法：二进制：0b,八进制：0，十六进制：0X，0x
        int b=0x2F;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a+b="+(a+b));
    }

}
