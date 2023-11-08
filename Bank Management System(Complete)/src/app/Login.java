/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Ronita Adhikari
 */
public class Login extends JFrame implements ActionListener {
    ImageIcon i1 ;
    ImageIcon ii1 ;
    ImageIcon iii1 ;
    
    Image i2;
    Image ii2;
    Image iii2;
    
    ImageIcon i3;
    ImageIcon ii3 ;
    ImageIcon iii3 ;
    
    JLabel image;
    JLabel ii_image;
    JLabel iii_image;
    
    JLabel label1,label2,label3;
    JTextField text_field;
    JPasswordField password_field;
    JButton button1,button2,button3;
    Login()
    {
        setTitle("Bank Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        i1=new ImageIcon("bank.png");
        i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        i3=new ImageIcon(i2);
        image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);
        
        ii1=new ImageIcon("card.png");
        ii2=ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ii3=new ImageIcon(ii2);
        ii_image = new JLabel(ii3);
        ii_image.setBounds(650,350,100,100);
        add(ii_image);
        
        label1=new JLabel("WELCOME TO BANK");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);
        
        label2=new JLabel("User Id:");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway",Font.BOLD,20));
        label2.setBounds(150,190,375,30);
        add(label2);
        
        text_field=new JTextField(15);
        text_field.setBounds(300, 190, 230, 30);
        text_field.setFont(new Font("Arial",Font.BOLD,14));
        add(text_field);
        
        
        label3=new JLabel("Password:");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway",Font.BOLD,20));
        label3.setBounds(150,250,375,30);
        add(label3);
        
        password_field=new JPasswordField(15);
        password_field.setBounds(300, 250, 230, 30);
        password_field.setFont(new Font("Arial",Font.BOLD,14));
        add(password_field);
        
        button1 = new JButton("LOG IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300, 300, 100, 30);
        button1.addActionListener(this);
        add(button1);
        
        
        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430, 300, 100, 30);
        button2.addActionListener(this);
        add(button2);
        
        
        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300, 350, 230, 30);
        button3.addActionListener(this);
        add(button3);
        
        
        iii1=new ImageIcon("login.jpg");
        iii2=iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        iii3=new ImageIcon(iii2);
        iii_image = new JLabel(iii3);
        iii_image.setBounds(0,0,850,480);
        add(iii_image);
        
        setLayout(null);
        setSize(850,480);
        setLocation(400,200);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          try
          {
          if(e.getSource()==button1)
          {
              
          }
          else if(e.getSource()==button2)
          {
              text_field.setText("");
              password_field.setText("");
          }
          else if(e.getSource()==button3)
          {
              this.dispose();
              new SignUp();
          }
          
         
          }
          catch(Exception E)
                  {
                      E.printStackTrace();
                  }
    
    }
}
