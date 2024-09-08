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
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.awt.Cursor;
 
 
public class OwnerActivity implements ActionListener,ListSelectionListener{
   
ImageIcon image=new ImageIcon("images\\owneractivity1.jpg");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);


    JFrame frame = new JFrame("Owner Activity");
 
    JLabel HelloLabel = new JLabel("   Hello,");
    JLabel AvailableCarLabel = new JLabel("    (Car You Added For Rent)");
 
    JTextField UserNameTextField= new JTextField();
   
  
   // JButton SeeDetailsButton=new JButton("Back");
 
 
    JDialog Dialog = new JDialog();
    Font basic=new Font("Arial",Font.PLAIN,16);
 
    JTable table = new JTable();
 
    DefaultTableModel model = new DefaultTableModel();
   
    JScrollPane scroll = new JScrollPane(table);
 
    private String[] column = { "Car No", "Car Model", "License no", "Color","Location","Hourly Rate","Car Type","Owner Name","Status","Rented By"};
    private String[] rows = new String[10];
 
    JLabel OwnerActivityLabel=new JLabel("Owner Activity");
    JButton BackButton =  new JButton("Back");
         
    private String UserName;
 
    OwnerActivity(String Id)
    {
        this.UserName=Id;

        imageLabel.setBounds(100,40,1200,300);
        label.setBounds(10,10,10,100);
        label.add(imageLabel);
                     
        HelloLabel.setBounds(650,80,150,40);
        HelloLabel.setBackground(Color.black);
        HelloLabel.setLayout(null);
        HelloLabel.setOpaque(false);
        HelloLabel.setForeground(Color.WHITE);
        HelloLabel.setFont(new Font("Arial",Font.BOLD,30));
 
        OwnerActivityLabel.setBounds(610,30,300,40);
        OwnerActivityLabel.setBackground(Color.black);
        OwnerActivityLabel.setLayout(null);
        OwnerActivityLabel.setOpaque(false);
        OwnerActivityLabel.setForeground(Color.WHITE);
        OwnerActivityLabel.setFont(new Font("Arial",Font.BOLD,30));
 
 
 
        AvailableCarLabel.setBounds(570,220,300,30);
        AvailableCarLabel.setBackground(Color.black);
        AvailableCarLabel.setLayout(null);
        AvailableCarLabel.setOpaque(false);
        AvailableCarLabel.setForeground(Color.WHITE);
        AvailableCarLabel.setFont(new Font("Arial",Font.BOLD,22));
 
        UserNameTextField.setBounds(790,85,250,30);
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
 
 
        model.setColumnIdentifiers(column);
 
 
        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(190);
        table.getColumnModel().getColumn(1).setPreferredWidth(190);
        table.getColumnModel().getColumn(2).setPreferredWidth(190);
        table.getColumnModel().getColumn(3).setPreferredWidth(190);
        table.getColumnModel().getColumn(4).setPreferredWidth(190);
        table.getColumnModel().getColumn(5).setPreferredWidth(190);
        table.getColumnModel().getColumn(6).setPreferredWidth(190);
        table.getColumnModel().getColumn(7).setPreferredWidth(190);
        table.getColumnModel().getColumn(8).setPreferredWidth(190);
        table.getColumnModel().getColumn(9).setPreferredWidth(190);
        table.getSelectionModel().addListSelectionListener(this);
 
        scroll.setBounds(15, 300, 1320, 500);
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
                    if(UserName.equals(Files.readAllLines(Paths.get(file)).get((i )).substring(12))){
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i+2).substring(20); // Registration Number
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11); // Car Model
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(10); // Location
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(16); // Licence Number
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(7); // Color
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 6)).substring(13); // Hourly Rate
                    rows[6] = Files.readAllLines(Paths.get(file)).get((i + 7)).substring(10); // Car type
                    rows[7] = Files.readAllLines(Paths.get(file)).get((i )).substring(12); // Owner Name
                    rows[8] = Files.readAllLines(Paths.get(file)).get((i +8)).substring(8); // Status
                    rows[9] = Files.readAllLines(Paths.get(file)).get((i + 9)).substring(10); // Rented By
                   
                    model.addRow(rows);
 
                }
                            }            }
 
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
 
 
 //       frame.add(locationComboBox);
 //       frame.add(ModelComboBox);
        frame.add(HelloLabel);
        frame.add(AvailableCarLabel);
        frame.add(UserNameTextField);
        frame.add(OwnerActivityLabel);
        frame.add(BackButton);
       // frame.add(ActivityButton);
       // frame.add(ProfileButton);
       // frame.add(SignOutButton);
       // frame.add(SeeDetailsButton);
       
        frame.add(scroll);
        frame.add(label);
        frame.add(imageLabel);
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
    //    if(e.getSource()==ProfileButton)
    //    {
    //          frame.dispose();
    //          new CustomerProfile(UserName);
    //        // new CustomerDashboard();
    //          //flag=1;
    //    }
    //     if(e.getSource()==SignOutButton)
    //    {
    //          frame.dispose();
    //          new LoginPage();
    //        // new CustomerDashboard();
    //          //flag=1;
    //    }
    //     if(e.getSource()==DriverButton)
    //    {
    //          frame.dispose();
    //        //  new DriverDashboard(UserName);
    //        // new CustomerDashboard();
    //          //flag=1;
    //    }
       if(e.getSource()==BackButton){
        frame.dispose();
        new OwnerProfile(UserName);
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
      new OwnerCarUpdate(selectedCarNumber, UserName);
        }
    }
 
   
     
}