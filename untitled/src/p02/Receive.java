package p02;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: 张伟
 * @Date: 2019/11/11
 * @Description: p02
 * @version: 1.0
 */
public class Receive {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("服务器接收数据！");
        //连接客户端利用Socket创建输入流并接收数据
        ServerSocket ss = new ServerSocket(2222);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        Person p = (Person) ois.readObject();

        //关闭Socket输入流
        s.shutdownInput();

        //启动Socket输出流，将登陆成功或失败信息返回给客户端
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        //对接收到的数据进行判定
        if ("lili".equals(p.getName()) && "123123".equals(p.getPassword())) {
            dos.writeUTF("登陆成功！");
        } else {
            dos.writeUTF("登陆失败！");
        }

        //关流
        s.shutdownOutput();
        ois.close();
        is.close();
        s.close();
        ss.close();


    }

}

