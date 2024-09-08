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
import javax.swing.JOptionPane;
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
import java.io.File;
import javax.swing.JFileChooser;
import java.awt.Image;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JPanel;






public class CustomerProfile implements ActionListener
{
    JLabel imageLabel = new JLabel();
    JPanel panel=new JPanel();
    JButton UploadImageButton = new JButton("Upload Image");

    JFrame frame = new JFrame("Customer Profile");
   
    JLabel text1=new JLabel("      Customer Profile");
 
    JLabel NameLabel=new JLabel("Name :");
    JLabel PhoneLabel=new JLabel("Phone :");
    JLabel EmailLabel=new JLabel("Email :");
    JLabel NidLabel=new JLabel("NID Number :");
    JLabel AddressLabel=new JLabel("Address :");
    JLabel BloodGroupLabel=new JLabel("Blood Group :");
    JLabel GenderLabel=new JLabel("Gender :");


 
    JTextField NameTextField = new JTextField();
    JTextField PhoneTextField = new JTextField();
    JTextField EmailTextField = new JTextField();
    JTextField NidTextField = new JTextField();
    JTextField AddressTextField = new JTextField();
    JTextField BloodGroupTextField=new JTextField();
    JTextField GenderTextField=new JTextField("");
 
   
    JButton EditButton = new JButton("Edit");
    JButton BackButton = new JButton("Back");
    JButton LogOutButton = new JButton("Log out");
   // JButton AddcarButton = new JButton("Add car for rent");
   JButton SaveButton = new JButton("Save");
    JDialog Dialog = new JDialog();
    Font basic=new Font("Arial",Font.PLAIN,16);
    String Id;
 
 
    public CustomerProfile(String Id)
    {
        this.Id=Id;
        text1.setBounds(830,50,240,60);
        text1.setBackground(Color.WHITE);
        text1.setLayout(null);
        text1.setOpaque(true);
        text1.setForeground(Color.black);
        text1.setFont(new Font("Arial",Font.BOLD,22));
 
        NameLabel.setBounds(700,200,180,30);
        NameLabel.setBackground(Color.blue);
        NameLabel.setLayout(null);
        NameLabel.setForeground(Color.WHITE);
        NameLabel.setFont(new Font("Arial",Font.BOLD,18));
 
        PhoneLabel.setBounds(700,270,180,30);
        PhoneLabel.setBackground(Color.blue);
        PhoneLabel.setLayout(null);
        PhoneLabel.setForeground(Color.WHITE);
        PhoneLabel.setFont(new Font("Arial",Font.BOLD,18));
 
        EmailLabel.setBounds(700,340,180,30);
        EmailLabel.setBackground(Color.blue);
        EmailLabel.setLayout(null);
        EmailLabel.setForeground(Color.WHITE);
        EmailLabel.setFont(new Font("Arial",Font.BOLD,18));
 
        NidLabel.setBounds(700,410,180,30);
        NidLabel.setBackground(Color.blue);
        NidLabel.setLayout(null);
        NidLabel.setForeground(Color.WHITE);
        NidLabel.setFont(new Font("Arial",Font.BOLD,18));
 
        GenderLabel.setBounds(700,480,180,30);
        GenderLabel.setBackground(Color.blue);
        GenderLabel.setLayout(null);
        GenderLabel.setForeground(Color.WHITE);
        GenderLabel.setFont(new Font("Arial",Font.BOLD,18));
 
        NameTextField.setBounds(900,200,250,30);
        NameTextField.setFont(basic);
        NameTextField.setForeground(Color.black);
        NameTextField.setOpaque(true);
        NameTextField.setEditable(false);
 
        PhoneTextField.setBounds(900,270,250,30);
        PhoneTextField.setFont(basic);
        PhoneTextField.setForeground(Color.black);
        PhoneTextField.setOpaque(true);
        PhoneTextField.setEditable(false);
 
        EmailTextField.setBounds(900,340,250,30);
        EmailTextField.setFont(basic);
        EmailTextField.setForeground(Color.black);
        EmailTextField.setOpaque(true);
        EmailTextField.setEditable(false);


        UploadImageButton.setBounds(200, 460, 150, 40);
        UploadImageButton.setForeground(Color.black);
        UploadImageButton.setFont(new Font("Arial", Font.BOLD, 15));
        UploadImageButton.setFocusable(false);
        UploadImageButton.setBorderPainted(true);
        UploadImageButton.setContentAreaFilled(false);
        UploadImageButton.setFocusPainted(false);
        UploadImageButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        UploadImageButton.setOpaque(true);
        UploadImageButton.setForeground(Color.black);
        UploadImageButton.setBackground(Color.white);

        imageLabel.setBounds(100, 230, 350, 200);
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        imageLabel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.white));
 
        NidTextField.setBounds(900,410,250,30);
        NidTextField.setFont(basic);
        NidTextField.setForeground(Color.black);
        NidTextField.setOpaque(true);
        NidTextField.setEditable(false);

        GenderTextField.setBounds(900,480,250,30);
        GenderTextField.setFont(basic);
        GenderTextField.setForeground(Color.black);
        GenderTextField.setOpaque(true);
        GenderTextField.setEditable(false);

        BackButton.setBounds(20,10,100,30);
        BackButton.setForeground(Color.black);
        BackButton.setFont(new Font("Arial",Font.BOLD,16));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.setForeground(Color.black);
        BackButton.setBackground(Color.white);
        BackButton.addActionListener(this);
 
       
        LogOutButton.setBounds(900, 650, 150, 40);
        LogOutButton.setForeground(Color.black);
        LogOutButton.setFont(new Font("Arial", Font.BOLD, 16));
        LogOutButton.setFocusable(false);
        LogOutButton.setBorderPainted(true);
        LogOutButton.setContentAreaFilled(false);
        LogOutButton.setFocusPainted(false);
        LogOutButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        LogOutButton.setOpaque(true);
        LogOutButton.setForeground(Color.black);
        LogOutButton.setBackground(Color.white);
        LogOutButton.addActionListener(this);

        EditButton.setBounds(1100, 650, 150, 40);
        EditButton.setFont(new Font("Arial", Font.BOLD, 16));
        EditButton.setFocusable(false);
        EditButton.setBorderPainted(true);
        EditButton.setContentAreaFilled(false);
        EditButton.setFocusPainted(false);
        EditButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        EditButton.setOpaque(true);
        EditButton.setForeground(Color.black);
        EditButton.setBackground(Color.white);
        EditButton.addActionListener(this);

    SaveButton.setBounds(1100, 650, 150, 40);
    SaveButton.setFont(new Font("Arial", Font.BOLD, 16));
    SaveButton.setFocusable(false);
    SaveButton.setBorderPainted(true);
    SaveButton.setContentAreaFilled(false);
    SaveButton.setFocusPainted(false);
    SaveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    SaveButton.setOpaque(true);
    SaveButton.setForeground(Color.black);
    SaveButton.setBackground(Color.white);
    SaveButton.addActionListener(this);
    SaveButton.setVisible(false);

        
 
        frame.getContentPane().setBackground(Color.black);
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
 
        frame.add(text1);
        frame.add(NameLabel);
        frame.add(PhoneLabel);
        frame.add(EmailLabel);
        frame.add(NidLabel);
        frame.add(GenderLabel);
      
        frame.add(LogOutButton);
 
        frame.add(NameTextField);
        frame.add(PhoneTextField);
        frame.add(EmailTextField);
        frame.add(NidTextField);
        frame.add(GenderTextField);
        frame.add(EditButton);
        frame.add(BackButton);
        frame.add(SaveButton);
 
        frame.add(imageLabel);
        frame.add(UploadImageButton);
        frame.add(panel);


        UploadImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                        "Image files", "jpg", "jpeg", "png", "gif");
                fileChooser.setFileFilter(filter);
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    // Load and display the selected image
                    ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
                    Image img = icon.getImage().getScaledInstance(350, 200, Image.SCALE_SMOOTH);
                    imageLabel.setIcon(new ImageIcon(img));
                }
            }
        });
    
        try (BufferedReader br = new BufferedReader(new FileReader("data\\CustomerInfo.txt"))){
       
            String line;
          System.out.println("inside try");
               StringBuilder userInfoBuilder = new StringBuilder();
    
               while ((line = br.readLine()) != null) {
                   System.out.println("Inside while loop");
                 
                   if (line.replace("-", "").isEmpty()) {
                       System.out.println("inside line if");
                       String[] userInfo = userInfoBuilder.toString().split("\n");
    
                       // Process the userInfo array
                       if (userInfo.length >= 8) {
                           System.out.println("inside userinfo length");
                           String storedUsername = userInfo[0].split(":")[1].trim();
                          String StoredEmail = userInfo[1].split(":")[1].trim();
                           String PhoneNumber = userInfo[3].split(":")[1].trim();
                           String StoredNid=userInfo[4].split(":")[1].trim();
                           String Gender=userInfo[7].split(":")[1].trim();
                          
                           if (storedUsername.equals(Id) ) {
                               System.out.println("inside okay");
                              NameTextField.setText(storedUsername);
                               EmailTextField.setText(StoredEmail);
                               PhoneTextField.setText(PhoneNumber);
                               NidTextField.setText(StoredNid);
                               GenderTextField.setText(Gender);

                            
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

      
           if (e.getSource() == EditButton) {
            EditButton.setVisible(false);
            SaveButton.setVisible(true);
              PhoneTextField.setEditable(true);
              EmailTextField.setEditable(true);
              NidTextField.setEditable(true);
              GenderTextField.setEditable(true);
          }
        
            if(e.getSource()==SaveButton){
                try {
                    new CustomerInfoUpdate(NameTextField.getText(),PhoneTextField.getText(),EmailTextField.getText(),NidTextField.getText(),GenderTextField.getText());
                     JOptionPane.showMessageDialog(null,"Info Updated" , "Message", JOptionPane.OK_CANCEL_OPTION);
                } catch (IOException e1) {
                  JOptionPane.showMessageDialog(null,"Could Not Save" , "Message", JOptionPane.ERROR_MESSAGE);
                }
                System.out.println("saved successfully");
              }
          
           if(e.getSource()==LogOutButton){
            frame.dispose();
            new LoginPage();
           }
            if(e.getSource()==BackButton){
            frame.dispose();
            new CustomerDashboard(Id);
           }
           
           
   
      }

      //public static void main(String args[])
      //{
      //      CustomerProfile a = new CustomerProfile(null);
      //}
    }


    
    
        
       
   





