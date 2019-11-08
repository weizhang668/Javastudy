package p05;

import java.util.Objects;

/**
 * @Auther: 张伟
 * @Date: 2019/11/4
 * @Description: p05
 * @version: 1.0
 */
public class Worker {
    private int age;
    private String name;
    private double salary;
    public Worker (){}
    public Worker (String name, int age, double salary){
        this.name=name;
        this.age = age;
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name= name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name=" + name +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void work(){
        System.out.println(name + " work");

    }

    //6) 为Worker 类重写equals 方法，当姓名、年龄、工资全部相等时候才返回true
    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Worker worker = (Worker) o;
        boolean b;
         if (this.age == worker.age) {
             b=true;
         }else {
             return false;
         }
         if ((this.salary-worker.salary)==0){
             b=true;
         }else {
             return false;
         }
         if (this.name.equals(worker.name)){
             b=true;
         }else{
             return false;
         }

         return b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, salary);
    }
}
