package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class HomePage extends JFrame implements ActionListener{
    JPanel user_greeting_panel,user_accounts_panel;
    JLabel name_label;
    JButton add_account_button;

    public HomePage(){
        setTitle("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        name_label = new JLabel("Welcome "+User.name);
        name_label.setFont(new Font("AvantGrade",Font.BOLD,50));
        name_label.setVerticalAlignment(JLabel.CENTER);
        name_label.setForeground(Color.white);
        Border emptyBorder = new EmptyBorder(0, 10, 0, 70);
        name_label.setBorder(emptyBorder);
        
        user_greeting_panel = new JPanel();
        user_greeting_panel.setPreferredSize(new Dimension(850, 80));
        user_greeting_panel.setLayout(new BorderLayout());
        user_greeting_panel.setBackground(Color.black);
//        user_details_panel.setBorder(BorderFactory.createLineBorder(Color.black));
        user_greeting_panel.add(name_label,BorderLayout.EAST);
        
        add_account_button = new JButton("ADD ACCOUNT");
        add_account_button.setFocusable(false);
        add_account_button.setPreferredSize(new Dimension(150,50));
        add_account_button.setFont(new Font("Arial",Font.BOLD,16));
        add_account_button.setForeground(Color.WHITE);
        add_account_button.setBackground(Color.BLACK);
        add_account_button.addActionListener(this);
        
        user_accounts_panel = new JPanel();
        user_accounts_panel.setPreferredSize(new Dimension(850,400));
        user_accounts_panel.setLayout(new GridBagLayout());
//        user_accounts_panel.setBorder(BorderFactory.createLineBorder(Color.yellow, 5));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;  
        gbc.gridx = 0;  
        gbc.gridy = 0;  
        user_accounts_panel.add(add_account_button,gbc);
        
        add(user_greeting_panel,BorderLayout.NORTH);
        add(user_accounts_panel,BorderLayout.SOUTH);
        setSize(850,480);
        setLocation(400,200);
        setResizable(false);
        setVisible(true);    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == add_account_button)
            {
                this.dispose();
                new Form_1();
            }
        }catch(Exception E)
        {
            E.printStackTrace();
        }
    }
}
