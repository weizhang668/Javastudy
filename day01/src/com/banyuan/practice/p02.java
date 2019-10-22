package com.banyuan.practice;

/**
 * @Auther: 张伟
 * @Date: 2019/10/22
 * @Description: com.banyuan.practice
 * @version: 1.0
 */
/*题目
*2.在控制台上输出以下的图形
1
23
456
7890
* */
public class p02 {
    public static void main(String[] args) {
        int x=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(x++%10);
            }
            System.out.println();

        }
    }


}
