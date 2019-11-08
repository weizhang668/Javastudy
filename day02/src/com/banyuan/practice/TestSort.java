package com.banyuan.practice;
import com.banyuan.practice.sort;
/**
 * @Auther: 张伟
 * @Date: 2019/10/23
 * @Description: com.banyuan.practice
 * @version: 1.0
 */
public class TestSort {
    public static void main(String[] args) {
        int[]array={12,23,11,54,34,5,1};
        sort a=new sort();
        int[] newArray=new int[array.length];
        newArray=a.upSort(array);

        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]);
        }
    }
}
