/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import MySQL.MySQLDatabase;
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

    ImageIcon i1;
    ImageIcon ii1;
    ImageIcon iii1;

    Image i2;
    Image ii2;
    Image iii2;

    ImageIcon i3;
    ImageIcon ii3;
    ImageIcon iii3;

    JLabel image;
    JLabel ii_image;
    JLabel iii_image;

    JLabel label1, label2, label3;
    JTextField username_text_field;
    JPasswordField password_field;
    JButton log_in_button, clear_button, sign_up_button;

    Login() {
        setTitle("Bank Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        i1 = new ImageIcon("bank.png");
        i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        i3 = new ImageIcon(i2);
        image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        add(image);

        ii1 = new ImageIcon("card.png");
        ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ii3 = new ImageIcon(ii2);
        ii_image = new JLabel(ii3);
        ii_image.setBounds(650, 350, 100, 100);
        add(ii_image);

        label1 = new JLabel("WELCOME TO BANK");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);

        label2 = new JLabel("User Id:");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway", Font.BOLD, 20));
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        username_text_field = new JTextField(15);
        username_text_field.setBounds(300, 190, 230, 30);
        username_text_field.setFont(new Font("Arial", Font.BOLD, 14));
        add(username_text_field);

        label3 = new JLabel("Password:");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway", Font.BOLD, 20));
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        password_field = new JPasswordField(15);
        password_field.setBounds(300, 250, 230, 30);
        password_field.setFont(new Font("Arial", Font.BOLD, 14));
        add(password_field);

        log_in_button = new JButton("LOG IN");
        log_in_button.setFont(new Font("Arial", Font.BOLD, 14));
        log_in_button.setFocusable(false);
        log_in_button.setForeground(Color.WHITE);
        log_in_button.setBackground(Color.BLACK);
        log_in_button.setBounds(300, 300, 100, 30);
        log_in_button.addActionListener(this);
        add(log_in_button);

        clear_button = new JButton("CLEAR");
        clear_button.setFont(new Font("Arial", Font.BOLD, 14));
        clear_button.setFocusable(false);
        clear_button.setForeground(Color.WHITE);
        clear_button.setBackground(Color.BLACK);
        clear_button.setBounds(430, 300, 100, 30);
        clear_button.addActionListener(this);
        add(clear_button);

        sign_up_button = new JButton("SIGN UP");
        sign_up_button.setFont(new Font("Arial", Font.BOLD, 14));
        sign_up_button.setFocusable(false);
        sign_up_button.setForeground(Color.WHITE);
        sign_up_button.setBackground(Color.BLACK);
        sign_up_button.setBounds(300, 350, 230, 30);
        sign_up_button.addActionListener(this);
        add(sign_up_button);

        iii1 = new ImageIcon("login.jpg");
        iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        iii3 = new ImageIcon(iii2);
        iii_image = new JLabel(iii3);
        iii_image.setBounds(0, 0, 850, 480);
        add(iii_image);

        setLayout(null);
        setSize(850, 480);
        setLocation(400, 200);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == log_in_button) {
                MySQLDatabase sql = new MySQLDatabase("loginDetails",
                        "(fullname varchar(255), email varchar(255), username varchar(255), password varchar(255))");
                if(sql.validatePassword(
                        username_text_field.getText(), 
                        new String(password_field.getPassword())))
                    new HomePage();
                
            } else if (e.getSource() == clear_button) {
                username_text_field.setText("");
                password_field.setText("");
            } else if (e.getSource() == sign_up_button) {
                this.dispose();
                new SignUp();
            }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }
}
