package package01.controller.Demo;

import package01.controller.Client.clientDemo;
import package01.controller.Server.serverDemo;

import java.io.IOException;

/**
 * @Auther: 张伟
 * @Date: 2019/11/19
 * @Description: package01.controller.Demo
 * @version: 1.0
 */
public class ServerClientDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        serverDemo.serverSocket();
        Thread.sleep(1000);
        clientDemo.clientSocket();
        clientDemo.clientSocket();
        clientDemo.clientSocket();
    }
}
