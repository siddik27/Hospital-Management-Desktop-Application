package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class update_patient_details extends JFrame {

    int oldDeposit = 0;
    int roomPrice = 0;

    update_patient_details() {

        JPanel panel = new JPanel();
        panel.setBounds(5,5,940,490);
        panel.setBackground(new Color(24,4,46));
        panel.setLayout(null);
        add(panel);

        JLabel title = new JLabel("Update Patient Details");
        title.setBounds(120,15,300,25);
        title.setFont(new Font("Tahoma",Font.BOLD,20));
        title.setForeground(new Color(178,113,244));
        panel.add(title);

        JLabel l1 = new JLabel("Name :");
        l1.setBounds(25,90,120,14);
        l1.setForeground(Color.white);
        panel.add(l1);

        Choice choice = new Choice();
        choice.setBounds(250,85,150,25);
        panel.add(choice);

        try {
            conn c = new conn();
            ResultSet rs = c.statement.executeQuery("select Name from Patient_Info");
            while (rs.next()) {
                choice.add(rs.getString("Name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel l2 = new JLabel("Room Number :");
        l2.setBounds(25,130,150,14);
        l2.setForeground(Color.white);
        panel.add(l2);

        JTextField roomField = new JTextField();
        roomField.setBounds(250,130,150,20);
        roomField.setEditable(false);
        panel.add(roomField);

        JLabel l3 = new JLabel("In-Time :");
        l3.setBounds(25,170,150,14);
        l3.setForeground(Color.white);
        panel.add(l3);

        JTextField timeField = new JTextField();
        timeField.setBounds(250,170,180,20);
        timeField.setEditable(false);
        panel.add(timeField);

        JLabel l4 = new JLabel("New Payment (Rs) :");
        l4.setBounds(25,210,160,14);
        l4.setForeground(Color.white);
        panel.add(l4);

        JTextField payField = new JTextField();
        payField.setBounds(250,210,150,20);
        panel.add(payField);

        JLabel l5 = new JLabel("Pending Amount (Rs) :");
        l5.setBounds(25,250,180,14);
        l5.setForeground(Color.white);
        panel.add(l5);

        JTextField pendingField = new JTextField();
        pendingField.setBounds(250,250,150,20);
        pendingField.setEditable(false);
        panel.add(pendingField);

        JButton check = new JButton("CHECK");
        check.setBounds(280,380,90,25);
        panel.add(check);

        check.addActionListener(e -> {
            try {
                conn c = new conn();
                String name = choice.getSelectedItem();

                ResultSet rs = c.statement.executeQuery(
                        "select * from Patient_Info where Name='"+name+"'"
                );

                if (rs.next()) {
                    roomField.setText(rs.getString("Room_No"));
                    timeField.setText(rs.getString("Time"));
                    oldDeposit = rs.getInt("Diposite");
                }

                ResultSet rs2 = c.statement.executeQuery(
                        "select Price from room where room_no='"+roomField.getText()+"'"
                );

                if (rs2.next()) {
                    roomPrice = rs2.getInt("Price");
                }

                int newPay = 0;
                if (!payField.getText().trim().isEmpty()) {
                    newPay = Integer.parseInt(payField.getText());
                }

                int totalPaid = oldDeposit + newPay;
                int pending = roomPrice - totalPaid;

                pendingField.setText(String.valueOf(Math.max(pending,0)));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"Enter valid amount");
            }
        });

        JButton update = new JButton("UPDATE");
        update.setBounds(80,380,90,25);
        panel.add(update);

        update.addActionListener(e -> {
            try {
                int newPay = 0;
                if (!payField.getText().trim().isEmpty()) {
                    newPay = Integer.parseInt(payField.getText());
                }

                int totalDeposit = oldDeposit + newPay;

                conn c = new conn();
                c.statement.executeUpdate(
                        "update Patient_Info set Diposite='"+totalDeposit+"' where Name='"+choice.getSelectedItem()+"'"
                );

                JOptionPane.showMessageDialog(null,"Payment Updated Successfully");
                setVisible(false);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"Invalid amount");
            }
        });

        JButton back = new JButton("BACK");
        back.setBounds(180,380,90,25);
        panel.add(back);
        back.addActionListener(e -> setVisible(false));

        setUndecorated(true);
        setSize(950,500);
        setLocation(400,250);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new update_patient_details();
    }
}
