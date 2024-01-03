package app;

//new
import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class HomePage extends JFrame implements ActionListener{
    JPanel user_greeting_panel;
    JLabel name_label;
    JButton add_account_button;
    JButton view_balance_button;
    JButton money_transfer_button;
    JButton get_statement_button;
    JButton deposit_button;

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
        view_balance_button.setBounds(120, 120, 200, 50);
        view_balance_button.setFont(new Font("Arial",Font.BOLD,16));
        view_balance_button.setForeground(Color.WHITE);
        view_balance_button.setBackground(Color.BLACK);
        add(view_balance_button);
        view_balance_button.addActionListener(this);


        money_transfer_button = new JButton("MONEY TRANSFER");
        money_transfer_button.setFocusable(false);
//        view_balance_button.setPreferredSize(new Dimension(150,50));
        money_transfer_button.setBounds(120, 230, 200, 50);
        money_transfer_button.setFont(new Font("Arial",Font.BOLD,16));
        money_transfer_button.setForeground(Color.WHITE);
        money_transfer_button.setBackground(Color.BLACK);
        money_transfer_button.addActionListener(this);
        add(money_transfer_button);
        
        
        deposit_button = new JButton("DEPOSIT");
        deposit_button.setFocusable(false);
//        view_balance_button.setPreferredSize(new Dimension(150,50));
        deposit_button.setBounds(500, 120, 200, 50);
        deposit_button.setFont(new Font("Arial",Font.BOLD,16));
        deposit_button.setForeground(Color.WHITE);
        deposit_button.setBackground(Color.BLACK);
        deposit_button.addActionListener(this);
        add(deposit_button);
        
        
        
        get_statement_button = new JButton("GET STATEMENT");
        get_statement_button.setFocusable(false);
//        view_balance_button.setPreferredSize(new Dimension(150,50));
        get_statement_button.setBounds(500, 230, 200, 50);
        get_statement_button.setFont(new Font("Arial",Font.BOLD,16));
        get_statement_button.setForeground(Color.WHITE);
        get_statement_button.setBackground(Color.BLACK);
        add(get_statement_button);
        
        
        
        
        add_account_button = new JButton("ADD ACCOUNT");
        add_account_button.setFocusable(false);
//        add_account_button.setPreferredSize(new Dimension(150,50));
        add_account_button.setBounds(310,330 , 200, 50);
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
    public void ShowViewBalanceDialogue()
        {
            JDialog d = new JDialog(this,"View Balance");
//            d.setSize(500,350);
//            d.setVisible(true);
//            d.setLocation(540,320);
                
            JLabel account_no_label = new JLabel("Account No. XXXX XXXX XXXX ");
            account_no_label.setFont(new Font("AvantGrade",Font.BOLD,20));
            
            JTextField text_account = new JTextField(4);
            text_account.setFont(new Font("Raleway",Font.PLAIN,20));
            
            JLabel balance_label = new JLabel("10,000");
            balance_label.setFont(new Font("Raleway",Font.BOLD,34));
            
            JButton submitButton = new JButton("SUBMIT");
            submitButton.setFont(new Font("Raleway",Font.PLAIN,20));
            
            
            
            
//            account_no_label.setBounds(100, 150,200 , 100);    
//            d.add(account_no_label);
            
            JPanel p = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.CENTER;
            gbc.insets = new Insets(5,5,5,5);
            
            gbc.gridx=0;
            gbc.gridy=0;
            gbc.insets.left = 20;
            gbc.gridwidth=1;
            p.add(account_no_label,gbc);
            
            
            
//            gbc.gridwidth=1;
            gbc.gridx=1;
            gbc.insets.left = 0;
            p.add(text_account,gbc);
                
//                JTextField text_account = new JTextField("XXX XXX XXX ");
////                text_account.setBounds(350, 230, 400, 30);
//                text_account.setFont(new Font("Raleway",Font.PLAIN,19));
//                d.add(text_account);

            gbc.gridx=0;
            gbc.gridy=1;
            gbc.gridwidth = 2;
            p.add(balance_label,gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.gridwidth = 2;
            p.add(submitButton,gbc);

            d.add(p);
            d.pack();
            d.setLocationRelativeTo(null);
            d.setVisible(true);
            
           }
    public void ShowDepositButtonDialouge()
    {
            JDialog d = new JDialog(this,"Deposit");
//            d.setSize(500,350);
//            d.setVisible(true);
//            d.setLocation(540,320);
                
            JLabel account_no_label = new JLabel("Account No. XXXX XXXX XXXX ");
            account_no_label.setFont(new Font("AvantGrade",Font.BOLD,20));
            
            JTextField text_account = new JTextField(4);
            text_account.setFont(new Font("Raleway",Font.PLAIN,20));
            
            JLabel amount_label = new JLabel("Enter the Amount: ");
            amount_label.setFont(new Font("Raleway",Font.BOLD,32));
            
            JTextField text_amount = new JTextField(10);
            text_amount.setFont(new Font("Raleway",Font.PLAIN,20));
            
            JButton submitButton = new JButton("DEPOSIT");
            submitButton.setFont(new Font("Raleway",Font.PLAIN,20));
            
            
            
            
//            account_no_label.setBounds(100, 150,200 , 100);    
//            d.add(account_no_label);
            
            JPanel p = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.CENTER;
            gbc.insets = new Insets(5,5,5,5);
            
            gbc.gridx=0;
            gbc.gridy=0;
            gbc.insets.left = 40;
            gbc.gridwidth=1;
            p.add(account_no_label,gbc);
            
            
            
//            gbc.gridwidth=1;
            gbc.gridx=1;
            gbc.insets.left = 0;
//            gbc.insets.right = 20;
            p.add(text_account,gbc);
                
//                JTextField text_account = new JTextField("XXX XXX XXX ");
////                text_account.setBounds(350, 230, 400, 30);
//                text_account.setFont(new Font("Raleway",Font.PLAIN,19));
//                d.add(text_account);

            gbc.gridx=0;
            gbc.gridy=1;
//            gbc.gridwidth = 2;
            gbc.insets.left = 22;
            gbc.gridwidth=1;
            p.add(amount_label,gbc);
            
            gbc.gridx=1;
            gbc.insets.left = 0;
            p.add(text_amount,gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.gridwidth = 2;
            p.add(submitButton,gbc);

            d.add(p);
            d.pack();
            d.setLocationRelativeTo(null);
            d.setVisible(true);
    }
    public void ShowMoneyTransferDialouge()
    {
            JDialog d = new JDialog(this,"Money Transfer");
//            d.setSize(500,350);
//            d.setVisible(true);
//            d.setLocation(540,320);
                
            JLabel account_from_label = new JLabel("Account From. XXXX XXXX XXXX");
            account_from_label.setFont(new Font("AvantGrade",Font.BOLD,20));
            
            JTextField text_account_from = new JTextField(4);
            text_account_from.setFont(new Font("Raleway",Font.PLAIN,20));
            
            
            JLabel account_to_label = new JLabel("Account to. XXXX XXXX XXXX");
            account_to_label.setFont(new Font("AvantGrade",Font.BOLD,20));
            
            JTextField text_account_to = new JTextField(4);
            text_account_to.setFont(new Font("Raleway",Font.PLAIN,20));
            
            JLabel amount_label = new JLabel("Enter the Amount");
            amount_label.setFont(new Font("AvantGrade",Font.BOLD,20));
            
            JTextField amount_text_field = new JTextField(10);
            amount_text_field.setFont(new Font("Raleway",Font.PLAIN,20));
            
//            JLabel amount_label = new JLabel("Enter the Amount: ");
//            amount_label.setFont(new Font("Raleway",Font.BOLD,32));
//            
//            JTextField text_amount = new JTextField(10);
//            text_amount.setFont(new Font("Raleway",Font.PLAIN,20));
            
            JButton submitButton = new JButton("TRANSFER");
            submitButton.setFont(new Font("Raleway",Font.PLAIN,20));
            
            
            
            
//            account_no_label.setBounds(100, 150,200 , 100);    
//            d.add(account_no_label);
            
            JPanel p = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.CENTER;
            gbc.insets = new Insets(5,5,5,5);
            
            gbc.gridx=0;
            gbc.gridy=0;
            gbc.insets.left = 60;
            gbc.gridwidth=1;
            p.add(account_from_label,gbc);
            
            
            
//            gbc.gridwidth=1;
            gbc.gridx=1;
            gbc.insets.left = 0;
            p.add(text_account_from,gbc);
                
//                JTextField text_account = new JTextField("XXX XXX XXX ");
////                text_account.setBounds(350, 230, 400, 30);
//                text_account.setFont(new Font("Raleway",Font.PLAIN,19));
//                d.add(text_account);

            gbc.gridx=0;
            gbc.gridy=1;
//            gbc.gridwidth = 2;
            gbc.insets.left = 20;
            gbc.gridwidth=1;
            p.add(account_to_label,gbc);
            
            gbc.gridx=1;
            gbc.insets.left = 0;
            p.add(text_account_to,gbc);
            
            gbc.gridx=0;
            gbc.gridy=2;
            gbc.insets.right = 100;
            gbc.gridwidth=1;
            p.add(amount_label,gbc);
            
            gbc.gridx=1;
            gbc.insets.left = 0;
            p.add(amount_text_field,gbc);

            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.gridwidth = 2;
            gbc.insets.left = 50;
            p.add(submitButton,gbc);

            d.add(p);
            d.pack();
            d.setLocationRelativeTo(null);
            d.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == add_account_button)
            {
                this.dispose();
                new Form_1();
            }
            if(e.getSource() == view_balance_button)
            {
                this.ShowViewBalanceDialogue();
            }
            if(e.getSource() == deposit_button)
            {
                this.ShowDepositButtonDialouge();
            }
            if(e.getSource() == money_transfer_button)
            {
                this.ShowMoneyTransferDialouge();
            }
            
        }catch(Exception E)
        {
            E.printStackTrace();
        }
    }
}
