package com.banyuan.practice.packaging09.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging09.p02
 * @version: 1.0
 */
public class Rectangle {
    private int length=1;
    private int width=1;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int perimeter(int length,int width){
        int per=2*(length+width);
        return per;
    }
     public int area(int length,int width){
        int ar=length*width;
        return ar;
     }
}
