import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.Border;
import static javax.swing.JOptionPane.showMessageDialog;

public class Dashboard1  implements ActionListener 
{
    JFrame f1;
    JLabel l1,l2,l3,l4;
    JButton Next,Previous,Exit,logout;
    Font logoutbuttonFont;
	JCheckBox ch1, ch2, ch3, ch4;
	JRadioButton r1, r2;
	JComboBox cb;
	ButtonGroup b;
    Container c;
    JLabel welcome;
	ImageIcon Icon;

    Dashboard1() 
	{
		//Creating Frame
        f1 = new JFrame();
        f1.setBounds(50, 50, 800, 500);
        f1.setTitle("DashBoard1");
        f1.setLayout(null);
        f1.setVisible(true);
        c = f1.getContentPane();
        c.setBackground(Color.YELLOW);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);

		//creating icon
        Icon = new ImageIcon(getClass().getResource("Icon.png"));
        f1.setIconImage(Icon.getImage());
		
		l1 = new JLabel("Hospital Portal");
        l1.setBounds(312, 00, 600, 100);
        l1.setForeground(Color.RED);
        Font l1Font = new Font("Verdana", Font.BOLD, 18);
        l1.setFont(l1Font);
		f1.add(l1);
		
		l2 = new JLabel("Gender");
        l2.setBounds(120, 100, 150, 50);
        l2.setForeground(Color.black);
        Font l2Font = new Font("Verdana", Font.BOLD, 14);
        l2.setFont(l2Font);
		f1.add(l2);
		
		l3 = new JLabel("Service");
        l3.setBounds(360, 100, 150, 50);
        l3.setForeground(Color.black);
        Font l3Font = new Font("Verdana", Font.BOLD, 14);
        l3.setFont(l3Font);
		f1.add(l3);
		
		l4 = new JLabel("Floor");
        l4.setBounds(570,100,150,50);
        l4.setForeground(Color.black);
        Font l4Font = new Font("Verdana", Font.BOLD, 14);
        l4.setFont(l4Font);
		f1.add(l4);
		
		//checkbox 
		ch1 = new JCheckBox("X-ray");
        ch1.setBounds(320, 140, 130, 30);
        ch1.setBackground(Color.GREEN);
		f1.add(ch1);

        ch2 = new JCheckBox("ECG");
        ch2.setBounds(320, 170, 130, 30);
        ch2.setBackground(Color.GREEN);
		f1.add(ch2);
		
		ch3 = new JCheckBox("Endoscopy");
        ch3.setBounds(320, 200, 130, 30);
        ch3.setBackground(Color.GREEN);
		f1.add(ch3);
		
		ch4 = new JCheckBox("Angiogram");
        ch4.setBounds(320, 230, 130, 30);
        ch4.setBackground(Color.GREEN);
		f1.add(ch4);
		
		b = new ButtonGroup();
		
        r1 = new JRadioButton("Male");
        r1.setBounds(100, 140, 100, 30);
        r1.setBackground(Color.YELLOW);
        r1.setSelected(true);
		b.add(r1);
		f1.add(r1);
		
        r2 = new JRadioButton("Female");
        r2.setBounds(100, 180, 100, 30);
        r2.setBackground(Color.YELLOW);
        b.add(r2);
		f1.add(r2);
		
		String[] cbitem = {"None","1st","2nd", "3rd"};
        cb = new JComboBox(cbitem);
        cb.setBounds(550, 140, 80, 40);
        cb.setBackground(Color.CYAN);
        cb.setEditable(true);
		f1.add(cb);
		
		
		
		
		
		
		
		
		//creating logout button
        logout = new JButton("Logout");
        logout.setBounds(350, 400, 90, 30);
        Font logoutbuttonFont = new Font("Arial", Font.BOLD, 15);
		logout.setForeground(Color.RED);
        logout.setFont(logoutbuttonFont);
        f1.add(logout);
        logout.addActionListener(this);

        //Creating Previous Button
        Previous = new JButton("Previous");
        Previous.setBounds(100,350,120,30);
        Font PreviousFont = new Font("Arial", Font.BOLD, 15);
        Previous.setForeground(Color.WHITE);
        Previous.setBackground(Color.BLUE);
        Previous.setFont(PreviousFont);
        f1.add(Previous);
        Previous.addActionListener(this);

        //Creating Exit Button
        Exit = new JButton("Exit");
        Exit.setBounds(350,350,90,30);
        Font ExitFont = new Font("Arial", Font.BOLD, 15);
        Exit.setForeground(Color.WHITE);
        Exit.setBackground(Color.BLUE);
        Exit.setFont(ExitFont);
        f1.add(Exit);
        Exit.addActionListener(this);
		
		//Creating Next Button
		Next = new JButton("Next");
		Next.setBounds(550,350,90,30);
		Font NextFont = new Font("Arial", Font.BOLD, 15);
        Next.setForeground(Color.WHITE);
        Next.setBackground(Color.BLUE);
        Next.setFont(NextFont);
        f1.add(Next);
        Next.addActionListener(this);
		
    }

    public void actionPerformed(ActionEvent e) 
	{
        if (e.getSource() == logout)
		{
            f1.setVisible(false);
            new Login();
        }
		if(e.getSource() == Exit)
        {
            System.exit(0);
           
        } 
		if (e.getSource() == Previous)
		{
			f1.setVisible(false);
			new Login();
		}
		if (e.getSource() == Next)
		{
			f1.setVisible(false);
			new Dashboard2();
		}
		
    }
}
