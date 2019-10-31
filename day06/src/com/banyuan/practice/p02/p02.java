package com.banyuan.practice.p02;

import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/29
 * @Description: com.banyuan.practice.p02
 * @version: 1.0
 *
 * 题目：给出一个随机字符串,判断有多少个字母？有多少个数字？
 */
public class p02 {
    public static void main(String[] args) {
        System.out.println("请随机输入一段字符串");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char s[] = str.toCharArray();
        int char_num=0;
        //计算字母
        int num = 0;
        //计算数字
        int other = 0;
        //计算其他字符

        for(int i=0;i<s.length;i++)
        {
            if (s[i]<='9'&&s[i]>='0') {
                num++;
            } else if (s[i]>='a'&&s[i]<='z'||s[i]>='A'&&s[i]<='Z') {
                char_num++;
            } else {
                other++;
            }
        }

        System.out.println("字符有"+char_num+"个;数字有"+num+"个;其他字符有"+other+"个");
    }
}
