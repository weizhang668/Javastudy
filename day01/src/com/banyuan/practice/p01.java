package com.banyuan.practice;

/**
 * @Auther: 张伟
 * @Date: 2019/10/22
 * @Description: com.banyuan.practice
 * @version: 1.0
 */

/*题目
*1.现在有如下的一个数组：
	int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ;
	要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：
		int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5} ;
	思路：生活中的问题解决 = 程序中的解决；
	1、	确定出不为0的个数，这样可以开辟新数组；
	2、	从旧的数组之中，取出内容，并将其赋给新开辟的数组；
	4.把整型  字符型  和  字符串型的数组 里面的元素 给我倒序
	5. 数组获取最值(获取数组中的最大值最小值)
* */
public class p01 {
    public static void main(String[] args) {
        int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int y=0;

        for (int i=0;i<oldArr.length;i++){
            int temp=oldArr[i];
            if (temp!=0) {
                y++;
            }
        }
        int newArr[]=new int[y];
        int x=0;
        for (int i=0;i<oldArr.length;i++){
            int temp=oldArr[i];
            if (temp!=0){
                newArr[x]=temp;
                x++;
            }
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]);
        }
        System.out.println("新数组长度为"+x);
        for(int i=0;i<newArr.length/2;i++){
            int temp=newArr[i];
            newArr[i]=newArr[newArr.length-1-i];
            newArr[newArr.length-1-i]=temp;
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]);
        }
        System.out.println();
        int min=newArr[0];
        int max=newArr[0];
        for(int i=0;i<newArr.length;i++){
            if (min>newArr[i])
                min=newArr[i];
            if (max<newArr[i])
                max=newArr[i];
        }
        System.out.println("数组最小值"+min);
        System.out.println("数组最大值"+max);

    }
}
