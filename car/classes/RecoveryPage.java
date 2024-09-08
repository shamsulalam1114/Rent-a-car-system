package classes;
import interfage.*;
import data.*;
import images.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RecoveryPage extends Forget implements ActionListener{
    ImageIcon image=new ImageIcon("images\\recoverypage.jpg");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);
    
    JFrame frame = new JFrame("Recovery Password");
    JLabel text1=new JLabel("      RECOVERY PASSWORD");
    JLabel nameLabel= new JLabel("User name :");
    JLabel questionLabel= new JLabel("Security Question :");
    JLabel answerLabel= new JLabel("Write Your Answer :");
    JLabel newPasswordLabel = new JLabel("New Password :");
    JLabel confirmPasswordLabel = new JLabel("Confirm Password :");
    JButton resetButton=new JButton("Reset Password");
    JButton BackButton=new JButton("Back");
    JComboBox <String> QuestionsComboBox;

    JTextField userNameField=new JTextField();
    JTextField answerField=new JTextField();
    JTextField newPasswordField=new JTextField();
    JTextField confirmPasswordField=new JTextField();

    Font basic=new Font("Arial",Font.PLAIN,16);


    private int userType;
    String[] SecurityQuestions = {
        "What is the name of your first pet?",
        "In which city were you born?",
        "What is your favorite book?",
        "What is your mother's maiden name?",
        "What is the model of your first car?"
    };


    RecoveryPage(int userType)
    {
    this.userType=userType;
    

    imageLabel.setBounds(00,80,700,600);
    label.setBounds(0,10,100,100);
    label.add(imageLabel);

        text1.setBounds(800,60,300,50);
        text1.setForeground(Color.black);
        text1.setFont(new Font("Arial",Font.BOLD,20));
        text1.setOpaque(true);
        text1.setBackground(new Color(92,218,194));


        nameLabel.setBounds(700,200,150,30);
        nameLabel.setForeground(Color.black);
        nameLabel.setFont(new Font("Arial",Font.BOLD,20));
        
        questionLabel.setBounds(700,250,250,30);
        questionLabel.setForeground(Color.black);
        questionLabel.setFont(new Font("Arial",Font.BOLD,20));

        answerLabel.setBounds(700,300,250,30);
        answerLabel.setForeground(Color.black);
        answerLabel.setFont(new Font("Arial",Font.BOLD,20));

       
        newPasswordLabel.setBounds(700,350,250,30);
        newPasswordLabel.setForeground(Color.black);
        newPasswordLabel.setFont(new Font("Arial",Font.BOLD,20));
        

        confirmPasswordLabel.setBounds(700,400,250,30);
        confirmPasswordLabel.setForeground(Color.black);
        confirmPasswordLabel.setFont(new Font("Arial",Font.BOLD,20));
       
    
        userNameField.setBounds(960,200,300,30);
        userNameField.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        userNameField.setFont(basic);
        userNameField.setForeground(Color.black);
        userNameField.setOpaque(false);
       
        

        QuestionsComboBox=new JComboBox<>(SecurityQuestions);
        QuestionsComboBox.setBounds(960,250,300,30);
        QuestionsComboBox.setBackground(Color.white);
        QuestionsComboBox.setOpaque(true);

       
        answerField.setBounds(960,300,300,30);
        answerField.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        answerField.setFont(basic);
        answerField.setForeground(Color.black);
        answerField.setOpaque(false);
       
     

        newPasswordField.setBounds(960,350,300,30);
        newPasswordField.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        newPasswordField.setFont(basic);
        newPasswordField.setForeground(Color.black);
        newPasswordField.setOpaque(false);
        newPasswordField.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
  
        confirmPasswordField.setBounds(960,400,300,30);
        confirmPasswordField.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        confirmPasswordField.setFont(basic);
        confirmPasswordField.setForeground(Color.black);
        confirmPasswordField.setOpaque(false);
        confirmPasswordField.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
    
        resetButton.setBounds(900,600,250,50);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        resetButton.setBackground(new Color(92,218,194));
        resetButton.setFont(new Font("Arial",Font.BOLD,20));


        BackButton.setBounds(60,10  ,150,30);
        BackButton.setForeground(Color.black);
        BackButton.setFont(new Font("Arial",Font.BOLD,20));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.setBackground(new Color(92,218,194));
        BackButton.addActionListener(this);

        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
  
        frame.add(resetButton);
        frame.add(BackButton);
        
        
        frame.add(imageLabel);
         frame.add(label);

        frame.add(text1);
        frame.add(nameLabel);
        frame.add(userNameField);
        frame.add(questionLabel);
        frame.add(answerLabel);
        frame.add(answerField);
        frame.add(newPasswordLabel);
        frame.add(newPasswordField);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);
        frame.add(QuestionsComboBox);
    
    }
public boolean Check(int type){
    // if true , successfully reset
    // if false, user not found
    switch (type){
    
       
            case 2:// Customer
        try (BufferedReader br = new BufferedReader(new FileReader("data\\CustomerInfo.txt"))){
       
            String line;
    
               StringBuilder userInfoBuilder = new StringBuilder();
    
               while ((line = br.readLine()) != null) {
                 
                 
                   if (line.replace("-", "").isEmpty()) {
                     
                       String[] userInfo = userInfoBuilder.toString().split("\n");
    
                       // Process the userInfo array
                       if (userInfo.length >= 8) {
                           System.out.println("inside userinfo length");
                           String storedUsername = userInfo[0].split(":")[1].trim();
                             String storedQuestion = userInfo[5].split(":")[1].trim();
                               String storedAnswer = userInfo[6].split(":")[1].trim();
                          
                          
                           if (storedUsername.equals(userNameField.getText()) ) {
                            String selectedQuestion=(String)QuestionsComboBox.getSelectedItem();
                               
                           if( selectedQuestion.equals(storedQuestion)){
                            if(answerField.getText().equals(storedAnswer)){
                               String Newpass=newPasswordField.getText();
                              String ConfirmPass=confirmPasswordField.getText();
                               if(Newpass.equals(ConfirmPass)){
                                if(ConfirmPass.isEmpty()){
                                    JOptionPane.showMessageDialog(null,"Please Enter New Password","Message",JOptionPane.OK_CANCEL_OPTION );
                                    return true;
                                }
                                //use loop to read through the file and find the matched user name then write new pass there
                                System.out.println("pass reseting");
                                ResetPassword("data\\CustomerInfo.txt",userNameField.getText(), ConfirmPass);
                                JOptionPane.showMessageDialog(null,"Password Reset Successful","Message",JOptionPane.OK_CANCEL_OPTION);
                                return true;
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Password Do Not Match",  "Message", JOptionPane.OK_CANCEL_OPTION); 
                                return true;       
                        }
                    }
                        else{
                            JOptionPane.showMessageDialog(null,"Answer Do Not Match",  "Message", JOptionPane.OK_CANCEL_OPTION);
                            return true;
                        }
                           }
                           else{
                             JOptionPane.showMessageDialog(null,"Question Do Not Match",  "Message", JOptionPane.OK_CANCEL_OPTION);
                             return true;
                           }
                        
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
           return false;
            
            case 3: // owner
            try (BufferedReader br = new BufferedReader(new FileReader("data\\OwnerInfo.txt"))){
       
            String line;
    
               StringBuilder userInfoBuilder = new StringBuilder();
    
               while ((line = br.readLine()) != null) {
                 
                 
                   if (line.replace("-", "").isEmpty()) {
                     
                       String[] userInfo = userInfoBuilder.toString().split("\n");
    
                       // Process the userInfo array
                       if (userInfo.length >= 7) {
                           System.out.println("inside userinfo length");
                           String storedUsername = userInfo[0].split(":")[1].trim();
                             String storedQuestion = userInfo[4].split(":")[1].trim();
                               String storedAnswer = userInfo[5].split(":")[1].trim();
                          
                          
                           if (storedUsername.equals(userNameField.getText()) ) {
                            String selectedQuestion=(String)QuestionsComboBox.getSelectedItem();
                               
                           if( selectedQuestion.equals(storedQuestion)){
                            if(answerField.getText().equals(storedAnswer)){
                               String Newpass=newPasswordField.getText();
                              String ConfirmPass=confirmPasswordField.getText();
                               if(Newpass.equals(ConfirmPass)){
                                if(ConfirmPass.isEmpty()){
                                    JOptionPane.showMessageDialog(null,"Please Enter New Password","Message",JOptionPane.OK_CANCEL_OPTION );
                                    return true;
                                }
                                //use loop to read through the file and find the matched user name then write new pass there
                                System.out.println("pass reseting");
                                ResetPassword("data\\OwnerInfo.txt",userNameField.getText(), ConfirmPass);
                                JOptionPane.showMessageDialog(null,"Password Reset Successful","Message",JOptionPane.OK_CANCEL_OPTION);
                                return true;
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Password Do Not Match",  "Message", JOptionPane.OK_CANCEL_OPTION); 
                                return true;       
                        }
                    }
                        else{
                            JOptionPane.showMessageDialog(null,"Answer Do Not Match",  "Message", JOptionPane.OK_CANCEL_OPTION);
                            return true;
                        }
                           }
                           else{
                             JOptionPane.showMessageDialog(null,"Question Do Not Match",  "Message", JOptionPane.OK_CANCEL_OPTION);
                             return true;
                           }
                        
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
           return false;
            

       
            case 4:
              try (BufferedReader br = new BufferedReader(new FileReader("data\\DriverInfo.txt"))){
       
            String line;
    
               StringBuilder userInfoBuilder = new StringBuilder();
    
               while ((line = br.readLine()) != null) {
                 
                 
                   if (line.replace("-", "").isEmpty()) {
                     
                       String[] userInfo = userInfoBuilder.toString().split("\n");
    
                       // Process the userInfo array
                       if (userInfo.length >= 12) {
                           System.out.println("inside userinfo length");
                           String storedUsername = userInfo[0].split(":")[1].trim();
                           String storedQuestion = userInfo[8].split(":")[1].trim();
                           String storedAnswer = userInfo[9].split(":")[1].trim();
                          
                          
                           if (storedUsername.equals(userNameField.getText()) ) {
                            String selectedQuestion=(String)QuestionsComboBox.getSelectedItem();
                               
                           if( selectedQuestion.equals(storedQuestion)){
                            if(answerField.getText().equals(storedAnswer)){
                               String Newpass=newPasswordField.getText();
                              String ConfirmPass=confirmPasswordField.getText();
                               if(Newpass.equals(ConfirmPass)){
                                if(ConfirmPass.isEmpty()){
                                    JOptionPane.showMessageDialog(null,"Please Enter New Password","Message",JOptionPane.OK_CANCEL_OPTION );
                                    return true;
                                }
                                //use loop to read through the file and find the matched user name then write new pass there
                                System.out.println("pass reseting");
                                ResetPassword("data\\DriverInfo.txt",userNameField.getText(), ConfirmPass);
                                JOptionPane.showMessageDialog(null,"Password Reset Successful","Message",JOptionPane.OK_CANCEL_OPTION);
                                return true;
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Password Do Not Match",  "Message", JOptionPane.OK_CANCEL_OPTION); 
                                return true;       
                        }
                    }
                        else{
                            JOptionPane.showMessageDialog(null,"Answer Do Not Match",  "Message", JOptionPane.OK_CANCEL_OPTION);
                            return true;
                        }
                           }
                           else{
                             JOptionPane.showMessageDialog(null,"Question Do Not Match",  "Message", JOptionPane.OK_CANCEL_OPTION);
                             return true;
                           }
                        
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
           return false;
           // break;
    
        default:
            break;
    }
    return false;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==BackButton){
            frame.dispose();
            new LoginPage();
        }
        if(e.getSource()==resetButton){
  if(!Check(userType)){
            JOptionPane.showMessageDialog(null,"User Not Found","Message",JOptionPane.OK_CANCEL_OPTION);
      
        }
    }
}
}


    
