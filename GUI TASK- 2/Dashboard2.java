import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.Border;
import static javax.swing.JOptionPane.showMessageDialog;

public class Dashboard2  implements ActionListener 
{

    JFrame f2;
    JLabel l1;
	JLabel bg;
    JButton Next,Previous,Exit,logout;
    Font logoutbuttonFont;
    Container c;
    
	ImageIcon Icon,Bgimg;

    Dashboard2() 
	{
        f2 = new JFrame();
        f2.setBounds(50, 50, 800, 500);
        f2.setTitle("DashBoard2");
        f2.setLayout(null);
        f2.setVisible(true);
        c = f2.getContentPane();
        c.setBackground(Color.YELLOW);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLocationRelativeTo(null);

        Icon = new ImageIcon(getClass().getResource("Icon.png"));
        f2.setIconImage(Icon.getImage());
		
		//adding background image
		Bgimg = new ImageIcon(getClass().getResource("underconstruction.png"));
		bg = new JLabel(Bgimg);
        bg.setBounds(150, 10, 500, 300);
		f2.add(bg);

        

        logout = new JButton("Logout");
        logout.setBounds(550,350,90,30);
        Font logoutbuttonFont = new Font("Arial", Font.BOLD, 15);
		logout.setForeground(Color.RED);
        logout.setFont(logoutbuttonFont);
        f2.add(logout);
        logout.addActionListener(this);

        //creating Previous button
        Previous = new JButton("Previous");
        Previous.setBounds(100,350,120,30);
        Font PreviousFont = new Font("Arial", Font.BOLD, 15);
        Previous.setForeground(Color.WHITE);
        Previous.setBackground(Color.BLUE);
        Previous.setFont(PreviousFont);
        f2.add(Previous);
        Previous.addActionListener(this);

        //creating Exit button
        Exit = new JButton("Exit");
        Exit.setBounds(350,350,90,30);
        Font ExitFont = new Font("Arial", Font.BOLD, 15);
        Exit.setForeground(Color.WHITE);
        Exit.setBackground(Color.BLUE);
        Exit.setFont(ExitFont);
        f2.add(Exit);
        Exit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) 
	{
        if (e.getSource() == logout) 
		{
            f2.setVisible(false);
            new Login();
        }
		if(e.getSource() == Exit)
        {
            System.exit(0);  
        } 
		if (e.getSource() == Previous)
		{
			f2.setVisible(false);
			new Dashboard1();
		}
		
    }
}
