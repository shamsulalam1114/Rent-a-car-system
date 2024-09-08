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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.Image;
 import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.awt.Cursor;
 
 
public class CustomerActivity implements ActionListener,ListSelectionListener{
   
    ImageIcon image=new ImageIcon("images\\customeractivity.jpg");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);

    JFrame frame = new JFrame("Customer Activity");
 
    JLabel HelloLabel = new JLabel("   Hello,");
    JLabel AvailableCarLabel = new JLabel("  Cars You Have Rented");
 
    JTextField UserNameTextField= new JTextField();
   
  
   // JButton SeeDetailsButton=new JButton("Back");
 
 
    JDialog Dialog = new JDialog();
    Font basic=new Font("Arial",Font.PLAIN,16);
 
    JTable table = new JTable();
 
    DefaultTableModel model = new DefaultTableModel();
   
    JScrollPane scroll = new JScrollPane(table);
 
    private String[] column = { "Car No", "Car Model", "License no", "Color","Location","Hourly Rate","Car Type","Owner Name","Status","Rented By"};
    private String[] rows = new String[10];
 
    JLabel CustomerActivityLabel=new JLabel("Customer Activity");
    JButton BackButton =  new JButton("Back");
    JButton DriverButton=new JButton("Drivers");
         
    private String UserName;
 
    CustomerActivity(String Id)
    {
        this.UserName=Id;

        imageLabel.setBounds(00,180,700,700);
        label.setBounds(0,00,100,500);
        label.add(imageLabel);
       
                     
        HelloLabel.setBounds(580,80,150,40);
        HelloLabel.setBackground(Color.black);
        HelloLabel.setLayout(null);
        HelloLabel.setOpaque(false);
        HelloLabel.setForeground(Color.WHITE);
        HelloLabel.setFont(new Font("Arial",Font.BOLD,30));
 
        CustomerActivityLabel.setBounds(560,30,300,40);
        CustomerActivityLabel.setBackground(Color.black);
        CustomerActivityLabel.setLayout(null);
        CustomerActivityLabel.setOpaque(false);
        CustomerActivityLabel.setForeground(Color.WHITE);
        CustomerActivityLabel.setFont(new Font("Arial",Font.BOLD,30));
 
 
 
        AvailableCarLabel.setBounds(550,140,300,30);
        AvailableCarLabel.setBackground(Color.black);
        AvailableCarLabel.setLayout(null);
        AvailableCarLabel.setOpaque(false);
        AvailableCarLabel.setForeground(Color.WHITE);
        AvailableCarLabel.setFont(new Font("Arial",Font.BOLD,22));
 
        UserNameTextField.setBounds(710,85,250,30);
        UserNameTextField.setFont(basic);
        UserNameTextField.setText(Id);
        UserNameTextField.setForeground(Color.white);
        UserNameTextField.setOpaque(false);
        UserNameTextField.setFont(new Font("Arial",Font.BOLD,30));
        UserNameTextField.setEditable(false);
        UserNameTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));
   
       
        // SeeDetailsButton.setBounds(1000,100,270,30);
        // SeeDetailsButton.setForeground(Color.black);
        // SeeDetailsButton.setFont(new Font("Arial",Font.BOLD,16));
        // SeeDetailsButton.setFocusable(false);
        // SeeDetailsButton.setBorderPainted(true);
        // SeeDetailsButton.setContentAreaFilled(false);
        // SeeDetailsButton.setFocusPainted(false);
        // SeeDetailsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // SeeDetailsButton.setOpaque(true);
        // SeeDetailsButton.setForeground(Color.black);
        // SeeDetailsButton.setBackground(Color.white);
        // SeeDetailsButton.addActionListener(this);

       
        BackButton.setBounds(60,10  ,150,30);
        BackButton.setForeground(Color.black);
        BackButton.setFont(new Font("Arial",Font.BOLD,20));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.setBackground(Color.white);
        BackButton.addActionListener(this);

        DriverButton.setBounds(1120,150  ,150,25);
        DriverButton.setForeground(Color.black);
        DriverButton.setFont(new Font("Arial",Font.BOLD,20));
        DriverButton.setFocusable(false);
        DriverButton.setBorderPainted(true);
        DriverButton.setContentAreaFilled(false);
        DriverButton.setFocusPainted(false);
        DriverButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        DriverButton.setOpaque(true);
        DriverButton.setForeground(Color.black);
        DriverButton.setBackground(Color.white);
        DriverButton.addActionListener(this);
 
 
        model.setColumnIdentifiers(column);
 
 
        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(164);
        table.getColumnModel().getColumn(1).setPreferredWidth(164);
        table.getColumnModel().getColumn(2).setPreferredWidth(164);
        table.getColumnModel().getColumn(3).setPreferredWidth(164);
        table.getColumnModel().getColumn(4).setPreferredWidth(164);
        table.getColumnModel().getColumn(5).setPreferredWidth(164);
        table.getColumnModel().getColumn(6).setPreferredWidth(164);
        table.getColumnModel().getColumn(7).setPreferredWidth(164);
        table.getColumnModel().getColumn(8).setPreferredWidth(164);
        table.getColumnModel().getColumn(9).setPreferredWidth(164);
        table.getSelectionModel().addListSelectionListener(this);
 
        scroll.setBounds(515, 280, 820, 400);
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
                    // { "Car No", "Car Model", "License no", "Color","Location","Hourly Rate","Car Type","Owner Name","Status","Rented By"}
                    if(UserName.equals(Files.readAllLines(Paths.get(file)).get((i + 9)).substring(10))){
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i+2).substring(20); // Registration Number
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11); // Car Model
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(16); // license
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(7); //color
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(10); // location
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 6)).substring(13); // Hourly Rate
                    rows[6] = Files.readAllLines(Paths.get(file)).get((i + 7)).substring(10); // Car type
                    rows[7] = Files.readAllLines(Paths.get(file)).get((i )).substring(12); // Owner Name
                    rows[8] = Files.readAllLines(Paths.get(file)).get((i +8)).substring(8); // Status
                    rows[9] = Files.readAllLines(Paths.get(file)).get((i + 9)).substring(10); // Rented By
                   
                       model.addRow(rows);
                    }
 
                }
            }
 
        } catch (Exception ex) {
            System.out.println("error");
            return;
        }
 
        frame.getContentPane().setBackground(Color.black);
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
 

        frame.add(HelloLabel);
        frame.add(AvailableCarLabel);
        frame.add(UserNameTextField);
        frame.add(CustomerActivityLabel);
        frame.add(BackButton);
        frame.add(DriverButton);
        frame.add(imageLabel);
        frame.add(label);
       
        frame.add(scroll);
     
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
    
       if(e.getSource()==BackButton){
        frame.dispose();
        new CustomerDashboard(UserName);
       }
    if(e.getSource()==DriverButton){
        frame.dispose();
        new CustomerActivityDriver(UserName);
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
      new CarUpdatePage(selectedCarNumber, UserName);
        }
    }
 
   
     
}