package com.banyuan.practice.p03;

/**
 * @Auther: 张伟
 * @Date: 2019/10/29
 * @Description: com.banyuan.practice.p03
 * @version: 1.0
 */
/*题目
*2.以下一段话：这些年一个人，风也过，雨也过,有过泪,有过错，还记得坚持什么，真爱过才会懂，会寂寞会回首，终有梦终有你在心中。统计 过 出线的次数
*/
public class p03 {
    public static void main(String[] args) {
        String string="这些年一个人，风也过，雨也过,有过泪,有过错，还记得坚持什么，真爱过才会懂，会寂寞会回首，终有梦终有你在心中。";
        char[]chars=string.toCharArray();
        int score=0;
        for(int i=0;i<chars.length;i++){
            if (chars[i]=='过'){
                score++;
            }

        }
        System.out.println(score);
    }
}
//        String str1="hello";
//        //str1="helloword";
//        foo(str1);
//        //str1.equals(st)
//
////        char[] hello;
////        String str2=new String(hello);
//
//        String str2=new String("nihao");
//        foo(str2);
//        str2="hhhhhh";
//        str1.equals(str2);
//        System.out.println(str1);
//        System.out.println(str2);
//    }
//    public static void foo(String string){
//        string="nihaoa";
//    }
