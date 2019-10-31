package com.banyuan.practice.p08;

/**
 * @Auther: 张伟
 * @Date: 2019/10/30
 * @Description: com.banyuan.practice.p08
 * @version: 1.0
 */
/*题目
*2 .如下字符串：
01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21
分割出每个人的信息，样式如下：
01 张三 20
02 李四 18
*/
public class p08 {
    public static void main(String[] args) {
        String string=new String("01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21");
        for (String s1:string.split("\\*")){
            String s2=s1.replace('#',' ');
            //System.out.println(s1);
            System.out.println(s2);
        }



    }
}
