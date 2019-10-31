package com.banyuan.practice.p07;

/**
 * @Auther: 张伟
 * @Date: 2019/10/30
 * @Description: com.banyuan.practice.p07
 * @version: 1.0
 */
/**题目
*编程. 已知字符串：”this is a test of java”.
按要求执行以下操作：
(1) 统计该字符串中字母s出现的次数
(2) 取出子字符串”test”
(3) 将本字符串复制到一个字符数组Char[] str中.
(4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。
(5) 用两种方式实现该字符串的倒叙输出。(用StringBuffer和for循环方式分别实现)
(6) 将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的额英文单词,并输出到控制台

*/
public class p07 {
    public static void main(String[] args) {
        String s = new String("this is a test of java");
        //统计该字符串中字母s出现的次数
        char[] chars = s.toCharArray();
        int score = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 's') {
                score++;
            }

        }
        System.out.println("s=" + score);
        //取出子字符串”test”
        String son = s.substring(10, 14);
        System.out.println(son);
        //将本字符串复制到一个字符数组Char[] str中
        char[] str = new char[s.length()];
        s.getChars(0, s.length(), str, 0);
        System.out.println(str);
        si(s);
        //(4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。
        System.out.println("=========================");
        //倒序
        daixu(str);
        StringBuffer stringBuffer=new StringBuffer(s);
        StringBuffer sb=stringBuffer.reverse();
        System.out.println("StringBuffer:"+sb);
        //
        String[] split = s.split(" ");
        //按空格分隔成数组
        for(int i=0;i<split.length;i++){
            System.out.println(split[i]);
        }
    }

    private static void daixu(char[] str) {
        for(int i=0;i<str.length/2;i++){
            char temp=str[i];
            str[i]=str[str.length-1-i];
            str[str.length-1-i]=temp;

        }
        System.out.println(str);
    }


    private static void si(String s) {
        // 4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。
        String[] split = s.split(" ");
        //按空格分隔成数组
        for (int i = 0; i < split.length; i++) {
            // .substring(0,1) 截取数组的首字母   +split[i].substring(1); 再加上后面
            String s2 = split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
            System.out.print(s2 + " ");
        }

    }
}