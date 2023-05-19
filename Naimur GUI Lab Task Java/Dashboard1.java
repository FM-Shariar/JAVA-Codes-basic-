import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Container;
import static javax.swing.JOptionPane.showMessageDialog;

public class Dashboard1 implements ActionListener {

    JFrame frame;
    JLabel l1;
    JButton logout;
    JButton exitButton;
    JButton nextButton;
    Font logoutbuttonFont;
    Container c;
    JLabel welcome;
    JComboBox combobox;
    JLabel lblText1;
    JLabel lblText2;
    JLabel lblText3;
    JLabel lblText4;
    JLabel lblText5;
    JLabel lblText6;
    ImageIcon labelImage;
    JLabel imgLabel1;
    JLabel imgLabel2;
    JPanel details;

    JRadioButton r1, r2;
    JCheckBox c1, c2, c3, c4, c5, c6;
    ButtonGroup bg;

    Account ac[] = new Account[200];

    Dashboard1(Account[] acc) {
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
        frame.setTitle("STARK INDUSTRIES");
        frame.setLayout(null);
        frame.setVisible(true);
        c = frame.getContentPane();
        c.setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon frameIcon = new ImageIcon(getClass().getResource("Arc.jfif"));
        frame.setIconImage(frameIcon.getImage());

        logout = new JButton("Logout");
        logout.setBounds(1270, 0, 85, 35);
        Font logoutbuttonFont = new Font("Arial", Font.BOLD, 14);
        logout.setFont(logoutbuttonFont);
        frame.add(logout);

        details = new JPanel();
        details.setBounds(800, 300, 500, 650);
        details.setBackground(new Color(255, 0, 0, 0));
        details.setLayout(null);
        c.add(details);

        String[] combolist = { "None", "Mark I", "Mark II", "Mark III", "Mark IV", "Mark V", "Mark VI" };
        combobox = new JComboBox(combolist);
        combobox.setBounds(0, 100, 80, 30);
        combobox.addActionListener(this);
        lblText1 = new JLabel();
        lblText1.setBounds(0, 0, 250, 60);
        lblText1.setForeground(Color.WHITE);
        Font lblText1Font = new Font("Verdana", Font.PLAIN, 18);
        lblText1.setFont(lblText1Font);

        lblText2 = new JLabel();
        lblText2.setBounds(0, 30, 350, 60);
        lblText2.setForeground(Color.WHITE);
        Font lblText2Font = new Font("Verdana", Font.PLAIN, 18);
        lblText2.setFont(lblText2Font);

        lblText3 = new JLabel();
        lblText3.setBounds(0, 60, 350, 60);
        lblText3.setForeground(Color.WHITE);
        Font lblText3Font = new Font("Verdana", Font.PLAIN, 18);
        lblText3.setFont(lblText3Font);

        lblText4 = new JLabel();
        lblText4.setBounds(0, 90, 450, 60);
        lblText4.setForeground(Color.WHITE);
        Font lblText4Font = new Font("Verdana", Font.PLAIN, 18);
        lblText4.setFont(lblText4Font);

        lblText5 = new JLabel();
        lblText5.setBounds(0, 120, 550, 60);
        lblText5.setForeground(Color.WHITE);
        Font lblText5Font = new Font("Verdana", Font.PLAIN, 18);
        lblText5.setFont(lblText5Font);

        lblText6 = new JLabel();
        lblText6.setBounds(0, 150, 350, 60);
        lblText6.setForeground(Color.WHITE);
        Font lblText6Font = new Font("Verdana", Font.PLAIN, 30);
        lblText6.setFont(lblText6Font);

        // labelImage = new ImageIcon();
        // imgLabel1 = new JLabel(labelImage);
        imgLabel2 = new JLabel();
        // lblText.setBounds(0, 0, 150, 50);
        // lblText1.setForeground(Color.white);
        frame.add(combobox);
        details.add(lblText1);
        details.add(lblText2);
        details.add(lblText3);
        details.add(lblText4);
        details.add(lblText5);
        details.add(lblText6);
        // signup.add(labelImage);
        // frame.add(imgLabel1);

        welcome = new JLabel("WELCOME TO STARK INDUSTRIES");
        welcome.setBounds(500, 0, 350, 50);
        Font welcomeFont = new Font("Verdana", Font.PLAIN, 18);
        welcome.setFont(welcomeFont);
        welcome.setForeground(Color.white);
        frame.add(welcome);

        JLabel list = new JLabel("Select One");
        list.setBounds(0, 70, 150, 30);
        Font listFont = new Font("Verdana", Font.PLAIN, 14);
        list.setFont(listFont);
        list.setForeground(Color.white);
        frame.add(list);

        ImageIcon exit = new ImageIcon(getClass().getResource("Exit.png"));
        exitButton = new JButton(exit);
        exitButton.setBounds(1280, 688, exit.getIconWidth(), exit.getIconHeight());
        exitButton.setBackground(Color.black);
        exitButton.setToolTipText("");
        exitButton.setBorder(BorderFactory.createEmptyBorder());
        frame.add(exitButton);

        ImageIcon next = new ImageIcon(getClass().getResource("Next.png"));
        nextButton = new JButton(next);
        nextButton.setBounds(600, 688, next.getIconWidth(), next.getIconHeight());
        nextButton.setBackground(Color.black);
        nextButton.setToolTipText("");
        nextButton.setBorder(BorderFactory.createEmptyBorder());
        frame.add(nextButton);

        JLabel nextLabel = new JLabel("Select Your Favourite Movie");
        nextLabel.setBounds(0, 300, 250, 50);
        Font nextLabelFont = new Font("Verdana", Font.PLAIN, 15);
        nextLabel.setFont(nextLabelFont);
        nextLabel.setForeground(Color.white);
        frame.add(nextLabel);

        c1 = new JCheckBox("Irom Man");
        c1.setBounds(0, 335, 150, 30);
        c1.setBackground(Color.black);
        c1.setForeground(Color.white);

        c2 = new JCheckBox("Iron Man 2");
        c2.setBounds(0, 360, 150, 30);
        c2.setBackground(Color.black);
        c2.setForeground(Color.white);

        c3 = new JCheckBox("Iron Man 3");
        c3.setBounds(0, 395, 150, 30);
        c3.setBackground(Color.black);
        c3.setForeground(Color.white);

        c4 = new JCheckBox("Infinity War");
        c4.setBounds(0, 430, 150, 30);
        c4.setBackground(Color.black);
        c4.setForeground(Color.white);

        c5 = new JCheckBox("End Game");
        c5.setBounds(0, 465, 150, 30);
        c5.setBackground(Color.black);
        c5.setForeground(Color.white);

        c6 = new JCheckBox("Spider Man");
        c6.setBounds(0, 500, 150, 30);
        c6.setBackground(Color.black);
        c6.setForeground(Color.white);

        JLabel nextLabel1 = new JLabel("Do You Like This ?");
        nextLabel1.setBounds(0, 600, 250, 50);
        Font nextLabelFont1 = new Font("Verdana", Font.PLAIN, 15);
        nextLabel1.setFont(nextLabelFont1);
        nextLabel1.setForeground(Color.white);
        frame.add(nextLabel1);

        r1 = new JRadioButton("Yes");
        Font r1Font = new Font("Verdana", Font.PLAIN, 14);
        r1.setFont(r1Font);
        r1.setBounds(0, 630, 70, 30);
        r1.setBackground(Color.black);
        r1.setForeground(Color.white);
        frame.add(r1);

        r2 = new JRadioButton("No");
        r2.setBounds(80, 630, 70, 30);
        r2.setBackground(Color.black);
        r2.setForeground(Color.white);

        frame.add(r1);
        frame.add(r2);

        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c5);
        c.add(c6);

        logout.addActionListener(this);
        exitButton.addActionListener(this);
        nextButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logout) {
            frame.setVisible(false);
            new Login(ac);
        }

        else if (e.getSource() == combobox) {

            String list = combobox.getSelectedItem().toString();
            switch (list) {
                case "Mark I":

                    imgLabel2.setIcon(new ImageIcon("Mark I.png"));
                    imgLabel2.setBounds(350, 110, 300, 600);
                    frame.add(imgLabel2);
                    lblText1.setText("Mark Number : I");
                    lblText2.setText("Designer : Tony Stark");
                    lblText3.setText("Armor Systems : Internal Systems");
                    lblText4.setText("Special Features : Jet Boots");
                    lblText5.setText("Weapons : Flamethrower,Manually-Deployed Missiles");
                    break;

                case "Mark II":
                    imgLabel2.setIcon(new ImageIcon("Mark II.png"));
                    imgLabel2.setBounds(350, 110, 300, 600);
                    frame.add(imgLabel2);
                    lblText1.setText("Mark Number : II");
                    lblText2.setText("Designer : Tony Stark");
                    lblText3.setText("Armor Systems : J.A.R.V.I.S.AI.OS");
                    lblText4.setText("Special Features : Flaps Stabilizers");
                    lblText5.setText("Weapons : Repulsors,Unibeam");

                    break;

                case "Mark III":
                    imgLabel2.setIcon(new ImageIcon("Mark III.png"));
                    imgLabel2.setBounds(350, 110, 300, 600);
                    frame.add(imgLabel2);
                    lblText1.setText("Mark Number : III");
                    lblText2.setText("Designer : Tony Stark");
                    lblText3.setText("Armor Systems : J.A.R.V.I.S.AI.OS");
                    lblText4.setText("Special Features : Flaps Stabilizers");
                    lblText5.setText("Weapons : Micro-Missiles,Unibeam");
                    break;
                case "Mark IV":
                    imgLabel2.setIcon(new ImageIcon("Mark IV.png"));
                    imgLabel2.setBounds(350, 110, 300, 600);
                    frame.add(imgLabel2);
                    lblText1.setText("Mark Number : IV");
                    lblText2.setText("Designer : Tony Stark");
                    lblText3.setText("Armor Systems : J.A.R.V.I.S.AI.OS");
                    lblText4.setText("Special Features : Active Internal Shutter");
                    lblText5.setText("Weapons : Smart Micro-Guns,Missiles(2)");
                    break;

                case "Mark V":
                    imgLabel2.setIcon(new ImageIcon("Mark V.png"));
                    imgLabel2.setBounds(350, 110, 300, 600);
                    frame.add(imgLabel2);
                    lblText1.setText("Mark Number : VI");
                    lblText2.setText("Designer : Tony Stark");
                    lblText3.setText("Armor Systems : J.A.R.V.I.S.AI.OS");
                    lblText4.setText("Special Features : Light System,Life-Support");
                    lblText5.setText("Weapons : Chest Repulso,Repulsion Mark");
                    break;

                case "Mark VI":
                    imgLabel2.setIcon(new ImageIcon("Mark VI.png"));
                    imgLabel2.setBounds(350, 110, 300, 600);
                    frame.add(imgLabel2);
                    lblText1.setText("Mark Number : II");
                    lblText2.setText("Designer : Tony Stark");
                    lblText3.setText("Armor Systems : J.A.R.V.I.S.AI.OS");
                    lblText4.setText("Special Features : Flaps Stabilizers");
                    lblText5.setText("Weapons : Repulsors,Unibeam");
                    break;
            }

        } else if (e.getSource() == exitButton) {
            System.exit(1);
        }

        else if (e.getSource() == nextButton) {
            frame.setVisible(false);
            new Dashboard2(ac);
        }
    }

    public static void main(String[] args) {
        Account ac = new Account("11", "11");
        Account acc[] = new Account[100];
        acc[0] = ac;
        new Dashboard1(acc);
    }

}