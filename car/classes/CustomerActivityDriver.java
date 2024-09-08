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
 
 
public class CustomerActivityDriver implements ActionListener,ListSelectionListener
{
    ImageIcon image=new ImageIcon("images\\customeractivitydriver.png");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);
    
    JFrame frame = new JFrame("Driver Dashboard");
 
    JLabel HelloLabel = new JLabel("   Hello,");
    JLabel AvailableCarLabel = new JLabel("(Drivers You Have Rented)");
 
    JTextField UserNameTextField= new JTextField();
   
    JButton BackButton = new JButton("Back");
 
    JDialog Dialog = new JDialog();
    Font basic=new Font("Arial",Font.PLAIN,16);
 
    
    JTable table = new JTable();
 
    DefaultTableModel model = new DefaultTableModel();
   
    JScrollPane scroll = new JScrollPane(table);
 
   
    private String[] column = { "Driver ID", "Car Type", "Experience", "Location", "Rent Rate","Status"};
    private String[] rows = new String[100];
     
    private String UserName;
 
public CustomerActivityDriver(String userID)
    {
       this.UserName=userID;

       imageLabel.setBounds(00,180,700,700);
       label.setBounds(0,10,100,100);
       label.add(imageLabel);


        HelloLabel.setBounds(600,40,120,50);
        HelloLabel.setBackground(Color.white);
        HelloLabel.setLayout(null);
        HelloLabel.setOpaque(false);
        HelloLabel.setForeground(Color.white);
        HelloLabel.setFont(new Font("Arial",Font.BOLD,30));
        HelloLabel.setFont(new Font("Arial",Font.ITALIC,30));

        AvailableCarLabel.setBounds(550,95,300,30);
        AvailableCarLabel.setBackground(Color.black);
        AvailableCarLabel.setLayout(null);
        AvailableCarLabel.setOpaque(true);
        AvailableCarLabel.setForeground(Color.WHITE);
        AvailableCarLabel.setFont(new Font("Arial",Font.BOLD,22));
        AvailableCarLabel.setFont(new Font("Arial",Font.ITALIC,22));
 
        UserNameTextField.setBounds(710,52,150,30);
        UserNameTextField.setFont(basic);
        UserNameTextField.setText(UserName);
        UserNameTextField.setEditable(false);
        UserNameTextField.setForeground(Color.white);
        UserNameTextField.setOpaque(false);
        UserNameTextField.setFont(new Font("Arial",Font.BOLD,30));
        UserNameTextField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));

       
        BackButton.setBounds(60,10  ,150,30);
        BackButton.setForeground(Color.white);
        BackButton.setFont(new Font("Arial",Font.BOLD,20));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.setBackground(Color.black);
        BackButton.addActionListener(this);
 
   
        model.setColumnIdentifiers(column);
 
 
        table.setModel(model);
        table.setSelectionBackground(Color.white);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(120);
        table.getColumnModel().getColumn(3).setPreferredWidth(120);
        table.getColumnModel().getColumn(4).setPreferredWidth(120);
        table.getColumnModel().getColumn(5).setPreferredWidth(120);
        table.getSelectionModel().addListSelectionListener(this);
        table.setGridColor(Color.BLACK); // Set to a color that contrasts with the table background
 
 
        scroll.setBounds(650, 180, 720, 520);
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
                    if(UserName.equals(Files.readAllLines(Paths.get(file)).get(i+12).substring(11))){

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
    frame.add(BackButton);
   
    frame.add(scroll);
    frame.add(imageLabel);
    frame.add(label);
    }
 
public void actionPerformed(ActionEvent e)
        {
              if(e.getSource()==BackButton)
              {
                    frame.dispose();
                  new CustomerDashboard(UserName);
                  
              }
       
        }
     String selectedDriverName;

        @Override
        public void valueChanged(ListSelectionEvent e) {
              if (!e.getValueIsAdjusting()&& table.getSelectedRow() != -1) {
                int selectedRow = table.getSelectedRow();
                // Perform actions based on the selected row
                // ...
      selectedDriverName = (String) model.getValueAt(selectedRow, 0); // Replace columnIndex with the actual index of the column containing details
        frame.dispose();
          new DriverRent(selectedDriverName, UserName);
            }
        }
        
 
 
 
}
