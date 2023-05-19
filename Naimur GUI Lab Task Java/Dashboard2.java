import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Container;
import static javax.swing.JOptionPane.showMessageDialog;

public class Dashboard2 implements ActionListener {
    JFrame f;
    JButton b1, b2, b3;
    JLabel l1;
    JPanel panel;
    ImageIcon Iconimg;
    ImageIcon tyimg;
    Container c;

    Account ac[] = new Account[200];

    Dashboard2(Account[] acc) {
        for (int i = 0; i < acc.length; i++) {
            if (acc[i] != null) {
                for (int j = 0; i < ac.length; j++) {
                    if (ac[j] == null) {
                        Account a = new Account();
                        a.setUsername(acc[i].getUsername());
                        a.setPassword(acc[i].getPassword());
                        // ac[j].setUsername(acc[i].getUsername());
                        // ac[j].setPassword(acc[i].getPassword());
                        ac[j] = a;
                        break;
                    }
                }
            }
        }
        f = new JFrame();
        f.setTitle("Dashboard 2");
        f.setBounds(50, 50, 1366, 768);
        f.setLocationRelativeTo(null);
        c = f.getContentPane();
        c.setBackground(Color.black);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1 = new JButton("Previous");
        b1.setBounds(750, 330, 100, 40);
        b1.setBackground(Color.white);
        b1.addActionListener(this);

        b2 = new JButton("Log out");
        b2.setBounds(550, 330, 100, 40);
        b2.setBackground(Color.white);
        b2.addActionListener(this);

        b3 = new JButton("Exit");
        b3.setBounds(650, 399, 100, 40);
        b3.setBackground(Color.white);
        b3.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.add(b1);
        f.add(b2);
        f.add(b3);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            f.setVisible(false);
            new Dashboard1(ac);
        } else if (e.getSource() == b2) {
            f.setVisible(false);
            new Login(ac);
        } else if (e.getSource() == b3) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Account ac = new Account("11", "11");
        Account acc[] = new Account[200];
        acc[0] = ac;
        new Dashboard2(acc);
    }

}
