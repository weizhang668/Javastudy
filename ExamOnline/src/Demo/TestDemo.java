package Demo;

import Client.ser;
import Server.serverDemo;
import view.LoginFrame;

import java.io.IOException;

/**
 * @Auther: 张伟
 * @Date: 2019/11/19
 * @Description: package01.controller.Demo
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        serverDemo.getInfo();

        new LoginFrame();


    }
}
