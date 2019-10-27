package com.banyuan.practice.packaging09.p04;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging09.p04
 * @version: 1.0
 */
public class Bank {
    private String ID=null;
    private String name;
    private String time;
    private String idCard;
    private int money;

    public Bank() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        if (idCard.length()==18){
            this.idCard = idCard;
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void getTimeInfo(){
        System.out.println("开户时间为："+getTime());
    }

    public void cunMoney(int x){
        money=money+x;
    }

    public void quMoney(int y){
        if (y>0&&y<=money){
            money=money-y;
        }else {
            System.out.println("账户余额不足，无法取出");
        }

    }
    public void getMoneyInfo(){
        System.out.println("账户余额为"+money+"万元");
    }

    @Override
    public String toString() {
        return "Bank{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", idCard='" + idCard + '\'' +
                ", money=" + money +
                '}';
    }
}
