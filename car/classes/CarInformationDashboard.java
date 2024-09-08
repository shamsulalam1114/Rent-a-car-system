package classes;
import interfage.*;
import data.*;
import images.*;
import javax.swing.BorderFactory;
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
 
 
public class CarInformationDashboard implements ActionListener{
   
    JFrame frame = new JFrame("Car information Dashboard");
 
   
    JLabel AvailableCarLabel = new JLabel("      ALL CAR INFORMATION ");
 
  //  JTextField UserNameTextField= new JTextField();
   
   // JButton ActivityButton = new JButton("Activity");
   // JButton ProfileButton = new JButton("Profile");
   // JButton SignOutButton = new JButton("Sign Out");
   // JButton NextButton = new JButton("Next");
   //  JButton BackButton = new JButton("Back");
    
    JButton SeeDetailsButton=new JButton("Back");
 
 
    JDialog Dialog = new JDialog();
    Font basic=new Font("Arial",Font.PLAIN,16);
 
    JTable table = new JTable();
 
    DefaultTableModel model = new DefaultTableModel();
   
    JScrollPane scroll = new JScrollPane(table);
 
    private String[] column = { "Owner name", "Car Model", "Registration number", "license number",
    "Color","Location","Hourly Rent","Car Type","Status","Rented By"};
    private String[] rows = new String[10];
 
    private String UserName;
 
    CarInformationDashboard()
    {
       
                       
      
 
        AvailableCarLabel.setBounds(580,100,300,30);
        AvailableCarLabel.setBackground(Color.white);
        AvailableCarLabel.setLayout(null);
        AvailableCarLabel.setOpaque(true);
        AvailableCarLabel.setForeground(Color.BLACK);
        AvailableCarLabel.setFont(new Font("Arial",Font.BOLD,22));
 
        // UserNameTextField.setBounds(740,78,250,18);
        // UserNameTextField.setFont(basic);
        // //UserNameTextField.setText(ID);
        // UserNameTextField.setForeground(Color.black);
        // UserNameTextField.setOpaque(true);
        // UserNameTextField.setFont(new Font("Arial",Font.BOLD,16));
        // UserNameTextField.setEditable(false);
 
     
       
        SeeDetailsButton.setBounds(30,20,120,30);
        SeeDetailsButton.setForeground(Color.black);
        SeeDetailsButton.setFont(new Font("Arial",Font.BOLD,16));
        SeeDetailsButton.setFocusable(false);
        SeeDetailsButton.setBorderPainted(true);
        SeeDetailsButton.setContentAreaFilled(false);
        SeeDetailsButton.setFocusPainted(false);
        SeeDetailsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SeeDetailsButton.setOpaque(true);
        SeeDetailsButton.setForeground(Color.black);
        SeeDetailsButton.setBackground(Color.white);
        SeeDetailsButton.addActionListener(this);
   
 
        
 
     
 
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
        table.getColumnModel().getColumn(6).setPreferredWidth(220);
        table.getColumnModel().getColumn(7).setPreferredWidth(220);
        table.getColumnModel().getColumn(8).setPreferredWidth(220);
        table.getColumnModel().getColumn(9).setPreferredWidth(220);
        //table.getSelectionModel().addListSelectionListener(this);
 
        scroll.setBounds(15, 180, 1320, 500);
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
                   //  private String[] column = { "Car No", "Car Model", "License no", "Color","Location",
                   //"Hourly Rate","Car Type","Owner Name","Status","Rented By"};
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12); // Owner name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11); // Car Model
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(20); // Registration Number
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(16); // License Number
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(7); // color
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(10); // location
                    rows[6] = Files.readAllLines(Paths.get(file)).get((i + 6)).substring(13); // Hourly rent
                    rows[7] = Files.readAllLines(Paths.get(file)).get((i + 7)).substring(10); // car type
                    rows[8] = Files.readAllLines(Paths.get(file)).get((i + 8)).substring(8); // status
                    rows[9] = Files.readAllLines(Paths.get(file)).get((i + 9)).substring(10); // rented by
                   
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
 
 
 //       frame.add(locationComboBox);
 //       frame.add(ModelComboBox);
        
        frame.add(AvailableCarLabel);
       // frame.add(UserNameTextField);
       // frame.add(ActivityButton);
       // frame.add(ProfileButton);
       // frame.add(SignOutButton);
        frame.add(SeeDetailsButton);
       
        frame.add(scroll);
     
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
   
       
       
       if(e.getSource()==SeeDetailsButton){
        frame.dispose();
        new AdminProfile();
       }
    }
    private String selectedCarNumber;
 
   
     
}
 
   