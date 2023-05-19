import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class ForgotPass implements ActionListener {
    JFrame frame;
    JTextField userField;
    JButton userButton;
    JButton exitButton;
    JButton loginimg;
    JLabel userLabel;
    int count;

    Account ac[] = new Account[200];

    ForgotPass(Account[] acc) {

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
        frame = new JFrame();
        frame.setBounds(50, 50, 1366, 768);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Reset Password");
        frame.setLayout(null);
        frame.setVisible(true);
        ImageIcon icon = new ImageIcon(getClass().getResource("Arc.jfif")); // Adding Jframe Icon
        frame.setIconImage(icon.getImage());
        frame.setLocationRelativeTo(null);

        JPanel lowheader = new JPanel();
        lowheader.setBounds(487, 300, 400, 400);
        lowheader.setBackground(new Color(0, 0, 0, 0));
        lowheader.setLayout(null);
        frame.add(lowheader);

        // c = frame.getContentPane();
        // c.setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon labelImage = new ImageIcon(getClass().getResource("forgetpass.jpg"));
        JLabel imgLabel = new JLabel(labelImage);
        imgLabel.setBounds(0, 0, labelImage.getIconWidth(), labelImage.getIconHeight());
        frame.add(imgLabel);

        JLabel forget = new JLabel("Reset Password");
        forget.setBounds(125, 0, 200, 50);
        Font forgetFont = new Font("Verdana", Font.PLAIN, 19);
        forget.setFont(forgetFont);
        forget.setForeground(Color.white);
        lowheader.add(forget);

        userLabel = new JLabel("Enter Username");
        userLabel.setBounds(40, 80, 200, 50);
        Font userLabelFont = new Font("Verdana", Font.PLAIN, 18);
        userLabel.setFont(userLabelFont);
        userLabel.setForeground(Color.white);
        lowheader.add(userLabel);

        userField = new JTextField();
        userField.setBounds(40, 130, 200, 28);
        Font userfieldFont = new Font("Monospace", Font.BOLD, 18);
        userField.setFont(userfieldFont);
        lowheader.add(userField);

        ImageIcon fnext = new ImageIcon(getClass().getResource("fnext.png"));
        userButton = new JButton(fnext);
        userButton.setBounds(260, 130, fnext.getIconWidth(), fnext.getIconHeight());
        userButton.setBackground(Color.black);
        userButton.setToolTipText("");
        userButton.setBorder(BorderFactory.createEmptyBorder());
        lowheader.add(userButton);

        ImageIcon exit = new ImageIcon(getClass().getResource("Exit.png"));
        exitButton = new JButton(exit);
        exitButton.setBounds(325, 215, exit.getIconWidth(), exit.getIconHeight());
        exitButton.setBackground(Color.black);
        exitButton.setToolTipText("");
        exitButton.setBorder(BorderFactory.createEmptyBorder());
        lowheader.add(exitButton);

        ImageIcon loginImage = new ImageIcon(getClass().getResource("Login_Button.png"));
        loginimg = new JButton(loginImage);
        loginimg.setBounds(10, 222, loginImage.getIconWidth(), loginImage.getIconHeight());
        loginimg.setBackground(Color.black);
        loginimg.setToolTipText("");
        loginimg.setBorder(BorderFactory.createEmptyBorder());
        lowheader.add(loginimg);

        userButton.addActionListener(this);
        exitButton.addActionListener(this);
        loginimg.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == userButton) {
            String user = userField.getText();
            boolean userEmpty = user.isEmpty();
            boolean flag = false;
            for (int i = 0; i < ac.length; i++) {
                if (ac[i] != null) {
                    String name = ac[i].getUsername();
                    if (user.equals(name)) {
                        flag = true;
                        count = i;
                        break;
                    }
                }
            }

            if (flag == true) {
                frame.setVisible(false);
                new ForgotPass2(ac, count);
            } else if (userEmpty == true) {
                showMessageDialog(null, "Enter username");
            } else {
                showMessageDialog(null, "Username not found!");
            }
        } else if (e.getSource() == exitButton) {
            System.exit(1);
        }

        else if (e.getSource() == loginimg) {
            frame.setVisible(false);
            new Login(ac);
        }
    }

    public static void main(String[] args) {
        Account ac = new Account("11", "11");
        Account acc[] = new Account[100];
        acc[0] = ac;
        new ForgotPass(acc);
    }
}
