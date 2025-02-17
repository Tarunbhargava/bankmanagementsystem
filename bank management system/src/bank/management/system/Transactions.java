package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener{
    JButton deposit, withdrawl, fastcash, ministatement, pinchange, balanceenquiry, exit;
    String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,700);
        add(image);

        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(150,200,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,14));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(110,320,135,26);
        deposit.addActionListener(this);
        image.add(deposit);

        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(270,320,135,26);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        fastcash = new JButton(" Fast Cash");
        fastcash.setBounds(110,350,135,26);
        fastcash.addActionListener(this);
        image.add(fastcash);

        ministatement = new JButton(" Mini Statement");
        ministatement.setBounds(270,350,135,26);
        ministatement.addActionListener(this);
        image.add(ministatement);

        pinchange = new JButton(" Pin Change");
        pinchange.setBounds(110,380,135,26);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balanceenquiry = new JButton(" Balance Enquiry");
        balanceenquiry.setBounds(270,380,135,26);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);

        exit = new JButton("Exit");
        exit.setBounds(270,410,135,26);
        exit.addActionListener(this);
        image.add(exit);

        setSize(700,700);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == exit){
            System.exit(0);
        } else if (ae.getSource()== deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if (ae.getSource()== withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource() == fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if (ae.getSource()== pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if (ae.getSource()== balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        } else if (ae.getSource() == ministatement) {
//            setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Transactions("");

    }
}
