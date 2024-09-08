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
import java.io.FileWriter;
import java.io.IOException;
 
public class AddAdmin extends NameException implements ActionListener{
 
    int flag=0;
 
    JFrame frame=new JFrame(" Add Admin page");
    JPanel panel1=new JPanel();
    JLabel idLabel=new JLabel("Admin ID");
    JLabel passLabel=new JLabel("Password");
    JLabel ConfirmPassWordLabel = new JLabel("Confirm Password");
 
 
   JTextField IdTextField=new JTextField();
   JPasswordField passPasswordField=new JPasswordField();
   JPasswordField ConfirmPasswordField=new JPasswordField();
 
   JButton LoginButton=new JButton("Login");
   JButton BackButton=new JButton( "Back");
   JButton EyeButton=new JButton();
   JButton ForgetButton=new JButton("Forget Password?");
   //JButton SignUpButton=new JButton("Sign Up");
   JButton AddAdminButton=new JButton("Add Admin");
 
   JDialog Dialog = new JDialog();
 
   Font basic=new Font("Arial",Font.PLAIN,16);
   
 
 
 
    AddAdmin(){
 
        idLabel.setBounds(500,125,100,50);
        idLabel.setForeground(Color.YELLOW);
        idLabel.setFont(new Font("Arial",Font.BOLD,20));
 
        IdTextField.setBounds(500,170,400,30);
        IdTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        IdTextField.setFont(basic);
        IdTextField.setForeground(Color.white);
        IdTextField.setOpaque(false);
 
        passLabel.setBounds(500,210,100,50);
        passLabel.setForeground(Color.YELLOW);
        passLabel.setFont(new Font("Arial",Font.BOLD,20));
       
       
 
        passPasswordField.setBounds(500,270,400,30);
        passPasswordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        passPasswordField.setFont(basic);
        passPasswordField.setForeground(Color.white);
        passPasswordField.setOpaque(false);

         ConfirmPassWordLabel.setBounds(500,310,200,50);
        ConfirmPassWordLabel.setForeground(Color.YELLOW);
        ConfirmPassWordLabel.setFont(new Font("Arial",Font.BOLD,20));
       
        ConfirmPasswordField.setBounds(500,370,400,30);
        ConfirmPasswordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        ConfirmPasswordField.setFont(basic);
        ConfirmPasswordField.setForeground(Color.white);
        ConfirmPasswordField.setOpaque(false);
 
        AddAdminButton.setBounds(600,420,150,40);
        AddAdminButton.setBackground(Color.white);
        AddAdminButton.setForeground(Color.black);
        AddAdminButton.setFont(new Font("Arial",Font.BOLD,20));
        AddAdminButton.setFocusable(false);
        AddAdminButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        AddAdminButton.addActionListener(this);
       
        ForgetButton.setBounds(470,470,400,25);
        ForgetButton.setForeground(Color.white);
        ForgetButton.setFont(new Font("Arial",Font.BOLD,25));
        ForgetButton.setFocusable(false);
        ForgetButton.setBorderPainted(false);
        ForgetButton.setContentAreaFilled(false);
        ForgetButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ForgetButton.addActionListener(this);
 
        BackButton.setBounds(60,10  ,150,30);
        BackButton.setForeground(Color.black);
        BackButton.setFont(new Font("Arial",Font.BOLD,20));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.setBackground(Color.white);
        BackButton.addActionListener(this);
 
 
        panel1.setBounds(0,0,1366,768);
        panel1.setBackground(Color.black);
        panel1.setLayout(null);
        panel1.add(idLabel);
        panel1.add(IdTextField);
        panel1.add(passLabel);
        panel1.add(passPasswordField);
        panel1.add(ConfirmPassWordLabel);
        panel1.add(ConfirmPasswordField);
        panel1.add(AddAdminButton);
        panel1.add(ForgetButton);
      //  panel1.add(text3);
      //  panel1.add(SignUpButton);
 panel1.add(BackButton);
 
 
       
        frame.add(panel1);
 
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
   
      }
 
       public void SignUp(){
         char[] passwordChars = passPasswordField.getPassword();
         String password = new String(passwordChars);
         char[] ConfirmpasswordChars = ConfirmPasswordField.getPassword();
         String Confirmpassword = new String(ConfirmpasswordChars);
        // String Question=(String)QuestionsComboBox.getSelectedItem();
         if(!IdTextField.getText().isEmpty() && !password.isEmpty() && !Confirmpassword.isEmpty())
         {
            if(password.equals(Confirmpassword)){
           try {
                FileWriter f1=new FileWriter("data\\AdminInfo.txt",true);
                f1.write("Admin Name :"+IdTextField.getText()+"\n"+"Admin Pass :"+password+"\n");
                f1.write("-----------------------------------------------------------"+"\n");
                f1.close();
                JOptionPane.showMessageDialog(null,"Admin Registration Successful",  "Message", JOptionPane.OK_CANCEL_OPTION);
                frame.dispose();
               // new LoginPage();
            } catch (IOException e1) {
         System.out.println("Error");
            }
       
    }
    else{
         JOptionPane.showMessageDialog(null,"Password do not match",  "Message", JOptionPane.ERROR_MESSAGE);
    }
}
else{
      JOptionPane.showMessageDialog(null,"Please Fill Up All The Fields Correctly",  "Message", JOptionPane.OK_CANCEL_OPTION);
}          
       
        }
   
   // int flag =0;
 
 
 
    public void actionPerformed(ActionEvent e){
    // if(e.getSource()==AdminButton){
    //   flag=1;
    // }
    if(e.getSource()==ForgetButton){
      if(flag>1){
       frame.dispose();
    new RecoveryPage(flag);
    }
    else{
      JOptionPane.showMessageDialog(null,"Invalid,Admin Password Can Not Be Reset" , "Message", JOptionPane.OK_CANCEL_OPTION);
   
    }
 
  }
    if(e.getSource()==BackButton)
              {
                    frame.dispose();
                  new AdminProfile();
                  
              }
   
      if(e.getSource()==AddAdminButton){
        if(AdminException(IdTextField.getText())){
       SignUp();
        }
       }
        }
 
//   public static void main (String arg[])
//   {
//     AddAdmin ad = new AddAdmin();
//   }
        }