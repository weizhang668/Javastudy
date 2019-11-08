package com.banyuan.practice.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/11/7
 * @Description: com.banyuan.practice.p02
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Tools t = new Tools();
        Mythread1 mythread1 = new Mythread1(t);
        Mythread2 mythread2 = new Mythread2(t);
        Mythread3 mythread3 = new Mythread3(t);
        Nosity na = new Nosity(t);

        mythread1.start();
        mythread2.start();
        mythread3.start();
        na.start();
    }
}
