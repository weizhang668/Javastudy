package p02;

/**
 * @Auther: 张伟
 * @Date: 2019/11/11
 * @Description: p02
 * @version: 1.0
 */
public class Person {
    private static final long serialVersionUID = 1L;


    private String name;
    private String password;

    public Person(String name, String password) {
        super();
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

