package com.banyuan.practice.packaging09.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging09.p02
 * @version: 1.0
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(12,6);
        r.setLength(13);
        System.out.println(r.perimeter(r.getLength(),r.getWidth()));
        System.out.println(r.area(r.getLength(),r.getWidth()));
    }
}
