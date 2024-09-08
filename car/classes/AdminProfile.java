package classes;
import interfage.*;
import data.*;
import images.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.awt.Cursor;
 
public class AdminProfile implements ActionListener
{

ImageIcon image=new ImageIcon("images\\adminprofile1.png");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);


    JFrame frame = new JFrame("Admin Profile");
   
    JButton AdminInformationButton = new JButton("Admin Information");
    JButton UserInformationButton = new JButton("User Information");
    JButton DriverInformationButton = new JButton("Driver Information");
    JButton CarInformationButton = new JButton("Car Information");
    JButton OwnerInformationButton = new JButton("Owner Information");
    JButton AddAdminButton = new JButton("Add Admin");
     JButton LogOutButton = new JButton("Log Out");
 
    JDialog Dialog = new JDialog();
    Font basic=new Font("Arial",Font.PLAIN,16);
 
    AdminProfile()
    {
        //this.UserName=Id;

        imageLabel.setBounds(0, 0,1300,768);
      label.setBounds(0,0,1300,1000);
      label.add(imageLabel);

        AdminInformationButton.setBounds(110,300,250,30);
        AdminInformationButton.setForeground(Color.black);
        AdminInformationButton.setFont(new Font("Arial",Font.BOLD,15));
        AdminInformationButton.setFocusable(false);
        AdminInformationButton.setBorderPainted(true);
        AdminInformationButton.setContentAreaFilled(false);
        AdminInformationButton.setFocusPainted(false);
        AdminInformationButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        AdminInformationButton.setOpaque(true);
        AdminInformationButton.setForeground(Color.black);
        AdminInformationButton.setBackground(Color.white);
        AdminInformationButton.addActionListener(this);
 
       
        UserInformationButton.setBounds(555,300,250,30);
        UserInformationButton.setForeground(Color.black);
        UserInformationButton.setFont(new Font("Arial",Font.BOLD,15));
        UserInformationButton.setFocusable(false);
        UserInformationButton.setBorderPainted(true);
        UserInformationButton.setContentAreaFilled(false);
        UserInformationButton.setFocusPainted(false);
        UserInformationButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        UserInformationButton.setOpaque(true);
        UserInformationButton.setForeground(Color.black);
        UserInformationButton.setBackground(Color.white);
        UserInformationButton.addActionListener(this);
 
 
       
        DriverInformationButton.setBounds(900,300,250,30);
        DriverInformationButton.setForeground(Color.black);
        DriverInformationButton.setFont(new Font("Arial",Font.BOLD,15));
        DriverInformationButton.setFocusable(false);
        DriverInformationButton.setBorderPainted(true);
        DriverInformationButton.setContentAreaFilled(false);
        DriverInformationButton.setFocusPainted(false);
        DriverInformationButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        DriverInformationButton.setOpaque(true);
        DriverInformationButton.setForeground(Color.black);
        DriverInformationButton.setBackground(Color.white);
        DriverInformationButton.addActionListener(this);
 
       
        CarInformationButton.setBounds(130,600,250,30);
        CarInformationButton.setForeground(Color.black);
        CarInformationButton.setFont(new Font("Arial",Font.BOLD,15));
        CarInformationButton.setFocusable(false);
        CarInformationButton.setBorderPainted(true);
        CarInformationButton.setContentAreaFilled(false);
        CarInformationButton.setFocusPainted(false);
        CarInformationButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        CarInformationButton.setOpaque(true);
        CarInformationButton.setForeground(Color.black);
        CarInformationButton.setBackground(Color.white);
        CarInformationButton.addActionListener(this);

 
       
        OwnerInformationButton.setBounds(555,600,250,30);
        OwnerInformationButton.setForeground(Color.black);
        OwnerInformationButton.setFont(new Font("Arial",Font.BOLD,15));
        OwnerInformationButton.setFocusable(false);
        OwnerInformationButton.setBorderPainted(true);
        OwnerInformationButton.setContentAreaFilled(false);
        OwnerInformationButton.setFocusPainted(false);
        OwnerInformationButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        OwnerInformationButton.setOpaque(true);
        OwnerInformationButton.setForeground(Color.BLACK);
        OwnerInformationButton.setBackground(Color.white);
        OwnerInformationButton.addActionListener(this);
       
        AddAdminButton.setBounds(900,600,250,30);
        AddAdminButton.setForeground(Color.black);
        AddAdminButton.setFont(new Font("Arial",Font.BOLD,15));
        AddAdminButton.setFocusable(false);
        AddAdminButton.setBorderPainted(true);
        AddAdminButton.setContentAreaFilled(false);
        AddAdminButton.setFocusPainted(false);
        AddAdminButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        AddAdminButton.setOpaque(true);
        AddAdminButton.setForeground(Color.black);
        AddAdminButton.setBackground(Color.white);
        AddAdminButton.addActionListener(this);
 
 
        LogOutButton.setBounds(1230,20,100,30);
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
 
 
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
 
       
        frame.add(AdminInformationButton);
        frame.add(UserInformationButton);
        frame.add(DriverInformationButton);
        frame.add(CarInformationButton);
        frame.add(OwnerInformationButton);
        frame.add(AddAdminButton);
        frame.add(LogOutButton);
        frame.add(label);
        frame.add(imageLabel);
        
       }
   
   
   
      @Override
      public void actionPerformed(ActionEvent e) {
   
           if(e.getSource()==LogOutButton){
            frame.dispose();
            new LoginPage();
           }
            if(e.getSource()==OwnerInformationButton){
            frame.dispose();
            new OwnerInformation();
           }
           if(e.getSource()==AdminInformationButton){
            frame.dispose();
            new AdminInformation();
           }
            if(e.getSource()==UserInformationButton){
            frame.dispose();
            new CustomerInformation();
           }
 
            if(e.getSource()==CarInformationButton)
            {
                frame.dispose();
              new CarInformationDashboard();
            }
             if(e.getSource()==AddAdminButton)
            {
                frame.dispose();
              new AddAdmin();
            }
          if(e.getSource()==DriverInformationButton)
            {
                frame.dispose();
              new DriverInformation();
            }
           
 
    }
 
    //public static void main(String args[])
    //{
    //    AdminProfile a = new AdminProfile();
    //}
}