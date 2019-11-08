package com.banyuan.practice.IO;

import java.io.*;

/**
 * @Auther: 张伟
 * @Date: 2019/11/4
 * @Description: com.banyuan.practice.IO
 * @version: 1.0
 */
public class IO1 {
    public static void main(String[] args) throws IOException {
        File file=new File("1.txt");
        System.out.println(file.getAbsolutePath());

        //FileInputStream fut=new FileInputStream(file);
        FileOutputStream fot=new FileOutputStream(file);
        byte[] bytes=new byte[(int) file.length()];
        String str="你好啊";
        fot.write(str.getBytes());
        fot.close();
        //fut.read(bytes);
        //fut.close();
        //bytes[0]='l';
//        for (byte b:bytes) {
//            System.out.println(b);
//            System.out.println(b);
//            System.out.println(b);
//            System.out.println(b);
//            System.out.println(b);
//            System.out.println(b);
//            System.out.println(b);
//        }


    }
}
