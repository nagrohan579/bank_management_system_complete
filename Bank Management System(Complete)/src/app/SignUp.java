/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import MySQL.MySQLDatabase;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Ronita Adhikari
 */
public class SignUp extends JFrame implements ActionListener{
    ImageIcon i1 ;
    Image i2;
    ImageIcon i3;
    JLabel label1;
    JPanel panel1;
    JPanel panel2;
    JTextField Email_text_field;
    JPasswordField password_text_field;
    JTextField Username_text_field;
    JTextField FullName_text_field;
    JButton signUp_button;
    
    SignUp()
    {
        setTitle("Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        i1=new ImageIcon("bank_register.jpg");
        i2=i1.getImage().getScaledInstance(480, 480, Image.SCALE_DEFAULT);
        i3=new ImageIcon(i2);
        label1 = new JLabel(i3);
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(350,480));
        panel2.setLayout(new GridBagLayout());
//        panel2.setBorder(BorderFactory.createLineBorder(Color.red,5));
        JLabel SignUp_Label1= new JLabel("Sign Up");
        SignUp_Label1.setPreferredSize(new Dimension(320,50));
//        SignUp_Label1.setBorder(BorderFactory.createLineBorder(Color.red,5));
        SignUp_Label1.setFont(new Font("AvantGrade",Font.BOLD,35));
//        panel2.add(SignUp_Label1);
        
        JLabel FullName_Label = new JLabel("Full Name");
        FullName_Label.setPreferredSize(new Dimension(280,30));
        FullName_Label.setFont(new Font("AvantGrade",Font.PLAIN,20));
//        panel2.add(SignUp_Label2);
        
        FullName_text_field=new JTextField(15);
        FullName_text_field.setMinimumSize(new Dimension(200, 25));
        FullName_text_field.setFont(new Font("AvantGrade",Font.PLAIN,16));
//        panel2.add(signUp_text_field);

        JLabel Email_Label = new JLabel("Email");
        Email_Label.setPreferredSize(new Dimension(280,30));
        Email_Label.setFont(new Font("AvantGrade",Font.PLAIN,20));
//        panel2.add(SignUp_Label2);
        
        Email_text_field=new JTextField(30);
        Email_text_field.setMinimumSize(new Dimension(200, 25));
        Email_text_field.setFont(new Font("AvantGrade",Font.PLAIN,16));
        
        JLabel UserName_Label = new JLabel("Username");
        UserName_Label.setPreferredSize(new Dimension(280,30));
        UserName_Label.setFont(new Font("AvantGrade",Font.PLAIN,20));
//        panel2.add(SignUp_Label2);
        
        Username_text_field=new JTextField(30);
        Username_text_field.setMinimumSize(new Dimension(200, 25));
        Username_text_field.setFont(new Font("AvantGrade",Font.PLAIN,16));
        
        JLabel password_Label = new JLabel("Password");
        password_Label.setPreferredSize(new Dimension(280,30));
        password_Label.setFont(new Font("AvantGrade",Font.PLAIN,20));
//        panel2.add(SignUp_Label2);
        
        password_text_field = new JPasswordField(30);
        password_text_field.setMinimumSize(new Dimension(200, 25));
        password_text_field.setFont(new Font("AvantGrade",Font.PLAIN,16));
        
        signUp_button = new JButton("Sign Up");
        signUp_button.setFont(new Font("Arial",Font.BOLD,16));
        signUp_button.setFocusable(false);
        signUp_button.setForeground(Color.WHITE);
        signUp_button.setBackground(Color.BLACK);
        signUp_button.setPreferredSize(new Dimension(200,300));
        signUp_button.addActionListener(this);
//        panel2.add(signUp_button);
        
        
        
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        panel2.add(SignUp_Label1,gbc);
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.insets=new Insets(8,0,8,0);
        panel2.add(FullName_Label,gbc);
        gbc.gridx=1;
        gbc.gridy=1;
        gbc.insets=new Insets(10,-10,8,8);
        panel2.add(FullName_text_field,gbc);
        
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.insets=new Insets(8,0,8,0);
        panel2.add(Email_Label,gbc);
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.insets=new Insets(10,-10,8,8);
        panel2.add(Email_text_field,gbc);
        
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.insets=new Insets(8,0,8,0);
        panel2.add(UserName_Label,gbc);
        gbc.gridx=1;
        gbc.gridy=3;
        gbc.insets=new Insets(10,-10,8,8);
        panel2.add(Username_text_field,gbc);
        
        gbc.gridx=0;
        gbc.gridy=4;
        gbc.insets=new Insets(8,0,8,0);
        panel2.add(password_Label,gbc);
        gbc.gridx=1;
        gbc.gridy=4;
        gbc.insets=new Insets(10,-10,8,8);
        panel2.add(password_text_field,gbc);
        
        gbc.gridx=0;
        gbc.gridy=5;
        gbc.insets=new Insets(8,8,8,0);
        panel2.add(signUp_button,gbc);
        
        
        
        
        
//        label1.setBounds(350,10,100,100);
        label1.setPreferredSize(new Dimension(480,480));
//      label1.setBorder(BorderFactory.createLineBorder(Color.RED,5));
        panel1.add(label1,BorderLayout.WEST);
        panel1.add(panel2,BorderLayout.EAST);
        
        add(panel1);

        setSize(850,480);
        setLocation(400,200);
        setResizable(false);
        setVisible(true);    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == signUp_button)
        {
            try {
                MySQL.MySQLDatabase sql = new MySQLDatabase("loginDetails",
                        "(fullname varchar(255), email varchar(255), username varchar(255), password varchar(255))");
                sql.insertData(Arrays.asList(
                        FullName_text_field.getText(),
                        Email_text_field.getText(),
                        Username_text_field.getText(),
                        new String(password_text_field.getPassword())
               ));
                
                this.dispose();
                new Login();
            } catch (SQLException | ClassNotFoundException | IOException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
