import javax.swing.*;  
import java.awt.event.*;  
public class Sample
{  

	JLabel l1;
    Sample()
	{  
        JFrame f= new JFrame(); 
		f.setBounds(50, 50, 800, 500);
		f.setLayout(null);  
        f.setVisible(true); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		
		l1 = new JLabel("Welcome");
		l1.setBounds(220,200,150,200); 
		f.add(l1); 
         
    }         
      
}