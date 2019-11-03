package com.banyuan.practice.p03;

/**
 * @Auther: 张伟
 * @Date: 2019/10/31
 * @Description: com.banyuan.practice.p02
 * @version: 1.0
 */
/**
 * 2.定义一个StringBuffer类对象，
 * 1）使用append方法向对象中添加26个字母，并倒序遍历输入
 * 2）删除前五个字符
 * */
public class p03 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <26 ; i++) {
            sb.append((char) ('a'+i));

        }
        System.out.println(sb);
        StringBuffer newsb=sb.reverse();
        System.out.println(newsb);
        String str=sb.substring(5);
        System.out.println(str);
    }
}
