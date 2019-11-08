package com.banyuan.practice.p01;

import java.io.File;

/**
 * @Auther: 张伟
 * @Date: 2019/11/4
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class ex {
    public static void main(String[] args) {
        File fold = new File("/Users/edz/Desktop/zw/picturezw.jpg");
        String strNewPath = "/Users/edz/Desktop/picture/1";
        File fnewpath = new File(strNewPath);
        if(!fnewpath.exists()) {
            fnewpath.mkdirs();
        }
        File fnew = new File(strNewPath+fold.getName());
        fold.renameTo(fnew);
    }
}
