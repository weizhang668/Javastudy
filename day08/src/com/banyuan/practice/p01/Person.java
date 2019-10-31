package com.banyuan.practice.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/10/31
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
/**题目
*Person 类 属性   身份编号    年龄     姓名  住址   性别
    现在有男女不同的N个人   分别住在 地址格式为：苏州xxx区  上海XXX区  南京xxx区  镇江xxx区  常州xxx区
     每个地方的人数不限
     1.将不同地区的n个人存储到集合中区
     2.根据手动输入的城市名称显示所有的该市的人员信息
     3.删除集合中指定市指定区的所有成员
     4.现在xxx市发布了一条新规定 只要住在该市的 该城市下的所有人员的身份编号后都必须加该市的
        拼音
        如: 身份编号:9527 -----> 9527shanghai
*/
public class Person {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String adress;

    public Person() {
    }

    public Person(int id, String name, int age, String sex, String adress) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
