package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Employee_info extends JFrame {
    Employee_info(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(24,4,46));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,34,980,450);
        table.setBackground(new Color(24,4,46));
        table.setFont(new Font("Tahoma",Font.BOLD,12));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            conn c = new conn();
            String q = "select * from EMP_INFO";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel label1 = new JLabel("Name");
        label1.setBounds(30,9,70,20);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("Age");
        label2.setBounds(172,9,70,20);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        JLabel label3 = new JLabel("Phone Number");
        label3.setBounds(335,9,150,20);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JLabel label4 = new JLabel("Salary");
        label4.setBounds(535,9,150,20);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JLabel label5 = new JLabel("Gmail");
        label5.setBounds(715,9,150,20);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        JLabel label6 = new JLabel("Aadhar Number");
        label6.setBounds(823,9,150,20);
        label6.setFont(new Font("Tahoma",Font.BOLD,14));
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        JButton button = new JButton("BACK");
        button.setBounds(400,500,120,30);
        button.setFont(new Font("Tahoma",Font.BOLD,14));
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
        setLocation(350,230);
        setLayout(null);
        setVisible(true);

    }



    public static void main(String[] args) {
        new Employee_info();
    }
}
