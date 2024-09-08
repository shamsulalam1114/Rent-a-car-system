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
 
 
public class AdminInformation implements ActionListener
{
    JFrame frame = new JFrame("Admin Information");
 
    JLabel AllUserInfoLabel = new JLabel("All Admin Information");
 
   
    JButton BackButton = new JButton("Back");
    JButton LogOutButton = new JButton("Log Out");
   
    JTable table = new JTable();
 
    DefaultTableModel model = new DefaultTableModel();
   
    JScrollPane scroll = new JScrollPane(table);
 
    private String[] column = { "Admin Name", "Password" };
    private String[] rows = new String[100];
 
    public AdminInformation()
    {
        AllUserInfoLabel.setBounds(455, 80, 500, 40);
        AllUserInfoLabel.setForeground(Color.white);
        AllUserInfoLabel.setFont(new Font("Segoe UI", Font.BOLD, 40));
        AllUserInfoLabel.setBackground(Color.white);


        BackButton.setBounds(30,20,100,30);
        BackButton.setForeground(Color.black);
        BackButton.setFont(new Font("Arial",Font.BOLD,15));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.setForeground(Color.black);
        BackButton.setBackground(Color.white);
        BackButton.addActionListener(this);
 
        LogOutButton.setBounds(1200, 20, 140, 30);
      
        LogOutButton.setFont(new Font("Arial",Font.BOLD,15));
        LogOutButton.setFocusable(false);
        LogOutButton.setBorderPainted(true);
        LogOutButton.setContentAreaFilled(false);
        LogOutButton.setFocusPainted(false);
        LogOutButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        LogOutButton.setOpaque(true);
        LogOutButton.setForeground(Color.black);
        LogOutButton.setBackground(Color.white);
        LogOutButton.addActionListener(this);
       
        model.setColumnIdentifiers(column);
 
 
        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(350);
        table.getColumnModel().getColumn(1).setPreferredWidth(335);
       
 
        scroll.setBounds(650, 150, 666, 500);
        scroll.setBackground(Color.cyan);
 
 
        String file = "data\\AdminInfo.txt";
 
        try {
 
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();
 
            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 10);
                if (x.equals("Admin Name")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12); // Admin Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(12); // Admin pass
                   
                    model.addRow(rows);
                }
            }
 
        } catch (Exception ex) {
            System.out.println("error");
            return;
        }
 
        frame.getContentPane().setBackground(Color.black);
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
 
 
        frame.add(AllUserInfoLabel);
        frame.add(BackButton);
        frame.add(LogOutButton);
        frame.add(scroll);
 
    }
 
   
    @Override
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