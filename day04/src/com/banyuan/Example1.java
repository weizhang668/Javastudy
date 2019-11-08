package com.banyuan;

/**
 * @Auther: 张伟
 * @Date: 2019/10/28
 * @Description: com.banyuan
 * @version: 1.0
 */
public class Example1 {
    public static void update(int[]ints){
        ints[1]=23;
    }
    public static void main(String[] args) {
        int i =100;
        short s=23; s+=12;
        int [] ints=new int[]{1,2};
        Example1.update(ints);
        System.out.println(ints[0]+""+ints[1]);

       // byte a=0,b=3; byte c =a+b;
        System.out.println("qqqqqqqqq");
        while(true)
        {
            if (i++>100)
                //i先计算在自加
            {
                break;
            }
            System.out.println(i);
        }
    }
}
