package classes;
import interfage.*;
import data.*;
import images.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
 
public class DriverProfile implements ActionListener {
 ImageIcon image=new ImageIcon("images\\driverprofile.png");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);
   


    JFrame frame=new JFrame("Driver Profile");
    JLabel text1=new JLabel("      Driver Profile");
    JLabel NameLabel=new JLabel("Name :")  ;
    JLabel NumberLabel=new JLabel("Phone Number :");
    JLabel EmailLabel=new JLabel("Email :");
    JLabel NidLabel=new JLabel("NID No :");
    JLabel LicenseLabel=new JLabel("License No :");
    JLabel GenderLabel=new JLabel("Gender :");
    JLabel AddressLabel=new JLabel("Address :");
    JLabel BloodGroupLabel=new JLabel("Blood Group :");
    JLabel ExperienceLabel=new JLabel("Select Years Of Experience :");
    JLabel TypeLabel=new JLabel("Prefered Vehicle Type :");
    JLabel RateLabel=new JLabel("Enter Hourly Rate :");
    JLabel LocationLabel = new JLabel("Location :");
    JLabel StatusLabel=new JLabel("Status");
    JLabel RentedByLabel=new JLabel("Rented By:");
 
   // JLabel RateLabel=new JLabel("           Enter Hourly Rate :");
    JPanel panel=new JPanel();
   
    JTextField NameTextField= new JTextField();
    JTextField NumberTextField= new JTextField();
    JTextField EmailTextField= new JTextField();
    JTextField NidTextField= new JTextField();
    JTextField LicenseTextField= new JTextField();
    JTextField GenderTextField= new JTextField();
    JTextField AddressTextField= new JTextField();
    JTextField BloodGroupTextField = new JTextField();
    JTextField RateTextField = new JTextField();
     JTextField IsAvaiableTextField = new JTextField();
     JTextField LocationTextField = new JTextField();
     JTextField RentedByTextField=new JTextField();
   
 
   // JButton EditButton = new JButton("Edit");
    JButton LogOutButton = new JButton("Log Out");
   
    JButton EditButton=new JButton("Edit");
    JButton SaveButton=new JButton("Save");
 
    JDialog Dialog = new JDialog();
    Font basic=new Font("Arial",Font.PLAIN,16);
   
   
    JTextField ExperienceTextField = new JTextField();
    JTextField VehicleTypeTextField = new JTextField();
 
   // JComboBox <String> QuestionsComboBox;
   // JComboBox <String> ExperienceComboBox;
   // JComboBox <String> VehicleComboBox;
 
    private String DriverId;
 
 
    DriverProfile(String Id)
    {
        this.DriverId=Id;
        imageLabel.setBounds(00,30,700,700);
        label.setBounds(0,10,100,100);
        label.add(imageLabel);

        text1.setBounds(1010,10,180,50);
        text1.setBackground(Color.white);
        text1.setLayout(null);
        text1.setOpaque(true);
        text1.setForeground(Color.black);
        text1.setFont(new Font("Arial",Font.BOLD,18));
 
        NameLabel.setBounds(700,90,220,30);
        NameLabel.setBackground(Color.black);
        NameLabel.setLayout(null);
        NameLabel.setOpaque(true);
        NameLabel.setForeground(Color.WHITE);
        NameLabel.setFont(new Font("Arial",Font.BOLD,16));
 
 
        NumberLabel.setBounds(700,140,220,30);
        NumberLabel.setBackground(Color.black);
        NumberLabel.setLayout(null);
        NumberLabel.setOpaque(true);
        NumberLabel.setForeground(Color.WHITE);
        NumberLabel.setFont(new Font("Arial",Font.BOLD,16));
 
        // EmailLabel.setBounds(700,260,180,30);
        // EmailLabel.setBackground(Color.blue);
        // EmailLabel.setLayout(null);
        // EmailLabel.setOpaque(true);
        // EmailLabel.setForeground(Color.WHITE);
        // EmailLabel.setFont(new Font("Arial",Font.BOLD,16));
 
 
        NidLabel.setBounds(700,190,220,30);
        NidLabel.setBackground(Color.black);
        NidLabel.setLayout(null);
        NidLabel.setOpaque(true);
        NidLabel.setForeground(Color.WHITE);
        NidLabel.setFont(new Font("Arial",Font.BOLD,16));
 
        LicenseLabel.setBounds(700,240,220,30);
        LicenseLabel.setBackground(Color.black);
        LicenseLabel.setLayout(null);
        LicenseLabel.setOpaque(true);
        LicenseLabel.setForeground(Color.WHITE);
        LicenseLabel.setFont(new Font("Arial",Font.BOLD,16));
 
        GenderLabel.setBounds(700,290,220,30);
        GenderLabel.setBackground(Color.black);
        GenderLabel.setLayout(null);
        GenderLabel.setOpaque(true);
        GenderLabel.setForeground(Color.WHITE);
        GenderLabel.setFont(new Font("Arial",Font.BOLD,16));
 
        ExperienceLabel.setBounds(700,340,220,30);
        ExperienceLabel.setBackground(Color.black);
        ExperienceLabel.setLayout(null);
        ExperienceLabel.setOpaque(true);
        ExperienceLabel.setForeground(Color.WHITE);
        ExperienceLabel.setFont(new Font("Arial",Font.BOLD,16));
 
 
        TypeLabel.setBounds(700,390,220,30);
        TypeLabel.setBackground(Color.black);
        TypeLabel.setLayout(null);
        TypeLabel.setOpaque(true);
        TypeLabel.setForeground(Color.WHITE);
        TypeLabel.setFont(new Font("Arial",Font.BOLD,16));
 
 
        RateLabel.setBounds(700,440,220,30);
        RateLabel.setBackground(Color.black);
        RateLabel.setLayout(null);
        RateLabel.setOpaque(true);
        RateLabel.setForeground(Color.WHITE);
        RateLabel.setFont(new Font("Arial",Font.BOLD,16));
 
 
        LocationLabel.setBounds(700,490,220,30);
        LocationLabel.setBackground(Color.black);
        LocationLabel.setLayout(null);
        LocationLabel.setOpaque(true);
        LocationLabel.setForeground(Color.WHITE);
        LocationLabel.setFont(new Font("Arial",Font.BOLD,16));
 
 
        StatusLabel.setBounds(700,540,220,30);
        StatusLabel.setBackground(Color.black);
        StatusLabel.setLayout(null);
        StatusLabel.setOpaque(true);
        StatusLabel.setForeground(Color.WHITE);
        StatusLabel.setFont(new Font("Arial",Font.BOLD,16));
 
 
        RentedByLabel.setBounds(700,590,220,30);
        RentedByLabel.setBackground(Color.black);
        RentedByLabel.setLayout(null);
        RentedByLabel.setOpaque(true);
        RentedByLabel.setForeground(Color.WHITE);
        RentedByLabel.setFont(new Font("Arial",Font.BOLD,16));
 
        NameTextField.setBounds(950,90,370,30);
        NameTextField.setFont(basic);
        NameTextField.setForeground(Color.black);
        NameTextField.setOpaque(true);
        NameTextField.setText(Id);
        NameTextField.setEditable(false);
 
 
        NumberTextField.setBounds(950,140,370,30);
        NumberTextField.setFont(basic);
        NumberTextField.setForeground(Color.black);
        NumberTextField.setOpaque(true);
        NumberTextField.setEditable(false);
 
        NidTextField.setBounds(950,190,370,30);
        NidTextField.setFont(basic);
        NidTextField.setForeground(Color.black);
        NidTextField.setOpaque(true);
        NidTextField.setEditable(false);
 
        LicenseTextField.setBounds(950,240,370,30);
        LicenseTextField.setFont(basic);
        LicenseTextField.setForeground(Color.black);
        LicenseTextField.setOpaque(true);
        LicenseTextField.setEditable(false);
 
        GenderTextField.setBounds(950,290,370,30);
        GenderTextField.setFont(basic);
        GenderTextField.setForeground(Color.black);
        GenderTextField.setOpaque(true);
        GenderTextField.setEditable(false);
 
 
       
        ExperienceTextField.setBounds(950,340,370,30);
        ExperienceTextField.setBackground(Color.white);
        ExperienceTextField.setOpaque(true);
        ExperienceTextField.setEditable(false);
 
 
     
        VehicleTypeTextField.setBounds(950,390,370,30);
        VehicleTypeTextField.setBackground(Color.white);
        VehicleTypeTextField.setOpaque(true);
        VehicleTypeTextField.setEditable(false);
 
 
        RateTextField.setBounds(950,440,370,30);
        RateTextField.setFont(basic);
        RateTextField.setForeground(Color.black);
        RateTextField.setOpaque(true);
        RateTextField.setEditable(false);
 
        LocationTextField.setBounds(950,490,370,30);
        LocationTextField.setFont(basic);
        LocationTextField.setForeground(Color.black);
        LocationTextField.setOpaque(true);
        LocationTextField.setEditable(false);
 
        IsAvaiableTextField.setBounds(950,540,370,30);
        IsAvaiableTextField.setFont(basic);
        IsAvaiableTextField.setForeground(Color.black);
        IsAvaiableTextField.setOpaque(true);
        IsAvaiableTextField.setEditable(false);
 
        RentedByTextField.setBounds(950,590,370,30);
        RentedByTextField.setFont(basic);
        RentedByTextField.setForeground(Color.black);
        RentedByTextField.setOpaque(true);
        RentedByTextField.setEditable(false);
 
 
        LogOutButton.setBounds(1180,670,100,50);
        LogOutButton.setForeground(Color.black);
        LogOutButton.setFont(new Font("Arial",Font.BOLD,16));
        LogOutButton.setFocusable(false);
        LogOutButton.setBorderPainted(true);
        LogOutButton.setContentAreaFilled(false);
        LogOutButton.setFocusPainted(false);
        LogOutButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        LogOutButton.setOpaque(true);
        LogOutButton.setForeground(Color.red);
        LogOutButton.setBackground(Color.white);
        LogOutButton.addActionListener(this);
 
      
        EditButton.setBounds(970,670,100,50);
        EditButton.setForeground(Color.black);
        EditButton.setFont(new Font("Arial",Font.BOLD,15));
        EditButton.setFocusable(false);
        EditButton.setBorderPainted(true);
        EditButton.setContentAreaFilled(false);
        EditButton.setFocusPainted(false);
        EditButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        EditButton.setOpaque(true);
        EditButton.setForeground(Color.black);
        EditButton.setBackground(Color.white);
        EditButton.addActionListener(this);
 
 
        SaveButton.setBounds(970,670,100,50);
        SaveButton.setForeground(Color.black);
        SaveButton.setFont(new Font("Arial",Font.BOLD,15));
        SaveButton.setFocusable(false);
        SaveButton.setBorderPainted(true);
        SaveButton.setContentAreaFilled(false);
        SaveButton.setFocusPainted(false);
        SaveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SaveButton.setOpaque(true);
        SaveButton.setForeground(Color.black);
        SaveButton.setBackground(Color.white);
        SaveButton.addActionListener(this);
       
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
 
 
 
        frame.add(imageLabel);
        frame.add(text1);
        frame.add(NameLabel);
        frame.add(NumberLabel);
        // frame.add(EmailLabel);
        frame.add(NidLabel);
        frame.add(LicenseLabel);
        frame.add(GenderLabel);
       
        frame.add(NameTextField);
        frame.add(NumberTextField);
        frame.add(NidTextField);
        frame.add(LicenseTextField);
        frame.add(GenderTextField);
        frame.add(ExperienceLabel);
        frame.add(LocationLabel);
        frame.add(LocationTextField);
        frame.add(TypeLabel);
        frame.add(RateLabel);
        frame.add(RentedByLabel);
 
        frame.add(ExperienceTextField);
        frame.add(VehicleTypeTextField);
        frame.add(RateTextField);
        frame.add(IsAvaiableTextField);
        frame.add(StatusLabel);
        frame.add(RentedByTextField);
 
        frame.add(LogOutButton);
        
        frame.add(EditButton);
        frame.add(SaveButton);
 
        frame.add(panel);
 
 
        panel.setBounds(683,0,683,766);
        panel.setBackground(Color.black);
       
   
 
     try (BufferedReader br = new BufferedReader(new FileReader("data\\DriverInfo.txt"))){
       
         String line;
     
            StringBuilder userInfoBuilder = new StringBuilder();
 
            while ((line = br.readLine()) != null) {
               
             
                if (line.replace("-", "").isEmpty()) {
                   
                    String[] userInfo = userInfoBuilder.toString().split("\n");
 
                    // Process the userInfo array
                    if (userInfo.length >= 14) {
                       
                        String storedUsername = userInfo[0].split(":")[1].trim();
                        String StoredNumber = userInfo[1].split(":")[1].trim();
                        String StoredNid = userInfo[3].split(":")[1].trim();
                        String StoredLicense=userInfo[4].split(":")[1].trim();
                        String StoredGender=userInfo[13].split(":")[1].trim();
                        String StoredExperience=userInfo[5].split(":")[1].trim();
                        String StoredVehicle=userInfo[6].split(":")[1].trim();
                        String StoredRate=userInfo[7].split(":")[1].trim();
                        String StoredStatus=userInfo[10].split(":")[1].trim();
                        String StoredLocation=userInfo[11].split(":")[1].trim();
                        String StoredRentedBy=userInfo[12].split(":")[1].trim();
 
                        if (storedUsername.equals(DriverId) ) {
                           System.out.println("matched");
                           NidTextField.setText(StoredNid);
                           NumberTextField.setText(StoredNumber);
                           LicenseTextField.setText(StoredLicense);
                           GenderTextField.setText(StoredGender);
                           ExperienceTextField.setText(StoredExperience);
                           VehicleTypeTextField.setText(StoredVehicle);
                           RateTextField.setText(StoredRate);
                           IsAvaiableTextField.setText(StoredStatus);
                           LocationTextField.setText(StoredLocation);
                           RentedByTextField.setText(StoredRentedBy);
                    }
 
                    // Reset userInfoBuilder for the next user
                    userInfoBuilder = new StringBuilder();
                }} else {
                    userInfoBuilder.append(line).append("\n");
                 
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
 
       
           
           if (e.getSource() == EditButton) {
            EditButton.setVisible(false);
            SaveButton.setVisible(true);
              //NameTextField.setEditable(true);
              NumberTextField.setEditable(true);
              //NidTextField.setEditable(true);
              //LicenseTextField.setEditable(true);
              //GenderTextField.setEditable(true);
              ExperienceTextField.setEditable(true);
              VehicleTypeTextField.setEditable(true);
              RateTextField.setEditable(true);
              LocationTextField.setEditable(true);
              //IsAvaiableTextField.setEditable(true);
              //RentedByTextField.setEditable(true);
          }
       
            if(e.getSource()==SaveButton){
                 
                            System.out.println("Save Button Executed");
                try {
 
                    System.out.println("Inside try");
                    new DriverInfoUpdate(NameTextField.getText(), NumberTextField.getText(), ExperienceTextField.getText(), RateTextField.getText(),LocationTextField.getText(), DriverId);
                            System.out.println("Constructor Called");
                    JOptionPane.showMessageDialog(null,"Info Updated" , "Message", JOptionPane.OK_CANCEL_OPTION);
                } catch (IOException e1) {
                  JOptionPane.showMessageDialog(null,"Could Not Save" , "Message", JOptionPane.ERROR_MESSAGE);
                }
                System.out.println("saved successfully");
              }
       }
 
       
    //    if (e.getSource() == BackButton) {
    //        frame.dispose();
    //        new CustomerDashboard(DriverId);
    //    }
 
   
 
}
 
 
 
 
 
 
 
 
 
 