package classes;
import interfage.*;
import data.*;
import images.*;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
public class OwnerSignUp extends NameException implements ActionListener{
    JFrame frame = new JFrame("Customer Sign Up");
 
   
    ImageIcon image=new ImageIcon("images\\ownersignup.png");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);

    JLabel text1=new JLabel("            OWNER");
    JLabel nameLabel = new JLabel("   Name :");
    JLabel emailLabel = new JLabel("   Email :");
    JLabel numberLabel=new JLabel("  Phone No :");
    JLabel passwordLabel = new JLabel("   Password :");
    JLabel confirmpasswordLabel = new JLabel("   Confirm Password :");
    JLabel securityLabel = new JLabel("   Security Questions :");
    JLabel answerLabel = new JLabel("   Write Your Answer  :");
    JLabel captchaLabel = new JLabel("                        Captcha :");
    JLabel customerLabel = new JLabel("  CUSTOMER ");
    JButton BackButton=new JButton("Back");
    JButton SignUpButton=new JButton("Sign Up");
    JRadioButton MaleButton=new JRadioButton("Male");
    JRadioButton FemaleButton=new JRadioButton("Female");
    ButtonGroup GenderButtonGroup=new ButtonGroup();
    JTextField nameTextField=new JTextField();
    JTextField emailTextField=new JTextField();
    JTextField NumberTextField=new JTextField();
    JTextField answerTextField=new JTextField();
    JTextField captchaTextField=new JTextField();
    JPasswordField passPasswordField=new JPasswordField();
    JPasswordField confirmPassField=new JPasswordField();
   
   
 

    String[] SecurityQuestions = {
        "What is the name of your first pet?",
        "In which city were you born?",
        "What is your favorite book?",
        "What is your mother's maiden name?",
        "What is the model of your first car?"
    };
    JComboBox <String> QuestionsComboBox;
 
    OwnerSignUp()
    { 
        imageLabel.setBounds(0,300,800,400);

        label.setBounds(0,0,800,800);
        label.add(imageLabel);
 

        text1.setBounds(1000,10,180,50);
        text1.setBackground(new Color(0,0,112));
        text1.setLayout(null);
        text1.setOpaque(true);
        text1.setForeground(Color.white);
        text1.setFont(new Font("Arial",Font.BOLD,18));
       
       
        nameLabel.setBounds(700,75,180,30);
        nameLabel.setBackground(new Color(0,0,112));
        nameLabel.setLayout(null);
        nameLabel.setOpaque(true);
        nameLabel.setForeground(Color.white);
        nameLabel.setFont(new Font("Arial",Font.BOLD,12));
 
        nameTextField.setBounds(900,75,400,30);
        nameTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01,(new Color(0,0,112))));
        nameTextField.setFont(new Font("Arial",Font.PLAIN,16));
        nameTextField.setForeground(Color.black);
        nameTextField.setOpaque(false);
 
        emailLabel.setBounds(700,120,180,30);
        emailLabel.setBackground(new Color(0,0,112));
        emailLabel.setLayout(null);
        emailLabel.setOpaque(true);
        emailLabel.setForeground(Color.white);
        emailLabel.setFont(new Font("Arial",Font.BOLD,12));

        emailTextField.setBounds(900,120,400,30);
        emailTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, (new Color(0,0,112))));
        nameTextField.setFont(new Font("Arial",Font.PLAIN,12));
        emailTextField.setForeground(Color.black);
        emailTextField.setOpaque(false);
       
 
        numberLabel.setBounds(700,165,180,30);
        numberLabel.setBackground(new Color(0,0,112));
        numberLabel.setLayout(null);
        numberLabel.setOpaque(true);
        numberLabel.setForeground(Color.white);
        numberLabel.setFont(new Font("Arial",Font.BOLD,12));

        NumberTextField.setBounds(900,165,400,30);
        NumberTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        NumberTextField.setFont(new Font("Arial",Font.PLAIN,12));
        NumberTextField.setForeground(Color.black);
        NumberTextField.setOpaque(false);
       
 
        passwordLabel.setBounds(700,210,180,30);
        passwordLabel.setBackground(new Color(0,0,112));
        passwordLabel.setLayout(null);
        passwordLabel.setOpaque(true);
        passwordLabel.setForeground(Color.white);
        passwordLabel.setFont(new Font("Arial",Font.BOLD,12));
 
        passPasswordField.setBounds(900,210,400,30);
        passPasswordField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        passPasswordField.setFont(new Font("Arial",Font.PLAIN,12));
        passPasswordField.setForeground(Color.black);
        passPasswordField.setOpaque(false);
 
        confirmpasswordLabel.setBounds(700,255,180,30);
        confirmpasswordLabel.setBackground(new Color(0,0,112));
        confirmpasswordLabel.setLayout(null);
        confirmpasswordLabel.setOpaque(true);
        confirmpasswordLabel.setForeground(Color.white);
        confirmpasswordLabel.setFont(new Font("Arial",Font.BOLD,12));
 
        confirmPassField.setBounds(900,255,400,30);
        confirmPassField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        confirmPassField.setFont(new Font("Arial",Font.PLAIN,12));
        confirmPassField.setForeground(Color.black);
        confirmPassField.setOpaque(false);
 
        securityLabel.setBounds(700,300,180,30);
        securityLabel.setBackground(new Color(0,0,112));
        securityLabel.setOpaque(true);
        securityLabel.setForeground(Color.white);
        securityLabel.setFont(new Font("Arial",Font.BOLD,12));

        QuestionsComboBox=new JComboBox<>(SecurityQuestions);
        QuestionsComboBox.setBounds(950,300,300,30);
        QuestionsComboBox.setBackground(Color.white);
        QuestionsComboBox.setOpaque(true);
 
        answerLabel.setBounds(700,345,180,30);
        answerLabel.setBackground(new Color(0,0,112));
        answerLabel.setLayout(null);
        answerLabel.setOpaque(true);
        answerLabel.setForeground(Color.white);
        answerLabel.setFont(new Font("Arial",Font.BOLD,12));

 
        answerTextField.setBounds(900,345,400,30);
        answerTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        answerTextField.setFont(new Font("Arial",Font.PLAIN,12));
        answerTextField.setForeground(Color.black);
        answerTextField.setOpaque(false);
       
        captchaLabel.setBounds(700,390,180,30);
        captchaLabel.setBackground(new Color(0,0,112));
        captchaLabel.setLayout(null);
        captchaLabel.setOpaque(true);
        captchaLabel.setForeground(Color.white);
        captchaLabel.setFont(new Font("Arial",Font.BOLD,12));
 
        captchaTextField.setBounds(900,390,400,30);
        captchaTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        captchaTextField.setFont(new Font("Arial",Font.PLAIN,12));
        captchaTextField.setForeground(Color.black);
        captchaTextField.setOpaque(false);
 
        MaleButton.setBounds(950,470,100,30);
        MaleButton.setFocusable(false);
        MaleButton.addActionListener(this);
        MaleButton.setBackground(new Color(0,0,112));
        MaleButton.setForeground(Color.white);
        
        FemaleButton.setBounds(1100,470,100,30);
        FemaleButton.setFocusable(false);
        FemaleButton.addActionListener(this);
        FemaleButton.setBackground(new Color(0,0,112));
        FemaleButton.setForeground(Color.white);


        BackButton.setBounds(70,20  ,100,30);
        BackButton.setForeground(Color.red);
        BackButton.setFont(new Font("Arial",Font.BOLD,20));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.addActionListener(this);
        BackButton.setBackground(new Color(0,0,112));
        BackButton.setForeground(Color.white);

        SignUpButton.setBounds(1095,660  ,150,30);
        SignUpButton.setForeground(Color.red);
        SignUpButton.setFont(new Font("Arial",Font.BOLD,20));
        SignUpButton.setFocusable(false);
        SignUpButton.setBorderPainted(true);
        SignUpButton.setContentAreaFilled(false);
        SignUpButton.setFocusPainted(false);
        SignUpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SignUpButton.setOpaque(true);
        SignUpButton.addActionListener(this);
        SignUpButton.setBackground(new Color(0,0,112));
        SignUpButton.setForeground(Color.white);

 
        frame.add(label);
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.add(text1);
        frame.add(nameLabel);
        frame.add(emailLabel);
        frame.add(numberLabel);
        frame.add(passwordLabel);
        frame.add(confirmpasswordLabel);
        frame.add(securityLabel);
        frame.add(QuestionsComboBox);
        frame.add(answerLabel);
        frame.add(captchaLabel);
        frame.add(MaleButton);
        frame.add(FemaleButton);
        frame.add(nameTextField);
        frame.add(passPasswordField);
        frame.add(confirmPassField);
        frame.add(captchaTextField);
        frame.add(answerTextField);
        frame.add(emailTextField);
        frame.add(NumberTextField);
        frame.add(BackButton);
        frame.add(SignUpButton);
       

        GenderButtonGroup.add(MaleButton);
        GenderButtonGroup.add(FemaleButton);

       
      
 
 
    }
    public void SignUp(){
        char[] passwordChars = passPasswordField.getPassword();
String password = new String(passwordChars);
char[] ConfirmpasswordChars = confirmPassField.getPassword();
String Confirmpassword = new String(ConfirmpasswordChars);
String Question=(String)QuestionsComboBox.getSelectedItem();
if(!nameTextField.getText().isEmpty() && !emailTextField.getText().isEmpty() && !password.isEmpty() && !Confirmpassword.isEmpty() &&!NumberTextField.getText().isEmpty()&& !Question.isEmpty()
 && !captchaTextField.getText().isEmpty()){
    if(password.equals(Confirmpassword)){
  try {
                FileWriter f1=new FileWriter("data\\OwnerInfo.txt",true);
                f1.write("Name :"+nameTextField.getText()+"\n"+"Email :"+emailTextField.getText()+"\n"+"Password :"+password+"\n"+"Phone Number :"+NumberTextField.getText()+"\n"
                +"Security Question :"+Question+"\n"+"Answer :"+answerTextField.getText()+"\n");
                if(flag==1){
                    f1.write("Gender :Male"+"\n");
                }
                else{
                    f1.write("Gender :Female"+"\n");
                }
               f1.write("-----------------------------------------------------------"+"\n");
                f1.close();
                JOptionPane.showMessageDialog(null,"Registration Successful",  "Message", JOptionPane.OK_CANCEL_OPTION);
                frame.dispose();
                new LoginPage();
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
    
    int flag =0;
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==BackButton){
            frame.dispose();
            new SignUpPage();
        }
         if(e.getSource()==MaleButton){
                    flag=1;
                }
         if(e.getSource()==FemaleButton){
                  flag=2;
                }
        if(e.getSource()==SignUpButton){
            if(OwnerNameException(nameTextField.getText())){
             SignUp();
            }
    }
   
}
    }