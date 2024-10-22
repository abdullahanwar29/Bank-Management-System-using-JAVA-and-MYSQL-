import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.util.*;

public class Signup1 extends JFrame {
    
    Signup1(){
    
        
    Random ran = new Random();
    long random = (ran.nextLong() % 9000L) + 1000L;
    
    
    
    JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
    formno.setFont(new Font("Raleway", Font.BOLD, 38));
    setLayout(null);
    formno.setBounds(140,20,600,40);
    add(formno);
    
    JLabel PersonalDetails = new JLabel("PAGE 1: PERSONAL DETAILS");
    PersonalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
    setLayout(null);
    PersonalDetails.setBounds(290,80,400,30);
    add(PersonalDetails);
    
    JLabel name = new JLabel("NAME: ");
    name.setFont(new Font("Raleway", Font.BOLD, 18));
    setLayout(null);
    name.setBounds(100,140,100,30);
    add(name);
    
    JTextField nameTextField = new JTextField();
    nameTextField.setFont(new Font("Raleway", Font.BOLD,14));
    nameTextField.setBounds(300,140,400,30);
    add(nameTextField);
    
    
    
    JLabel fname = new JLabel("FATHER'S NAME: ");
    fname.setFont(new Font("Raleway", Font.BOLD, 18));
    setLayout(null);
    fname.setBounds(100,190,200,30);
    add(fname);
    
    JTextField fnameTextField = new JTextField();
    fnameTextField.setFont(new Font("Raleway", Font.BOLD,14));
    fnameTextField.setBounds(300,190,400,30);
    add(fnameTextField);
    
    
    
    
    JLabel dob = new JLabel("DATE OF BIRTH: ");
    dob.setFont(new Font("Raleway", Font.BOLD, 18));
    setLayout(null);
    dob.setBounds(100,240,200,30);
    add(dob);
    
    JDateChooser dateChooser = new JDateChooser();
    dateChooser.setForeground(new Color(105, 105, 105));
    dateChooser.setBounds(300, 240, 400, 30);
    add(dateChooser);
    
    
    
    JLabel gender = new JLabel("GENDER: ");
    gender.setFont(new Font("Raleway", Font.BOLD, 18));
    setLayout(null);
    gender.setBounds(100,290,200,30);
    add(gender);
    
    JRadioButton male = new JRadioButton("MALE");
    male.setBounds(300, 290, 120, 30);
    male.setBackground(Color.white);
    add(male);
    JRadioButton female = new JRadioButton("FEMALE");
    female.setBounds(450, 290, 120, 30);
    female.setBackground(Color.white);
    add(female);
    
    ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(male);
        groupstatus.add(female);
    
    
    JLabel email = new JLabel("EMAIL ADDRESS: ");
    email.setFont(new Font("Raleway", Font.BOLD, 18));
    setLayout(null);
    email.setBounds(100,340,200,30);
    add(email);
    
    JTextField emailTextField = new JTextField();
    emailTextField.setFont(new Font("Raleway", Font.BOLD,14));
    emailTextField.setBounds(300,340,400,30);
    add(emailTextField);
    
    
    
    
    JLabel maritalstatus = new JLabel("MARITAL STATUS: ");
    maritalstatus.setFont(new Font("Raleway", Font.BOLD, 18));
    setLayout(null);
    maritalstatus.setBounds(100,390,200,30);
    add(maritalstatus);
    
    JRadioButton Married = new JRadioButton("MARRIED");
    Married.setBounds(300, 390, 100, 30);
    Married.setBackground(Color.white);
    add(Married);
    JRadioButton Unmarried = new JRadioButton("UNMARRIED");
    Unmarried.setBounds(450, 390, 110, 30);
    Unmarried.setBackground(Color.white);
    add(Unmarried);
        JRadioButton Divorcee = new JRadioButton("OTHER");
    Divorcee.setBounds(630, 390, 100, 30);
    Divorcee.setBackground(Color.white);
    add(Divorcee);
    
    ButtonGroup maritalgroupstatus = new ButtonGroup();
        maritalgroupstatus.add(Married);
        maritalgroupstatus.add(Unmarried);
        maritalgroupstatus.add(Divorcee);

    
    
    JLabel address = new JLabel("ADDRESS: ");
    address.setFont(new Font("Raleway", Font.BOLD, 18));
    setLayout(null);
    address.setBounds(100,440,200,30);
    add(address);
    
    JTextField addressTextField = new JTextField();
    addressTextField.setFont(new Font("Raleway", Font.BOLD,14));
    addressTextField.setBounds(300,440,400,30);
    add(addressTextField);
    
    
    
    
    JLabel city = new JLabel("CITY: ");
    city.setFont(new Font("Raleway", Font.BOLD, 18));
    setLayout(null);
    city.setBounds(100,490,200,30);
    add(city);
    
    JTextField cityTextField = new JTextField();
    cityTextField.setFont(new Font("Raleway", Font.BOLD,14));
    cityTextField.setBounds(300,490,400,30);
    add(cityTextField);
    
    
    
    
    JLabel state = new JLabel("STATE: ");
    state.setFont(new Font("Raleway", Font.BOLD, 18));
    setLayout(null);
    state.setBounds(100,540,200,30);
    add(state);
    
    JTextField stateTextField = new JTextField();
    stateTextField.setFont(new Font("Raleway", Font.BOLD,14));
    stateTextField.setBounds(300,540,400,30);
    add(stateTextField);
    
    
    
    
    JLabel pincode = new JLabel("CITY PINCODE: ");
    pincode.setFont(new Font("Raleway", Font.BOLD, 18));
    setLayout(null);
    pincode.setBounds(100,590,200,30);
    add(pincode);
    
    JTextField pinTextField = new JTextField();
    pinTextField.setFont(new Font("Raleway", Font.BOLD,14));
    pinTextField.setBounds(300,590,400,30);
    add(pinTextField);
    
    
    
    JButton next = new JButton("Next");
    next.setFont(new Font("Raleway", Font.BOLD, 14));
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setBounds(620,660,80,30);
    add(next);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    getContentPane().setBackground(Color.WHITE);
    
        
    setSize(850,800);
    setLocation(120,0);
    setVisible(true);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        new Signup1();
    }
}
