package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,160,1420,670);
        panel.setBackground(new Color(24,4,46));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,1420,150);
        panel1.setBackground(new Color(24,4,46));
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image image = i1.getImage().getScaledInstance(180,150,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(1250,0,180,150);
        panel1.add(label);

        //adding buttons to the panel1
        JButton btn1 = new JButton("Add new Patient");
        btn1.setBounds(30,15,200,30);
        btn1.setBackground(new Color(178,113,244));
        btn1.setFont(new Font("sarif",Font.BOLD,15));
        btn1.setForeground(new Color(255, 255, 255));
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NEW_PATIENT();
            }
        });

        JButton btn2 = new JButton("Room");
        btn2.setBounds(30,55,200,30);
        btn2.setBackground(new Color(178,113,244));
        btn2.setFont(new Font("sarif",Font.BOLD,15));
        btn2.setForeground(new Color(255, 255, 255));
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Room();
            }
        });

        JButton btn3 = new JButton("Department");
        btn3.setBounds(30,95,200,30);
        btn3.setBackground(new Color(178,113,244));
        btn3.setFont(new Font("sarif",Font.BOLD,15));
        btn3.setForeground(new Color(255, 255, 255));
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Department();
            }
        });

        JButton btn4 = new JButton("All Employee Info");
        btn4.setBounds(270,15,200,30);
        btn4.setBackground(new Color(178,113,244));
        btn4.setFont(new Font("sarif",Font.BOLD,15));
        btn4.setForeground(new Color(255, 255, 255));
        panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Employee_info();
            }
        });

        JButton btn5 = new JButton("Patient Info");
        btn5.setBounds(270,55,200,30);
        btn5.setBackground(new Color(178,113,244));
        btn5.setFont(new Font("sarif",Font.BOLD,15));
        btn5.setForeground(new Color(255, 255, 255));
        panel1.add(btn5);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ALL_Patient_Info();
            }
        });

        JButton btn6 = new JButton("Patient Discharge");
        btn6.setBounds(270,95,200,30);
        btn6.setBackground(new Color(178,113,244));
        btn6.setFont(new Font("sarif",Font.BOLD,15));
        btn6.setForeground(new Color(255, 255, 255));
        panel1.add(btn6);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new patient_discharge();
            }
        });

        JButton btn7 = new JButton("Update Patient Details");
        btn7.setBounds(510, 15, 200, 30);
        btn7.setBackground(new Color(178, 113, 244));
        btn7.setFont(new Font("sarif", Font.BOLD, 15));
        btn7.setForeground(new Color(255, 255, 255));
        panel1.add(btn7);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new update_patient_details();
            }
        });

        JButton btn8 = new JButton("Hospital Ambulance");
        btn8.setBounds(510, 55, 200, 30);
        btn8.setBackground(new Color(178, 113, 244));
        btn8.setFont(new Font("sarif", Font.BOLD, 15));
        btn8.setForeground(new Color(255, 255, 255));
        panel1.add(btn8);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ambulance();
            }
        });

        JButton btn9 = new JButton("Search Room");
        btn9.setBounds(510, 95, 200, 30);
        btn9.setBackground(new Color(178, 113, 244));
        btn9.setFont(new Font("sarif", Font.BOLD, 15));
        btn9.setForeground(new Color(255, 255, 255));
        panel1.add(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SearchRoom();
            }
        });

        JButton btn10 = new JButton("Logout");
        btn10.setBounds(750, 15, 200, 30);
        btn10.setBackground(new Color(178, 113, 244));
        btn10.setFont(new Font("sarif", Font.BOLD, 15));
        btn10.setForeground(new Color(255, 255, 255));
        panel1.add(btn10);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });



        setSize(1950,1090);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Reception();
    }

}
