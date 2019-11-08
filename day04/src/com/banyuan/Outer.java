package com.banyuan;

/**
 * @Auther: 张伟
 * @Date: 2019/10/28
 * @Description: com.banyuan
 * @version: 1.0
 */
class Outer {
    int number=10;
     class Inner{
        int number=20;
        public void method(){
            int number=30;
            System.out.println(number);
            System.out.println(this.number);
            System.out.println(Outer.this.number);
        }

    }
}
