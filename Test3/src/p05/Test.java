package p05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: 张伟
 * @Date: 2019/11/4
 * @Description: p05
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Worker> list=new ArrayList<Worker>();
        //zhang3 18 3000
        //li4 25 3500
        //wang5 22 3200;
        list.add(new Worker("zhang3",18,3000));
        list.add(new Worker("li4",25,3500));
        list.add(new Worker("wang5",22,3200));
        //2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
        list.add(1,new Worker("zhao6",24,3300));
        //3) 删除wang5 的信息
        list.remove(3);
        //4) 利用for 循环遍历，打印List 中所有工人的信息

        for (Worker w:list) {
            System.out.println(w.toString());

        }
        //5) 利用迭代遍历，对List 中所有的工人调用work 方法。
        Iterator<Worker> iterator = list.iterator();
        while (iterator.hasNext()) {
            Worker w = (Worker) iterator.next();
            w.work();
        }
        //6) 为Worker 类重写equals 方法，当姓名、年龄、工资全部相等时候才返回true

        Worker w1=new Worker("zhang3",18,3000);
        Worker w2=new Worker("zhang3",18,3000);
        System.out.println(w1.equals(w2));



    }
}
