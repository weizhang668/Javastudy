package com.banyuan.practice.p03;

/**
 * @Auther: 张伟
 * @Date: 2019/10/31
 * @Description: com.banyuan.practice.p02
 * @version: 1.0
 */
/**
 * 3.将字符串中指定部分进行反转。
 * */
public class p03 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <26 ; i++) {
            sb.append((char) ('a'+i));

        }
        String str=sb.substring(1,13);
        StringBuffer steb=new StringBuffer(str);
        //构造方法

        System.out.println(steb.reverse());
        //StringBuffer newsb=sb.reverse();
        //System.out.println(newsb);
        //String str=sb.substring(5);
        //System.out.println(str);
    }
}
