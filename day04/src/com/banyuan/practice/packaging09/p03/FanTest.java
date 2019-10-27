package com.banyuan.practice.packaging09.p03;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging09.p03
 * @version: 1.0
 */
public class FanTest {
    public static void main(String[] args) {
        Fan fan=new Fan(22);
        fan.setOn("on");
        fan.setSpeed(3);
        fan.setRadius(20);

        System.out.println(fan.toString());

    }
}
