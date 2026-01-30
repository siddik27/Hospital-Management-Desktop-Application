package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class patient_discharge extends JFrame {
        patient_discharge(){
            JPanel panel = new JPanel();
            panel.setBounds(5,5,790,390);
            panel.setBackground(new Color(24,4,46));
            panel.setLayout(null);
            add(panel);

            JLabel label = new JLabel("CHECK-OUT");
            label.setBounds(100,20,150,20);
            label.setFont(new Font("Tahoma",Font.BOLD,20));
            label.setForeground(new Color(178,113,244));
            panel.add(label);

            JLabel label2 = new JLabel("Customer Id");
            label2.setBounds(30,80,150,20);
            label2.setFont(new Font("Tahoma",Font.BOLD,14));
            label2.setForeground(Color.white);
            panel.add(label2);

            Choice choice = new Choice();
            choice.setBounds(200,80,150,25);
            choice.setBackground(new Color(178,113,244));
            panel.add(choice);

            try{
                conn c = new conn();
                ResultSet resultSet = c.statement.executeQuery("select * from Patient_Info");
                while (resultSet.next()){
                    choice.add(resultSet.getString("number"));
                }

            }catch (Exception e){
                e.printStackTrace();
            }

            JLabel label3 = new JLabel("Room Number");
            label3.setBounds(30,130,150,20);
            label3.setFont(new Font("Tahoma",Font.BOLD,14));
            label3.setForeground(Color.white);
            panel.add(label3);

            JLabel RNo = new JLabel();
            RNo.setBounds(200,130,150,20);
            RNo.setFont(new Font("Tahoma",Font.BOLD,14));
            RNo.setForeground(Color.white);
            panel.add(RNo);

            JLabel label4 = new JLabel("In Time");
            label4.setBounds(30,180,150,20);
            label4.setFont(new Font("Tahoma",Font.BOLD,14));
            label4.setForeground(Color.white);
            panel.add(label4);

            JLabel INTime = new JLabel();
            INTime.setBounds(200,180,250,20);
            INTime.setFont(new Font("Tahoma",Font.BOLD,14));
            INTime.setForeground(Color.white);
            panel.add(INTime);

            JLabel label5 = new JLabel("Out Time");
            label5.setBounds(30,230,150,20);
            label5.setFont(new Font("Tahoma",Font.BOLD,14));
            label5.setForeground(Color.white);
            panel.add(label5);

            JLabel label6 = new JLabel("Name");
            label6.setBounds(30,270,150,20);
            label6.setFont(new Font("Tahoma",Font.BOLD,14));
            label6.setForeground(Color.white);
            panel.add(label6);

            JLabel P_name = new JLabel();
            P_name.setBounds(200,270,150,20);
            P_name.setFont(new Font("Tahoma",Font.BOLD,14));
            P_name.setForeground(Color.white);
            panel.add(P_name);


            Date date = new Date();

            JLabel OUTTime = new JLabel(""+date);
            OUTTime .setBounds(200,230,250,20);
            OUTTime .setFont(new Font("Tahoma",Font.BOLD,14));
            OUTTime .setForeground(Color.white);
            panel.add(OUTTime );

            JButton discharge = new JButton("Discharge");
            discharge.setBounds(30,320,120,30);
            discharge.setBackground(new Color(82, 16, 30));
            discharge.setForeground(Color.white);
            panel.add(discharge);
            discharge.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    conn c = new conn();
                    try {
                        c.statement.executeUpdate("delete from Patient_Info where number = '"+choice.getSelectedItem()+"'");
                        c.statement.executeUpdate("update room set Avilability = 'Available' where room_no = '"+RNo.getText()+"'");
                        JOptionPane.showMessageDialog(null,"Done");
                        setVisible(false);
                    }catch (Exception E){
                        E.printStackTrace();
                    }


                }
            });

            JButton Check = new JButton("Check");
            Check.setBounds(170,320,120,30);
            Check.setBackground(new Color(82, 16, 30));
            Check.setForeground(Color.white);
            panel.add(Check);
            Check.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    conn c = new conn();
                    try{
                        ResultSet resultSet = c.statement.executeQuery("select * from Patient_Info where number = '"+choice.getSelectedItem()+"'");
                        while (resultSet.next()){
                            RNo.setText(resultSet.getString("Room_no"));
                            INTime.setText(resultSet.getString("Time"));
                            P_name.setText(resultSet.getString("Name"));
                        }
                    }catch (Exception E){
                        E.printStackTrace();
                    }
                }
            });

            JButton Back = new JButton("Back");
            Back.setBounds(300,320,120,30);
            Back.setBackground(new Color(82, 16, 30));
            Back.setForeground(Color.white);
            panel.add(Back);
            Back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                }
            });


            setUndecorated(true);
            setSize(800,400);
            setLayout(null);
            setLocation(400,250);
            setVisible(true);

        }

    public static void main(String[] args) {
            new patient_discharge();
    }
}
