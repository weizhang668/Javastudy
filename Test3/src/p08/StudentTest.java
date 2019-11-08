package p08;

import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/11/4
 * @Description: p08
 * @version: 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        int x = 0;
        do {
            System.out.println("case10:添加学生");
            System.out.println("case11:查找学生");
            System.out.println("case12:根据编号更新学生");
            System.out.println("case13:根据编号删除学生");
            System.out.println("case14:根据编号录入成绩");
            System.out.println("case15:根据某门成绩排序");
            System.out.println("case16:根据总成绩排序");
            System.out.println("case99:退出系统");
            Scanner scanner=new Scanner(System.in);
            int y=scanner.nextInt();
            if (y==10||y==11||y==12||y==13||y==14||y==15||y==16||y==99){

            }
        }while (x!=99);


    }
}
