package com.banyuan;

/**
 * @Auther: 张伟
 * @Date: 2019/10/28
 * @Description: com.banyuan
 * @version: 1.0
 */
public class Example2 {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.method();

    }
}
