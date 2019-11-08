package com.banyuan.practice.p01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 张伟
 * @Date: 2019/11/4
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class FileList {
    static List<File> list = new ArrayList<>();

    public static List getFileList(File file) {

        File[] fileList = file.listFiles();

        if (fileList != null) {
            for (int i = 0; i < fileList.length; i++) {

                if (!fileList[i].isDirectory()) {
                    list.add(fileList[i]);
                } else {
                    getFileList(fileList[i]);
                }

            }
        }

        return list;

    }
}