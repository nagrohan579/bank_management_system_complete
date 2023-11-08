/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Ronita Adhikari
 */
public class Form_1 extends JFrame implements ActionListener{
    
    JButton button = new JButton("Next");
    
    Form_1()
    {
        setTitle("APPLICATION FORM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        i1=new ImageIcon("bank.png");
//        i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        i3=new ImageIcon(i2);
//        image = new JLabel(i3);
//        image.setBounds(25,10,100,100);
//        add(image);

        
        
        JLabel label1 = new JLabel("Bank Account Registration Form");
        label1.setBounds(40,95,600,50);
        label1.setFont(new Font("Raleway",Font.BOLD,35));
        add(label1);
        
        JLabel line1 = new JLabel();
        line1.setBounds(10, 170, 815, 1);
        line1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        add(line1);
         
        
//        JLabel label2 = new JLabel("Page 1");
//        label2.setBounds(350,70,600,30);
//        label2.setFont(new Font("Raleway",Font.BOLD,22));
//        add(label2);
        
//        JLabel label3 = new JLabel("Personal Details");
//        label3.setBounds(300,95,600,30);
//        label3.setFont(new Font("Raleway",Font.BOLD,22));
//        add(label3);
        
//        JLabel labelName = new JLabel("Account Information ");
//        labelName.setBounds(40,190,250,30);
//        labelName.setFont(new Font("Raleway",Font.BOLD,25));
//        add(labelName);

        JLabel labelName = new JLabel("Personal Information ");
        labelName.setBounds(40,190,250,30);
        labelName.setFont(new Font("Raleway",Font.BOLD,25));
        add(labelName);
        
        JLabel labelInfoName = new JLabel("The information given in the section is considered as the information of the primary account owner information");
        labelInfoName.setBounds(40,210,800,50);
        labelInfoName.setFont(new Font("Raleway",Font.ITALIC,15));
        add(labelInfoName);
        
//        textName=new JTextField();
//        textName.setFont(new Font("Raleway",Font.BOLD,14));
//        textName.setBounds(200,190,600,30);
//        add(textName);
        
//        JLabel labelAccName = new JLabel("Account type");
//        labelAccName.setBounds(40,240,300,30);
//        labelAccName.setFont(new Font("Raleway",Font.PLAIN,20));
//        add(labelAccName);
        
//         String[] accounts = {"Please Select","Checking Account","Savings Account","A Money Market Account","Cerificates of Deposit","IRA Account"};
//        JComboBox Acc_combo=new JComboBox(accounts);
//        Acc_combo.setBounds(40,280,300,30);
//        Acc_combo.setFont(new Font("Raleway",Font.PLAIN,20));
//        add(Acc_combo);
        
//        JLabel labelcurrName = new JLabel("Currency type");
//        labelcurrName.setBounds(500,240,300,30);
//        labelcurrName.setFont(new Font("Raleway",Font.PLAIN,20));
//        add(labelcurrName);
        
//        String[] currency = {"Please Select","USD - US Dollar","EUR - Euro","GBP - Pound Sterling","CAD - Canadian Dollar","KWD - Kuwaiti Dinar"};
//        JComboBox curr_comboBox=new JComboBox(currency);
//        curr_comboBox.setBounds(500,280,300,30);
//        curr_comboBox.setFont(new Font("Raleway",Font.PLAIN,20));
//        add(curr_comboBox);
        
//        JLabel labelperName = new JLabel("Personal Information ");
//        labelperName.setBounds(40,340,250,30);
//        labelperName.setFont(new Font("Raleway",Font.BOLD,25));
//        add(labelperName);
        
//        JLabel labelInfoName = new JLabel("The information given in the section is considered as the information of the primary account owner information");
//        labelInfoName.setBounds(40,370,800,50);
//        labelInfoName.setFont(new Font("Raleway",Font.ITALIC,15));
//        add(labelInfoName);
        
        JLabel labelFullName = new JLabel("Name");
        labelFullName.setBounds(40,270,250,30);
        labelFullName.setFont(new Font("Raleway",Font.PLAIN,25));
        add(labelFullName);
        
        JTextField text1_name = new JTextField(15);
        text1_name.setBounds(40,310,250,40);
        text1_name.setFont(new Font("Raleway",Font.PLAIN,16));
        add(text1_name);
        
        JTextField text2_name = new JTextField(15);
        text2_name.setBounds(300,310,250,40);
        text2_name.setFont(new Font("Raleway",Font.PLAIN,16));
        add(text2_name);
        
        JTextField text3_name = new JTextField(15);
        text3_name.setBounds(560,310,250,40);
        text3_name.setFont(new Font("Raleway",Font.PLAIN,16));
        add(text3_name);
        
        JLabel label_prefix_Name = new JLabel("First Name");
        label_prefix_Name.setBounds(40,350,100,20);
        label_prefix_Name.setFont(new Font("Raleway",Font.PLAIN,15));
        add(label_prefix_Name);
        
        JLabel label_first_Name = new JLabel("Middle Name");
        label_first_Name.setBounds(300,350,100,20);
        label_first_Name.setFont(new Font("Raleway",Font.PLAIN,15));
        add(label_first_Name);
        
        JLabel label_last_Name = new JLabel("Last Name");
        label_last_Name.setBounds(560,350,100,20);
        label_last_Name.setFont(new Font("Raleway",Font.PLAIN,15));
        add(label_last_Name);
        
        JLabel labelGender = new JLabel("Gender");
        labelGender.setBounds(40,400,250,30);
        labelGender.setFont(new Font("Raleway",Font.PLAIN,25));
        add(labelGender);
        
        JRadioButton rd_gender1=new JRadioButton("Male");
        rd_gender1.setBounds(300,400,150,30);
        rd_gender1.setFont(new Font("Raleway",Font.PLAIN,20));
        add(rd_gender1);
        
        JRadioButton rd_gender2=new JRadioButton("Female");
        rd_gender2.setBounds(490,400,250,30);
        rd_gender2.setFont(new Font("Raleway",Font.PLAIN,20));
        add(rd_gender2);
        
        
        
        ButtonGroup group=new ButtonGroup();
        group.add(rd_gender1);
        group.add(rd_gender2);
        
        
        
        JLabel labelPhoneNumber = new JLabel("Phone Number");
        labelPhoneNumber.setBounds(40,460,250,30);
        labelPhoneNumber.setFont(new Font("Raleway",Font.PLAIN,25));
        add(labelPhoneNumber);
        
        JTextField text_phone = new JTextField(10);
        text_phone.setBounds(40, 510, 380, 40);
        text_phone.setFont(new Font("Raleway",Font.PLAIN,25));
        add(text_phone);
        
        JLabel labelDOB = new JLabel("Date Of Birth");
        labelDOB.setBounds(510,460,250,30);
        labelDOB.setFont(new Font("Raleway",Font.PLAIN,25));
        add(labelDOB);
        
        String[] Dates = {"1","2","3","4","5","6","7","8","9","10", "11","12","13" ,"14", "15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        JComboBox Date_combo=new JComboBox(Dates);
        Date_combo.setBounds(500,510,80,40);
        Date_combo.setFont(new Font("Raleway",Font.PLAIN,20));
        add(Date_combo);
        
        String[] months = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        JComboBox month_combo=new JComboBox(months);
        month_combo.setBounds(600,510,80,40);
        month_combo.setFont(new Font("Raleway",Font.PLAIN,20));
        add(month_combo);
        
        String[] year = {"1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005"};
        JComboBox year_combo=new JComboBox(year);
        year_combo.setBounds(700,510,110,40);
        year_combo.setFont(new Font("Raleway",Font.PLAIN,20));
        add(year_combo);
        
        JLabel labelEmail = new JLabel("Address");
        labelEmail.setBounds(40,575,150,30);
        labelEmail.setFont(new Font("Raleway",Font.PLAIN,25));
        add(labelEmail);
        
        JTextField text_email = new JTextField(40);
        text_email.setBounds(155, 575, 655, 40);
        text_email.setFont(new Font("Raleway",Font.PLAIN,25));
        add(text_email);
        
        JLabel labelstate = new JLabel("State");
        labelstate.setBounds(40,640,150,30);
        labelstate.setFont(new Font("Raleway",Font.PLAIN,25));
        add(labelstate);
        
        JTextField text_state = new JTextField(40);
        text_state.setBounds(155, 640, 270, 40);
        text_state.setFont(new Font("Raleway",Font.PLAIN,25));
        add(text_state);
        
        JLabel labelcity = new JLabel("City");
        labelcity.setBounds(460,640,150,30);
        labelcity.setFont(new Font("Raleway",Font.PLAIN,25));
        add(labelcity);
        
        JTextField text_city = new JTextField(40);
        text_city .setBounds(530, 640, 280, 40);
        text_city .setFont(new Font("Raleway",Font.PLAIN,25));
        add(text_city );
        
        
//        JLabel labelcity = new JLabel("Address");
//        labelEmail.setBounds(40,575,150,30);
//        labelEmail.setFont(new Font("Raleway",Font.PLAIN,25));
//        add(labelEmail);
//        
//        JTextField text_city = new JTextField(40);
//        text_email.setBounds(40, 620, 775, 40);
//        text_email.setFont(new Font("Raleway",Font.PLAIN,25));
//        add(text_email);
        
        
        button.setBounds(700, 700, 100, 40);
        button.setFont(new Font("Raleway",Font.PLAIN,20));
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLACK);
        button.addActionListener(this);
                
        add(button);
        
//        JScrollPane scrollBar=new JScrollPane(this,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        add(scrollBar);
//     
        
        
        
        
//        textfName=new JTextField();
//        textfName.setFont(new Font("Raleway",Font.BOLD,14));
//        textfName.setBounds(200,240,600,30);
//        add(textfName);
        
        
        
        
        
        
//        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,10);
        setResizable(false);
        setVisible(true);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(e.getSource()==button)
              {
                  this.dispose();
//                  form2 ob3 = new form2();
                    Form_2 ob3 = new Form_2();
              }
    
    }
    
}
