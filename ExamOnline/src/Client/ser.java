package Client;

import Server.serverDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: 张伟
 * @Date: 2019/11/26
 * @Description: Client
 * @version: 1.0
 */
public class ser {
    public static void main(String[] args) throws IOException {
        serverSocket();
    }

    public static void serverSocket() throws IOException {
        ServerSocket server = new ServerSocket(9999);
        while (true) {
            final Socket socket = server.accept();
            new Thread() {
                @Override
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader
                                (new InputStreamReader(socket.getInputStream()));
                        PrintStream ps = new PrintStream(socket.getOutputStream());
                        String flag = br.readLine();//增加a，删除2，改3，查4
                        while (!"E".equals(flag)) {
                            //ps.println("连接客户端");

                            System.out.println(flag);
                            if ("A".equals(flag)) {
                                String id = br.readLine();
                                String name = br.readLine();
                                String sex = br.readLine();
                                String age = br.readLine();
                                serverDemo.adddb(id, name, sex, age);
                            } else if ("B".equals(flag)) {
                                String id = br.readLine();
                                serverDemo.deletedb(id);

                            } else if ("C".equals(flag)) {
                                String id = br.readLine();
                                String name = br.readLine();
                                String sex = br.readLine();
                                String age = br.readLine();
                                serverDemo.updatedb(id, name, sex, age);
                            } else if ("D".equals(flag)) {
                                String id = br.readLine();
                                String str = serverDemo.selectdb(id);
                                ps.println(str);
                            }else if ("F".equals(flag)){
                                String id = br.readLine();
                                String password = br.readLine();
                                serverDemo.updatapassword(id,password);
                            }else if ("G".equals(flag)){
                                String id = br.readLine();
                                String score = br.readLine();
                                serverDemo.updatascore(id,score);
                            }else {
                                System.out.println("出错");
                            }
                            flag = br.readLine();
                        }


                        ps.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }.start();
        }
    }
}


