package classes;
import interfage.*;
import data.*;
import images.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome implements ActionListener{
    JFrame frame=new JFrame("Car Rental System");
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JLabel text1=new JLabel("RENT-A-CAR");
    

    JLabel text2=new JLabel("Your Journey,Your Way With Our Car");
    JLabel text3=new JLabel("Rental App");
    JButton ContributionButton=new JButton("Developed By");
    JButton GetStartedButton=new JButton("Get Started");


    ImageIcon image=new ImageIcon("images\\welcomepage.png");
    JLabel label=new JLabel();
    JLabel imageLabel=new JLabel(image);

    public Welcome(){

        text1.setBounds(600,40,400,100);
        text1.setForeground(Color.red);
        text1.setFont(new Font("Arial",Font.BOLD,40));

        
        
        
        text2.setBounds(400,150,1000,100);
        text2.setForeground(Color.black);
        text2.setFont(new Font("Arial",Font.BOLD,34));
        text2.setFont(new Font("Arial",Font.ITALIC,34));

        
        text3.setBounds(600,200,1000,100);
        text3.setForeground(Color.black);
        text3.setFont(new Font("Arial",Font.BOLD,34));
        text3.setFont(new Font("Arial",Font.ITALIC,34));

        imageLabel.setBounds(0,200,1350,500);
        label.setBounds(10,10,10,10);
        label.add(imageLabel);


        // panel1.setBounds(0,0,683,768);
        // panel1.setBackground(Color.white);
        // panel1.setLayout(null);

        panel1.setBounds(0,0,1366,768);
        panel1.setBackground(Color.BLUE);
        panel1.setLayout(null);


        // panel1.add(ContributionButton);
        // panel1.add(GetStartedButton);
        // panel1.add(text1);
        // panel1.add(text2);
        // panel1.add(text3);
       // panel1.add(label);
         
        ContributionButton.setBounds(980,570,300,34);
        ContributionButton.setFocusable(false);
        ContributionButton.addActionListener(this);
        ContributionButton.setForeground(Color.white);
        ContributionButton.setBackground(Color.black);

        GetStartedButton.setBounds(980,620,300,34);
        GetStartedButton.setFocusable(false);
        GetStartedButton.addActionListener(this);
        GetStartedButton.setForeground(Color.white);
        GetStartedButton.setBackground(Color.black);


        frame.add(ContributionButton);
        frame.add(GetStartedButton);
        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.getContentPane().setBackground(Color.white);
        frame.add(label);
      //  frame.add(panel1);
      //  frame.add(panel2);
        frame.setSize(1366,768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
       
    }

     public void actionPerformed(ActionEvent e){
                if(e.getSource()==ContributionButton){
                    frame.dispose();
                    new Contribution();
                    
                }
                if(e.getSource()==GetStartedButton){
                     frame.dispose();
                   new LoginPage();
                   
                } 
            }
}
