package entity;
/**
 * @Auther: 张伟
 * @Date: 2019/11/20
 * @Description: entity
 * @version: 1.0
 */

public class User {

    private Student student;//学生
    private Teacher teacher;//老师
    private String account;//属性用来存储学号或工号
    private String password;//属性用来存储密码

    public User() {}
    public User(String account, String password) {//登陆系统
        this.account = account;
        this.password = password;
    }

    public User(Student student, String password) {//修改学生信息
        this.student = student;
        this.password = password;
    }

    public User(Teacher teacher, String password) {//修改老师信息
        this.teacher = teacher;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
