/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.awt.Font;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ronita Adhikari
 */
public class Form_2 extends JFrame {
//    JButton button1 = new JButton();
//    JButton button2 = new JButton();
    
    Form_2()
    {
        setTitle("APPLICATION FORM2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label1 = new JLabel("Religion");
        label1.setBounds(100,45,300,50);
        label1.setFont(new Font("Raleway",Font.BOLD,25));
        add(label1);
        
        
        
        
        
        
        
        
        
        
        
        setLayout(null);
        setSize(850,800);
        setLocation(360,10);
        setResizable(false);
        setVisible(true);
    }
    
}
