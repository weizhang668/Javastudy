package com.banyuan.practice.packaging08.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging.p02
 * @version: 1.0
 */
/*题目
*创建一个狗类:Dog
//为Dog添加yao(咬)方法,实现狗咬的功能
//如果是yao(),什么都不传，则是“汪汪叫”
//如果是yao(String str),则是“咬骨头，好香啊”
//如果是yao(Person p),传入的是人类，如果人的性别为男，则“扑上去撕咬”，
* 如果人的性别是女,则“不扑上去撕咬”，
*/
public class DogTest {
    public static void main(String[] args) {
        Person p=new Person();
        p.setSex("女");
        p.setSex("ren");

        Dog dog=new Dog();
        dog.yao(p);

    }
}
