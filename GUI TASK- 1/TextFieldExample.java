import javax.swing.*;  
import java.awt.event.*;  
import static javax.swing.JOptionPane.showMessageDialog;
public class TextFieldExample implements ActionListener{  
    
	JFrame f;
    JLabel l1;
	JLabel l2;	
	JTextField tf1;  
    JPasswordField tf2;
    JButton b1;  
	
    TextFieldExample(){  
        f= new JFrame("Application"); 
		f.setBounds(50, 50, 800, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		l1 = new JLabel("Username");
		l1.setBounds(460, 130, 150, 30);

		l2 = new JLabel("Password");
		l2.setBounds(460, 170, 150, 30); 		
		
        tf1=new JTextField();  
        tf1.setBounds(545, 130, 150, 30);  
		
		tf2=new JPasswordField();  
        tf2.setBounds(545, 170, 150, 30); 
          
        b1=new JButton("Login");  
        b1.setBounds(480, 210, 75, 30);  
        b1.addActionListener(this);
		
		f.add(l1);
		f.add(l2);
        f.add(tf1);
        f.add(tf2);
		f.add(b1); 
         
         
    }         
    public void actionPerformed(ActionEvent e) {  
         
        if(e.getSource()==b1)
		{  
			String user = tf1.getText();
			String pass = tf2.getText();
            if(user.equals("11") && pass.equals("12"))
			{
				f.setVisible(false);
				new Sample();
			}
			else
			{
				showMessageDialog(null, "Invalid Username and Password!");
			}
			
        }  
    }  
} 