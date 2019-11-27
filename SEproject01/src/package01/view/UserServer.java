package package01.examination;

/**
 * @Auther: 张伟
 * @Date: 2019/11/19
 * @Description: package01.view
 * @version: 1.0
 */

public class UserServer {

    //设计一个方法  负责登录
    public String login(String name,String password){
        if(name.equals("ZGH") && password.equals("666")){
            return "登录成功";
        }
        return "用户名和密码错误";
    }
}


