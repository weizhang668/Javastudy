package com.banyuan.practice.packaging09.p03;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging09.p03
 * @version: 1.0
 */
/*题目
*创建一个名为Fan的类来模拟风扇，该类包含属性speed、on、radius，
* 有合适的构造方法,此外还要求提供一个方法用来设置风扇的速度和开关状态等信息。
* 另外编写一个类来测试Fan的使用。 

*/
public class Fan {
    private int speed=0;
    private String on=null;
    private int radius=15;

    public Fan() {
    }

    public Fan(int radius) {
        if (radius>15&&radius<25)
            this.radius = radius;
        else{
            System.out.println("输入尺寸不合法");

        }

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed>0&&speed<=5){
            this.speed = speed;
        }else {
            System.out.println("输入速度不合法");
        }
    }

    public String getOn() {
        return on;
    }

    public void setOn(String on) {
        if (on.equals("on")||on.equals("off")){
            this.on = on;
        }else {
            System.out.println("电风扇只有on和off两种状态");
        }

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius>15&&radius<25)
        this.radius = radius;
        else {
            System.out.println("输入尺寸不合法");

        }
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on='" + on + '\'' +
                ", radius=" + radius +
                '}';
    }
}
