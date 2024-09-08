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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.awt.Cursor;
 
 
public class CustomerDashboard implements ActionListener,ListSelectionListener{
    
    ImageIcon image=new ImageIcon("images\\driverinterfage1.jpg");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);

    JFrame frame = new JFrame("Customer Dashboard");
  

    JLabel HelloLabel = new JLabel("   Hello,");
    JLabel AvailableCarLabel = new JLabel("      Available car near you");
 
    JTextField UserNameTextField= new JTextField();
   
    JButton ActivityButton = new JButton("Activity");
    JButton ProfileButton = new JButton("Profile");
    JButton SignOutButton = new JButton("Sign Out");
   // JButton NextButton = new JButton("Next");
   //  JButton BackButton = new JButton("Back");
    JButton DriverButton = new JButton("Driver");
    JButton ModelButton = new JButton("Model");
    JButton LocationButton = new JButton("Location");
    JPanel panel=new JPanel();

 
 
    JDialog Dialog = new JDialog();
    Font basic=new Font("Arial",Font.PLAIN,16);
 
    JTable table = new JTable();
 
    DefaultTableModel model = new DefaultTableModel();
   
    JScrollPane scroll = new JScrollPane(table);
 
    private String[] column = { "Car Number", "Model", "Type", "Location", "Hourly rate","Status"};
    private String[] rows = new String[100];
 
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

    String[] VehicleType = {
        "Seden",
        "Coupe",
        "Micro Car",
        "Sports car",
        "Minivan",
        "SUV"
    };

    JComboBox<String>locationComboBox;
     JComboBox<String>ModelComboBox;
         
    private String UserName;
 
    CustomerDashboard(String ID)
    {
        this.UserName=ID;
                  
       // imageLabel.setBounds(0,00,1350,500);
          AvailableCarLabel.setBounds(450,55,100,10);
        AvailableCarLabel.setForeground(Color.white);
        AvailableCarLabel.setFont(new Font("Arial",Font.ITALIC,34));
 
        label.add(imageLabel);
        imageLabel.setBounds(0,20,1350,400);
        //label.setBounds(10,10,10,10);

        HelloLabel.setBounds(600,10,150,40);
        HelloLabel.setBackground(Color.black);
        HelloLabel.setLayout(null);
        HelloLabel.setOpaque(false);
        HelloLabel.setForeground(Color.WHITE);
        HelloLabel.setFont(new Font("Arial",Font.BOLD,40));
        HelloLabel.setFont(new Font("Arial",Font.ITALIC,40));
 
        AvailableCarLabel.setBounds(450,55,300,30);
        AvailableCarLabel.setBackground(Color.black);
        AvailableCarLabel.setLayout(null);
        AvailableCarLabel.setOpaque(false);
        AvailableCarLabel.setForeground(Color.WHITE);
        AvailableCarLabel.setFont(new Font("Arial",Font.BOLD,22));
        AvailableCarLabel.setFont(new Font("Arial",Font.ITALIC,22));
 
        UserNameTextField.setBounds(750,20,150,30);
        UserNameTextField.setFont(basic);
        UserNameTextField.setText(UserName);
        UserNameTextField.setEditable(false);
        UserNameTextField.setForeground(Color.white);
        UserNameTextField.setOpaque(false);
        UserNameTextField.setFont(new Font("Arial",Font.BOLD,30));
        UserNameTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));


        ActivityButton.setBounds(900,10,100,30);
        ActivityButton.setForeground(Color.black);
        ActivityButton.setFont(new Font("Arial",Font.BOLD,16));
        ActivityButton.setFocusable(false);
        ActivityButton.setBorderPainted(true);
        ActivityButton.setContentAreaFilled(false);
        ActivityButton.setFocusPainted(false);
        ActivityButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ActivityButton.setOpaque(true);
        ActivityButton.setForeground(Color.black);
        ActivityButton.setBackground(Color.white);
        ActivityButton.addActionListener(this);

        ProfileButton.setBounds(1050,10,100,30);
        ProfileButton.setForeground(Color.black);
        ProfileButton.setFont(new Font("Arial",Font.BOLD,16));
        ProfileButton.setFocusable(false);
        ProfileButton.setBorderPainted(true);
        ProfileButton.setContentAreaFilled(false);
        ProfileButton.setFocusPainted(false);
        ProfileButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ProfileButton.setOpaque(true);
        ProfileButton.setForeground(Color.black);
        ProfileButton.setBackground(Color.white);
        ProfileButton.addActionListener(this);

        SignOutButton.setBounds(1200,10,100,30);
        SignOutButton.setForeground(Color.black);
        SignOutButton.setFont(new Font("Arial",Font.BOLD,16));
        SignOutButton.setFocusable(false);
        SignOutButton.setBorderPainted(true);
        SignOutButton.setContentAreaFilled(false);
        SignOutButton.setFocusPainted(false);
        SignOutButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SignOutButton.setOpaque(true);
        SignOutButton.setForeground(Color.black);
        SignOutButton.setBackground(Color.white);
        SignOutButton.addActionListener(this); 

        
        DriverButton.setBounds(1120,300  ,170,25);
        DriverButton.setForeground(Color.black);
        DriverButton.setFont(new Font("Arial",Font.BOLD,20));
        DriverButton.setFocusable(false);
        DriverButton.setBorderPainted(true);
        DriverButton.setContentAreaFilled(false);
        DriverButton.setFocusPainted(false);
        DriverButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        DriverButton.setOpaque(true);
        DriverButton.setForeground(Color.white);
        DriverButton.setBackground(Color.red);
        DriverButton.addActionListener(this);

        ModelButton.setBounds(1080,250  ,120,25);
        ModelButton.setForeground(Color.black);
        ModelButton.setFont(new Font("Arial",Font.BOLD,20));
        ModelButton.setFocusable(false);
        ModelButton.setBorderPainted(true);
        ModelButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ModelButton.setOpaque(true);
        ModelButton.setForeground(Color.white);
        ModelButton.setBackground(Color.red);

        LocationButton.setBounds(1080,200  ,130,25);
        LocationButton.setForeground(Color.black);
        LocationButton.setFont(new Font("Arial",Font.BOLD,20));
        LocationButton.setFocusable(false);
        LocationButton.setBorderPainted(true);
        LocationButton.setOpaque(true);
        LocationButton.setForeground(Color.white);
        LocationButton.setBackground(Color.red);
        LocationButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        locationComboBox=new JComboBox<>(LocationType);
        locationComboBox.setBounds(1230,200,80,25);
        locationComboBox.setBackground(Color.white);
        locationComboBox.setOpaque(true);
        
        ModelComboBox=new JComboBox<>(VehicleType);
        ModelComboBox.setBounds(1230,250  ,80,25);
        ModelComboBox.setBackground(Color.white);
        ModelComboBox.setOpaque(true);
 
        model.setColumnIdentifiers(column);
 
 
        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(270);
        table.getColumnModel().getColumn(1).setPreferredWidth(210);
        table.getColumnModel().getColumn(2).setPreferredWidth(220);
        table.getColumnModel().getColumn(3).setPreferredWidth(200);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);
        table.getColumnModel().getColumn(5).setPreferredWidth(220);
        table.getSelectionModel().addListSelectionListener(this);
 
        scroll.setBounds(15, 350, 1320, 300);
        scroll.setBackground(Color.cyan);

         DefaultTableCellRenderer centerRenderer=new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);
 
 
        String file = "data\\CarDetails.txt";
 
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();
 
            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 10);
                if (x.equals("Owner Name")) {
                    
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i+2).substring(20); // Registration Number
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11); // Car Model
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 7)).substring(10); // Car Type
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(10); // Location
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 6)).substring(13); // Hourly Rent
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 8)).substring(8); // Status
                    model.addRow(rows);
                }
            }
 
        } catch (Exception ex) {
            System.out.println("error");
            return;
        }
 
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
 
 
        frame.add(locationComboBox);
        frame.add(ModelComboBox);
        frame.add(HelloLabel);
        frame.add(AvailableCarLabel);
        frame.add(UserNameTextField);
        frame.add(ActivityButton);
        frame.add(ProfileButton);
        frame.add(SignOutButton);
        frame.add(DriverButton);
        frame.add(ModelButton);
        frame.add(LocationButton);
        frame.add(scroll);
        frame.add(panel);

        panel.setBounds(0,0,1366,400);
        panel.setBackground(Color.BLACK);
        panel.add(imageLabel);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==ProfileButton)
       {
             frame.dispose();
             new CustomerProfile(UserName);
           // new CustomerDashboard();
             //flag=1;
       }
        if(e.getSource()==SignOutButton)
       {
             frame.dispose();
             new LoginPage();
           
       }
        if(e.getSource()==DriverButton)
       {
             frame.dispose();
             new DriverDashboard(UserName);
         
       }
        if(e.getSource()==ActivityButton)
       {
             frame.dispose();
            
             new CustomerActivity(UserName);
           
       }
    }
    private String selectedCarNumber;
 


   

    @Override
    public void valueChanged(ListSelectionEvent e) {
          if (!e.getValueIsAdjusting()&& table.getSelectedRow() != -1) {
            int selectedRow = table.getSelectedRow();
            // Perform actions based on the selected row
            // ...
  selectedCarNumber = (String) model.getValueAt(selectedRow, 0); // Replace columnIndex with the actual index of the column containing details
    frame.dispose();
      new CarRentalPage(selectedCarNumber, UserName);
        }
    }
    
 
     
}
 
   