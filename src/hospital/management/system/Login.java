package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JTextField textField;
    JPasswordField passwordField;
    JButton b1,b2;

    Login(){
        JLabel namelabel = new JLabel("Username");
        namelabel.setBounds(48,20,100,30);
        namelabel.setFont(new Font("Tahoma",Font.BOLD,16));
        namelabel.setForeground(Color.WHITE);
        add(namelabel);

        JLabel password = new JLabel("Password");
        password.setBounds(48,70,100,30);
        password.setFont(new Font("Tahoma",Font.BOLD,16));
        password.setForeground(Color.WHITE);
        add(password);

        textField  = new JTextField();
        textField.setBounds(150,20,150,30);
        textField.setFont(new Font("Tahoma",Font.PLAIN,16));
        textField.setBackground(new Color(178,113,244));
        add(textField);

        passwordField  = new JPasswordField();
        passwordField.setBounds(150,70,150,30);
        passwordField.setFont(new Font("Tahoma",Font.PLAIN,16));
        passwordField.setBackground(new Color(178,113,244));
        add(passwordField);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.PNG"));
        Image i1 = imageIcon.getImage().getScaledInstance(320,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(400,20,300,200);
        add(label);

        b1 = new JButton("Login");
        b1.setBounds(40,160,120,30);
        b1.setFont(new Font("sarif",Font.BOLD,15));
        b1.setBackground(new Color(178,113,244));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(200,160,120,30);
        b2.setFont(new Font("sairf",Font.BOLD,15));
        b2.setBackground(new Color(178,113,244));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);

        add(b2);


        getContentPane().setBackground(new Color(24,4,46));
        setSize(750,300);
        setLocation(400,270);
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            try {
                conn c = new conn();
                String user = textField.getText();
                String pass = passwordField.getText();

                String q = "select * from login where ID = '"+user+"' and Password ='"+pass+"'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if(resultSet.next()){
                    new Reception();
                    setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null,"Invalid");
                }



            }catch (Exception E){
                E.printStackTrace();
            }
        }
        else {
            System.exit(0);
        }
    }
}
