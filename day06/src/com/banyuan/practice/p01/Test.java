package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/10/29
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Pai pai=new Pai();
            String[]strings=pai.fapai(pai.zupai());
            pai.threep(strings);
            System.out.print("\n");
            System.out.println("========================");

        }
    }

    private static void bianLi(String[] ints) {
        for(int i=0;i<ints.length;i++){
            System.out.println(ints[i]);

        }
    }

    private static void maopaopaixu(int[] ints) {
        for(int i=0;i<ints.length;i++){
            for(int j=0;j<ints.length-1-i;j++){
                if (ints[j]>ints[j+1]){
                int tep=ints[j];
                ints[j]=ints[j+1];
                ints[j+1]=tep;
                }
            }
        }
    }
}
