package bank.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

    
public class Login extends JFrame implements  ActionListener{ 
    
    JLabel text,accountno,pin;
    JTextField CardTextField;
    JPasswordField PinTextField;
    JButton login,clear,signup;
    
    Login()
    {
        
        setTitle("BANK MANAGEMENT SYSTEM");
        
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logos/logo.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(270, 10, 600, 100);
        add(label);
        
        text = new JLabel("ABL DIGITEL BANKING");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(350,120,450,40);
        add(text);
        
        accountno = new JLabel("ACCOUNT NO:");
        accountno.setFont(new Font("Raleway", Font.BOLD, 28));
        accountno.setBounds(150,200,450,40);
        add(accountno);
        
        CardTextField = new JTextField(15);
        CardTextField.setBounds(400,200,450,40);
        CardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(CardTextField);
        
        pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(150,270,450,40);
        add(pin);
        
        PinTextField = new JPasswordField(15);
        PinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        PinTextField.setBounds(400,270,450,40);
        add(PinTextField);
        
        setLayout(null);
        
        login = new JButton("SIGN IN");
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setFont(new Font("Arial", Font.BOLD, 14));
        login.setBounds(450,360,100,40);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setBounds(680,360,100,40);
        clear.addActionListener(this);
        add(clear);
        
        
        signup = new JButton("USING FIRST TIME! CREATE ACCOUNT?");
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.setFont(new Font("Arial", Font.BOLD, 14));
        signup.setBounds(450,430,330,40);
        signup.addActionListener(this);
        add(signup);
                
        
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(1100,600);
        setVisible(true);
        setLocation(120,50);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == clear )
        {
            CardTextField.setText("eg. 238764238746");
            PinTextField.setText("0000");

        } else if(ae.getSource() == login)
        {
            
        } else if (ae.getSource() == signup)
        {
            
        }
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        
        new Login();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}
