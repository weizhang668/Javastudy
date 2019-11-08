package com.banyuan.practice.p05;

/**
 * @Auther: 张伟
 * @Date: 2019/11/3
 * @Description: com.banyuan.practice.p05
 * @version: 1.0
 */

import java.util.Scanner;

/**
 *5. 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。
 *但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，
 * 应该输出为“我ABC”而不是“我ABC+汉的半个”。*/
public class p05 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true) {
            System.out.println("请输入一个带中文的字符串，和要截取的字节数：");
            String str=scan.next();
            int num=scan.nextInt();
            byte[] buf=str.getBytes();
            if(num<=buf.length) {
                System.out.println("输入正确，即将截取字符串...");
                int times = 0;
                for (int i = 0; i < num; i++) {
                    if (buf[i] < 0) {
                        times++;
                    }
                }
                if (times % 2 == 1) {
                    num--;
                }
                String out = new String(buf, 0, num);
                //字节转成字符串
                System.out.println("截取的字符串是：" + out);
                System.out.println();
            }else {
                try {
                    throw new MyException("截取字节数超出字符串长度．．．");
                } catch (MyException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    static class MyException extends Exception{
        public MyException(String msg) {
            super(msg);
        }

    }

}
