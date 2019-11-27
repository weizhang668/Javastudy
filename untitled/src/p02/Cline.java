package p02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


/**
 * @Auther: 张伟
 * @Date: 2019/11/11
 * @Description: p02
 * @version: 1.0
 */
public class Cline {

    public static void main(String[] args) throws IOException {
        //提醒并接收用户输入
        Scanner sc = new Scanner(System.in);
        System.out.print("用户名：");
        String name = sc.next();
        System.out.print("密码：");
        String password = sc.next();

        InetAddress adr=InetAddress.getLocalHost();
        //System.out.println(adr.getHostAddress());
        //连接服务器利用Socket创建输出流，并将对象输出到服务器
        Socket s = new Socket("192.168.51.179", 10001);
        OutputStream os = s.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(new Person(name, password));


        //关闭输出流
        s.shutdownOutput();

        //利用Socket创建输入流，接收服务器验证信息
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        System.out.print(dis.readUTF());

        //关流
        dis.close();
        is.close();
        s.close();

    }
}

