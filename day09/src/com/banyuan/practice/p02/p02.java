package com.banyuan.practice.p02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: 张伟
 * @Date: 2019/11/1
 * @Description: com.banyuan.practice.p02
 * @version: 1.0
 */
public class p02 {
    public static void main(String[] args) {
        Map<String,String> map1=new HashMap();
        map1.put("关羽","关夫人");
        map1.put("张飞","张夫人");
        map1.put("黄忠","黄夫人");
        map1.put("赵云","赵夫人");
        map1.put("马超","马夫人");

        Map<String,String> map2=new HashMap();
        map2.put("典韦","典夫人");
        map2.put("张辽","张夫人");
        map2.put("郭嘉","郭夫人");
        map2.put("荀彧","荀夫人");
        map2.put("于禁","于夫人");

        Map<String,String> map3=new HashMap();
        map3.put("鲁肃","鲁夫人");
        map3.put("陆逊","陆夫人");
        map3.put("黄盖","黄夫人");
        map3.put("吕蒙","吕夫人");
        map3.put("周瑜","周夫人");

        Map<String,Map<String,String>> map0=new HashMap();
        map0.put("刘备",map1);
        map0.put("曹操",map2);
        map0.put("孙权",map3);


        Set s=map0.keySet();


        for (Object object:s) {
            System.out.println("主公："+object);

            Map n=map0.get(object);
            Set ns=n.keySet();

            for (Object ob :ns) {
                System.out.println("臣子："+ob+"----妻子："+n.get(ob));


            }

        }


        //System.out.println(map0);


//        for (Map newmap:map0) {
//
//        }
    }
}
