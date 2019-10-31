package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/10/29
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */

import java.util.Random;

/**
 * 三个人斗地主,随机发牌，假设其中一个人抓到了“A”(不考虑花色)
那么他就是地主，会比其他两人多三张牌，编写程序，
最终得到三个人所发的牌在控制台输出(要考虑到花色和地主预留三张)
* */
public class Pai {
    static String[] pai = new String[54];
    static String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    static String[] col = {"红桃", "黑桃", "方块", "梅花"};


    public String[] zupai() {
        int x = 0;
        for (int i = 0; i < col.length; i++) {
            for (int j = 0; j < num.length; j++) {
                pai[x++] = col[i] + num[j];
            }
        }
        pai[52] = "小王";
        pai[53] = "大王";
        return pai;
    }


    public String[] fapai(String[] pai) {
        //产生不同随机数
        Random random = new Random();
        int[] ints = new int[54];
        ints[0] = random.nextInt(54);
        for (int i = 1; i < ints.length; i++) {
            int x = random.nextInt(54);
            ints[i] = x;
            //boolean flage;
            for (int j = 1; j < i; j++) {
                while (ints[i] == ints[j]) {
                    i--;
                    break;
                }
            }
        }
        String[] newpai = new String[54];
        for (int i = 0; i < newpai.length; i++) {
            newpai[i] = pai[ints[i]];

        }
        return newpai;

    }

    public void threep(String[] newpai) {
        String[] th = new String[3];

        Random random = new Random();
        int[] ints = new int[3];
        while (true) {
            ints[0] = random.nextInt(54);
            if (ints[0] != 1) {
                break;
            }
        }

        while (true) {
            ints[1] = random.nextInt(54);
            if (ints[1] != ints[0] && ints[1] != 1) {
                break;
            }
        }
        while (true) {
            ints[2] = random.nextInt(54);
            if (ints[2] != ints[0] && ints[2] != 1 && ints[2] != ints[1]) {
                break;
            }
        }

        //地主的牌
        th[0] = newpai[ints[0]];
        th[1] = newpai[ints[1]];
        th[2] = newpai[ints[2]];
        System.out.print("地主" + th[0] + th[1] + th[2]);
        System.out.print("\n");


        newpai[ints[0]] = null;
        newpai[ints[1]] = null;
        newpai[ints[2]] = null;
        String[] nnpai = new String[51];

        for (int i = 0; i < newpai.length; i++) {
            if (newpai[i] == null) {
                for (int j = i; j < newpai.length - 1; j++) {
                    newpai[j] = newpai[j + 1];

                }
                i--;
            }

        }


        for (int i = 0; i < nnpai.length; i++) {
            nnpai[i] = newpai[i];

        }

        String[] p1 = new String[17];
        String[] p2 = new String[17];
        String[] p3 = new String[17];
        for (int i = 0; i < 17; i++) {
            p1[i] = nnpai[i];
            p2[i] = nnpai[i + 17];
            p3[i] = nnpai[i + 34];


        }


        for (int i = 0; i < 17; i++) {
            if (p1[i].equals("红桃A")) {
                System.out.print("小明是地主，三张牌是：");
                System.out.print(th[0] + th[1] + th[2]);
                break;
            } else if (p2[i].equals("红桃A")) {
                System.out.print("小黑是地主，三张牌是：");
                System.out.print(th[0] + th[1] + th[2]);
                break;
            } else if (p3[i].equals("红桃A")) {
                System.out.print("小李是地主，三张牌是：");
                System.out.print(th[0] + th[1] + th[2]);
                break;
            } else {
                continue;
            }

        }
        System.out.println();


        System.out.print("小明");
        System.out.println();
        for (int i = 0; i < 17; i++) {
            System.out.print(p1[i]);

        }
        System.out.println();
        System.out.print("小黑");
        System.out.println();
        for (int i = 0; i < 17; i++) {
            System.out.print(p2[i]);

        }
        System.out.println();
        System.out.print("小李");
        System.out.println();
        for (int i = 0; i < 17; i++) {
            System.out.print(p3[i]);
        }


    }
}
//        for(int i=1;i<ints.length;i++){
//            int x=random.nextInt(54);
//
//            ints[i]=x;
//            //boolean flage;
//            for(int j=0;j<i;j++){
//                while (ints[i]==ints[j]||ints[i]==1){
//                    i--;
//                    break;
//                }
//            }
//        }
//
//        new StringBuffer().

//        for(int i=0;i<newpai.length-1;i++) {
//            if (newpai[i] == null) {
//                newpai[i] = newpai[i + 1];
//            }
//            if (newpai[i] == null && newpai[i + 1] == null) {
//                newpai[i] = newpai[i + 1];
//            }
//            if (newpai[i] == null && newpai[i + 1] == null && newpai[i + 2] == null) {
//                newpai[i] = newpai[i + 2];
//            }
//        }


//        for(int i=0;i<17;i++){
//            if ("红桃A".equals(p1[i])){
//                System.out.print("是地主，三张牌是：");
//                System.out.print(th[0]+th[1]+th[2]);
//                break;
//            }
//        }
//        for(int i=0;i<17;i++){
//            if (p3[i].equals("红桃A")){
//                System.out.print("是地主，三张牌是：");
//                System.out.print(th[0]+th[1]+th[2]);
//                break;
//
//            }
//        }
//        for(int i=0;i<17;i++){
//            if (p2[i].equals("红桃A")) {
//                System.out.print("是地主，三张牌是：");
//                System.out.print(th[0] + th[1] + th[2]);
//                break;
//
//            }
//        }
