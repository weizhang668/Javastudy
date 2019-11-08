package com.banyuan.practice;

/**
 * @Auther: 张伟
 * @Date: 2019/10/23
 * @Description: com.banyuan.practice
 * @version: 1.0
 */
public class sort {
    public int[] upSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}
