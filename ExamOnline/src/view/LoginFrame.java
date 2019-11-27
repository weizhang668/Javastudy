package view;


import Controllor.method;
import Server.serverDemo;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

public class LoginFrame extends BaseFrame {
    public static String getname=null;

    public LoginFrame() {
        init();
    }

    public LoginFrame(String title) {
        super(title);
        init();
    }

    private JPanel mainPanel = new JPanel();
    private JLabel titleLable = new JLabel("在 线 考 试 系 统");
    private JLabel nameLable = new JLabel("账 号：");
    private JLabel passwordLable = new JLabel("密 码：");
    private JTextField text = new JTextField();
    private JPasswordField password = new JPasswordField();
    private JRadioButton student = new JRadioButton("学生");
    private JRadioButton teacher = new JRadioButton("老师");
    private JButton login = new JButton("登 录");
    private JButton exit = new JButton("退 出");

    @Override
    protected void setup() {
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(null);
        titleLable.setBounds(150, 40, 340, 35);
        titleLable.setFont(new Font("黑体", Font.BOLD, 34));
        nameLable.setBounds(94, 124, 90, 30);
        nameLable.setFont(new Font("黑体", Font.BOLD, 24));
        passwordLable.setBounds(94, 174, 90, 30);
        passwordLable.setFont(new Font("黑体", Font.BOLD, 24));
        passwordLable.setBounds(94, 174, 90, 30);
        passwordLable.setFont(new Font("黑体", Font.BOLD, 24));
        text.setBounds(204, 124, 260, 30);
        text.setFont(new Font("黑体", Font.BOLD, 24));
        password.setBounds(204, 174, 260, 30);
        password.setFont(new Font("黑体", Font.BOLD, 24));
        student.setBounds(137, 222, 100, 30);
        student.setFont(new Font("黑体", Font.BOLD, 22));
        teacher.setBounds(324, 222, 100, 30);
        teacher.setFont(new Font("黑体", Font.BOLD, 22));
        login.setBounds(127, 252, 100, 30);
        login.setFont(new Font("黑体", Font.BOLD, 22));
        exit.setBounds(324, 252, 100, 30);
        exit.setFont(new Font("黑体", Font.BOLD, 22));
    }

    @Override
    protected void addElement() {
        ButtonGroup g1 = new ButtonGroup();
        g1.add(student);
        g1.add(teacher);
        add(mainPanel);
        mainPanel.add(titleLable);
        mainPanel.add(nameLable);
        mainPanel.add(passwordLable);
        mainPanel.add(text);
        mainPanel.add(password);
        mainPanel.add(student);
        mainPanel.add(teacher);
        mainPanel.add(login);
        mainPanel.add(exit);
    }

    @Override
    protected void addListener() {
       final int[] flag = {0};//初始0，1student，2teacher（user）
        //单选框鼠标监听
        student.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (student.isSelected()){
                    flag[0] =1;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }


        });
        teacher.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (teacher.isSelected()){
                    flag[0] =2;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }


        });


        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = text.getText();
                char[] pw = password.getPassword();
                getname=name;//传输id

                //调用controllor中的登陆对比方法
                boolean result = false;
                int resultflag=0;//初始化0，1学生界面，2管理员界面
                if (flag[0]==1){
                    //System.out.println(serverDemo.userInfo.toString());
                    result = method.denglustu(name, pw);
                    System.out.println("denglu"+result);
                }else if (flag[0]==2){
                    result = method.dengluus(name, pw);
                    System.out.println("denglulaoshi"+result);

                }else {
                    System.out.println("登陆出错");
                }


                if (result&&flag[0]==1) {
                    //new ExamFrame("考试界面");
                    new StudentFrame("学生界面");
                    System.out.println("学生登陆成功");
                    setVisible(false);
                }else if (result&&flag[0]==2){
                    try {
                        new TeacherFrame("管理员界面");

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    System.out.println("管理员登陆成功");
                    setVisible(false);
                } else {
                    //这里的第一个参数，要注意
                    //在匿名内部类中this不好使
                    JOptionPane.showMessageDialog(LoginFrame.this, "用户名或密码错误");
                    password.setText(null);
                    text.setText(null);
                }
            }
        });

        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(10);
            }
        });
    }


    @Override
    protected void setFrameSelf() {
        setBounds(400, 280, 560, 340);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

