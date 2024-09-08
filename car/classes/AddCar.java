package classes;
import interfage.*;
import data.*;
import images.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import java.awt.Cursor;

public class AddCar extends Car implements ActionListener {

    ImageIcon image=new ImageIcon("images\\addcar.png");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);


    JFrame frame = new JFrame("ADD CAR FOR RENT PAGE");

    JLabel text1 = new JLabel("      ADD CAR FOR RENT");
    JLabel CarModel = new JLabel("                 Car Model :");
    JLabel RegNumberLabel = new JLabel("                Registration No :");
    JLabel LicenseNumberLabel = new JLabel("            License No :");
    JLabel color = new JLabel("                   Color :");
    JLabel location = new JLabel("                  Location :");
    JLabel rate = new JLabel("                  Hourly rate :"); 
    JLabel typeLabel=new JLabel("                  Car Type");
    //JLabel typeLabel=new JLabel("                  Car Type");
   // JLabel TypeLabel=new JLabel("          Prefered Vehicle Type :");
    String[] VehicleType = {
        "Seden",
        "Coupe",
        "Micro Car",
        "Sports car",
        "Minivan",
        "SUV"
    };
    String[] LocationType = {
        "Dhaka",
        "Chitagong",
        "Khuna",
        "Sylhet",
        "Barisal",
        "Rajshahi",
        "Mymonsingh",
        "Rangpur"
    };
         
   

    JComboBox<String>TypeComboBox;
    
    JComboBox<String>locationComboBox;
    
    
    
    JTextField NameTextField = new JTextField();
    JTextField NumberTextField = new JTextField();
    JTextField LicenseNumberTextField = new JTextField();
    JTextField colorTextField = new JTextField();
   // JTextField locationTextField = new JTextField();
    JTextField rateTextField = new JTextField();
    
   
   
  
    JButton BackButton = new JButton("Back");
    JButton DoneButton = new JButton("Done");


    JDialog Dialog = new JDialog();
    Font basic = new Font("Arial", Font.PLAIN, 16);
    String OwnerId;

   
   
    public AddCar(String OwnerId) {

        imageLabel.setBounds(600,00,800,800);
        label.setBounds(0,0,1000,700);
        label.add(imageLabel);

        this.OwnerId=OwnerId;
        // this.Model=NameTextField.getText();
        // this.Type=(String)TypeComboBox.getSelectedItem();
        // this.Status=true;
        // this.CarColor=colorTextField.getText();
        // this.HourlyRate=rateTextField.getText();
        // this.Location=locationTextField.getText();

    


        text1.setBounds(630, 40, 230, 50);
        text1.setBackground(Color.black);
        text1.setLayout(null);
        text1.setOpaque(true);
        text1.setForeground(Color.WHITE);
        text1.setFont(new Font("Arial", Font.BOLD, 18));

        CarModel.setBounds(100, 150, 180, 30);
        CarModel.setBackground(Color.black);
        CarModel.setLayout(null);
        CarModel.setOpaque(true);
        CarModel.setForeground(Color.WHITE);

        RegNumberLabel.setBounds(100, 200, 180, 30);
        RegNumberLabel.setBackground(Color.black);
        RegNumberLabel.setLayout(null);
        RegNumberLabel.setOpaque(true);
        RegNumberLabel.setForeground(Color.WHITE);

        LicenseNumberLabel.setBounds(100, 250, 180, 30);
        LicenseNumberLabel.setBackground(Color.black);
        LicenseNumberLabel.setLayout(null);
        LicenseNumberLabel.setOpaque(true);
        LicenseNumberLabel.setForeground(Color.WHITE);

        color.setBounds(100, 300, 180, 30);
        color.setBackground(Color.black);
        color.setLayout(null);
        color.setOpaque(true);
        color.setForeground(Color.WHITE);
        
        location.setBounds(100, 350, 180, 30);
        location.setBackground(Color.black);
        location.setLayout(null);
        location.setOpaque(true);
        location.setForeground(Color.WHITE);
       
        rate.setBounds(100, 400, 180, 30);
        rate.setBackground(Color.black);
        rate.setLayout(null);
        rate.setOpaque(true);
        rate.setForeground(Color.WHITE);

        typeLabel.setBounds(100, 450, 180, 30);
        typeLabel.setBackground(Color.black);
        typeLabel.setLayout(null);
        typeLabel.setOpaque(true);
        typeLabel.setForeground(Color.WHITE);


        NameTextField.setBounds(300, 150, 350, 30);
        NameTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        NameTextField.setFont(basic);
        NameTextField.setForeground(Color.black);
        NameTextField.setOpaque(false);

        NumberTextField.setBounds(300, 200, 350, 30);
        NumberTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        NumberTextField.setFont(basic);
        NumberTextField.setForeground(Color.black);
        NumberTextField.setOpaque(false);

        LicenseNumberTextField.setBounds(300, 250, 350, 30);
        LicenseNumberTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0,Color.black));
        LicenseNumberTextField.setFont(basic);
        LicenseNumberTextField.setForeground(Color.black);
        LicenseNumberTextField.setOpaque(false);


        colorTextField.setBounds(300, 300, 350, 30);
        colorTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        colorTextField.setFont(basic);
        colorTextField.setForeground(Color.black);
        colorTextField.setOpaque(false);

        locationComboBox=new JComboBox<>(LocationType);
        locationComboBox.setBounds(300,350,350,30);
        locationComboBox.setBackground(Color.white);
        locationComboBox.setOpaque(true);

        rateTextField.setBounds(300, 400, 350, 30);
        rateTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        rateTextField.setFont(basic);
        rateTextField.setForeground(Color.black);
        rateTextField.setOpaque(false);


        TypeComboBox=new JComboBox<>(VehicleType);
        TypeComboBox.setBounds(300,450,350,30);
        TypeComboBox.setBackground(Color.white);
        TypeComboBox.setOpaque(true);

       



        DoneButton.setBounds(300, 650, 150, 40);
   
        DoneButton.setFont(new Font("Arial", Font.BOLD, 16));
        DoneButton.setFocusable(false);
        DoneButton.setBorderPainted(true);
        DoneButton.setContentAreaFilled(false);
        DoneButton.setFocusPainted(false);
        DoneButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        DoneButton.setOpaque(true);
        DoneButton.setForeground(Color.white);
        DoneButton.setBackground(Color.black);
        DoneButton.addActionListener(this);

        BackButton.setBounds(70, 20, 100, 30);
        BackButton.setForeground(Color.white);
        BackButton.setFont(new Font("Arial", Font.BOLD, 15));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.setBackground(Color.black);
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

        frame.add(NameTextField);
        frame.add(NumberTextField);
        frame.add(NameTextField);
        frame.add(LicenseNumberTextField);
        frame.add(colorTextField);
        frame.add(locationComboBox);
        frame.add(rateTextField);
        frame.add(typeLabel);
        frame.add(TypeComboBox);
        frame.add(imageLabel);
        frame.add(label);

        frame.add(BackButton);
        frame.add(DoneButton);
    }
    public void AddingCar(){
String Type=(String)TypeComboBox.getSelectedItem();
String Location=(String)locationComboBox.getSelectedItem();
        if(!NameTextField.getText().isEmpty() && !NumberTextField.getText().isEmpty() && !LicenseNumberTextField.getText().isEmpty()
         && !colorTextField.getText().isEmpty() && !Location.isEmpty()
         && !rateTextField.getText().isEmpty() && !Type.isEmpty()){
            
      try {
                FileWriter f1=new FileWriter("data\\CarDetails.txt",true);
                f1.write("Owner Name :"+OwnerId+"\n"+"Car Model :"+NameTextField.getText()+"\n"+"Registration Number:"+NumberTextField.getText()+"\n"+"License Number :"+LicenseNumberTextField.getText()+"\n"
                +"Color :"+ colorTextField.getText()+"\n" +"Location :"+ Location+"\n"+"Hourly Rent :"+rateTextField.getText()+"\n" + "Car Type :"+Type+"\n"+"Status :Available"+"\n"+"Rented By:Null"+"\n");
               f1.write("-----------------------------------------------------------"+"\n");
                f1.close();
                JOptionPane.showMessageDialog(null,"Car Added Successfully",  "Message", JOptionPane.OK_CANCEL_OPTION);
                 frame.dispose();
           //new Car(Model,Type,Status,CarColor,HourlyRate,Location);
           new OwnerProfile(OwnerId);
            } catch (IOException e1) {
         System.out.println("Error");
       
         
       
    }
}
   
    else{
      JOptionPane.showMessageDialog(null,"Please Fill Up All The Fields Correctly",  "Message", JOptionPane.OK_CANCEL_OPTION);

  }          
       
        }
    



    @Override
   public void actionPerformed(ActionEvent e) {
       if (e.getSource() == BackButton) {
           frame.dispose();
           new OwnerProfile(OwnerId);
       }
        if (e.getSource() == DoneButton) {
           AddingCar();
           
        }

//    }

    // public static void main(String args[])
    // {
    // CustomerSignUp a = new CustomerSignUp();
    // }

//}

    }

}