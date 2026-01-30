package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class SearchRoom extends JFrame {

    Choice choice;
    JTable table;

    SearchRoom() {

        JPanel panel = new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setBackground(new Color(24,4,46));
        panel.setLayout(null);
        add(panel);

        JLabel title = new JLabel("Search For Room");
        title.setBounds(250,11,250,31);
        title.setForeground(Color.white);
        title.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(title);

        JLabel status = new JLabel("Status :");
        status.setBounds(70,70,80,20);
        status.setForeground(Color.white);
        status.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(status);

        choice = new Choice();
        choice.setBounds(170,70,120,20);
        choice.add("Available");
        choice.add("Occupied");
        panel.add(choice);

        table = new JTable();
        table.setBounds(0,187,700,210);
        table.setBackground(new Color(24,4,46));
        table.setForeground(Color.white);
        panel.add(table);

        try {
            conn c = new conn();
            ResultSet rs = c.statement.executeQuery("select * from Room");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        JButton search = new JButton("Search");
        search.setBounds(200,420,120,32);
        panel.add(search);

        search.addActionListener(e -> {
            try {
                conn c = new conn();
                String q =
                        "SELECT * FROM Room " +
                                "WHERE LOWER(TRIM(Avilability)) = '" +
                                choice.getSelectedItem().toLowerCase() + "'";

                ResultSet rs = c.statement.executeQuery(q);
                table.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(380,420,120,32);
        panel.add(back);
        back.addActionListener(e -> setVisible(false));

        setUndecorated(true);
        setSize(700,500);
        setLayout(null);
        setLocation(450,250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SearchRoom();
    }
}
