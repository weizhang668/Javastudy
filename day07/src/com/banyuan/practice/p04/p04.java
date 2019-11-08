package com.banyuan.practice.p04;

/**
 * @Auther: 张伟
 * @Date: 2019/11/3
 * @Description: com.banyuan.practice.p04
 * @version: 1.0
 */
/**
 *  编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
 * “To be or not to be"，将变成"oT eb ro ton ot eb."。
 *
 * */
public class p04 {
    public static void main(String[] args) {
        String str=new String("To be or not to be");
        String[] strings=str.split(" ");
        //split 以什么分离
        StringBuffer strbn=new StringBuffer();

        for (String s:strings) {
            StringBuffer strb=new StringBuffer(s);
            strbn.append((strb.reverse()+" "));
            //System.out.print(strbn);
            //System.out.println(strbn.append((strb.reverse()+" ")));

        }
        System.out.println(strbn);
    }
}
