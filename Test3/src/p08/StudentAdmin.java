package p08;

import java.util.Scanner;
import java.util.Set;

/**
 * @Auther: 张伟
 * @Date: 2019/11/4
 * @Description: p08
 * @version: 1.0
 */
public class StudentAdmin {
    static void create(){//添加
        Scanner sc=new Scanner(System.in);
        System.out.println("请依次输入学生学号，姓名，年龄，" +
                "python成绩，java成绩，linux成绩，sql成绩");
        Student student=new Student(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());

    }
    static void search(Set<Student> set){
        System.out.println("请输入学生编号查找学生");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        for(int i=0;i<set.size();i++){
            if (id==set.hashCode()){
                System.out.println("找到该学生");
                System.out.println(set.toString());
                break;
            }else{
                System.out.println("查无此人");
            }

        }


    }
    static Student[] update(Student[]students){
        System.out.println("请输入要修改的学生编号");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        for(int i=0;i<students.length;i++){
            if (id==students[i].getNumber()){
                System.out.println("编号输入正确");
                System.out.println("请依次输入学生学号，姓名，年龄，" +
                        "python成绩，java成绩，linux成绩，sql成绩");
                Student student=new Student(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
                //System.out.println(students[i].toString());
            }else{
                System.out.println("查无此人");
            }

        }
        return students;
    }



}
