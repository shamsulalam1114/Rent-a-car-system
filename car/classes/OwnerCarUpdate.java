package classes;
import interfage.*;
import data.*;
import images.*;
import javax.swing.JDialog;
import java.awt.Cursor;
import javax.swing.BorderFactory;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
//import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
 
import javax.swing.JDialog;
import java.awt.Cursor;
 
public class OwnerCarUpdate implements ActionListener {
    JFrame frame = new JFrame(" Car Details");
 
    JLabel text1 = new JLabel("       Your Car Details");
    JLabel CarModel = new JLabel("                 Car Model :");
    JLabel RegNumberLabel = new JLabel("                Registration No :");
    JLabel LicenseNumberLabel = new JLabel("            License No :");
    JLabel color = new JLabel("                   Color :");
    JLabel location = new JLabel("                  Location :");
    JLabel rate = new JLabel("                  Hourly rate :");
    JLabel typeLabel=new JLabel("                  Car Type");
    JLabel OwnerNameLabel=new JLabel(" Owner Name :");
    JLabel StatusLabel=new JLabel("Status :");
    JLabel RentedByLabel=new JLabel("Rented By :");
   
   
    JTextField ModelTextField = new JTextField();
    JTextField NumberTextField = new JTextField();
    JTextField LicenseNumberTextField = new JTextField();
    JTextField colorTextField = new JTextField();
    JTextField locationTextField = new JTextField();
    JTextField TypeTextField=new JTextField();
    JTextField rateTextField = new JTextField();
    JTextField OwnerNameTextField=new JTextField();
    JTextField StatusTextField=new JTextField();
    JTextField RentedByTextField=new JTextField();
    
 
    JButton BackButton = new JButton("Back");
    
    JButton UpdateButton=new JButton("Update");
 
 
    JDialog Dialog = new JDialog();
    Font basic = new Font("Arial", Font.PLAIN, 16);
    String CarRegNumber;

    String UserID;
    String Status;
 
   
   
    public OwnerCarUpdate(String CarRegNumber,String Id) {
        this.CarRegNumber=CarRegNumber;
        this.UserID=Id;
 
        text1.setBounds(630, 40, 230, 50);
        text1.setBackground(Color.blue);
        text1.setLayout(null);
        text1.setOpaque(true);
        text1.setForeground(Color.WHITE);
        text1.setFont(new Font("Arial", Font.BOLD, 18));
 
        CarModel.setBounds(100, 150, 180, 30);
        CarModel.setBackground(Color.blue);
        CarModel.setLayout(null);
        CarModel.setOpaque(true);
        CarModel.setForeground(Color.WHITE);
 
        RegNumberLabel.setBounds(100, 200, 180, 30);
        RegNumberLabel.setBackground(Color.blue);
        RegNumberLabel.setLayout(null);
        RegNumberLabel.setOpaque(true);
        RegNumberLabel.setForeground(Color.WHITE);
 
        LicenseNumberLabel.setBounds(100, 250, 180, 30);
        LicenseNumberLabel.setBackground(Color.blue);
        LicenseNumberLabel.setLayout(null);
        LicenseNumberLabel.setOpaque(true);
        LicenseNumberLabel.setForeground(Color.WHITE);
 
        color.setBounds(100, 300, 180, 30);
        color.setBackground(Color.blue);
        color.setLayout(null);
        color.setOpaque(true);
        color.setForeground(Color.WHITE);
       
        location.setBounds(100, 350, 180, 30);
        location.setBackground(Color.blue);
        location.setLayout(null);
        location.setOpaque(true);
        location.setForeground(Color.WHITE);
       
        rate.setBounds(100, 400, 180, 30);
        rate.setBackground(Color.blue);
        rate.setLayout(null);
        rate.setOpaque(true);
        rate.setForeground(Color.WHITE);
 
        typeLabel.setBounds(100, 450, 180, 30);
        typeLabel.setBackground(Color.blue);
        typeLabel.setLayout(null);
        typeLabel.setOpaque(true);
        typeLabel.setForeground(Color.WHITE);

        OwnerNameLabel.setBounds(100, 500, 180, 30);
        OwnerNameLabel.setBackground(Color.blue);
        OwnerNameLabel.setLayout(null);
        OwnerNameLabel.setOpaque(true);
        OwnerNameLabel.setForeground(Color.WHITE);

        StatusLabel.setBounds(100, 550, 180, 30);
        StatusLabel.setBackground(Color.blue);
        StatusLabel.setLayout(null);
        StatusLabel.setOpaque(true);
        StatusLabel.setForeground(Color.WHITE);

        RentedByLabel.setBounds(100, 600, 180, 30);
        RentedByLabel.setBackground(Color.blue);
        RentedByLabel.setLayout(null);
        RentedByLabel.setOpaque(true);
        RentedByLabel.setForeground(Color.WHITE);
        
 
 
        ModelTextField.setBounds(300, 150, 350, 30);
        ModelTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLUE));
        ModelTextField.setFont(basic);
        ModelTextField.setForeground(Color.black);
        ModelTextField.setOpaque(false);
        ModelTextField.setEditable(false);
 
        NumberTextField.setBounds(300, 200, 350, 30);
        NumberTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLUE));
        NumberTextField.setFont(basic);
        NumberTextField.setForeground(Color.black);
        NumberTextField.setOpaque(false);
        NumberTextField.setEditable(false);
 
        LicenseNumberTextField.setBounds(300, 250, 350, 30);
        LicenseNumberTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLUE));
        LicenseNumberTextField.setFont(basic);
        LicenseNumberTextField.setForeground(Color.black);
        LicenseNumberTextField.setOpaque(false);
        LicenseNumberTextField.setEditable(false);
 
 
        colorTextField.setBounds(300, 300, 350, 30);
        colorTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLUE));
        colorTextField.setFont(basic);
        colorTextField.setForeground(Color.black);
        colorTextField.setOpaque(false);
        colorTextField.setEditable(false);
 
        locationTextField.setText("Null");
        locationTextField.setBounds(300,350,400,30);
        locationTextField.setBackground(Color.white);
        locationTextField.setOpaque(true);
        locationTextField.setEditable(false);
 
        rateTextField.setBounds(300, 400, 350, 30);
        rateTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLUE));
        rateTextField.setFont(basic);
        rateTextField.setForeground(Color.black);
        rateTextField.setOpaque(false);
        rateTextField.setEditable(false);
 
 
   
        TypeTextField.setBounds(300,450,400,30);
        TypeTextField.setBackground(Color.white);
        TypeTextField.setOpaque(true);
        TypeTextField.setEditable(false);

  
        OwnerNameTextField.setBounds(300,500,400,30);
        OwnerNameTextField.setBackground(Color.white);
        OwnerNameTextField.setOpaque(true);
        OwnerNameTextField.setEditable(false);

        StatusTextField.setBounds(300,550,400,30);
        StatusTextField.setBackground(Color.white);
        StatusTextField.setOpaque(true);
        StatusTextField.setEditable(false);

        RentedByTextField.setBounds(300,600,400,30);
        RentedByTextField.setBackground(Color.white);
        RentedByTextField.setOpaque(true);
        RentedByTextField.setEditable(false);
 
 
        

         
         UpdateButton.setBounds(600, 650, 150, 40);
         UpdateButton.setFont(new Font("Arial", Font.BOLD, 16));
         UpdateButton.setFocusable(false);
         UpdateButton.setBorderPainted(true);
         UpdateButton.setContentAreaFilled(false);
         UpdateButton.setFocusPainted(false);
         UpdateButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
         UpdateButton.setOpaque(true);
         UpdateButton.setForeground(Color.white);
         UpdateButton.setBackground(Color.blue);
         UpdateButton.addActionListener(this);
      
       BackButton.setBounds(00, 0, 150, 40);
        BackButton.setFont(new Font("Arial", Font.BOLD, 15));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.setForeground(Color.white);
        BackButton.setBackground(Color.blue);
        BackButton.addActionListener(this);
 
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(1366, 768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
 
        frame.add(text1);
        frame.add(CarModel);
        frame.add(RegNumberLabel);
        frame.add(LicenseNumberLabel);
        frame.add(color);
        frame.add(location);
        frame.add(rate);
        frame.add(OwnerNameLabel);
        frame.add(StatusLabel);
        frame.add(RentedByLabel);
    
 
        frame.add(ModelTextField);
        frame.add(NumberTextField);
        frame.add(LicenseNumberTextField);
        frame.add(colorTextField);
        frame.add(locationTextField);
        frame.add(rateTextField);
        frame.add(typeLabel);
        frame.add(TypeTextField);
        frame.add(OwnerNameTextField);
        frame.add(StatusTextField);
        frame.add(RentedByTextField);
 
 
        frame.add(BackButton);
        
        frame.add(UpdateButton);
        CarInfo();
    }
 public void CarInfo(){
      try (BufferedReader br = new BufferedReader(new FileReader("data\\CarDetails.txt"))){
       
         String line;
       System.out.println("inside try");
            StringBuilder userInfoBuilder = new StringBuilder();
 
            while ((line = br.readLine()) != null) {
                System.out.println("Inside while loop");
              
                if (line.replace("-", "").isEmpty()) {
                    System.out.println("inside line if");
                    String[] userInfo = userInfoBuilder.toString().split("\n");
 
                    // Process the userInfo array
                    if (userInfo.length >= 10) {
                        System.out.println("inside userinfo length");
                        String storedOwnerame = userInfo[0].split(":")[1].trim();
                        String StoredModel = userInfo[1].split(":")[1].trim();
                        String StoredResisterNumber=userInfo[2].split(":")[1].trim();
                        String StoredLicenseNumber= userInfo[3].split(":")[1].trim();
                          String StoredColor= userInfo[4].split(":")[1].trim();
                            String StoredLocation= userInfo[5].split(":")[1].trim();
                              String StoredHourlyRate= userInfo[6].split(":")[1].trim();
                                String StoredType= userInfo[7].split(":")[1].trim();
                        String StoredStatus = userInfo[8].split(":")[1].trim();
                              String StoredRentedBy = userInfo[9].split(":")[1].trim();
 
                        if (StoredResisterNumber.equals(CarRegNumber) ) {
                            System.out.println("inside okay");
                            OwnerNameTextField.setText(storedOwnerame);
                            NumberTextField.setText(StoredResisterNumber);
                            LicenseNumberTextField.setText(StoredLicenseNumber);
                             colorTextField.setText(StoredColor);
                             locationTextField.setText(StoredLocation);
                             rateTextField.setText(StoredHourlyRate);
                            TypeTextField.setText(StoredType);
                            ModelTextField.setText(StoredModel);
                            StatusTextField.setText(StoredStatus);
                            RentedByTextField.setText(StoredRentedBy);
                            Status=StoredStatus;

                          
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
    


   {
        if(e.getSource()==BackButton){
            frame.dispose();
            new OwnerActivity(UserID);
        }
}
 
 
 
   
 
    }
     /*private void Update(){
        protected void ResetStatus(String File,String RegistrationNum)throws IOException{
     

            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Registration Number:" + RegistrationNum)) {
                    line=lines[i+6];
                    found = true;
                    // int index = line.indexOf("Password :") + "Password :".length();
                    // int endIndex = line.indexOf("\n", index);
                    String oldStatus = line.substring(8);
                    line = line.replace(oldStatus, "Not Available");
                    lines[i+6] = line;
                    break;
                }
            }
         
            if (found) {
                content = String.join("\n", lines);
                writeFile(File, content);
            } else {
                System.out.println("User not found");
            }
            
        }
 }/* */

 
}
