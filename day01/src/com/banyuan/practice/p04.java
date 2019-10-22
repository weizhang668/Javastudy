package com.banyuan.practice;
import java.util.Scanner;
/**
 * @Auther: 张伟
 * @Date: 2019/10/22
 * @Description: com.banyuan.practice
 * @version: 1.0
 */
/*题目
*输出菱形
* */
public class p04 {
    public static void main(String[] args) {
        System.out.println("请输入菱形大小：");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=1;
        for(int i=1;i<=x;i++){
            for(int z=1;z<=x-a;z++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i-1)*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
            a++;
        }
        a=1;
        for(int i=x;i>=1;i--){
            for(int z=1;z<=a;z++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i-2)*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
            a++;
        }
    }
}
