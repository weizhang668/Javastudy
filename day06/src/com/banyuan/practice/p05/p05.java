package com.banyuan.practice.p05;

import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/30
 * @Description: com.banyuan.practice.p05
 * @version: 1.0
 */
/*题目
*编写一个程序，设定一个有大小写和以及非大小写的字符串
* 分别统计大小写的字符的个数和非大小写字符的个数，
* 并且分别把大小写字符和非大小写字符输出字符串
*/
public class p05 {
    public static void main(String[] args) {
        System.out.println("请随机输入一段字符串");
        //ADFADGADGFGHJdsfghjhgfafgdhfjggfhgdj12345674567#¥%¥#%……%WFGHASHDSafaer奥迪
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char s[] = str.toCharArray();
        int big=0;
        int small = 0;
        int other = 0;
        //计算其他字符

        for(int i=0;i<s.length;i++) {
             if (s[i]>='a'&&s[i]<='z') {
                small++;
            } else if(s[i]>='A'&&s[i]<='Z') {
                big++;
            }else {
                 other++;
             }
        }
        System.out.println("大写字母有"+big+"个;小写字母有"+small+"个;其他字符有"+other+"个");


    }
}
