package com.banyuan.practice.p01;

import java.io.*;
import java.util.List;

/**
 * @Auther: 张伟
 * @Date: 2019/11/4
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class p01 {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/edz/Desktop/zw");
        List<File> list=FileLIst.getFileList(file);
        //String[]str=new String[list.size()];
        for (File  f:list) {
            //System.out.println(f);
           String s=f.getPath();
           if (s.endsWith(".jpg")){
               System.out.println(s.toString());
               FileOutputStream outputStream = new FileOutputStream("/Users/edz/Desktop/picture" );
               FileInputStream inputStream = new FileInputStream(f);
               byte[] bytes = new byte[1024];
               int num = 0;
               while ((num = inputStream.read(bytes)) != -1) {
                   outputStream.write(bytes, 0, num);
                   outputStream.flush();
               }
               inputStream.close();
               outputStream.close();
           }


        }


    }
}


