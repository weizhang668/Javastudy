package com.banyuan.practice.packaging08.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging.p02
 * @version: 1.0
 */
public class Dog {
    public void yao(){
        System.out.println("汪汪叫");
    }
    public void yao(String str){
        System.out.println("咬骨头，好想啊");
    }
    public void yao(Person p){
        if (p.getSex().equals("男")){
            System.out.println("狗扑上去撕咬");
        }else {
            System.out.println("狗跳上去舔");
        }
    }
}
