package p01;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: 张伟
 * @Date: 2019/11/11
 * @Description: p01
 * @version: 1.0
 */
public class Receive {
    public static void main(String[] args) {

        try{

//监听端口

            ServerSocket ss = new ServerSocket(10001);

            System.out.println("服务器已启动：");

//逻辑处理

            while(true){

//获得连接

                Socket s = ss.accept();

//启动线程处理

                new MyThread(s);

            }


        }catch(Exception e){

            e.printStackTrace();

        }

    }

}

