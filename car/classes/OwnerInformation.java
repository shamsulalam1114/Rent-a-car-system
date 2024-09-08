package classes;
import interfage.*;
import data.*;
import images.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import javax.swing.table.*;

import java.io.*;
import java.nio.file.*;
import static javax.swing.JOptionPane.showMessageDialog;
 
 
public class OwnerInformation  implements ActionListener
{
    JFrame frame = new JFrame("Owner Information");
 
    JLabel AllUserInfoLabel = new JLabel("All Owner Information");
 
   
    JButton BackButton = new JButton("Back");
    JButton LogOutButton = new JButton("Log Out");
    JButton DeleteUserButton = new JButton("Delete Owner Information");
 
 
    JTable table = new JTable();
 
    DefaultTableModel model = new DefaultTableModel();
   
    JScrollPane scroll = new JScrollPane(table);
 
    private String[] column = { "Owner Name", "Email","Password", "Phone Number","Security Question", "Answer","Gender"};
    private String[] rows = new String[100];
 
    public OwnerInformation()
    {
        AllUserInfoLabel.setBounds(450, 70, 500, 40);
        AllUserInfoLabel.setForeground(Color.black);
        AllUserInfoLabel.setFont(new Font("Segoe UI", Font.BOLD, 40));
 
        BackButton.setBounds(30,20,100,30);
       
        BackButton.setFont(new Font("Arial",Font.BOLD,15));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.setForeground(Color.white);
        BackButton.setBackground(Color.black);
        BackButton.addActionListener(this);
 
        LogOutButton.setBounds(1200, 20, 140, 30);
        
        LogOutButton.setFont(new Font("Arial",Font.BOLD,15));
        LogOutButton.setFocusable(false);
        LogOutButton.setBorderPainted(true);
        LogOutButton.setContentAreaFilled(false);
        LogOutButton.setFocusPainted(false);
        LogOutButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        LogOutButton.setOpaque(true);
        LogOutButton.setForeground(Color.white);
        LogOutButton.setBackground(Color.black);
        LogOutButton.addActionListener(this);
       
       
 
        DeleteUserButton.setBounds(1000, 660, 320, 30);
        DeleteUserButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
        DeleteUserButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        DeleteUserButton.setBackground(Color.orange);
        DeleteUserButton.setFocusPainted(false);
        DeleteUserButton.setForeground(Color.red);
        DeleteUserButton.setBackground(Color.black);

        model.setColumnIdentifiers(column);
 
   //private String[] column = { "Owner Name", "Email","Password", "Phone Number","Security Question", "Answer","Gender"};
        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(300);
        table.getColumnModel().getColumn(1).setPreferredWidth(300);
        table.getColumnModel().getColumn(2).setPreferredWidth(300);
        table.getColumnModel().getColumn(3).setPreferredWidth(220);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);
        table.getColumnModel().getColumn(5).setPreferredWidth(200);
        table.getColumnModel().getColumn(6).setPreferredWidth(200);
       
        scroll.setBounds(15, 150, 1315, 500);
        scroll.setBackground(Color.cyan);
 
 
        String file = "data\\OwnerInfo.txt";
 
        try {
 
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();
 // private String[] column = { "Owner Name", "Email","Password", "Phone Number","Security Question", "Answer","Gender"};
            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("Name")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(6); // User Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(7); // Email
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(10); // Password
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(14); // phone Number
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(19); // Security Question
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(8); // Answer
                    rows[6] = Files.readAllLines(Paths.get(file)).get((i + 6)).substring(8); // Gender
                    model.addRow(rows);
                }
            }
 
        } catch (Exception ex) {
            System.out.println("error");
            return;
        }
 
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
 
 
        frame.add(AllUserInfoLabel);
        frame.add(BackButton);
        frame.add(LogOutButton);
        frame.add(DeleteUserButton);
        frame.add(scroll);
 
       
    }
 
    public void actionPerformed(ActionEvent e) {
   
        if(e.getSource()==LogOutButton){
         frame.dispose();
         new LoginPage();
        }
         if(e.getSource()==BackButton){
         frame.dispose();
         new AdminProfile();
        }
 
   
}
}
 