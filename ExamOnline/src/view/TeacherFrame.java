package view;

import Controllor.method;
import Server.serverDemo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @Auther: 张伟
 * @Date: 2019/11/25
 * @Description: view
 * @version: 1.0
 */
public class TeacherFrame extends BaseFrame {


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
    public TeacherFrame() {
        init();
    }

    public TeacherFrame(String title) {
        super(title);
        init();
    }

    private JPanel mainPanel = new JPanel();
    private JPanel leftPanel = new JPanel();
    private JPanel left1 = new JPanel();
    private JPanel left2 = new JPanel();
    private JPanel left3 = new JPanel();
    private JPanel left4 = new JPanel();
    private JPanel rightPanel = new JPanel();
    //添加
    private JLabel id1Lable = new JLabel("学 号：");
    private JLabel name1Lable = new JLabel("姓 名：");
    private JLabel sex1Lable = new JLabel("性 别：");
    private JLabel age1Lable = new JLabel("年 龄：");
    private JTextField id1text = new JTextField();
    private JTextField name1text = new JTextField();
    private JTextField sex1text = new JTextField();
    private JTextField age1text = new JTextField();
    private JButton login1 = new JButton("添 加");
    //删除
    private JLabel id2Lable = new JLabel("学 号：");
    private JTextField id2text = new JTextField();
    private JButton login2 = new JButton("删 除");
    //修改
    private JLabel id3Lable = new JLabel("学 号：");
    private JLabel name3Lable = new JLabel("姓 名：");
    private JLabel sex3Lable = new JLabel("性 别：");
    private JLabel age3Lable = new JLabel("年 龄：");
    private JTextField id3text = new JTextField();
    private JTextField name3text = new JTextField();
    private JTextField sex3text = new JTextField();
    private JTextField age3text = new JTextField();
    private JButton login3 = new JButton("修 改");
    //查询
    private JLabel id4Lable = new JLabel("学 号：");
    private JTextField id4text = new JTextField();
    private JButton login4 = new JButton("查 询");

    //退出
    private JButton login5 = new JButton("退 出");

    //显示数据库
    //private JTextArea infoArea = new JTextArea();


    private JTable jTable = new JTable();
    private DefaultTableModel dtm;
    private JScrollPane scrollPane = new JScrollPane(jTable);


    @Override
    protected void setup() {
        Vector columnNames = new Vector();

        columnNames.add("学号");
        columnNames.add("名字");
        columnNames.add("性别");
        columnNames.add("年龄");
        columnNames.add("成绩");

        Vector rowData = new Vector();
        try {
            rowData = serverDemo.getstudent();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dtm = new DefaultTableModel(rowData,columnNames);
        jTable.setModel(dtm);

        //设置panel布局管理---->自定义
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.LIGHT_GRAY);
        //设置leftPanel区域的位置
        leftPanel.setLayout(null);
        leftPanel.setBounds(16, 15, 310, 620);
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        left1.setLayout(null);
        left1.setBounds(16, 10, 280, 180);
        left1.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        left2.setLayout(null);
        left2.setBounds(16, 200, 280, 100);
        left2.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        left3.setLayout(null);
        left3.setBounds(16, 310, 280, 180);
        left3.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        left4.setLayout(null);
        left4.setBounds(16, 500, 280, 80);
        left4.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        //设置button区域的位置
        rightPanel.setLayout(null);
        rightPanel.setBounds(340, 15, 480, 620);
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        //手动设置每一个组件的位置 字体 背景
        scrollPane.setBounds(16, 10, 450, 590);
//        infoArea.setFont(new Font("黑体", Font.BOLD, 34));
//        infoArea.setEnabled(false);//文本域中的文字不能编辑


        //设置区域中的每一个组件位置 大小 颜色
        //left1
        id1Lable.setBounds(10, 10, 80, 20);
        id1Lable.setFont(new Font("黑体", Font.PLAIN, 20));
        id1text.setBounds(100, 10, 150, 20);
        id1text.setFont(new Font("黑体", Font.BOLD, 20));
        id1Lable.setEnabled(false);
        id1Lable.setHorizontalAlignment(JTextField.CENTER);

        name1Lable.setBounds(10, 40, 80, 20);
        name1Lable.setFont(new Font("黑体", Font.PLAIN, 20));
        name1text.setBounds(100, 40, 150, 20);
        name1text.setFont(new Font("黑体", Font.BOLD, 20));
        name1Lable.setEnabled(false);
        name1Lable.setHorizontalAlignment(JTextField.CENTER);

        sex1Lable.setBounds(10, 70, 80, 20);
        sex1Lable.setFont(new Font("黑体", Font.PLAIN, 20));
        sex1text.setBounds(100, 70, 150, 20);
        sex1text.setFont(new Font("黑体", Font.BOLD, 20));
        sex1Lable.setEnabled(false);
        sex1Lable.setHorizontalAlignment(JTextField.CENTER);

        age1Lable.setBounds(10, 100, 80, 20);
        age1Lable.setFont(new Font("黑体", Font.PLAIN, 20));
        age1text.setBounds(100, 100, 150, 20);
        age1text.setFont(new Font("黑体", Font.BOLD, 20));
        age1Lable.setEnabled(false);
        age1Lable.setHorizontalAlignment(JTextField.CENTER);
        login1.setBounds(10, 130, 60, 30);

        //left2
        id2Lable.setBounds(10, 10, 80, 20);
        id2Lable.setFont(new Font("黑体", Font.PLAIN, 20));
        id2text.setBounds(100, 10, 150, 20);
        id2text.setFont(new Font("黑体", Font.BOLD, 20));
        id2Lable.setEnabled(false);
        id2Lable.setHorizontalAlignment(JTextField.CENTER);
        login2.setBounds(10, 40, 60, 30);

        //left3
        id3Lable.setBounds(10, 10, 80, 20);
        id3Lable.setFont(new Font("黑体", Font.PLAIN, 20));
        id3text.setBounds(100, 10, 150, 20);
        id3text.setFont(new Font("黑体", Font.BOLD, 20));
        id3Lable.setEnabled(false);
        id3Lable.setHorizontalAlignment(JTextField.CENTER);

        name3Lable.setBounds(10, 40, 80, 20);
        name3Lable.setFont(new Font("黑体", Font.PLAIN, 20));
        name3text.setBounds(100, 40, 150, 20);
        name3text.setFont(new Font("黑体", Font.BOLD, 20));
        name3Lable.setEnabled(false);
        name3Lable.setHorizontalAlignment(JTextField.CENTER);

        sex3Lable.setBounds(10, 70, 80, 20);
        sex3Lable.setFont(new Font("黑体", Font.PLAIN, 20));
        sex3text.setBounds(100, 70, 150, 20);
        sex3text.setFont(new Font("黑体", Font.BOLD, 20));
        sex3Lable.setEnabled(false);
        sex3Lable.setHorizontalAlignment(JTextField.CENTER);

        age3Lable.setBounds(10, 100, 80, 20);
        age3Lable.setFont(new Font("黑体", Font.PLAIN, 20));
        age3text.setBounds(100, 100, 150, 20);
        age3text.setFont(new Font("黑体", Font.BOLD, 20));
        age3Lable.setEnabled(false);
        age3Lable.setHorizontalAlignment(JTextField.CENTER);
        login3.setBounds(10, 130, 60, 30);

        //left4
        id4Lable.setBounds(10, 10, 80, 20);
        id4Lable.setFont(new Font("黑体", Font.PLAIN, 20));
        id4text.setBounds(100, 10, 150, 20);
        id4text.setFont(new Font("黑体", Font.BOLD, 20));
        id4Lable.setEnabled(false);
        id4Lable.setHorizontalAlignment(JTextField.CENTER);
        login4.setBounds(10, 40, 60, 30);

        login5.setBounds(100, 580, 60, 30);


    }

    @Override
    protected void addElement() {
        add(mainPanel);
        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);

        leftPanel.add(left1);
        left1.add(id1Lable);
        left1.add(id1text);
        left1.add(name1Lable);
        left1.add(name1text);
        left1.add(sex1Lable);
        left1.add(sex1text);
        left1.add(age1Lable);
        left1.add(age1text);
        left1.add(login1);

        leftPanel.add(left2);
        left2.add(id2Lable);
        left2.add(id2text);
        left2.add(login2);

        leftPanel.add(left3);
        left3.add(id3Lable);
        left3.add(id3text);
        left3.add(name3Lable);
        left3.add(name3text);
        left3.add(sex3Lable);
        left3.add(sex3text);
        left3.add(age3Lable);
        left3.add(age3text);
        left3.add(login3);

        leftPanel.add(left4);
        left4.add(id4Lable);
        left4.add(id4text);
        left4.add(login4);

        leftPanel.add(login5);

        rightPanel.add(scrollPane);


    }

    @Override
    protected void addListener() {
        //创建一个监听器  用于退出按钮
        login5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //1.确认框
                //返回值  0--是   1--否  2--取消
                int value = JOptionPane.showConfirmDialog(TeacherFrame.this, "确定退出吗？");
                if (value == 0) {
                    String x = "E";
                    ps.println(x);
                    new LoginFrame();
                    TeacherFrame.this.setVisible(false);
                }
            }
        });

        login1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = id1text.getText();
                String name = name1text.getText();
                String sex = sex1text.getText();
                String age = age1text.getText();
                String x = "A";
                ps.println(x);
                ps.println(id);
                ps.println(name);
                ps.println(sex);
                ps.println(age);

                id1text.setText(null);
                name1text.setText(null);
                sex1text.setText(null);
                age1text.setText(null);

                Vector columnNames = new Vector();

                columnNames.add("学号");
                columnNames.add("名字");
                columnNames.add("性别");
                columnNames.add("年龄");
                columnNames.add("成绩");
                serverDemo.getInfo();

                Vector rowData = new Vector();
                try {
                    rowData = serverDemo.getstudent();
                } catch (SQLException a) {
                    a.printStackTrace();
                }
                dtm.setDataVector(rowData,columnNames);
                jTable.setModel(dtm);
            }
        });

        login2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = id2text.getText();
                String x = "B";
                ps.println(x);
                ps.println(id);
                id2text.setText(null);
                Vector columnNames = new Vector();

                columnNames.add("学号");
                columnNames.add("名字");
                columnNames.add("性别");
                columnNames.add("年龄");
                columnNames.add("成绩");
                serverDemo.getInfo();

                Vector rowData = new Vector();
                try {
                    rowData = serverDemo.getstudent();
                } catch (SQLException a) {
                    a.printStackTrace();
                }
                dtm.setDataVector(rowData,columnNames);
                jTable.setModel(dtm);


            }
        });
        login3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = id3text.getText();
                String name = name3text.getText();
                String sex = sex3text.getText();
                String age = age3text.getText();
                String x = "C";
                ps.println(x);
                ps.println(id);
                ps.println(name);
                ps.println(sex);
                ps.println(age);

                id3text.setText(null);
                name3text.setText(null);
                sex3text.setText(null);
                age3text.setText(null);
                Vector columnNames = new Vector();

                columnNames.add("学号");
                columnNames.add("名字");
                columnNames.add("性别");
                columnNames.add("年龄");
                columnNames.add("成绩");
                serverDemo.getInfo();

                Vector rowData = new Vector();
                try {
                    rowData = serverDemo.getstudent();
                } catch (SQLException a) {
                    a.printStackTrace();
                }
                dtm.setDataVector(rowData,columnNames);
                jTable.setModel(dtm);


            }
        });

        login4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = id4text.getText();
                String x = "D";
                ps.println(x);
                ps.println(id);
                try {
                    String str = br.readLine();
                    JOptionPane.showMessageDialog(TeacherFrame.this, str);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                id4text.setText(null);

            }
        });

    }

    @Override
    protected void setFrameSelf() {
        this.setBounds(260, 130, 840, 670);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);//不想让窗体拖拽大小
        this.setVisible(true);//最终展示整个窗体

    }
}
