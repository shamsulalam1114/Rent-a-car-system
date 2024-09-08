package classes;
import interfage.*;
import data.*;
import images.*;
import javax.naming.NameAlreadyBoundException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JDialog;
import java.awt.Cursor;

public class OwnerProfile implements ActionListener  {
    JFrame frame = new JFrame("Owner profile Page");

    JLabel text1 = new JLabel("             Owner profile");
    JLabel NameLabel = new JLabel("                 Owner Name :");
    JLabel NumberLabel = new JLabel("                Phone No :");
    JLabel GenderLabel = new JLabel("                   Gender :");
    JLabel emailLabel = new JLabel("                   Email :");
    

    JTextField NameTextField=new JTextField();
    JTextField NumberTextField = new JTextField();
    JTextField GenderTextField = new JTextField();
    JTextField emailTextField = new JTextField();

    JButton EditButton=new JButton("Edit");
    JButton AddcarButton = new JButton("Add Car For Rent");
   // JButton BackButton = new JButton("Back");
  //  JButton EditButton = new JButton("Edit");
    JButton SaveButton=new JButton("Save");
    JButton LogOutButton=new JButton("LogOut");
    JButton ActivityButton=new JButton("Activity");
         
    ImageIcon image=new ImageIcon("images\\ownerprofile.png");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);




    JDialog Dialog = new JDialog();
    Font basic = new Font("Arial", Font.PLAIN, 16);

   
    public OwnerProfile(String Id) {
        imageLabel.setBounds(00,200,1000,700);
        label.setBounds(0,10,100,100);
        label.add(imageLabel);
        

        text1.setBounds(630,150,340,60);
        text1.setBackground(Color.black);
        text1.setLayout(null);
        text1.setOpaque(true);
        text1.setForeground(Color.white);
        text1.setFont(new Font("Arial",Font.BOLD,22));

        NameLabel.setBounds(700, 300, 180, 30);
        NameLabel.setBackground(Color.black);
        NameLabel.setLayout(null);
        NameLabel.setOpaque(true);
        NameLabel.setForeground(Color.WHITE);

        NumberLabel.setBounds(700, 350, 180, 30);
        NumberLabel.setBackground(Color.black);
        NumberLabel.setLayout(null);
        NumberLabel.setOpaque(true);
        NumberLabel.setForeground(Color.WHITE);

        GenderLabel.setBounds(700, 450, 180, 30);
        GenderLabel.setBackground(Color.black);
        GenderLabel.setLayout(null);
        GenderLabel.setOpaque(true);
        GenderLabel.setForeground(Color.WHITE);

        emailLabel.setBounds(700, 400, 180, 30);
        emailLabel.setBackground(Color.black);
        emailLabel.setLayout(null);
        emailLabel.setOpaque(true);
        emailLabel.setForeground(Color.WHITE);

   
        NameTextField.setBounds(900, 300, 350, 30);
        NameTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        NameTextField.setFont(basic);
        NameTextField.setForeground(Color.black);
        NameTextField.setOpaque(false);
        NameTextField.setText(Id);
        NameTextField.setEditable(false);
        NameTextField.setEditable(false);

        NumberTextField.setBounds(900, 350, 350, 30);
        NumberTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        NumberTextField.setFont(basic);
        NumberTextField.setForeground(Color.black);
        NumberTextField.setOpaque(false);
        NumberTextField.setEditable(false);

        emailTextField.setBounds(900, 400, 350, 30);
        emailTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        emailTextField.setFont(basic);
        emailTextField.setForeground(Color.black);
        emailTextField.setOpaque(false);
        emailTextField.setEditable(false);

       GenderTextField.setBounds(900, 450, 350, 30);
       GenderTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
       GenderTextField.setFont(basic);
       GenderTextField.setForeground(Color.black);
       GenderTextField.setOpaque(false);
       GenderTextField.setEditable(false);
       //GenderTextFieldld.setOpaque(false);

        ActivityButton.setBounds(1000,10,150,30);
        ActivityButton.setBackground(Color.black);
        ActivityButton.setLayout(null);
        ActivityButton.setOpaque(true);
        ActivityButton.setForeground(Color.WHITE);
        ActivityButton.setFont(new Font("Arial", Font.BOLD, 18));
        ActivityButton.addActionListener(this);
        ActivityButton.setFocusable(false);

        EditButton.setBounds(870,650,150, 40);
       
        EditButton.setFont(new Font("Arial",Font.BOLD,15));
        EditButton.setFocusable(false);
        EditButton.setBorderPainted(true);
        EditButton.setContentAreaFilled(false);
        EditButton.setFocusPainted(false);
        EditButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        EditButton.setOpaque(true);
        EditButton.setForeground(Color.white);
        EditButton.setBackground(Color.black);
        EditButton.addActionListener(this);


        SaveButton.setBounds(870, 650, 150, 40);
        
        SaveButton.setFont(new Font("Arial", Font.BOLD, 16));
        SaveButton.setFocusable(false);
        SaveButton.setBorderPainted(true);
        SaveButton.setContentAreaFilled(false);
        SaveButton.setFocusPainted(false);
        SaveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SaveButton.setOpaque(true);
        SaveButton.setForeground(Color.white);
        SaveButton.setBackground(Color.black);
        SaveButton.setVisible(false);
        SaveButton.addActionListener(this);

        AddcarButton.setBounds(1100, 650, 200, 40);
        AddcarButton.setFont(new Font("Arial", Font.BOLD, 16));
        AddcarButton.setFocusable(false);
        AddcarButton.setBorderPainted(true);
        AddcarButton.setContentAreaFilled(false);
        AddcarButton.setFocusPainted(false);
        AddcarButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        AddcarButton.setOpaque(true);
        AddcarButton.setForeground(Color.white);
        AddcarButton.setBackground(Color.black);
        AddcarButton.addActionListener(this);


        LogOutButton.setBounds(1200, 10, 150, 30);
        LogOutButton.setFont(new Font("Arial", Font.BOLD, 16));
        LogOutButton.setFocusable(false);
        LogOutButton.setBorderPainted(true);
        LogOutButton.setContentAreaFilled(false);
        LogOutButton.setFocusPainted(false);
        LogOutButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        LogOutButton.setOpaque(true);
        LogOutButton.setForeground(Color.white);
        LogOutButton.setBackground(Color.black);
        LogOutButton.addActionListener(this);

       

        
        frame.add(imageLabel);
        frame.add(label);
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(1366, 768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        frame.add(text1);
        frame.add(NameLabel);
        frame.add(NumberLabel);
        frame.add(GenderLabel);
        frame.add(emailLabel);
       
        frame.add(ActivityButton);
        frame.add(NameTextField);
        frame.add(NumberTextField);
        frame.add(NameTextField);
        frame.add(GenderTextField);
        frame.add(emailTextField);
        frame.add(AddcarButton);
       frame.add(EditButton);
        frame.add(LogOutButton);
        frame.add(SaveButton);

       try (BufferedReader br = new BufferedReader(new FileReader("data\\OwnerInfo.txt"))){
       
         String line;
       System.out.println("inside try");
            StringBuilder userInfoBuilder = new StringBuilder();
 
            while ((line = br.readLine()) != null) {
                System.out.println("Inside while loop");
             
                if (line.replace("-", "").isEmpty()) {
                    System.out.println("inside line if");
                    String[] userInfo = userInfoBuilder.toString().split("\n");
 
                    // Process the userInfo array
                    if (userInfo.length >= 7) {
                        System.out.println("inside userinfo length");
                        String storedUsername = userInfo[0].split(":")[1].trim();
                        String StoredNumber = userInfo[3].split(":")[1].trim();
                        String StoredEmail = userInfo[1].split(":")[1].trim();
                        String StoredGender = userInfo[6].split(":")[1].trim();
 
                        if (storedUsername.equals(Id) ) {
                            System.out.println("inside okay");
                           emailTextField.setText(StoredEmail);
                           NumberTextField.setText(StoredNumber);
                           GenderTextField.setText(StoredGender);
                    }
 
                    // Reset userInfoBuilder for the next user
                    userInfoBuilder = new StringBuilder();
                }} else {
                    userInfoBuilder.append(line).append("\n");
                    System.out.println("inside line else ");
                }    
 
            }
        }
         catch (IOException e) {
           System.out.println("FIle not found");
        }
     
    }
 
 
 
    @Override
   public void actionPerformed(ActionEvent e) {
       if (e.getSource() == LogOutButton) {
           frame.dispose();
           new LoginPage();
       }
       
        if(e.getSource()==AddcarButton){
            frame.dispose();
            new AddCar(NameTextField.getText());
        }
        if(e.getSource()==ActivityButton){
            frame.dispose();
            new OwnerActivity(NameTextField.getText());
        }
 
        if (e.getSource() == EditButton) {
            EditButton.setVisible(false);
            SaveButton.setVisible(true);
              NumberTextField.setEditable(true);
              emailTextField.setEditable(true);
          }
       
        if(e.getSource()==SaveButton){                
        try {
 
        new OwnerInfoUpdate(NameTextField.getText(), NumberTextField.getText(), emailTextField.getText());
           
        JOptionPane.showMessageDialog(null,"Info Updated" , "Message", JOptionPane.OK_CANCEL_OPTION);
                } catch (IOException e1) {
                  JOptionPane.showMessageDialog(null,"Could Not Save" , "Message", JOptionPane.ERROR_MESSAGE);
                }
                System.out.println("saved successfully");
              }
 
   }
 
    // public static void main(String args[])
    // {
    // CustomerSignUp a = new CustomerSignUp();
    // }
 
//}
 
 
}
 