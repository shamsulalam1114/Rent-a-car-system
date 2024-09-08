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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
 
import javax.swing.JDialog;
import java.awt.Cursor;
 
public class DriverSignUp extends NameException implements ActionListener{
 
//public class DriverSignUp implements ActionListener{


    
    JFrame frame=new JFrame("Driver Sign Up");
 
    JPanel panel = new JPanel();
    ImageIcon image=new ImageIcon("images\\driversignup.png");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);
    
    JLabel text1=new JLabel("            Driver");
    JLabel NameLabel=new JLabel("                    Name :")  ;
    JLabel NumberLabel=new JLabel("                   Phone No :");
    JLabel NidLabel=new JLabel("                    NID No :");
    JLabel LicenseLabel=new JLabel("                  License No :");
    JLabel LocationLabel=new JLabel("               Location :");
    JLabel ExperienceLabel=new JLabel("    Select Years Of Experience :");
    JLabel TypeLabel=new JLabel("          Prefered Vehicle Type :");
    JLabel RateLabel=new JLabel("           Enter Hourly Rate :");
    JLabel PassLabel=new JLabel("                   Password :");
    JLabel ConfirmLabel=new JLabel("            Confirm Password :");
    JLabel QusetionLabel=new JLabel("           Security Questions :");
    JLabel AnswerLabel=new JLabel("            Write Your Answer :");
    JLabel CaptchaLabel=new JLabel("                    Captcha :");
 
    JTextField NameTextField= new JTextField();
    JTextField NumberTextField= new JTextField();
    JTextField NidTextField= new JTextField();
    JTextField LicenseTextField= new JTextField();
   // JTextField ExperinceTextField= new JTextField();
   // JTextField TypeTextField= new JTextField();
    JTextField RateTextField= new JTextField();
 
    JPasswordField PassTextField=new JPasswordField();
    JPasswordField ConfirmTextField=new JPasswordField();
 
 
    JTextField AnswerTextField= new JTextField();
    JTextField CaptchaTextField= new JTextField();
 
    JButton SignUpButton = new JButton("Sign Up");
    JButton BackButton = new JButton("Back");
 
    JRadioButton MaleButton=new JRadioButton("Male");
    JRadioButton FemaleButton=new JRadioButton("Female");
    ButtonGroup GenderButtonGroup=new ButtonGroup();
 
    JDialog Dialog = new JDialog();
    Font basic=new Font("Arial",Font.PLAIN,16);
 
    int flag=0;
    String[] SecurityQuestions = {
        "What is the name of your first pet?",
        "In which city were you born?",
        "What is your favorite book?",
        "What is your mother's maiden name?",
        "What is the model of your first car?"
    };
    String[] Experience = {
        "6 Month",
        "1 Year",
        "2 Year",
        "3 Year",
        "4 Year"
    };
    String[] VehicleType = {
        "Seden",
        "Coupe",
        "Micro Car",
        "Sports car",
        "Minivan",
        "SUV"
    };
    String[] Location = {
        "Dhaka",
        "Chittagong",
        "Rajshahi",
        "Sylhet",
        "Khulna",
        "Barishal"
    };
   
    JComboBox <String> QuestionsComboBox;
    JComboBox <String> ExperienceComboBox;
    JComboBox <String> VehicleComboBox;
    JComboBox <String> LocationCombobox;
   
    public DriverSignUp(){
 
        imageLabel.setBounds(0,200,800,400);

        label.setBounds(0,0,800,800);
        label.add(imageLabel);
 
     
 
       
        text1.setBounds(1000,10,180,50);
        text1.setBackground(new Color(92,218,194));
        text1.setLayout(null);
        text1.setOpaque(true);
        text1.setForeground(Color.black);
        text1.setFont(new Font("Arial",Font.BOLD,18));
 
        NameLabel.setBounds(700,75,180,30);
        NameLabel.setBackground(new Color(92,218,194));
        NameLabel.setLayout(null);
        NameLabel.setOpaque(true);
        NameLabel.setForeground(Color.black);
        NameLabel.setFont(new Font("Arial",Font.BOLD,12));

        NumberLabel.setBounds(700,120,180,30);
        NumberLabel.setBackground(new Color(92,218,194));
        NumberLabel.setLayout(null);
        NumberLabel.setOpaque(true);
        NumberLabel.setForeground(Color.black);
        NumberLabel.setFont(new Font("Arial",Font.BOLD,12));


        NidLabel.setBounds(700,165,180,30);
        NidLabel.setBackground(new Color(92,218,194));
        NidLabel.setLayout(null);
        NidLabel.setOpaque(true);
        NidLabel.setForeground(Color.black);
        NidLabel.setFont(new Font("Arial",Font.BOLD,12));

        LicenseLabel.setBounds(700,210,180,30);
        LicenseLabel.setBackground(new Color(92,218,194));
        LicenseLabel.setLayout(null);
        LicenseLabel.setOpaque(true);
        LicenseLabel.setForeground(Color.black);
        LicenseLabel.setFont(new Font("Arial",Font.BOLD,12));
  
        LocationLabel.setBounds(700,255,180,30);
        LocationLabel.setBackground(new Color(92,218,194));
        LocationLabel.setLayout(null);
        LocationLabel.setOpaque(true);
        LocationLabel.setForeground(Color.black);
        LocationLabel.setFont(new Font("Arial",Font.BOLD,12));

 
        ExperienceLabel.setBounds(700,300,180,30);
        ExperienceLabel.setBackground(new Color(92,218,194));
        ExperienceLabel.setOpaque(true);
        ExperienceLabel.setForeground(Color.black);
        ExperienceLabel.setFont(new Font("Arial",Font.BOLD,12));

        TypeLabel.setBounds(700,345,180,30);
        TypeLabel.setBackground(new Color(92,218,194));
        TypeLabel.setLayout(null);
        TypeLabel.setOpaque(true);
        TypeLabel.setForeground(Color.black);
        TypeLabel.setFont(new Font("Arial",Font.BOLD,12));

        RateLabel.setBounds(700,390,180,30);
        RateLabel.setBackground(new Color(92,218,194));
        RateLabel.setLayout(null);
        RateLabel.setOpaque(true);
        RateLabel.setForeground(Color.black);
        RateLabel.setFont(new Font("Arial",Font.BOLD,12));

        PassLabel.setBounds(700,435,180,30);
        PassLabel.setBackground(new Color(92,218,194));
        PassLabel.setLayout(null);
        PassLabel.setOpaque(true);
        PassLabel.setForeground(Color.black);
        PassLabel.setFont(new Font("Arial",Font.BOLD,12));

        ConfirmLabel.setBounds(700,480,180,30);
        ConfirmLabel.setBackground(new Color(92,218,194));
        ConfirmLabel.setLayout(null);
        ConfirmLabel.setOpaque(true);
        ConfirmLabel.setForeground(Color.black);
        ConfirmLabel.setFont(new Font("Arial",Font.BOLD,12));


        QusetionLabel.setBounds(700,525,180,30);
        QusetionLabel.setBackground(new Color(92,218,194));
        QusetionLabel.setLayout(null);
        QusetionLabel.setOpaque(true);
        QusetionLabel.setForeground(Color.black);
        QusetionLabel.setFont(new Font("Arial",Font.BOLD,12));

        AnswerLabel.setBounds(700,570,180,30);
        AnswerLabel.setBackground(new Color(92,218,194));
        AnswerLabel.setLayout(null);
        AnswerLabel.setOpaque(true);
        AnswerLabel.setForeground(Color.black);
        AnswerLabel.setFont(new Font("Arial",Font.BOLD,12));


        CaptchaLabel.setBounds(700,615,180,30);
        CaptchaLabel.setBackground(new Color(92,218,194));
        CaptchaLabel.setLayout(null);
        CaptchaLabel.setOpaque(true);
        CaptchaLabel.setForeground(Color.black);
        CaptchaLabel.setFont(new Font("Arial",Font.BOLD,14));
 
 
 
        NameTextField.setBounds(900,75,400,30);
        NameTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        NameTextField.setFont(basic);
        NameTextField.setForeground(Color.black);
        NameTextField.setOpaque(false);
        

        NumberTextField.setBounds(900,120,400,30);
        NumberTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        NumberTextField.setFont(basic);
        NumberTextField.setForeground(Color.black);
        NumberTextField.setOpaque(false);
 
        NidTextField.setBounds(900,165,400,30);
        NidTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        NidTextField.setFont(basic);
        NidTextField.setForeground(Color.black);
        NidTextField.setOpaque(false);
 
        LicenseTextField.setBounds(900,210,400,30);
        LicenseTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        LicenseTextField.setFont(basic);
        LicenseTextField.setForeground(Color.black);
        LicenseTextField.setOpaque(false);
 
 
        RateTextField.setBounds(900,390,400,30);
        RateTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        RateTextField.setFont(basic);
        RateTextField.setForeground(Color.black);
        RateTextField.setOpaque(false);
 
        PassTextField.setBounds(900,435,400,30);
        PassTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        PassTextField.setFont(basic);
        PassTextField.setForeground(Color.black);
        PassTextField.setOpaque(false);  
 
        ConfirmTextField.setBounds(900,480,400,30);
        ConfirmTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        ConfirmTextField.setFont(basic);
        ConfirmTextField.setForeground(Color.black);
        ConfirmTextField.setOpaque(false);  
 
        QuestionsComboBox=new JComboBox<>(SecurityQuestions);
        QuestionsComboBox.setBounds(900,525,400,30);
        QuestionsComboBox.setBackground(Color.white);
        QuestionsComboBox.setOpaque(true);
 
 
 
        ExperienceComboBox=new JComboBox<>(Experience);
        ExperienceComboBox.setBounds(900,300,400,30);
        ExperienceComboBox.setBackground(Color.white);
        ExperienceComboBox.setOpaque(true);
 
 
        VehicleComboBox=new JComboBox<>(VehicleType);
        VehicleComboBox.setBounds(900,345,400,30);
        VehicleComboBox.setBackground(Color.white);
        VehicleComboBox.setOpaque(true);
 
 
        LocationCombobox=new JComboBox<>(Location);
        LocationCombobox.setBounds(900,255,400,30);
        LocationCombobox.setBackground(Color.white);
        LocationCombobox.setOpaque(true);
     
 
 
 
        AnswerTextField.setBounds(900,570,400,30);
        AnswerTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        AnswerTextField.setFont(basic);
        AnswerTextField.setForeground(Color.black);
        AnswerTextField.setOpaque(false);
 
        CaptchaTextField.setBounds(900,615,400,30);
        CaptchaTextField.setBorder(BorderFactory.createMatteBorder(01, 01, 1, 01, Color.black));
        CaptchaTextField.setFont(basic);
        CaptchaTextField.setForeground(Color.black);
        CaptchaTextField.setOpaque(false);
 
       
 
 
        SignUpButton.setBounds(1190,675,150,30);
        SignUpButton.setForeground(Color.black);
        SignUpButton.setFont(new Font("Arial",Font.BOLD,18));
        SignUpButton.setFocusable(false);
        SignUpButton.setBorderPainted(true);
        SignUpButton.setContentAreaFilled(false);
        SignUpButton.setFocusPainted(false);
        SignUpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SignUpButton.setOpaque(true);
        SignUpButton.setBackground(new Color(92,218,194));
        SignUpButton.addActionListener(this);
 
        BackButton.setBounds(70,20,100,30);
        BackButton.setForeground(Color.white);
        BackButton.setFont(new Font("Arial",Font.BOLD,15));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.setBackground(new Color(92,218,194));
        BackButton.addActionListener(this);
 
        MaleButton.setBounds(900,675,90,30);
        MaleButton.setForeground(Color.black);
        MaleButton.setFont(new Font("Arial",Font.PLAIN,20));
        MaleButton.setFocusable(false);
        MaleButton.setBorderPainted(true);
        MaleButton.setContentAreaFilled(false);
        MaleButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        MaleButton.setOpaque(true);
        MaleButton.setBackground(new Color(92,218,194));
        MaleButton.setFocusable(false);
        MaleButton.addActionListener(this);
 
        FemaleButton.setBounds(1030,675,120,30);
        FemaleButton.setForeground(Color.black);
        FemaleButton.setFont(new Font("Arial",Font.PLAIN,20));
        FemaleButton.setFocusable(false);
        FemaleButton.setBorderPainted(true);
        FemaleButton.setContentAreaFilled(false);
        FemaleButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        FemaleButton.setOpaque(true);
        FemaleButton.setBackground(new Color(92,218,194));
        FemaleButton.setFocusable(false);
        FemaleButton.addActionListener(this);
       
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
       
        frame.add(label);
       // frame.getContentPane().add(imageLabel);
        //frame.add(panel);
        frame.add(text1);
        frame.add(NameLabel);
        frame.add(NumberLabel);
        frame.add(NidLabel);
        frame.add(LicenseLabel);
        frame.add(LocationLabel);
        frame.add(ExperienceLabel);
        frame.add(TypeLabel);
        frame.add(RateLabel);
        frame.add(PassLabel);
        frame.add(ConfirmLabel);
        frame.add(QusetionLabel);
        frame.add(AnswerLabel);
        frame.add(CaptchaLabel);
 
        frame.add(NameTextField);
        frame.add(NumberTextField);
        frame.add(NameTextField);
        frame.add(NidTextField);
        frame.add(LicenseTextField);
      //  frame.add(ExperinceTextField);
      //  frame.add(TypeTextField);
        frame.add(RateTextField);
        frame.add(PassTextField);
        frame.add(ConfirmTextField);
       
        frame.add(AnswerTextField);
        frame.add(CaptchaTextField);    
       
        frame.add(MaleButton);
        frame.add(FemaleButton);
        frame.add(SignUpButton);
        frame.add(BackButton);
        frame.add(QuestionsComboBox);
        frame.add(LocationCombobox);
        frame.add(ExperienceComboBox);
        frame.add(VehicleComboBox);
 
        GenderButtonGroup.add(MaleButton);
        GenderButtonGroup.add(FemaleButton);
 
     
 
 
    }
   
    public void SignUp()
    {
        char[] passwordChars = PassTextField.getPassword();
        String password = new String(passwordChars);
        char[] ConfirmpasswordChars = ConfirmTextField.getPassword();
        String Confirmpassword = new String(ConfirmpasswordChars);
        String Question=(String)QuestionsComboBox.getSelectedItem();
        String ExperienceYear=(String)ExperienceComboBox.getSelectedItem();
        String VehicleType=(String)VehicleComboBox.getSelectedItem();
        String Location=(String)LocationCombobox.getSelectedItem();
       // VehicleType.getFont(new Font("Arial",Font.BOLD,16));
        if(!NameTextField.getText().isEmpty() && !NumberTextField.getText().isEmpty() && !NidTextField.getText().isEmpty()&&!LicenseTextField.getText().isEmpty()&&!ExperienceYear.isEmpty()
        &&!VehicleType.isEmpty()&&!RateTextField.getText().isEmpty()&&!password.isEmpty() && !Confirmpassword.isEmpty()&&!AnswerTextField.getText().isEmpty() &&!CaptchaTextField.getText().isEmpty()&& !Question.isEmpty())
        {
            if(password.equals(Confirmpassword)){
               
      try { FileWriter f1=new FileWriter("data\\DriverInfo.txt",true);
             
                f1.write("Name :"+NameTextField.getText()+"\n"+"Number :"+NumberTextField.getText()+"\n"+"Password :"+password+"\n"+"NID :"+NidTextField.getText()+"\n"+"LicenseNumber :"
                +LicenseTextField.getText()+"\n"+"Experince :"+ExperienceYear+"\n"+"Type :"+VehicleType+"\n"+"Rate :"
                +RateTextField.getText()+"\n"+"Security Question :"+Question+
                "\n"+"Answer :"+AnswerTextField.getText()+"\n"+"Status :Available"+"\n"+"Location :"+Location+"\n"+"Rented By :Null"+"\n");
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
           
           if(DriverException(NameTextField.getText())){
               SignUp();
                 }
        }
       
    }

    
 
   // public static void main(String[] args) {
   //     DriverSignUp a = new DriverSignUp();
   // }
 
   }