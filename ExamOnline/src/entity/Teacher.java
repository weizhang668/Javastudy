package entity;
/**
 * @Auther: 张伟
 * @Date: 2019/11/20
 * @Description: entity
 * @version: 1.0
 */
public class Teacher {
    private String number;
    private String password;
    private String name;

    public Teacher() {
    }

    public Teacher(String number, String password, String name) {
        this.number = number;
        this.password = password;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "number='" + number + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
