package com.banyuan.practice.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/11/7
 * @Description: com.banyuan.practice.p02
 * @version: 1.0
 */
public class Mythread2 extends Thread {
    Tools tools;
    @Override
    public void run() {
        while (true){
            synchronized (new Tools()){
                if (tools.number<=75){
                    for (int i = 0; i <5 ; i++) {
                        System.out.println(Thread.currentThread().getName()+"-------"+(tools.number++));

                    }
                    try {
                        tools.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
