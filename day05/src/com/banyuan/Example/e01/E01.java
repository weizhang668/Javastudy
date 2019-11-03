package com.banyuan.Example.e01;

/**
 * @Auther: 张伟
 * @Date: 2019/10/28
 * @Description: com.banyuan.Example.e01
 * @version: 1.0
 */
public class E01 {

    public static void main(String[] args) {

    }
}
class Outer{
    public void test(){
        Inner1 inner=new Inner1();
        inner.show();
        Inner2.show1();
        int a=new Inner2().anInt2;
        int b=Inner2.anInt3;

    }


    class Inner1{
        int anInt1=1;
        public void show(){
            test();
            System.out.println("");
        }
    }
    static class Inner2{
        int anInt2=11;
        static int anInt3=11;
        //test();
        public static void show1(){
            System.out.println(11111);
        }
        public void show2(){

            System.out.println(22222);
        }
    }
}
