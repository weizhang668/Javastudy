package com.banyuan.practice.p04;

/**
 * @Auther: 张伟
 * @Date: 2019/11/3
 * @Description: com.banyuan.practice.p04
 * @version: 1.0
 */
/**
 * 3. 春节回家，小明、小王、小李。三个步骤：①买票②使用交通工具③回家过年①与③两个步骤相同，已经实现了，
 * ②工具不同，分别是小明坐大巴，小王坐火车，小李坐飞机，请设计出他们的关系。并打印出每个人回家的三步骤
 * */
public abstract class Person {
    public void buy(){
        System.out.println("买票回家");
    }
    public void home(){
        System.out.println("回家过年");
    }
    public abstract void traffic();

    public void method(){
        buy();
        traffic();
        home();
    }

}
