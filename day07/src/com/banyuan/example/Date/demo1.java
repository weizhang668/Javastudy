package com.banyuan.example.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: 张伟
 * @Date: 2019/10/30
 * @Description: com.banyuan.example.Date
 * @version: 1.0
 */
public class demo1 {
    public static void main(String[] args) {
        //System.out.println(new Date().setTime(););
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
        String s=sdf.format(date.getTime());
        long l=date.getTime();
        System.out.println(s);
    }

}
