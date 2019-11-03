package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/10/28
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class Outer {
    public static Inter method(){
        return new Inter(){
            @Override
            public void show(){
                System.out.println("HelloWorld");
            }
        };
    }

}
