package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField panTextField, aadhar;
    JButton next;
    JRadioButton ayes, ano, eyes, eno;
    JComboBox religion, category, income, education, qualification, occupation;
    String formno;

    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionaldetail = new JLabel("Page 2: Additional Details");
        additionaldetail.setFont(new Font("Raleway", Font.BOLD,22));
        additionaldetail.setBounds(290,80,400,30);
        add(additionaldetail);

        JLabel religionname = new JLabel("Religion:");
        religionname.setFont(new Font("Raleway", Font.BOLD,22));
        religionname.setBounds(100,140,100,30);
        add(religionname);

        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel categorylist = new JLabel("Category:");
        categorylist.setFont(new Font("Raleway",Font.BOLD,22));
        categorylist.setBounds(100,190,200,30);
        add(categorylist);

        String valcategory [] = {"General","OBC","SC","ST","OTHER"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.white);
        add(category);

        JLabel incomeslab = new JLabel("Income:");
        incomeslab.setFont(new Font("raleway",Font.BOLD,22));
        incomeslab.setBounds(100,240,200,30);
        add(incomeslab);

        String incomecategory[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000",};
        income = new JComboBox(incomecategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel educationlist = new JLabel("Educational");
        educationlist.setFont(new Font("raleway",Font.BOLD,22));
        educationlist.setBounds(100,290,200,30);
        add(educationlist);

        JLabel qualication = new JLabel("Qualification:");
        qualication.setFont(new Font("raleway",Font.BOLD,22));
        qualication.setBounds(100,315,200,30);
        add(qualication);

        String educationcategory[] = {"Non-Gradution","Graduation","Post-Gradution","Doctrate","Others"};
        education = new JComboBox(educationcategory);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel occupationlist = new JLabel("Occupation:");
        occupationlist.setFont(new Font("raleway",Font.BOLD,22));
        occupationlist.setBounds(100,390,200,30);
        add(occupationlist);

        String occupationcategory[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
        occupation = new JComboBox(occupationcategory);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);




        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100,440,200,30);
        add(address);

        panTextField = new JTextField();
        panTextField.setFont(new Font("raleway",Font.BOLD,22));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);

        JLabel aadharNumber = new JLabel("Aadhar Number:");
        aadharNumber.setFont(new Font("Raleway",Font.BOLD,22));
        aadharNumber.setBounds(100,490,200,30);
        add(aadharNumber);

        aadhar= new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,22));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);

        JLabel citizen = new JLabel("Senior Citizen:");
        citizen.setFont(new Font("Raleway",Font.BOLD,22));
        citizen.setBounds(100,540,200,30);
        add(citizen);

        ayes = new JRadioButton("Yes");
        ayes.setBounds(300, 540, 100, 30);
        ayes.setBackground(Color.WHITE);
        add(ayes);

        ano = new JRadioButton("No");
        ano.setBounds(450, 540, 100, 30);
        ano.setBackground(Color.WHITE);
        add(ano);

        ButtonGroup seniorcitizon = new ButtonGroup();
        seniorcitizon.add(ayes);
        seniorcitizon.add(ano);

        JLabel exisitingaccount = new JLabel("Exisiting Account:");
        exisitingaccount.setFont(new Font("Raleway",Font.BOLD,22));
        exisitingaccount.setBounds(100,590,200,30);
        add(exisitingaccount);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup aacount = new ButtonGroup();
        aacount.add(eyes);
        aacount.add(eno);




        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,620,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350, 10);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincomes = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String sseniorcitizen = null;
        if (ayes.isSelected()){
            sseniorcitizen = "Yes";
        } else if (ano.isSelected()) {
            sseniorcitizen = "No";
        }
        String eexisitingaacount = null;
        if (eyes.isSelected()){
            eexisitingaacount = "Yes";
        }else if(eno.isSelected()){
            eexisitingaacount = "No";
        }
        String saadhar = aadhar.getText();
        String span = panTextField.getText();
        try {
             Conn c = new Conn();
             String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincomes+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+sseniorcitizen+"','"+eexisitingaacount+"')";
             c.s.executeUpdate(query);

             //signup3 object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }catch (Exception ae) {
            System.out.println(ae);
        }
    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
}

