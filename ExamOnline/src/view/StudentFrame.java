package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Auther: 张伟
 * @Date: 2019/11/27
 * @Description: view
 * @version: 1.0
 */
public class StudentFrame extends BaseFrame {

    public StudentFrame() {
        init();
    }

    public StudentFrame(String title) {
        super(title);
        init();
    }

    private JPanel mainPanel = new JPanel();
    private JLabel titleLable = new JLabel("学 生 界 面");

    private JButton exam = new JButton("考 试");
    private JButton updata = new JButton("修改密码");


    @Override
    protected void setup() {
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(null);
        titleLable.setBounds(180, 40, 340, 35);
        titleLable.setFont(new Font("黑体", Font.BOLD, 34));
        exam.setBounds(50, 200, 150, 50);
        exam.setFont(new Font("黑体", Font.BOLD, 22));
        updata.setBounds(324, 200, 150, 50);
        updata.setFont(new Font("黑体", Font.BOLD, 22));

    }

    @Override
    protected void addElement() {
        add(mainPanel);
        mainPanel.add(titleLable);
        mainPanel.add(exam);
        mainPanel.add(updata);

    }

    @Override
    protected void addListener() {
        exam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExamFrame("考试界面");
                System.out.println("学生开始考试");
                setVisible(false);
            }
        });

        updata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdataFrame("修改密码");
                System.out.println("学生修改密码");
                setVisible(false);
            }
        });

    }

    @Override
    protected void setFrameSelf() {
        setBounds(400, 280, 520, 340);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
