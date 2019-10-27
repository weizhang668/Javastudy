package com.banyuan.practice.packaging08.p04;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging.p04
 * @version: 1.0
 */
/*题目
*定义一个Tank类(坦克类)，为其定义x（横坐标），y（纵坐标），
* dir（方向：值为上下左右），Type（类型）4个属性，其访问修饰符均为公有；
 为Tank类定义一个构造方法实现4个字段的初始化
 为Tank类定义一个ShowData方法，控制台打印4个字段值
 创建一个Tank对象，横坐标为10，纵坐标为50，方向为右，
 * 类型为重型坦克，并通过调用对象的ShowData()方法打印Tank信息
*/
public class Tank {
    public int x;
    public int y;
    public String dire;
    public String type;

    public Tank() {
    }

    public Tank(int x, int y, String dire, String type) {
        this.x = x;
        this.y = y;
        if (dire.equals("上")||dire.equals("下")||dire.equals("左")||dire.equals("右"))
        this.dire = dire;
        this.type = type;
    }
    public void ShowData(){
        System.out.println("Tank位置：x="+x+"y="+y+" 方向："+dire+" 类型："+type);

    }

    @Override
    public String toString() {
        return "Tank{" +
                "x=" + x +
                ", y=" + y +
                ", dire='" + dire + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
