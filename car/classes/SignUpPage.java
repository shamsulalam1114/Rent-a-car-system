package classes;
import interfage.*;
import data.*;
import images.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SignUpPage  implements ActionListener {
    JFrame frame=new JFrame("Sign Up");
    JLabel text1=new JLabel("Your Journey,Your Way With Our Car");
    JLabel text3=new JLabel("Rental App");
    JLabel text2=new JLabel("Sign Up As");
    JButton CustomerButton = new JButton("Customer");
    JButton DriverButton =  new JButton("Driver");
    JButton OwnerButton = new JButton("Owner");
    JButton BackButton=new JButton("Back");
    
    ImageIcon image=new ImageIcon("images\\signuppage.png");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);


    SignUpPage(){


        text1.setBounds(400,30,1000,100);
        text1.setForeground(Color.black);
        text1.setFont(new Font("Arial",Font.BOLD,34));
        text1.setFont(new Font("Arial",Font.ITALIC,34));
        
        text3.setBounds(600,80,1000,100);
        text3.setForeground(Color.black);
        text3.setFont(new Font("Arial",Font.BOLD,34));
        text3.setFont(new Font("Arial",Font.ITALIC,34));

        text2.setBounds(900,270,300,50);
        text2.setForeground(Color.RED);
        text2.setBackground(new Color(0,0,170));
        text2.setFont(new Font("Arial",Font.BOLD,24));
        text2.setFont(new Font("Arial",Font.ITALIC,34));

        imageLabel.setBounds(00,180,1000,700);
        label.setBounds(0,10,100,100);
        label.add(imageLabel);
        

        CustomerButton.setBounds(700,350,200,50);
        CustomerButton.setFont(new Font("Arial",Font.PLAIN,16));
        CustomerButton.setBackground(Color.black);
        CustomerButton.setForeground(Color.white);
        CustomerButton.setFocusable(false);
        CustomerButton.setBorderPainted(false);
        CustomerButton.addActionListener(this);
        

        DriverButton.setBounds(920,350,200,50);
        DriverButton.setFont(new Font("Arial",Font.PLAIN,16));
        DriverButton.setBackground(Color.black);
        DriverButton.setForeground(Color.white);
        DriverButton.setFocusable(false);
        DriverButton.setBorderPainted(false);
        DriverButton.addActionListener(this);
        
        OwnerButton.setBounds(1140,350,200,50);
        OwnerButton.setFont(new Font("Arial",Font.PLAIN,16));
        OwnerButton.setBackground(Color.black);
        OwnerButton.setForeground(Color.white);
        OwnerButton.setFocusable(false);
        OwnerButton.setBorderPainted(false);
        OwnerButton.addActionListener(this);

        BackButton.setBounds(80,0  ,150,30);
        BackButton.setForeground(Color.red);
        BackButton.setFont(new Font("Arial",Font.BOLD,20));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        //BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
        BackButton.setBackground(Color.black);
        BackButton.addActionListener(this);


        // label.setIcon(image);
        // dimension size=new d
        // label.dimensi

       // frame.setIconImage(image.getImage()); 



        frame.add(text1);
        frame.add(text3);
        frame.add(text2);
        frame.add(CustomerButton);
        frame.add(DriverButton);
        frame.add(OwnerButton);
        frame.add(BackButton);
        frame.add(label);
        frame.setSize(1366,768);
        frame.getContentPane().setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.add(imageLabel);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==CustomerButton){
        frame.dispose();
        new CustomerSignUp();
       }
       if(e.getSource()==DriverButton){
        frame.dispose();
        new DriverSignUp();
       }
       if(e.getSource()==OwnerButton){
        frame.dispose();
        new OwnerSignUp();
       }
       if(e.getSource()==BackButton){
        frame.dispose();
        new LoginPage();
       }
    }

}
    
// }public void actionPerformed(ActionEvent e)if(e.getSource()==CustomerButton){
//     frame.dispose();
//     new SignUpPage();
