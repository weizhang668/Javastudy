package com.banyuan;

/**
 * @Auther: 张伟
 * @Date: 2019/10/26
 * @Description: com.banyuan
 * @version: 1.0
 */
public class Example {
    public static void main(String[] args) {
        System.out.println('a'+1+"as");
        System.out.println(4+"2");
        int x=1,y=1;
        if(x++==2& ++y==2)
        {
            x=7;
        }
        System.out.println("x="+x+" , y="+y);
        Boolean b=true;
        if(b=false)
        {
            System.out.println("a");
        } else if(b)
    {
            System.out.println("b");
        } else if(!b)
        {
            System.out.println("c");
        } else
        {
            System.out.println("d");
        }

    }
}
