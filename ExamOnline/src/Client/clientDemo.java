package Client;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: 张伟
 * @Date: 2019/11/19
 * @Description: package01.controller.Client
 * @version: 1.0
 */
public class clientDemo {
//    public static void main(String[] args) throws IOException {
//
//        clientSocket();
//
//    }

    public static void clientSocket() throws IOException {
        Socket socket = new Socket("192.168.11.162", 9999);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        PrintStream ps = new PrintStream(os);

        String str = br.readLine();
        System.out.println(str);
        ps.println();
       // ps.flush();
        socket.close();

    }
}
