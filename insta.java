import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class insta {
    insta()
    {
        JFrame f = new JFrame("Instagram");
        f.setBounds(450,100,100,100);
        JLabel J1 = new JLabel("Email/Username");
        J1.setBounds(100,100,100,20);
        JLabel J2 = new JLabel("Password");
        J2.setBounds(100,160,100,20);
        JTextField jtf = new JTextField();
        jtf.setBounds(100,130,200,25);
        JPasswordField jpf = new JPasswordField();
        jpf.setBounds(100,190,200,25);
        JButton b = new JButton("Log In");
        b.setBounds(90,250,220,25);
        JRadioButton r = new JRadioButton("Forgot password?");
        r.setBounds(120,300,200,20);
        JLabel J3 = new JLabel("--------------- Or ----------------");
        J3.setBounds(120,280,1000,20);
        String s[] = {"Continue with Google","Continue with Facebook","Continue with Twitter"};
        JComboBox jcb = new JComboBox(s);
        jcb.setBounds(100,350,200,20);
        b.setBackground(Color.GRAY);
        f.add(jcb);
        f.add(J3);
        f.add(r);
        f.add(b);
        f.add(jpf);
        f.add(jtf);
        f.add(J2);
        f.add(J1);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JFrame f2 = new JFrame("Login Page");
                f2.setBounds(450,100,100,100);
                JLabel J6 = new JLabel();
                String s1 = jtf.getText();
                J6.setText(s1);
                J6.setBounds(150,180,100,20);
                JLabel J7 = new JLabel("Welcome to Instagram");
                J7.setBounds(120,210,200,40);
                f2.add(J6);
                f2.add(J7);
                f2.setSize(400,500);
                f2.setLayout(null);
                f2.setVisible(true);
            }
        });
        r.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f1 = new JFrame("Rest Password");
                f1.setBounds(450,100,100,100);
                JLabel J4 = new JLabel("Phone Number");
                J4.setBounds(70,160,100,20);
                JLabel J5 = new JLabel("OTP");
                J5.setBounds(70,190,100,20);
                JTextField jtf1 = new JTextField();
                jtf1.setBounds(180,160,100,25);
                JPasswordField jpf1 = new JPasswordField();
                jpf1.setBounds(180,190,100,25);
                JButton J8 = new JButton("SUBMIT");
                J8.setBounds(130,250,100,25);
                JLabel J9 = new JLabel();
                J9.setBounds(115,300,200,25);
                f1.add(J8);
                f1.add(J4);
                f1.add(J5);
                f1.add(jtf1);
                f1.add(jpf1);
                f1.setSize(400,500);
                f1.setLayout(null);
                f1.setVisible(true);
                f1.add(J9);
                J8.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        J9.setText("Successfully Submited");

                    }
                });
            }
        });
    }
    public static void main(String args[])
    {
        new insta();
    }
}
