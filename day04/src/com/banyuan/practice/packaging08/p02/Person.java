package com.banyuan.practice.packaging08.p02;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging.p02
 * @version: 1.0
 */
public class Person {
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex=="男"||sex=="女"){
            this.sex = sex;
        }else {
            System.out.println("输入内容不合法，赋初值为男");
            this.sex="男";
        }

    }
}
