package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/11/7
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class Threadsell implements Runnable{
    Trade trade;
    boolean flag=true;

    public Threadsell(Trade trade) {
        this.trade = trade;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Thread.class) {
                if (flag) {
                    trade.setName("压缩");
                    trade.setMoney("6300");

                    System.out.println(Thread.currentThread().getName() + "-------sell--------"+trade.toString());
                } else {
                    trade.setName("小炮");
                    trade.setMoney("450");
                    //= new Trade("小炮", "450");
                    System.out.println(Thread.currentThread().getName() +"-------sell---------"+ trade.toString());

                }
                flag =!flag;

            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
