package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    String formno;
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel type = new JLabel("Account Type ");
        type.setFont(new Font("raleway",Font.BOLD,20));
        type.setBounds(100,120,200,30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setBackground(Color.WHITE);
        r1.setFont(new Font("raleway",Font.BOLD,14));
        r1.setBounds(100,160,140,20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBackground(Color.WHITE);
        r2.setFont(new Font("raleway",Font.BOLD,14));
        r2.setBounds(350,160,220,20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBackground(Color.WHITE);
        r3.setFont(new Font("raleway",Font.BOLD,14));
        r3.setBounds(100,200,140,20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBackground(Color.WHITE);
        r4.setFont(new Font("raleway",Font.BOLD,14));
        r4.setBounds(350,200,220,20);
        add(r4);

        ButtonGroup gruopaacount = new ButtonGroup();
        gruopaacount.add(r1);
        gruopaacount.add(r2);
        gruopaacount.add(r3);
        gruopaacount.add(r4);


        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("raleway",Font.BOLD,20));
        card.setBounds(100,250,200,30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("raleway",Font.BOLD,20));
        number.setBounds(330,250,300,30);
        add(number);

        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("raleway",Font.BOLD,8));
        carddetail.setBounds(100,270,300,20);
        add(carddetail);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("raleway",Font.BOLD,20));
        pin.setBounds(100,300,200,30);
        add(pin);

        JLabel Pnumber = new JLabel("XXXX");
        Pnumber.setFont(new Font("raleway",Font.BOLD,20));
        Pnumber.setBounds(330,300,200,30);
        add(Pnumber);

        JLabel pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("raleway",Font.BOLD,8));
        pindetail.setBounds(100,320,200,20);
        add(pindetail);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("raleway",Font.BOLD,20));
        services.setBounds(100,350,200,30);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("raleway",Font.BOLD,14));
        c1.setBounds(100,400,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("raleway",Font.BOLD,14));
        c2.setBounds(350,400,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("raleway",Font.BOLD,14));
        c3.setBounds(100,440,200,30);
        add(c3);

        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("raleway",Font.BOLD,14));
        c4.setBounds(350,440,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("raleway",Font.BOLD,14));
        c5.setBounds(100,480,200,30);
        add(c5);

        c6 = new JCheckBox("E Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("raleway",Font.BOLD,14));
        c6.setBounds(350,480,200,30);
        add(c6);

        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("raleway",Font.BOLD,10));
        c7.setBounds(100,540,500,30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("raleway",Font.BOLD,12));
        submit.setBounds(200,580,80,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("raleway",Font.BOLD,12));
        cancel.setBounds(400,580,80,30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);


        setSize(750,720);
        setLocation(350,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== submit){
            String accounttype = null;
            if (r1.isSelected()){
                accounttype = "Saving Account";
            }else if(r2.isSelected()){
                accounttype = "Fixed Deposit Account";
            }else if(r3.isSelected()){
                accounttype = "Current Account";
            }else if(r4.isSelected()){
                accounttype = "Reccuring Deposit Account";
            }

            Random random = new Random();
            String cardnumber = ""+ Math.abs((random.nextLong() %90000000l)+ 5040936000000000l);

            String pinnumber = ""+ Math.abs((random.nextLong() % 9000l) + 1000l);

            String facility = "";
            if (c1.isSelected()){
                facility = facility + " ATM Card";
            }else if (c2.isSelected()){
                facility = facility + " Internet Banking";
            }else if (c3.isSelected()){
                facility = facility + " Mobile Banking";
            }else if (c4.isSelected()){
                facility = facility + " Email & SMS Alerts";
            }else if (c5.isSelected()){
                facility = facility + " Cheque Book";
            }else if (c5.isSelected()){
                facility = facility + " E-Statement";
            }

            try {
                if (accounttype.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");;
                }else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null,"Card Number: "+ cardnumber + "\n pin: " + pinnumber);

                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                }
            }catch (Exception e){
                System.out.println(e);
            }
        } else if (ae.getSource()== cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    public static void main (String[]args){
        new SignupThree("");
    }
}
