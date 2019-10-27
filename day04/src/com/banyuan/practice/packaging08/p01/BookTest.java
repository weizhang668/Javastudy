package com.banyuan.practice.packaging08.p01;

import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan
 * @version: 1.0
 */
/*题目
*请通过代码封装，实现如下需求：
编写一个类Book，代表教材:
具有属性：名称（title）、页数（pageNum），其中页数不能少于200页，否则输出错误信息，并赋予默认值200
为各属性设置赋值和取值方法
具有方法:detail，用来在控制台输出每本教材的名称和页数
编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确
*/
public class BookTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("请输入总书籍数量：");
        int n=sc.nextInt();
        Book[] book=new Book[n];//定义书籍数组

        for(int i=0;i<book.length;i++){//输入书籍信息
            System.out.print("请输入书籍名称:");
            String name=sc.next();
            book[i]=new Book();
            book[i].setTitle(name);
            System.out.print("请输入"+name+"书籍的页数：");
            int num=sc.nextInt();
            book[i].setPageNum(num);
//            book[i]=new Book(name,num);
        }

        Book.detail(book);

    }
}
