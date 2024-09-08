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
 
 
public class DriverInformation implements ActionListener
{
    JFrame frame = new JFrame("Driver Information");
 
    JLabel AllDriverInfoLabel = new JLabel("All Driver Information");
 
   
    JButton BackButton = new JButton("Back");
    JButton LogOutButton = new JButton("Log Out");
    JButton DeleteUserButton = new JButton("Delete Customer Information");
 
 
    JTable table = new JTable();
 
    DefaultTableModel model = new DefaultTableModel();
   
    JScrollPane scroll = new JScrollPane(table);
 
    private String[] column = { "Driver Name", "Number", "Password", "Nid", "LicenseNumber",
     "Experince", "Type", "Rate","Security Question","Answer","Status","Location","Rented By","Gender"};
    private String[] rows = new String[100];
 
    public DriverInformation()
    {
        AllDriverInfoLabel.setBounds(450, 70, 500, 40);
        AllDriverInfoLabel.setForeground(Color.black);
        AllDriverInfoLabel.setFont(new Font("Segoe UI", Font.BOLD, 40));
 
        BackButton.setBounds(30,20,100,30);
        BackButton.setForeground(Color.black);
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
        LogOutButton.setForeground(Color.black);
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
        DeleteUserButton.setBackground(Color.black);
        DeleteUserButton.setFocusPainted(false);
         DeleteUserButton.setForeground(Color.white);
        model.setColumnIdentifiers(column);
 // private String[] column = { "Driver Name", "Number", "Password", "Nid", "LicenseNumber",
 //    "Experince", "Type", "Rate","Security Question","Answer","Status","Location","Rented By","Gender"};
 
        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(180);
        table.getColumnModel().getColumn(1).setPreferredWidth(192);
        table.getColumnModel().getColumn(2).setPreferredWidth(180);
        table.getColumnModel().getColumn(3).setPreferredWidth(180);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);
        table.getColumnModel().getColumn(5).setPreferredWidth(200);
        table.getColumnModel().getColumn(6).setPreferredWidth(180);
        table.getColumnModel().getColumn(7).setPreferredWidth(180);
        table.getColumnModel().getColumn(8).setPreferredWidth(250);
        table.getColumnModel().getColumn(9).setPreferredWidth(180);
        table.getColumnModel().getColumn(10).setPreferredWidth(180);
        table.getColumnModel().getColumn(11).setPreferredWidth(180);
        table.getColumnModel().getColumn(12).setPreferredWidth(180);
        table.getColumnModel().getColumn(13).setPreferredWidth(180);
   
 
        scroll.setBounds(15, 150, 1315, 500);
        scroll.setBackground(Color.cyan);
 
        DefaultTableCellRenderer centerRenderer=new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);
 
 
        String file = "data\\DriverInfo.txt";
   
 
        try {
 
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();
         //    
            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                // private String[] column = { "Driver Name", "Number", "Password", "Nid", "LicenseNumber",
 //    "Experince", "Type", "Rate","Security Question","Answer","Status","Location","Rented By","Gender"};
 
                String x = line.substring(0, 4);
                if (x.equals("Name")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(6); //Driver Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(8); // Number
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(10); // Password
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(5); // Nid
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(15); // LicenseNumber
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(11); // Experince
                    rows[6] = Files.readAllLines(Paths.get(file)).get((i + 6)).substring(6); // Type
                    rows[7] = Files.readAllLines(Paths.get(file)).get((i + 7)).substring(6); // Rate
                    rows[8] = Files.readAllLines(Paths.get(file)).get((i + 8)).substring(19); // Security Question
                    rows[9] = Files.readAllLines(Paths.get(file)).get((i + 9)).substring(8); //Answer
                    rows[10] = Files.readAllLines(Paths.get(file)).get((i + 10)).substring(8); //Status
                    rows[11] = Files.readAllLines(Paths.get(file)).get((i + 11)).substring(10); //location
                    rows[12] = Files.readAllLines(Paths.get(file)).get((i + 12)).substring(11); //Rented By
                    rows[13] = Files.readAllLines(Paths.get(file)).get((i + 13)).substring(8); //Gender
 
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
 
 
        frame.add(AllDriverInfoLabel);
        frame.add(BackButton);
        frame.add(LogOutButton);
        frame.add(DeleteUserButton);
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
 
    // public static void main(String args[])
    //  {
    //      DriverInformation a = new DriverInformation();
    //   }
 
}