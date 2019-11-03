package com.banyuan.practice.p03;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 张伟
 * @Date: 2019/11/1
 * @Description: com.banyuan.practice.p03
 * @version: 1.0
 */
public class Example {
    public static void main(String[] args) {
        String string = new String("If you want to change your fate I think you must come to the ujiuye to learn java");
        String[] strings = string.split(" ");

        Map<String, Integer> map = new HashMap<String, Integer>();
        //int x=1;
        //String[] strings=string.split(" ");
        for (int i = 0; i < strings.length; i++) {
           // x=1;
            Integer iint=map.put(strings[i],1);
            //System.out.println(iint);
            if (iint!=null){
                iint++;
                //System.out.println("=========="+iint);
                map.put(strings[i],iint);

            }

        //for (String s:strings) {
          // System.out.println(s);
        //}
        }
        System.out.println(map);
    }
}
