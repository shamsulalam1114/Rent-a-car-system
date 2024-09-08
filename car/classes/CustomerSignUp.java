package classes;
import interfage.*;
import data.*;
import images.*;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
public class CustomerSignUp extends NameException implements ActionListener {
    ImageIcon image=new ImageIcon("images\\customersignup.jpg");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);
   
   
    JFrame frame = new JFrame("Customer Sign Up");
    JPanel panel1 = new JPanel();
    JLabel text1=new JLabel("       Customer");
    JLabel nameLabel = new JLabel("   Name :");
    JLabel emailLabel = new JLabel("   Email :");
    JLabel passwordLabel = new JLabel("   Password :");
    JLabel confirmpasswordLabel = new JLabel("   Confirm Password :");
    JLabel phoneLabel = new JLabel("   Phone :");
    JLabel nidLabel = new JLabel("    Nid :");
    JLabel securityLabel = new JLabel("   Security Questions :");
    JLabel answerLabel = new JLabel("   Write Your Answer  :");
    JLabel captchaLabel = new JLabel("   Captcha :");
    JLabel customerLabel = new JLabel("  CUSTOMER ");

    JRadioButton MaleButton=new JRadioButton("Male");
    JRadioButton FemaleButton=new JRadioButton("Female");

    ButtonGroup GenderButtonGroup=new ButtonGroup();

    JTextField nameTextField=new JTextField();
    JTextField emailTextField=new JTextField();
    JTextField answerTextField=new JTextField();

    JPasswordField passPasswordField=new JPasswordField();
    JPasswordField confirmPassField=new JPasswordField();

    JTextField phoneTextField = new JTextField();
    JTextField nidTextField = new JTextField();
    JTextField answer2TextField=new JTextField();

    JButton SignUpButton=new JButton("Sign Up");
    JButton BackButton=new JButton("Back");
    int flag=0;
 
    JDialog Dialog = new JDialog();
 
   Font basic=new Font("Arial",Font.PLAIN,16);
    String[] SecurityQuestions = {
        "What is the name of your first pet?",
        "In which city were you born?",
        "What is your favorite book?",
        "What is your mother's maiden name?",
        "What is the model of your first car?"
    };
    JComboBox <String> QuestionsComboBox;
 
    CustomerSignUp()
    {

        imageLabel.setBounds(00,30,700,700);
        label.setBounds(0,10,100,100);
        label.add(imageLabel);

        text1.setBounds(890,30,200,50);
        text1.setForeground(Color.black);
        text1.setBackground(new Color(92,218,194));
        text1.setFont(new Font("Arial",Font.BOLD , 24));
        text1.setOpaque(true);
       

 
        nameLabel.setBounds(100,55,60,20);
        nameLabel.setBackground(Color.white);
        nameLabel.setLayout(null);
        nameLabel.setOpaque(true);
 
         nameTextField.setBounds(170,55,220,20);
         nameTextField.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
         nameTextField.setFont(basic);
         nameTextField.setForeground(Color.black);
         nameTextField.setOpaque(true);
 
        emailLabel.setBounds(100,95,60,20);
        emailLabel.setBackground(Color.white);
        emailLabel.setOpaque(true);
        emailLabel.setLayout(null);
 
 
         emailTextField.setBounds(170,95,220,20);
         emailTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
         emailTextField.setFont(basic);
         emailTextField.setForeground(Color.black);
         emailTextField.setOpaque(true);
 
 
 
        passwordLabel.setBounds(100,135,80,20);
        passwordLabel.setBackground(Color.white);
        passwordLabel.setLayout(null);
        passwordLabel.setOpaque(true);
 
         passPasswordField.setBounds(200,135,220,20);
         passPasswordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
         passPasswordField.setFont(basic);
         passPasswordField.setForeground(Color.black);
         passPasswordField.setOpaque(true);
 
   
        confirmpasswordLabel.setBounds(100,175,130,20);
        confirmpasswordLabel.setBackground(Color.white);
        confirmpasswordLabel.setLayout(null);
        confirmpasswordLabel.setOpaque(true);
 
         confirmPassField.setBounds(240,175,220,20);
         confirmPassField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
         confirmPassField.setFont(basic);
         confirmPassField.setForeground(Color.black);
         confirmPassField.setOpaque(true);

        phoneLabel.setBounds(100,215,60,20);
        phoneLabel.setBackground(Color.white);
        phoneLabel.setLayout(null);
        phoneLabel.setOpaque(true);
 
        phoneTextField.setBounds(170,215,220,20);
        phoneTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
        phoneTextField.setFont(basic);
        phoneTextField.setForeground(Color.black);
        phoneTextField.setOpaque(true);
 

        nidLabel.setBounds(100,255,60,20);
        nidLabel.setBackground(Color.white);
        nidLabel.setLayout(null);
        nidLabel.setOpaque(true);
 
        nidTextField.setBounds(170,255,220,20);
        nidTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
        nidTextField.setFont(basic);
        nidTextField.setForeground(Color.black);
        nidTextField.setOpaque(true);
 
        securityLabel.setBounds(100,290,130,20);
        securityLabel.setBackground(Color.white);
        securityLabel.setLayout(null);
        securityLabel.setOpaque(true);
 
 
        QuestionsComboBox=new JComboBox<>(SecurityQuestions);
        QuestionsComboBox.setBounds(250,290,300,20);
        QuestionsComboBox.setBackground(Color.white);
        QuestionsComboBox.setOpaque(true);
 
        answerLabel.setBounds(100,335,130,20);
        answerLabel.setBackground(Color.white);
        answerLabel.setLayout(null);
        answerLabel.setOpaque(true);
 
         answerTextField.setBounds(240,335,220,20);
         answerTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
         answerTextField.setFont(basic);
         answerTextField.setForeground(Color.black);
         answerTextField.setOpaque(true);
       
       
        captchaLabel.setBounds(100,375,70,20);
        captchaLabel.setBackground(Color.white);
        captchaLabel.setLayout(null);
        captchaLabel.setOpaque(true);
 
         answer2TextField.setBounds(180,375,300,20);
         answer2TextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
         answer2TextField.setFont(basic);
         answer2TextField.setForeground(Color.black);
         answer2TextField.setOpaque(true);
 
 
        MaleButton.setBounds(250,430,70,20);
        MaleButton.setFocusable(false);
        MaleButton.addActionListener(this);
        MaleButton.setBackground(Color.white);

        FemaleButton.setBounds(350,430,70,20);
        FemaleButton.setFocusable(false);
        FemaleButton.addActionListener(this);
        FemaleButton.setBackground(Color.white);
 
        SignUpButton.setBounds(1095,660 ,150,30);
        SignUpButton.setForeground(Color.black);
        SignUpButton.setFont(new Font("Arial",Font.BOLD,20));
        SignUpButton.setFocusable(false);
        SignUpButton.setBorderPainted(true);
        SignUpButton.setContentAreaFilled(false);
        SignUpButton.setFocusPainted(false);
        SignUpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SignUpButton.setOpaque(true);
        SignUpButton.setForeground(Color.black);
        SignUpButton.setBackground(new Color(92,218,194));
        SignUpButton.addActionListener(this);
 
         BackButton.setBounds(80,0  ,150,30);
         BackButton.setForeground(Color.black);
         BackButton.setFont(new Font("Arial",Font.BOLD,20));
         BackButton.setFocusable(false);
         BackButton.setBorderPainted(true);
         BackButton.setContentAreaFilled(false);
         BackButton.setFocusPainted(false);
         BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
         BackButton.setOpaque(true);
         BackButton.setForeground(Color.black);
         BackButton.setBackground(new Color(92,218,194));
         BackButton.addActionListener(this);
 
 
        frame.add(imageLabel);
        frame.add(label);
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.add(panel1);
        frame.add(text1);
        frame.add(SignUpButton);
        frame.add(BackButton);

        panel1.setBounds(700,120,600,510);
        panel1.setBackground(new Color(92,218,194));
        panel1.setLayout(null);
       
        panel1.add(nameLabel);
        panel1.add(emailLabel);
        panel1.add(passwordLabel);
        panel1.add(confirmpasswordLabel);
        panel1.add(phoneLabel);
        panel1.add(nidLabel);
        panel1.add(securityLabel);
        panel1.add(QuestionsComboBox);
        panel1.add(answerLabel);
        panel1.add(captchaLabel);

        panel1.add(MaleButton);
        panel1.add(FemaleButton);

        panel1.add(nameTextField);
        panel1.add(emailTextField);
        panel1.add(passPasswordField);
        panel1.add(confirmPassField);
        panel1.add(phoneTextField);
        panel1.add(nidTextField);
        panel1.add(answerTextField);
        panel1.add(answer2TextField);
       
       // panel1.add(SignUpButton);
 
        GenderButtonGroup.add(MaleButton);
        GenderButtonGroup.add(FemaleButton);
 
 
    }
    public void SignUp(){
         char[] passwordChars = passPasswordField.getPassword();
        String password = new String(passwordChars);
        char[] ConfirmpasswordChars = confirmPassField.getPassword();
        String Confirmpassword = new String(ConfirmpasswordChars);
        String Question=(String)QuestionsComboBox.getSelectedItem();
        if(!nameTextField.getText().isEmpty() && !emailTextField.getText().isEmpty() && !password.isEmpty() && !Confirmpassword.isEmpty() && !Question.isEmpty()
         && !answer2TextField.getText().isEmpty() && !phoneTextField.getText().isEmpty() && !nidTextField.getText().isEmpty()){
            if(password.equals(Confirmpassword)){
      try {
                FileWriter f1=new FileWriter("data\\CustomerInfo.txt",true);
                f1.write("Name :"+nameTextField.getText()+"\n"+"Email :"+emailTextField.getText()+"\n"+"Password :"+password+"\n"
                +"Phone :"+ phoneTextField.getText()+"\n" +"Nid :"+ nidTextField.getText()+"\n"+"Security Question :"+Question+"\n" + "Answer :"+answerTextField.getText()+"\n");
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
            if(CustomerException(nameTextField.getText())){
           SignUp();
            }
  
    }
 
 
    }

    public static void main(String args[])
     {
     CustomerSignUp a = new CustomerSignUp();
     }
}
 