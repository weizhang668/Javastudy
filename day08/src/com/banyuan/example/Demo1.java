package com.banyuan.example;

import java.util.regex.Pattern;

/**
 * @Auther: 张伟
 * @Date: 2019/10/31
 * @Description: com.banyuan.example
 * @version: 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        String content = "I am noob " + "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
        char ch='\\';
        System.out.println(ch);
    }
}
