/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.awt.Font;
import javax.swing.JComboBox;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
        
        String[] religion = {"Hindu","Buddhist","Muslim","Jewish","Sikh","Other"};
        JComboBox religion_combo=new JComboBox(religion);
        religion_combo.setBounds(350,55,400,30);
        religion_combo.setFont(new Font("Raleway",Font.PLAIN,20));
        add(religion_combo);
        
        JLabel label_category = new JLabel("Category");
        label_category.setBounds(100,100,300,50);
        label_category.setFont(new Font("Raleway",Font.BOLD,25));
        add(label_category);
        
        String[] category = {"General","SC","ST","OBC","Other"};
        JComboBox category_combo=new JComboBox(category);
        category_combo.setBounds(350,110,400,30);
        category_combo.setFont(new Font("Raleway",Font.PLAIN,20));
        add(category_combo);
        
        JLabel label_Occupation = new JLabel("Occupation");
        label_Occupation.setBounds(100,160,300,50);
        label_Occupation.setFont(new Font("Raleway",Font.BOLD,25));
        add(label_Occupation);
        
        JTextField text_occupation = new JTextField();
        text_occupation.setBounds(350, 170, 400, 30);
        text_occupation.setFont(new Font("Raleway",Font.PLAIN,19));
        add(text_occupation);
        
        
        
        
        
        
        
        
        
        setLayout(null);
        setSize(850,800);
        setLocation(360,10);
        setResizable(false);
        setVisible(true);
    }
    
}
