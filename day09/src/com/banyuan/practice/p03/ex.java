package com.banyuan.practice.p03;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 张伟
 * @Date: 2019/11/1
 * @Description: com.banyuan.practice.p03
 * @version: 1.0
 */
public class ex {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap();
        map.put("aaaaa",7);
        System.out.println(map.put("aaaaa",7));
        System.out.println(map.get("aaaaa"));
    }
}
