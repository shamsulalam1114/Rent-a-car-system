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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 
public class DriverDashboard implements ActionListener,ListSelectionListener
{
    ImageIcon image=new ImageIcon("images\\carinside.jpg");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);
    JPanel panel=new JPanel();
    JFrame frame = new JFrame("Driver Dashboard");
 
    JLabel HelloLabel = new JLabel("   Hello,");
    JLabel AvailableCarLabel = new JLabel(" Available Driver near you");
 
    JTextField UserNameTextField= new JTextField();


    JButton ActivityButton = new JButton("Activity");
    JButton ProfileButton = new JButton("Profile");
    JButton SignOutButton = new JButton("Sign Out");
    JButton NextButton = new JButton("Next");
    JButton BackButton = new JButton("Back");
 
    JDialog Dialog = new JDialog();
    Font basic=new Font("Arial",Font.PLAIN,16);
 
    
    JTable table = new JTable();
 
    DefaultTableModel model = new DefaultTableModel();
   
    JScrollPane scroll = new JScrollPane(table);
 
   
    private String[] column = { "Driver ID", "Car Type", "Experience", "Location", "Rent Rate","Status"};
    private String[] rows = new String[100];
     
    private String UserName;
 
public DriverDashboard(String userID)
    {
       this.UserName=userID;

       label.add(imageLabel);
       imageLabel.setBounds(0,20,1366,400);

        HelloLabel.setBounds(600,10,150,40);
        HelloLabel.setBackground(Color.white);
        HelloLabel.setLayout(null);
        HelloLabel.setOpaque(false);
        HelloLabel.setForeground(Color.black);
        HelloLabel.setFont(new Font("Arial",Font.BOLD,40));
        HelloLabel.setFont(new Font("Arial",Font.ITALIC,40));
        HelloLabel.setFont(new Font("Arial",Font.ITALIC,40));

        AvailableCarLabel.setBounds(600,65,300,30);
        AvailableCarLabel.setBackground(Color.black);
        AvailableCarLabel.setLayout(null);
        AvailableCarLabel.setOpaque(false);
        AvailableCarLabel.setForeground(Color.black);
        AvailableCarLabel.setFont(new Font("Arial",Font.BOLD,22));
        AvailableCarLabel.setFont(new Font("Arial",Font.ITALIC,22));


        UserNameTextField.setBounds(750,20,150,30);
        UserNameTextField.setFont(basic);
        UserNameTextField.setText(UserName);
        UserNameTextField.setEditable(false);
        UserNameTextField.setForeground(Color.white);
        UserNameTextField.setOpaque(false);
        UserNameTextField.setFont(new Font("Arial",Font.BOLD,30));
        UserNameTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.white));
         
        
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
 
 
        NextButton.setBounds(1200,690,100,30);
        NextButton.setForeground(Color.black);
        NextButton.setFont(new Font("Arial",Font.BOLD,16));
        NextButton.setFocusable(false);
        NextButton.setBorderPainted(true);
        NextButton.setContentAreaFilled(false);
        NextButton.setFocusPainted(false);
        NextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        NextButton.setOpaque(true);
        NextButton.setForeground(Color.black);
        NextButton.setBackground(Color.white);
 
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
 
   
        model.setColumnIdentifiers(column);
 
 
        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(200);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getColumnModel().getColumn(3).setPreferredWidth(200);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);
        table.getColumnModel().getColumn(5).setPreferredWidth(200);
        table.getSelectionModel().addListSelectionListener(this);
        table.setGridColor(Color.BLACK); // Set to a color that contrasts with the table background
 
 
        scroll.setBounds(50, 400, 1205, 300);
        scroll.setBackground(Color.cyan);
 
        DefaultTableCellRenderer centerRenderer=new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);
 
 
 
        String file = "data\\DriverInfo.txt";
       // String file1 = "E:\\java\\Car Rental\\CarDetails.txt";
 
        try {
 
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
                reader.close();
 
            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("Name")) {

                    //    private String[] column = { "Driver ID", "Car Type", "Experience", "Location", "Rent Rate","Status"};
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(6); // Driver ID
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 6)).substring(6); // Car Type
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(11); // Experience
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 11)).substring(10); // Location
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 7)).substring(6); // rent
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 10)).substring(8); // status
                    model.addRow(rows);
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
 
 
    frame.add(ProfileButton); 
    frame.add(SignOutButton);
    frame.add(ActivityButton);
    frame.add(HelloLabel);
    frame.add(AvailableCarLabel);
    frame.add(UserNameTextField);
   // frame.add(NextButton);
    frame.add(BackButton);
   
    frame.add(scroll);
    panel.setBounds(0,0,1366,400);
    panel.setBackground(Color.black);
    frame.add(panel);
    panel.add(imageLabel);
 
    }

 
public void actionPerformed(ActionEvent e)
        {
              if(e.getSource()==BackButton)
              {
                    frame.dispose();
                  new CustomerDashboard(UserName);
                    //flag=1;
              }
              //if(e.getSource()==SignOutButton)
              //{
              //      flag=2;
              //}
              //if(e.getSource()==NextButton)
              //{
              //      flag=3;
              //}
              //  if(e.getSource()==ActivityButton)
              //{
              //      flag=4;
              //}
              //if(e.getSource()==ProfileButton){
              //  new RecoveryPage();
              //}
       
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
            if(e.getSource()==ActivityButton)
       {
             frame.dispose();
            
             new CustomerActivity(UserName);}
           
       }


        @Override
        public void valueChanged(ListSelectionEvent e) {
              if (!e.getValueIsAdjusting()&& table.getSelectedRow() != -1) {
                int selectedRow = table.getSelectedRow();
                // Perform actions based on the selected row
                // ...
      String selectedDriverName = (String) model.getValueAt(selectedRow, 0); // Replace columnIndex with the actual index of the column containing details
        frame.dispose();
          new DriverRent(selectedDriverName, UserName);
            }
        }
        
 
 
 
}