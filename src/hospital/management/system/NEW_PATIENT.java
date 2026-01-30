package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import java.util.SimpleTimeZone;

public class NEW_PATIENT extends JFrame implements ActionListener {
    JComboBox comboBox;
    JTextField textFieldNumber,textName, textFieldDisease, textFieldDeposite;

    JRadioButton r1,r2;
    Choice c1;

    JLabel date;
    JButton b1, b2;

    NEW_PATIENT(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,840,590);
        panel.setBackground(new Color(24,4,46));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/patient.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(550,150,200,200);
        panel.add(label);

        JLabel labelName = new JLabel("NEW PATIENT FORM");
        labelName.setBounds(118,11,260,53);
        labelName.setFont(new Font("Tahoma",Font.BOLD,20));
        labelName.setForeground(Color.WHITE);
        panel.add(labelName);

        JLabel labelId = new JLabel("ID");
        labelId.setBounds(20,70,150,40);
        labelId.setFont(new Font("Tahoma",Font.BOLD,16));
        labelId.setForeground(Color.WHITE);
        panel.add(labelId);

        comboBox  = new JComboBox<>(new String[] {"Adhaar card","Voter Card","Driving licence"});
        comboBox.setBounds(240,70,190,30);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,16));
        comboBox.setForeground(Color.WHITE);
        comboBox.setBackground(new Color(178,113,244));
        panel.add(comboBox);

        JLabel labelNumber = new JLabel("Number");
        labelNumber.setBounds(20,120,150,40);
        labelNumber.setFont(new Font("Tahoma",Font.BOLD,16));
        labelNumber.setForeground(Color.WHITE);
        panel.add(labelNumber);

        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(240,120,190,30);
        textFieldNumber.setFont(new Font("Tahoma",Font.BOLD,16));
        textFieldNumber.setForeground(Color.WHITE);
        textFieldNumber.setBackground(new Color(178,113,244));
        panel.add(textFieldNumber);

        JLabel labelName1 = new JLabel("Name");
        labelName1.setBounds(20,170,150,40);
        labelName1.setFont(new Font("Tahoma",Font.BOLD,16));
        labelName1.setForeground(Color.WHITE);
        panel.add(labelName1);

        textName = new JTextField();
        textName.setBounds(240,170,190,30);
        textName.setFont(new Font("Tahoma",Font.BOLD,16));
        textName.setForeground(Color.WHITE);
        textName.setBackground(new Color(178,113,244));
        panel.add(textName);

        JLabel labelGender = new JLabel("Gender");
        labelGender.setBounds(20,220,150,40);
        labelGender.setFont(new Font("Tahoma",Font.BOLD,16));
        labelGender.setForeground(Color.WHITE);
        panel.add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setBounds(240,220,80,30);
        r1.setBackground(new Color(178,113,244));
        r1.setForeground(Color.WHITE);
        r1.setFont(new Font("Tahoma",Font.BOLD,16));


        r2 = new JRadioButton("Female");
        r2.setBounds(340,220,100,30);
        r2.setBackground(new Color(178,113,244));
        r2.setForeground(Color.WHITE);
        r2.setFont(new Font("Tahoma",Font.BOLD,16));

        //for selecting one gender at a time and there is only two genders , no other gender allows
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);
        panel.add(r1);
        panel.add(r2);

        JLabel labelDisease = new JLabel("Disease");
        labelDisease.setBounds(20,270,150,40);
        labelDisease.setFont(new Font("Tahoma",Font.BOLD,16));
        labelDisease.setForeground(Color.WHITE);
        panel.add(labelDisease);

        textFieldDisease = new JTextField();
        textFieldDisease.setBounds(240,270,190,30);
        textFieldDisease.setFont(new Font("Tahoma",Font.BOLD,16));
        textFieldDisease.setForeground(Color.WHITE);
        textFieldDisease.setBackground(new Color(178,113,244));
        panel.add(textFieldDisease);

         JLabel labelRoom = new JLabel("Room");
        labelRoom.setBounds(20,320,150,40);
        labelRoom.setFont(new Font("Tahoma",Font.BOLD,16));
        labelRoom.setForeground(Color.WHITE);
        panel.add(labelRoom);

        c1 = new Choice();
        try{
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from Room");
            while (resultSet.next()){
                c1.add(resultSet.getString("room_no"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
            //room choice
        c1.setBounds(240,325,190,50);
        c1.setBackground(new Color(178,113,244));
        c1.setFont(new Font("Tahoma",Font.BOLD,16));
        c1.setForeground(Color.WHITE);
        panel.add(c1);

        JLabel labelDate = new JLabel("Time");
        labelDate.setBounds(20,370,150,40);
        labelDate.setFont(new Font("Tahoma",Font.BOLD,16));
        labelDate.setForeground(Color.WHITE);
        panel.add(labelDate);

        Date date1 = new Date();

        date = new JLabel(""+date1);
        date.setBounds(240,370,260,30);
        date.setFont(new Font("Tahoma",Font.BOLD,16));
        date.setForeground(Color.WHITE);
        panel.add(date);

        JLabel labelDiposite = new JLabel("Diposite");
        labelDiposite.setBounds(20,420,150,40);
        labelDiposite.setFont(new Font("Tahoma",Font.BOLD,16));
        labelDiposite.setForeground(Color.WHITE);
        panel.add(labelDiposite);

        textFieldDeposite = new JTextField();
        textFieldDeposite.setBounds(240,420,190,30);
        textFieldDeposite.setFont(new Font("Tahoma",Font.BOLD,16));
        textFieldDeposite.setForeground(Color.WHITE);
        textFieldDeposite.setBackground(new Color(178,113,244));
        panel.add(textFieldDeposite);

        //add button
        b1 = new JButton("ADD");
        b1.setBounds(130,500,120,30);
        b1.setBackground(new Color(82, 16, 30));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        //back button
        b2 = new JButton("BACK");
        b2.setBounds(300,500,120,30);
        b2.setBackground(new Color(82, 16, 30));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        setUndecorated(true);
        setSize(850,600);
        setLayout(null);
        setLocation(300,100);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            conn c = new conn();
            String radioBtn = null;
            if (r1.isSelected()){
                radioBtn = "Male";
            } else if (r2.isSelected()) {
                radioBtn = "Female";
            }

            String s1 = (String)comboBox.getSelectedItem();
            String s2 = textFieldNumber.getText();
            String s3 = textName.getText();
            String s4 = radioBtn;
            String s5 = textFieldDisease.getText();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = textFieldDeposite.getText();

            try {
                String q = "insert into Patient_info values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                String q1 = "update room set Avilability = 'occupied' where room_no = "+s6;

                 c.statement.executeUpdate(q);
                 c.statement.executeUpdate(q1);


                JOptionPane.showMessageDialog(null,"Added Successfully");
                setVisible(false);




            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new NEW_PATIENT();
    }


}
