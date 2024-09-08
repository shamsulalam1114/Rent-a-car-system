package classes;
import interfage.*;
import data.*;
import images.*;
import javax.swing.JDialog;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
//import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
 
import javax.swing.JDialog;
import java.awt.Cursor;
 
public class DriverRent implements ActionListener {
    JFrame frame = new JFrame("    Driver rental page");

    ImageIcon image=new ImageIcon("images\\driver rent.png");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);
 
    JLabel text1 = new JLabel("   Driver rental page");
    JLabel DriverNameLabel = new JLabel("               Driver Name :");
    JLabel DriverNumberLabel = new JLabel("             Number :");
    JLabel ExperienceLabel = new JLabel("            Experience :");
    JLabel LocationLabel = new JLabel("             Location :");
    JLabel TypeLabel = new JLabel("                  Type :");
    JLabel GenderLabel = new JLabel("                  Gender :");
    JLabel RateLabel=new JLabel("               Rate: ");
    JLabel StatusLabel=new JLabel("    Status :  ");
    JLabel RentedByLabel=new JLabel("  Rented By  : ");
    JLabel EmailLabel=new JLabel("    Email :  ");
   
   
    JTextField DriverNameTextField = new JTextField();
    JTextField DriverNumberTextField = new JTextField();
    JTextField ExperienceTextField = new JTextField();
    JTextField LocationTextField = new JTextField();
    JTextField TypeTextField = new JTextField();
    JTextField GenderTextField=new JTextField();
    JTextField RateTextField = new JTextField();
    JTextField StatusTextField=new JTextField();
    JTextField RentedTextField=new JTextField();
    JTextField EmailTextField=new JTextField();
   
 
    JButton BackButton = new JButton("Back");
    JButton RentButton = new JButton("Rent Now");
    JButton UpdateButton=new JButton("Update");
 
 
    JDialog Dialog = new JDialog();
    Font basic = new Font("Arial", Font.PLAIN, 16);
 
    String DriverName;
    String UserID;
    String Status;
 
   
   
    public DriverRent(String DriverName,String CustomerId) {
        this.DriverName=DriverName;
        this.UserID=CustomerId;

       
      imageLabel.setBounds(600,150,700,500);
        label.setBounds(0,0,1300,700);
        label.add(imageLabel);
 

  frame.add(label);
 
        text1.setBounds(630, 40, 230, 50);
        text1.setBackground (new Color(237,125,49));
        text1.setLayout(null);
        text1.setOpaque(true);
        text1.setForeground(Color.black);
        text1.setFont(new Font("Arial", Font.BOLD, 18));
 
        DriverNameLabel.setBounds(100, 150, 180, 30);
        DriverNameLabel.setBackground (new Color(237,125,49));
        DriverNameLabel.setLayout(null);
        DriverNameLabel.setOpaque(true);
        DriverNameLabel.setForeground(Color.WHITE);
 
        DriverNumberLabel.setBounds(100, 200, 180, 30);
        DriverNumberLabel.setBackground (new Color(237,125,49));
        DriverNumberLabel.setLayout(null);
        DriverNumberLabel.setOpaque(true);
        DriverNumberLabel.setForeground(Color.WHITE);
 
        ExperienceLabel.setBounds(100, 250, 180, 30);
        ExperienceLabel.setBackground (new Color(237,125,49));
        ExperienceLabel.setLayout(null);
        ExperienceLabel.setOpaque(true);
        ExperienceLabel.setForeground(Color.WHITE);
 
        LocationLabel.setBounds(100, 300, 180, 30);
        LocationLabel.setBackground (new Color(237,125,49));
        LocationLabel.setLayout(null);
        LocationLabel.setOpaque(true);
        LocationLabel.setForeground(Color.WHITE);
       
        TypeLabel.setBounds(100, 350, 180, 30);
        TypeLabel.setBackground (new Color(237,125,49));
        TypeLabel.setLayout(null);
        TypeLabel.setOpaque(true);
        TypeLabel.setForeground(Color.WHITE);
       
        GenderLabel.setBounds(100, 400, 180, 30);
        GenderLabel.setBackground (new Color(237,125,49));
        GenderLabel.setLayout(null);
        GenderLabel.setOpaque(true);
        GenderLabel.setForeground(Color.WHITE);
       
        RateLabel.setBounds(100, 450, 180, 30);
        RateLabel.setBackground (new Color(237,125,49));
        RateLabel.setLayout(null);
        RateLabel.setOpaque(true);
        RateLabel.setForeground(Color.WHITE);
 
        StatusLabel.setBounds(100, 500, 180, 30);
        StatusLabel.setBackground (new Color(237,125,49));
        StatusLabel.setLayout(null);
        StatusLabel.setOpaque(true);
        StatusLabel.setForeground(Color.WHITE);
 
        RentedByLabel.setBounds(100, 550, 180, 30);
        RentedByLabel.setBackground (new Color(237,125,49));
        RentedByLabel.setLayout(null);
        RentedByLabel.setOpaque(true);
        RentedByLabel.setForeground(Color.WHITE);
 
 
        DriverNameTextField.setBounds(300, 150, 350, 30);
        DriverNameTextField.setBorder(BorderFactory.createMatteBorder(1, 01, 1, 1,  new Color(237,125,49)));
        DriverNameTextField.setFont(basic);
        DriverNameTextField.setForeground(Color.black);
        DriverNameTextField.setOpaque(false);
        DriverNameTextField.setEditable(false);
   
 
        DriverNumberTextField.setBounds(300, 200, 350, 30);
        DriverNumberTextField.setBorder(BorderFactory.createMatteBorder(1, 01, 1, 1,  new Color(237,125,49)));
        DriverNumberTextField.setFont(basic);
        DriverNumberTextField.setForeground(Color.black);
        DriverNumberTextField.setOpaque(false);
        DriverNumberTextField.setEditable(false);
 
        ExperienceTextField.setBounds(300, 250, 350, 30);
        ExperienceTextField.setBorder(BorderFactory.createMatteBorder(1, 01, 1, 1,  new Color(237,125,49)));
        ExperienceTextField.setFont(basic);
        ExperienceTextField.setForeground(Color.black);
        ExperienceTextField.setOpaque(false);
        ExperienceTextField.setEditable(false);
 
 
        LocationTextField.setBounds(300, 300, 350, 30);
        LocationTextField.setBorder(BorderFactory.createMatteBorder(1, 01, 1, 1,  new Color(237,125,49)));
        LocationTextField.setFont(basic);
        LocationTextField.setForeground(Color.black);
        LocationTextField.setOpaque(false);
        LocationTextField.setEditable(false);
 
   
        TypeTextField.setBounds(300,350,350,30);
        TypeTextField.setBackground(Color.white);
        TypeTextField.setOpaque(true);
        TypeTextField.setEditable(false);
 
TypeTextField.setBorder(BorderFactory.createMatteBorder(1, 01, 1, 1,  new Color(237,125,49)));

        GenderTextField.setBounds(300, 400, 350, 30);
        GenderTextField.setBorder(BorderFactory.createMatteBorder(1, 01, 1, 1,  new Color(237,125,49)));
        GenderTextField.setFont(basic);
        GenderTextField.setForeground(Color.black);
        GenderTextField.setOpaque(false);
        GenderTextField.setEditable(false);
 
 
  RateTextField .setBorder(BorderFactory.createMatteBorder(1, 01, 1, 1,  new Color(237,125,49)));
        RateTextField.setBounds(300,450,350,30);
        RateTextField.setBackground(Color.white);
        RateTextField.setOpaque(true);
        RateTextField.setEditable(false);
 
 
        StatusTextField.setBounds(300,500,350,30);
        StatusTextField.setBackground(Color.white);
        StatusTextField.setOpaque(true);
        StatusTextField.setEditable(false);
 StatusTextField.setBorder(BorderFactory.createMatteBorder(1, 01, 1, 1,  new Color(237,125,49)));


        RentedTextField.setBounds(300,550,350,30);
        RentedTextField.setBackground(Color.white);
        RentedTextField.setOpaque(true);
        RentedTextField.setEditable(false);
 RentedTextField.setBorder(BorderFactory.createMatteBorder(1, 01, 1, 1,  new Color(237,125,49)));
       
 
         RentButton.setBounds(900, 650, 150, 40);
         RentButton.setFont(new Font("Arial", Font.BOLD, 16));
         RentButton.setFocusable(false);
         RentButton.setBorderPainted(true);
         RentButton.setContentAreaFilled(false);
         RentButton.setFocusPainted(false);
         RentButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
         RentButton.setOpaque(true);
         RentButton.setForeground(Color.black);
         RentButton.setBackground (new Color(237,125,49));
         RentButton.addActionListener(this);
 
         
        
 
        BackButton.setFont(new Font("Arial", Font.BOLD, 15));
        BackButton.setBounds(10,0,150,30);
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.setForeground(Color.black);
        BackButton.setBackground (new Color(237,125,49));
        BackButton.addActionListener(this);
       
 
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(1366, 768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
 
        frame.add(text1);
        frame.add(DriverNameLabel);
        frame.add(DriverNumberLabel);
        frame.add(ExperienceLabel);
        frame.add(LocationLabel);
        frame.add(TypeLabel);
        frame.add(GenderLabel);
        frame.add(RateLabel);
        frame.add(StatusLabel);
        frame.add(RentedByLabel);
       
   
 
        frame.add(DriverNameTextField);
        frame.add(DriverNumberTextField);
        frame.add(ExperienceTextField);
        frame.add(LocationTextField);
        frame.add(TypeTextField);
        frame.add(GenderTextField);
        frame.add(RateTextField);
        frame.add(StatusTextField);
        frame.add(RentedTextField);
 
          frame.add(BackButton);
        frame.add(RentButton);
 
     DriverInfo();
    }
 public void DriverInfo(){
      try (BufferedReader br = new BufferedReader(new FileReader("data\\DriverInfo.txt"))){
       
         String line;
     
            StringBuilder DriverInfoBuilder = new StringBuilder();
 
            while ((line = br.readLine()) != null) {
               
             
                if (line.replace("-", "").isEmpty()) {
                   
                    String[] DriverInfo = DriverInfoBuilder.toString().split("\n");
 
                    // Process the userInfo array
                    if (DriverInfo.length >= 14) {
                       
                        String storedDriverName = DriverInfo[0].split(":")[1].trim();
                        String StoredDriverNumber = DriverInfo[1].split(":")[1].trim();
                        String StoredExperience=DriverInfo[5].split(":")[1].trim();
                        String StoredLocation= DriverInfo[11].split(":")[1].trim();
                        String StoredType= DriverInfo[6].split(":")[1].trim();
                        String StoredGender= DriverInfo[13].split(":")[1].trim();
                        String Storedrate= DriverInfo[7].split(":")[1].trim();
                        String StoredStatus= DriverInfo[10].split(":")[1].trim();
                       String StoredRentedBy = DriverInfo[12].split(":")[1].trim();
                       
 
                        if (storedDriverName.equals(DriverName) ) {
                          System.out.println("matched");
                            DriverNameTextField.setText(storedDriverName);
                            DriverNumberTextField.setText(StoredDriverNumber);
                            ExperienceTextField.setText(StoredExperience);
                           LocationTextField.setText(StoredLocation);
                            TypeTextField.setText(StoredType);
                            GenderTextField.setText(StoredGender);
                            RateTextField.setText(Storedrate);
                            StatusTextField.setText(StoredStatus);
                           RentedTextField.setText(StoredRentedBy);
                            Status=StoredStatus;
                            DriverRent=Storedrate;
                         
                    }
 
 
                    // Reset userInfoBuilder for the next user
                    DriverInfoBuilder = new StringBuilder();
                }} else {
                    DriverInfoBuilder.append(line).append("\n");
                   
                }    
 
            }
        }
         catch (IOException e) {
           System.out.println("FIle not found");
        }
 }
 
 
 
    @Override
   public void actionPerformed(ActionEvent e) {
       if (e.getSource() == BackButton) {
           frame.dispose();
           new CustomerDashboard(UserID);
       }
        if (e.getSource() ==RentButton) {
            if(Status.equals("Not Available")){
                JOptionPane.showMessageDialog(null,"Driver Not Available" , "Message",JOptionPane.OK_CANCEL_OPTION );
            }
            else{
            frame.dispose();
          new DriverPayment(DriverName,UserID, DriverRent );
            }
           
        }
 
 
 
    }
 
    private String DriverRent;
 
 
}