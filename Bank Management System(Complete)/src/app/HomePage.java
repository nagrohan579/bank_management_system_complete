package app;

//new
import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Dimension;
import java.awt.Font;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class HomePage extends JFrame implements ActionListener{
    JPanel user_greeting_panel;
    JLabel name_label;
    JButton add_account_button;
    JButton view_balance_button;
    JButton money_transfer_button;
    JButton get_statement_button;

    public HomePage(){
        setTitle("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        name_label = new JLabel("   Welcome "+User.name);
        name_label.setFont(new Font("AvantGrade",Font.BOLD,50));
        name_label.setVerticalAlignment(JLabel.CENTER);
        name_label.setBounds(500, 0,400 , 80);
        name_label.setForeground(Color.white);
        Border emptyBorder = new EmptyBorder(0, 10, 0, 70);
        name_label.setBorder(emptyBorder);
        
        user_greeting_panel = new JPanel();
        //        user_greeting_panel.setPreferredSize(new Dimension(850, 80));
        user_greeting_panel.setBounds(0, 0, 850, 80);
        user_greeting_panel.setLayout(new BorderLayout());
        user_greeting_panel.setBackground(Color.black);
//        user_details_panel.setBorder(BorderFactory.createLineBorder(Color.black));
        user_greeting_panel.add(name_label);
//        add(user_greeting_panel,BorderLayout.NORTH);
        add(user_greeting_panel);
        
        view_balance_button = new JButton("VIEW BALANCE");
        view_balance_button.setFocusable(false);
//        view_balance_button.setPreferredSize(new Dimension(150,50));
        view_balance_button.setBounds(100, 150, 200, 50);
        view_balance_button.setFont(new Font("Arial",Font.BOLD,16));
        view_balance_button.setForeground(Color.WHITE);
        view_balance_button.setBackground(Color.BLACK);
        add(view_balance_button);
//        view_balance_button.addActionListener(this);


        money_transfer_button = new JButton("MONEY TRANSFER");
        money_transfer_button.setFocusable(false);
//        view_balance_button.setPreferredSize(new Dimension(150,50));
        money_transfer_button.setBounds(100, 300, 200, 50);
        money_transfer_button.setFont(new Font("Arial",Font.BOLD,16));
        money_transfer_button.setForeground(Color.WHITE);
        money_transfer_button.setBackground(Color.BLACK);
        add(money_transfer_button);
        
        
        get_statement_button = new JButton("GET STATEMENT");
        get_statement_button.setFocusable(false);
//        view_balance_button.setPreferredSize(new Dimension(150,50));
        get_statement_button.setBounds(550, 150, 200, 50);
        get_statement_button.setFont(new Font("Arial",Font.BOLD,16));
        get_statement_button.setForeground(Color.WHITE);
        get_statement_button.setBackground(Color.BLACK);
        add(get_statement_button);
        
        
        add_account_button = new JButton("ADD ACCOUNT");
        add_account_button.setFocusable(false);
//        add_account_button.setPreferredSize(new Dimension(150,50));
        add_account_button.setBounds(550,300 , 200, 50);
        add_account_button.setFont(new Font("Arial",Font.BOLD,16));
        add_account_button.setForeground(Color.WHITE);
        add_account_button.setBackground(Color.BLACK);
        add_account_button.addActionListener(this);
        add(add_account_button);
        
        add(user_greeting_panel,BorderLayout.NORTH);
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
