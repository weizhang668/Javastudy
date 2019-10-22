package com.banyuan.practice;
import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/22
 * @Description: com.banyuan.practice
 * @version: 1.0
 */
/*题目
* 3.有1个人有名字和账户密码（随便自己设置）
	现在要登录一个系统, 需要去判断这个名字和密码是否一致
	如果名字不一致 那么给出提示：名字不一样请重新输入，
	如果名字一样那么就继续进行下一步  密码的判断,如果密码不一样
	给出提示：您输入的密码不一致,请重新输入。
	如果三次密码都不一样的话那么整个程序就退出不再执行
* */
public class p03 {
    public static void main(String[] args) {
        String oldName="zhangwei";
        String oldPassword="12345678";
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<3;i++) {
            System.out.print("请输入用户名：");
            String newName = sc.next();
            if ((newName).equals(oldName)) {
                System.out.println("用户名正确！");
                System.out.print("请输入密码：");
                String newPassword = sc.next();
                if (newPassword.equals(oldPassword)) {
                    System.out.println("输入正确，允许进入！");
                    break;
                } else {
                    System.out.println("密码错误！");
                }
            } else {
                System.out.println("用户名错误！");
            }
        }
        if (i==3){
            System.out.println("账户锁定！");
        }
    }
}
