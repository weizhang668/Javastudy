package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/11/7
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class Trade {
    private String name;
    private String money;

    public Trade() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    //
//    public void make(){
//        System.out.println("工厂");
//    }

    public Trade(String name, String money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "name='" + name + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
