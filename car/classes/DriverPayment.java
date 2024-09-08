package classes;
import interfage.*;
import data.*;
import images.*;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
public class DriverPayment implements ActionListener{
    private static final String String = null;
 
    JFrame frame = new JFrame("Payment");
 
    JLabel PaymentLabel=new JLabel("Payment");
    JLabel nameLabel = new JLabel("  How many hours you want to rent for");
    JLabel TotalAmount=new JLabel("Total Amount");
   
    JButton BackButton=new JButton("Back");
    JButton PayNowButton=new JButton("Pay now");
    JTextField PaymentTextField = new JTextField();
   
    String [] RentHours = {
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
        "11",
        "12",
        "24"
       
 
    };
    JComboBox <String> RentHoursComboBox;
 
    private String DriverName;
    private String UserId;
    private String Payment;
   
    DriverPayment(String Driver,String Customer, String Payment)
    {
        this.DriverName=Driver;
        this.UserId=Customer;
        this.Payment=Payment;
        PaymentLabel.setBounds(480,100,200,40);
        PaymentLabel.setForeground(new Color(255,204,0));
        PaymentLabel.setBackground(Color.white);
        PaymentLabel.setFont(new Font("Arial",Font.BOLD , 24));
        PaymentLabel.setOpaque(true);
       
 
        nameLabel.setBounds(430,160,250,30);
        nameLabel.setForeground(Color.white);
        nameLabel.setLayout(null);
        PaymentLabel.setFont(new Font("Arial",Font.BOLD , 24));
        //nameLabel.setBorder(false);
        nameLabel.setOpaque(false);
     
 
     
       
        RentHoursComboBox=new JComboBox<>(RentHours);
        RentHoursComboBox.setBounds(430,200,300,30);
        RentHoursComboBox.setBackground(Color.white);
        RentHoursComboBox.setOpaque(true);
 
       
     
       
     
 
        BackButton.setBounds(80,0  ,150,30);
        BackButton.setForeground(Color.black);
        BackButton.setFont(new Font("Arial",Font.BOLD,20));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.setForeground(Color.yellow);
        BackButton.setBackground(Color.blue);
        BackButton.addActionListener(this);
 
       
        PayNowButton.setBounds(400,260  ,150,30);
        PayNowButton.setForeground(Color.black);
        PayNowButton.setFont(new Font("Arial",Font.BOLD,20));
        PayNowButton.setFocusable(false);
        PayNowButton.setBorderPainted(true);
        PayNowButton.setContentAreaFilled(false);
        PayNowButton.setFocusPainted(false);
        PayNowButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        PayNowButton.setOpaque(true);
        PayNowButton.setForeground(Color.yellow);
        PayNowButton.setBackground(Color.blue);
        PayNowButton.addActionListener(this);
 
        TotalAmount.setBounds(560,260,180,30);
        TotalAmount.setForeground(new Color(255,204,0));
        TotalAmount.setBackground(Color.white);
        TotalAmount.setFont(new Font("Arial",Font.BOLD , 24));
        TotalAmount.setOpaque(true);
 
        PaymentTextField.setBounds(760,260,200,30);
        PaymentTextField.setForeground(new Color(255,204,0));
        PaymentTextField.setBackground(Color.white);
        PaymentTextField.setFont(new Font("Arial",Font.BOLD , 24));
        PaymentTextField.setOpaque(true);
        //PaymentTextField.setText(""+ ShowAmount());
 
 
        frame.getContentPane().setBackground(new Color(0,0,170));
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.add(PaymentLabel);
        frame.add(nameLabel);
        frame.add(RentHoursComboBox);
        frame.add(BackButton);
        frame.add(PayNowButton);
        frame.add(TotalAmount);
        frame.add(PaymentTextField);
         
         ShowAmount();
 
    }
 
 
    public double CalculateAmount()
    {
       
        String RentHours=(String)RentHoursComboBox.getSelectedItem();
 
        double TotalHour = Double.parseDouble(RentHours);
        double PerHourRent = Double.parseDouble(Payment);
 
        return TotalHour * PerHourRent;
 
    }
 
    public void ShowAmount()
    {
        PaymentTextField.setText(""+ CalculateAmount());
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==PayNowButton){
        JOptionPane.showMessageDialog(null, "Payment Successful, Driver Rented Successfully", "Message", JOptionPane.OK_CANCEL_OPTION);
        System.out.println("Payment successful , Driver rented successfully");
        try {
            ResetRenter("data\\DriverInfo.txt", DriverName, UserId);
        } catch (IOException e1) {
           System.out.println("Renter reset Unsuccessful" );
        }
        try {
            ResetStatus("data\\DriverInfo.txt", DriverName);
        } catch (IOException e1) {
         System.out.println("Status reset Unsuccessful");
        }
        frame.dispose();
        new CustomerDashboard(UserId);
       }
       if(e.getSource()==BackButton){
        frame.dispose();
        new DriverRent(DriverName, UserId);
       }
    }
 
 
 
     protected void ResetStatus(String File,String Driver)throws IOException{
     
 
            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Name :" + Driver)) {
                    line=lines[i+10];
                    found = true;
                    // int index = line.indexOf("Password :") + "Password :".length();
                    // int endIndex = line.indexOf("\n", index);
                    String oldStatus = line.substring(8);
                    line = line.replace(oldStatus, "Not Available");
                    lines[i+10] = line;
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
 
         
           
 
            protected void ResetRenter(String File,String Driver,String Customer)throws IOException{
     
 
            String content = readFile(File);
            String[] lines = content.split("\n");
            boolean found = false;
         
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("Name :" + Driver)) {
                    line=lines[i+12];
                    found = true;
                    // int index = line.indexOf("Password :") + "Password :".length();
                    // int endIndex = line.indexOf("\n", index);
                    String oldRenter = line.substring(11);
                    line = line.replace(oldRenter, Customer);
                    lines[i+12] = line;
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
 
   
      String readFile(String file) throws IOException {
                StringBuilder content = new StringBuilder();
             
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                }
             
                return content.toString();
            }
             
             void writeFile(String file, String content) throws IOException {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                    bw.write(content);
                }
   
 
    }
 
   
 
}