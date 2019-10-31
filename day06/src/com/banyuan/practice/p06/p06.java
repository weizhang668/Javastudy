package com.banyuan.practice.p06;

/**
 * @Auther: 张伟
 * @Date: 2019/10/30
 * @Description: com.banyuan.practice.p06
 * @version: 1.0
 */
/*题目
*String  st1="aa,bb,cc";  //根据逗号来截取
String  st3="aa   bb    cc";//  根据空格来截取
String st4="D:\\EclipseWorkSpace\\Day12\\src\\zhengze\\ZhengZeDemo5.java";  //根据 \\ 截取
得到截取之后的数据。

*/
public class p06 {
    public static void main(String[] args) {
        String  st1="aa,bb,cc";
        //根据逗号来截取
        //st1.split(",");
        for (String s:st1.split(",")){
            System.out.println(s);
        }
        String  st3="aa   bb    cc";
        //  根据空格来截取
        /*
        * Java 增强 for 循环
            Java5 引入了一种主要用于数组的增强型 for 循环。
            Java 增强 for 循环语法格式如下:
            for(声明语句 : 表达式)
            {
               //代码句子
            }
            声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定在循环语句块，其值与此时数组元素的值相等。
            表达式：表达式是要访问的数组名，或者是返回值为数组的方法。
        * */
        for (String s3:st3.split("\\s+")) {
            System.out.println(s3);
        }
        String st4="D:\\EclipseWorkSpace\\Day12\\src\\zhengze\\ZhengZeDemo5.java";
        //根据 \\ 截取得到截取之后的数据。
        for (String s4:st4.split("\\\\")){
            System.out.println(s4);
        }
    }

}
