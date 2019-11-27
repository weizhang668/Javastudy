package view;

import Server.serverDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

/**
 * @Auther: 张伟
 * @Date: 2019/11/27
 * @Description: view
 * @version: 1.0
 */
public class UpdataFrame extends BaseFrame {
    public UpdataFrame() {
        init();
    }

    public UpdataFrame(String title) {
        super(title);
        init();
    }

    private JPanel mainPanel = new JPanel();

    private JLabel nameLable = new JLabel("账 号：");
    private JLabel passwordLable = new JLabel("密 码：");
    private JTextField text = new JTextField(LoginFrame.getname);
    private JPasswordField password = new JPasswordField();
    private JButton sure = new JButton("确 认");
    private JButton exit = new JButton("退 出");


    @Override
    protected void setup() {
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(null);
        nameLable.setBounds(94, 124, 90, 30);
        nameLable.setFont(new Font("黑体", Font.BOLD, 24));
        passwordLable.setBounds(94, 174, 90, 30);
        passwordLable.setFont(new Font("黑体", Font.BOLD, 24));
        passwordLable.setBounds(94, 174, 90, 30);
        passwordLable.setFont(new Font("黑体", Font.BOLD, 24));
        text.setBounds(204, 124, 260, 30);
        text.setFont(new Font("黑体", Font.BOLD, 24));
        text.setEnabled(false);
        password.setBounds(204, 174, 260, 30);
        password.setFont(new Font("黑体", Font.BOLD, 24));
        sure.setBounds(127, 252, 100, 30);
        sure.setFont(new Font("黑体", Font.BOLD, 22));
        exit.setBounds(324, 252, 100, 30);
        exit.setFont(new Font("黑体", Font.BOLD, 22));

    }

    @Override
    protected void addElement() {

        add(mainPanel);
        mainPanel.add(nameLable);
        mainPanel.add(passwordLable);
        mainPanel.add(text);
        mainPanel.add(password);

        mainPanel.add(sure);
        mainPanel.add(exit);

    }

    Socket socket = null;
    InputStream is = null;
    OutputStream os = null;
    BufferedReader br = null;
    PrintStream ps = null;

    {
        try {
            //socket = new Socket("192.168.11.162", 9999);
            socket = new Socket("127.0.0.1", 9999);
            is = socket.getInputStream();
            os = socket.getOutputStream();
            br = new BufferedReader(new InputStreamReader(is));
            ps = new PrintStream(os);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void addListener() {
        sure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String passwordText = password.getText();
                String x = "F";
                ps.println(x);
                ps.println(LoginFrame.getname);
                ps.println(passwordText);
                password.setEnabled(false);
                serverDemo.getInfo();

            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //1.确认框
                //返回值  0--是   1--否  2--取消
                int value = JOptionPane.showConfirmDialog(UpdataFrame.this, "确定退出吗？");
                if (value == 0) {
                    new StudentFrame();
                    UpdataFrame.this.setVisible(false);
                }
            }
        });

    }

    @Override
    protected void setFrameSelf() {
        setBounds(400, 280, 560, 340);
        setResizable(false);
        setVisible(true);

    }
}
