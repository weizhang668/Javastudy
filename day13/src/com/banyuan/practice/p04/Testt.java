package com.banyuan.practice.p04;

/**
 * @Auther: 张伟
 * @Date: 2019/11/7
 * @Description: com.banyuan.practice.p04
 * @version: 1.0
 */
public class Testt {

    static Testt t = new Testt();

    class T1 extends Thread {
        public T1(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //T3线程中要处理的东西
            System.out.println("T1线程执行");
            for (int i = 0; i < 10; i++) {
                System.out.println(this.getName() + ":" + i);
            }
        }
    }

    class T2 extends Thread {
        public T2(String name) {
            super(name);
        }

        @Override
        public void run() {
            //T3线程中要处理的东西
            System.out.println("T2线程执行");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(this.getName() + ":" + i);
            }
        }
    }

    class T3 extends Thread {
        public T3(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //T3线程中要处理的东西
            System.out.println("T3线程执行");
            for (int i = 0; i < 10; i++) {
                System.out.println(this.getName() + ":" + i);
            }
        }
    }

    public static void main(String[] args) {
        try {
            T1 t1 = t.new T1("T1");
            t1.start();//启动t1线程
            t1.join();//阻塞主线程，执行完t1再返回
            T2 t2 = t.new T2("T2");
            t2.start();//启动t2线程
            t2.join();//阻塞主线程，执行完t2再返回
            T3 t3 = t.new T3("T3");
            t3.start();//启动t3线程
            t3.join();//阻塞主线程，执行完t3再返回
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
