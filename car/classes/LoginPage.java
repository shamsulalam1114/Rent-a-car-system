package classes;
import interfage.*;
import data.*;
import images.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import javax.swing.ImageIcon;

public class LoginPage extends Login implements ActionListener{
 
    int flag=0;
 
    JFrame frame=new JFrame("Login page");
    JPanel panel1=new JPanel();
    JLabel idLabel=new JLabel("User ID");
    JLabel passLabel=new JLabel("Password");
    JLabel text1=new JLabel("Rent-A Car");
    JLabel text2=new JLabel("Your Perfect Journey Starts Here!");
    JLabel text3=new JLabel("Don't have any account?");
    

    ImageIcon image=new ImageIcon("images\\loginpage.png");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);

   

   JTextField IdTextField=new JTextField();
   JPasswordField passPasswordField=new JPasswordField();
 
   JButton LoginButton=new JButton("Login");
   JButton BackButton=new JButton();
   JButton EyeButton=new JButton();
   JButton ForgetButton=new JButton("Forget Password?");
   JButton SignUpButton=new JButton("Sign Up");
   JRadioButton AdminButton=new JRadioButton("Admin");
   JRadioButton CustomerButton=new JRadioButton("Customer");
   JRadioButton OwnerButton=new JRadioButton("Owner");
   JRadioButton DriverButton=new JRadioButton("Driver");
   ButtonGroup group1=new ButtonGroup();
 
   JDialog Dialog = new JDialog();
 
   Font basic=new Font("Arial",Font.PLAIN,16);
   
 
 
 
    LoginPage(){
     
      imageLabel.setBounds(0, 0,1300,768);
      label.setBounds(0,0,1300,1000);
      label.add(imageLabel);




        text1.setBounds(583,20,400,300);
        text1.setForeground(new Color(255,204,0));
        text1.setFont(new Font("Arial",Font.BOLD,40));
 
        text2.setBounds(500,80,400,300);
        text2.setForeground(Color.black);
        text2.setFont(new Font("Arial",Font.ITALIC,26));
 
 
        AdminButton.setBounds(500,280,100,50);
        AdminButton.setFont(new Font("Arial",Font.PLAIN,16));
        AdminButton.setForeground(Color.black);
        AdminButton.setFocusable(false);
        AdminButton.setBorderPainted(false);
        AdminButton.setContentAreaFilled(false);
        AdminButton.addActionListener(this);
 
        CustomerButton.setBounds(600,280,100,50);
        CustomerButton.setFont(new Font("Arial",Font.PLAIN,16));
        CustomerButton.setForeground(Color.black);
        CustomerButton.setFocusable(false);
        CustomerButton.setBorderPainted(false);
        CustomerButton.setContentAreaFilled(false);
        CustomerButton.addActionListener(this);
 
        OwnerButton.setBounds(720,280,100,50);
        OwnerButton.setFont(new Font("Arial",Font.PLAIN,16));
        OwnerButton.setForeground(Color.black);
        OwnerButton.setFocusable(false);
        OwnerButton.setBorderPainted(false);
        OwnerButton.setContentAreaFilled(false);
        OwnerButton.addActionListener(this);

        DriverButton.setBounds(820,280,100,50);
        DriverButton.setFont(basic);
        DriverButton.setForeground(Color.black);
        DriverButton.setFocusable(false);
        DriverButton.setBorderPainted(false);
        DriverButton.setContentAreaFilled(false);  
        DriverButton.addActionListener(this);
 
        idLabel.setBounds(500,335,100,50);
        idLabel.setForeground(Color.YELLOW);
        idLabel.setFont(new Font("Arial",Font.BOLD,20));
 
        IdTextField.setBounds(500,380,400,30);
        IdTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.yellow));
        IdTextField.setFont(basic);
        IdTextField.setForeground(Color.white);
        IdTextField.setOpaque(false);
 
        passLabel.setBounds(500,420,100,50);
        passLabel.setForeground(Color.YELLOW);
        passLabel.setFont(new Font("Arial",Font.BOLD,20));
 
        passPasswordField.setBounds(500,465,400,30);
        passPasswordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.yellow));
        passPasswordField.setFont(basic);
        passPasswordField.setForeground(Color.white);
        passPasswordField.setOpaque(false);    
 
        LoginButton.setBounds(615,520,150,40);
        LoginButton.setBackground(Color.white);
        LoginButton.setForeground(Color.black);
        LoginButton.setFont(new Font("Arial",Font.BOLD,20));
        LoginButton.setFocusable(false);
        LoginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        LoginButton.addActionListener(this);
       
        ForgetButton.setBounds(540,580,300,30);
        ForgetButton.setForeground(Color.white);
        ForgetButton.setFont(new Font("Arial",Font.BOLD,20));
        ForgetButton.setFocusable(false);
        ForgetButton.setBorderPainted(false);
        ForgetButton.setContentAreaFilled(false);
        ForgetButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ForgetButton.addActionListener(this);
 
       
        text3.setBounds(550,650,300,30);
        text3.setForeground(Color.ORANGE);
        text3.setFont(new Font("Arial",Font.BOLD,18));
 
       
        SignUpButton.setBounds(690,638  ,250,52);
        SignUpButton.setForeground(Color.white);
        SignUpButton.setFont(new Font("Arial",Font.BOLD,20));
        SignUpButton.setFocusable(false);
        SignUpButton.setBorderPainted(false);
        SignUpButton.setContentAreaFilled(false);
        SignUpButton.setFocusPainted(false);
        SignUpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SignUpButton.addActionListener(this);
 
 
        panel1.setBounds(0,0,1366,768);
        panel1.setBackground(Color.white);
        panel1.setLayout(null);
        panel1.add(text1);
        panel1.add(text2);
        panel1.add(AdminButton);
        panel1.add(CustomerButton);
        panel1.add(OwnerButton);
        panel1.add(DriverButton);
        panel1.add(idLabel);
        panel1.add(IdTextField);
        panel1.add(passLabel);
        panel1.add(passPasswordField);
        panel1.add(LoginButton);
        panel1.add(ForgetButton);
        panel1.add(text3);
        panel1.add(SignUpButton);
        panel1.add(label);
        panel1.add(imageLabel);
       
      
        
        group1.add(AdminButton);
        group1.add(CustomerButton);
        group1.add(OwnerButton);
        group1.add(DriverButton);
 
      
        frame.add(panel1);
        
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
   
}
public void actionPerformed(ActionEvent e){
  if(e.getSource()==AdminButton){
    flag=1;
  }
  if(e.getSource()==CustomerButton){
    flag=2;
  }
  if(e.getSource()==OwnerButton){
    flag=3;
  }if(e.getSource()==DriverButton){
    flag=4;
  }
  if(e.getSource()==ForgetButton){
    if(flag>1){
       frame.dispose();
    new RecoveryPage(flag);
    }
    else{
      JOptionPane.showMessageDialog(null,"Invalid,Admin Password Can Not Be Reset" , "Message", JOptionPane.OK_CANCEL_OPTION);
    
    }

  }
if(e.getSource()==SignUpButton){
  frame.dispose();
  new SignUpPage();
}
if(e.getSource()==LoginButton){
     char[] passwordChars = passPasswordField.getPassword();
String password = new String(passwordChars);
//  frame.dispose();
 switch (flag) {
  case 1:
 if(matchAdmin(IdTextField.getText().toString(), password)){
      System.out.println("Admin Login Successful");
      frame.dispose();
      new AdminProfile();
    }
    else{
      JOptionPane.showMessageDialog(null,"Invalid Id & Password",  "Message", JOptionPane.OK_CANCEL_OPTION);
    }
    break;
    case 2:
    if(matchCustomer(IdTextField.getText(), password)){
     // System.out.println("Customer Login Successful");
       frame.dispose();
       new CustomerDashboard(IdTextField.getText());
       
      
    }
    else{
      JOptionPane.showMessageDialog(null,"Invalid Id & Password",  "Message", JOptionPane.OK_CANCEL_OPTION);
    }
 
    break;
    case 3:
    if(matchOwner(IdTextField.getText(),password)){
      frame.dispose();
       new OwnerProfile(IdTextField.getText());
    }
    else{
      JOptionPane.showMessageDialog(null,"Invalid Id & Password",  "Message", JOptionPane.OK_CANCEL_OPTION);
    }
 
    break;
     case 4:
     if(matchDriver(IdTextField.getText(),password)){
         frame.dispose();
       new DriverProfile(IdTextField.getText());
    //  System.out.println("Drive Sign Up Successful");
    }
    else{
      JOptionPane.showMessageDialog(null,"Invalid Id & Password",  "Message", JOptionPane.OK_CANCEL_OPTION);
    }
 
     break;
  default:
   JOptionPane.showMessageDialog(null,"Please Choose the User Type",  "Message", JOptionPane.OK_CANCEL_OPTION);
  //  System.out.println(flag);
   break;
     
 
 }
}
}
}