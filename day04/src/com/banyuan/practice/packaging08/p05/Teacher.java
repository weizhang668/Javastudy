package com.banyuan.practice.packaging08.p05;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging.p05
 * @version: 1.0
 */
/*题目
*1) 创建一个老师类:Teacher
 2) 为老师添加字段:id,name,sex,age,height
3) 分别为字段添加对应的属性:
 id:int，不用校验
 name:string，长度大于一位少于四位
 sex:string，只能是男和女
 age:int，只能在20-55之间
height:double，只能在1.50-1.80之间
 定义一个ShowData方法，打印编号、姓名、性别、身高
4） 创建一个老师对象，调用其ShowData();
*/
public class Teacher {
    private int id;
    private String name=null;
    private String sex=null;
    private int age=0;
    private double height=0.0;

    public Teacher() {
    }

    public Teacher(int id, String name, String sex, int age, double height) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
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
        if (name.length()>1&&name.length()<4){
            this.name = name;
        }else {
            System.out.println("输入不合法");
        }

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("男")||sex.equals("女"))
        this.sex = sex;
        else{
            System.out.println("输入不合法");

        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=20&&age<=55){
            this.age = age;
        } else{
            System.out.println("输入不合法");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height>=1.50&&height<=1.80)
        this.height = height;
        else{
            System.out.println("输入不合法");
        }
    }

    public void ShowDate(){
        System.out.println("Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}');

    }
}
