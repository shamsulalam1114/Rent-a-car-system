package classes;
import interfage.*;
import data.*;
import images.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contribution  implements ActionListener {

    JLabel text1 = new JLabel("            DEVELOPER");
    JFrame frame = new JFrame("Contribution");
    JButton BackButton=new JButton("Back");
    JLabel group= new JLabel( "                            Group 2");

    Contribution() {

        text1.setBounds(550, 30, 300, 50);
        text1.setForeground(Color.white);
        text1.setBackground(Color.black);
        text1.setFont(new Font("Arial", Font.BOLD, 24));
        text1.setOpaque(true);


        
        group.setBounds(450, 550, 500, 80);
        group.setForeground(Color.white);
        group.setBackground(Color.black);
        group.setFont(new Font("Arial", Font.BOLD, 24));
        group.setOpaque(true);

        BackButton.setBounds(80,0  ,150,30);
        BackButton.setForeground(Color.white);
        BackButton.setFont(new Font("Arial",Font.BOLD,20));
        BackButton.setFocusable(false);
        BackButton.setBorderPainted(true);
        BackButton.setContentAreaFilled(false);
        BackButton.setFocusPainted(false);
        //BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BackButton.setOpaque(true);
      
        BackButton.setBackground(Color.black);
       BackButton.addActionListener(this);

        frame.getContentPane().setBackground(Color.WHITE);
        frame.setSize(1366, 768);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.add(text1);
        frame.add(BackButton);
         frame.add(group);

        addDeveloper(250, 100, "Khaled Md Raihan",  "                   23-50656-1 ", "images\\raihan.jpg");
        addDeveloper(500, 100, "Jafir Islam Siam", "                   23-50574-1", "images\\siam.jpg");
        addDeveloper(750, 100, "Md Redwanl Haque", "                 23-50057-1", "images\\ridwan.jpg");
        addDeveloper(1000, 100, "Dip Khastagir", "                 23-50346-1 ", "images\\dip.jpg");
    }

    private void addDeveloper(int x, int y, String name, String description, String imagePath) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(image);

        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(scaledIcon);
        imageLabel.setBounds(x, y, 200, 200);

        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        imageLabel.setBorder(border);

        JTextArea descriptionArea = new JTextArea(description);
        descriptionArea.setBounds(x, y + 210, 200, 50);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setEditable(false);

        JLabel nameLabel = new JLabel(name, SwingConstants.CENTER);
        nameLabel.setBounds(x, y + 260, 200, 30);

        frame.add(imageLabel);
        frame.add(descriptionArea);
        frame.add(nameLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==BackButton){
        frame.dispose();
        new Welcome();
       }
    }
}

    



