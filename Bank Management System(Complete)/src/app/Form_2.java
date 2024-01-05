/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import MySQL.MySQLDatabase;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Ronita Adhikari
 */
public class Form_2 extends JFrame implements ActionListener{
    JButton submit_btn = new JButton();
    JButton cancel_btn = new JButton();
    JCheckBox checkBox;
    JComboBox religion_combo, category_combo;
    JTextField text_occupation, text_pan, text_adhar;
    JRadioButton savings_account_rb, fd_account_rb, current_account_rb, recurring_account_rb;
    AccountInformation accinfo;

    
    Form_2(AccountInformation accinfo)
    {
        this.accinfo = accinfo; 
        
        setTitle("APPLICATION FORM2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label1 = new JLabel("Religion");
        label1.setBounds(100,45,300,50);
        label1.setFont(new Font("Raleway",Font.BOLD,25));
        add(label1);
        
        String[] religion = {"Hindu","Chirsitian","Buddhist","Jain","Muslim","Jewish","Sikh","Other"};
        religion_combo = new JComboBox(religion);
        religion_combo.setBounds(350,55,400,30);
        religion_combo.setFont(new Font("Raleway",Font.PLAIN,20));
        add(religion_combo);
        
        JLabel label_category = new JLabel("Category");
        label_category.setBounds(100,100,300,50);
        label_category.setFont(new Font("Raleway",Font.BOLD,25));
        add(label_category);
        
        String[] category = {"General","SC","ST","OBC","Other"};
        category_combo = new JComboBox(category);
        category_combo.setBounds(350,110,400,30);
        category_combo.setFont(new Font("Raleway",Font.PLAIN,20));
        add(category_combo);
        
        JLabel label_Occupation = new JLabel("Occupation");
        label_Occupation.setBounds(100,160,300,50);
        label_Occupation.setFont(new Font("Raleway",Font.BOLD,25));
        add(label_Occupation);
        
        text_occupation = new JTextField();
        text_occupation.setBounds(350, 170, 400, 30);
        text_occupation.setFont(new Font("Raleway",Font.PLAIN,19));
        add(text_occupation);
        
        JLabel label_pan = new JLabel("PAN Number");
        label_pan.setBounds(100,220,300,50);
        label_pan.setFont(new Font("Raleway",Font.BOLD,25));
        add(label_pan);
        
        text_pan = new JTextField();
        text_pan.setBounds(350, 230, 400, 30);
        text_pan.setFont(new Font("Raleway",Font.PLAIN,19));
        add(text_pan);
        
        JLabel label_adhar = new JLabel("Aadhar Number");
        label_adhar.setBounds(100,280,300,50);
        label_adhar.setFont(new Font("Raleway",Font.BOLD,25));
        add(label_adhar);
        
        text_adhar = new JTextField();
        text_adhar.setBounds(350, 290, 400, 30);
        text_adhar.setFont(new Font("Raleway",Font.PLAIN,19));
        add(text_adhar);
        
        JLabel label_account = new JLabel("Account Type");
        label_account.setBounds(100,340,300,50);
        label_account.setFont(new Font("Raleway",Font.BOLD,25));
        add(label_account);
        
        savings_account_rb = new JRadioButton("Savings Account");
        savings_account_rb.setBounds(350, 340, 200, 40);
        savings_account_rb.setFont(new Font("Raleway",Font.PLAIN,18));
        savings_account_rb.setFocusable(false);
        add(savings_account_rb);
        
        fd_account_rb = new JRadioButton("Fixed Deposit Account");
        fd_account_rb.setBounds(550, 340, 250, 40);
        fd_account_rb.setFont(new Font("Raleway",Font.PLAIN,18));
        fd_account_rb.setFocusable(false);
        add(fd_account_rb);
        
        current_account_rb = new JRadioButton("Current Account");
        current_account_rb.setBounds(350, 410, 160, 40);
        current_account_rb.setFont(new Font("Raleway",Font.PLAIN,18));
        current_account_rb.setFocusable(false);
        add(current_account_rb);
        
        recurring_account_rb = new JRadioButton("Recurring Deposit Account");
        recurring_account_rb.setBounds(550, 410, 300, 40);
        recurring_account_rb.setFont(new Font("Raleway",Font.PLAIN,18));
        recurring_account_rb.setFocusable(false);
        add(recurring_account_rb);
        
        ButtonGroup group1=new ButtonGroup();
        group1.add(savings_account_rb);
        group1.add(fd_account_rb);
        group1.add(current_account_rb);
        group1.add(recurring_account_rb);
        
        checkBox = new JCheckBox();
        checkBox .setText("I hereby declare that the above mentioned details correct to the best of my knowledge");
        checkBox.setFocusable(false);
        checkBox.setBounds(100, 500, 750, 40);
        checkBox.setFont(new Font("Raleway",Font.PLAIN,17));
        add(checkBox);
        
        submit_btn = new JButton("Submit");
        submit_btn.setFont(new Font("Arial",Font.BOLD,16));
        submit_btn.setForeground(Color.WHITE);
        submit_btn.setBackground(Color.BLACK);
        submit_btn.setBounds(210, 600, 100, 40);
        submit_btn.setFocusable(false);
        submit_btn.addActionListener(this);
        add(submit_btn);
        
        
        cancel_btn = new JButton("Cancel");
        cancel_btn.setFont(new Font("Arial",Font.BOLD,16));
        cancel_btn.setForeground(Color.WHITE);
        cancel_btn.setBackground(Color.BLACK);
        cancel_btn.setBounds(540, 600, 100, 40);
        cancel_btn.setFocusable(false);
        cancel_btn.addActionListener(this);
        add(cancel_btn);
        
        setLayout(null);
        setSize(850,800);
        setLocation(360,10);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit_btn){
            if(checkBox.isSelected())
            {
                this.dispose();
                accinfo.generateAccNo();
                accinfo.setReligion((String)religion_combo.getSelectedItem());
                accinfo.setCategory((String)category_combo.getSelectedItem());
                accinfo.setOccupation(text_occupation.getText());
                accinfo.setPanNumber(text_pan.getText());
                accinfo.setAdhaarNumber(text_adhar.getText());
                if(savings_account_rb.isSelected())
                    accinfo.setAccountType("SAVINGS ACCOUNT");
                if(fd_account_rb.isSelected())
                    accinfo.setAccountType("FIXED DEPOSIT ACCOUNT");
                if(current_account_rb.isSelected())
                    accinfo.setAccountType("CURRENT ACCOUNT");
                if(recurring_account_rb.isSelected())
                    accinfo.setAccountType("RECURRING DEPOSIT ACCOUNT");
                try{
                    MySQL.MySQLDatabase sql;
                    sql = new MySQLDatabase("accountinfo",
                            "(firstname varchar(255), "
                                    + "middlename varchar(255), "
                                    + "lastname varchar(255), "
                                    + "gender varchar(255), "
                                    + "phone_number varchar(255), "
                                    + "DOB varchar(255), "
                                    + "email varchar(255), "
                                    + "address varchar(255), "
                                    + "state varchar(255), "
                                    + "city varchar(255), "
                                    + "religion varchar(255), "
                                    + "category varchar(255), "
                                    + "occupation varchar(255), "
                                    + "panNumber varchar(255), "
                                    + "adhaarNumber varchar(255), "
                                    + "accountType varchar(255), "
                                    + "accountNumber varchar(255),"
                                    + "accountBalance varchar(255))");
                    
                    sql.insertData(accinfo.getList());
                }
                catch(IOException | ClassNotFoundException | SQLException E){
                    E.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, 
                    "Account successfully created! Your new Account number is: XXXX XXXX XXXX " + accinfo.getAccountNumber(), 
                    "SUCCESS!", 
                    JOptionPane.PLAIN_MESSAGE);
                System.out.println(accinfo);  
                new HomePage();
            }    
            else
                JOptionPane.showMessageDialog(null, 
                    "Please check the box in order to preoceed!", 
                    "WARNING!", 
                    JOptionPane.WARNING_MESSAGE);
        }
        if(e.getSource() == cancel_btn)
        {
            this.dispose();
            new HomePage();
        }
    }    
}
