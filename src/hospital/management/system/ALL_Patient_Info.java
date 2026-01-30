package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class ALL_Patient_Info extends JFrame {
    ALL_Patient_Info(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(24,4,46));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,40,980,450);
        table.setBackground(new Color(24,4,46));
        table.setFont(new Font("Tahoma",Font.BOLD,12));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            conn c = new conn();
            String q = "select * from Patient_Info";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel label1 = new JLabel("ID");
        label1.setBounds(21,11,100,14);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("ID Number");
        label2.setBounds(135,11,110,14);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        JLabel label3 = new JLabel("Name");
        label3.setBounds(260,11,100,14);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JLabel label4 = new JLabel("Gender");
        label4.setBounds(380,11,100,14);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JLabel label5 = new JLabel("Disease");
        label5.setBounds(500,11,100,14);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        JLabel label6 = new JLabel("Room");
        label6.setBounds(630,11,100,14);
        label6.setFont(new Font("Tahoma",Font.BOLD,14));
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        JLabel label7 = new JLabel("Time");
        label7.setBounds(750,11,100,14);
        label7.setFont(new Font("Tahoma",Font.BOLD,14));
        label7.setForeground(Color.WHITE);
        panel.add(label7);

        JLabel label8 = new JLabel("Deposit");
        label8.setBounds(870,11,100,14);
        label8.setFont(new Font("Tahoma",Font.BOLD,14));
        label8.setForeground(Color.WHITE);
        panel.add(label8);

        JButton button = new JButton("BACK");
        button.setBounds(450,510,120,30);
        button.setBackground(new Color(82, 16, 30));
        button.setForeground(Color.white);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(1000,600);
        setLayout(null);
        setLocation(275,170);
        setVisible(true);
    }


    public static void main(String[] args) {
        new ALL_Patient_Info();
    }
}
