import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.Border;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login implements ActionListener 
{
    JFrame fL;
	JLabel bg;
    JLabel username;
    JLabel password;
    JTextField userField;
    JPasswordField passField;
    JButton loginButton,signUp,forgotPass,Exit;
    ImageIcon Icon,Bgimg;
    Container c;
	
	//login frame creation
    Login() 
	{
        fL = new JFrame();
        fL.setBounds(50, 50, 800, 500);                          
        fL.setTitle("Login");                                    //JFrame Title
        fL.setLayout(null);
        fL.setVisible(true);                                     //Jframe Visibility
        c = fL.getContentPane(); 
        c.setBackground(Color.white);                            //For JFrame color
        fL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fL.setLocationRelativeTo(null);                          //Labeling the frame at center

        //adding icon
        Icon = new ImageIcon(getClass().getResource("Icon.png"));
        fL.setIconImage(Icon.getImage());
		
		//adding background image
		Bgimg = new ImageIcon(getClass().getResource("Hospital.jfif"));
		bg = new JLabel(Bgimg);
        bg.setBounds(0, 0, 450, 450);
		fL.add(bg);
	
		//creating jlabel user name
        username = new JLabel("Username:");
        username.setBounds(460, 130, 150, 30);
        Font usernameFont = new Font("Verdana", Font.PLAIN, 15);
        username.setFont(usernameFont);
        username.setForeground(Color.black);
        fL.add(username);
		
		//creating jlabel user field
        userField = new JTextField();
        userField.setBounds(545, 130, 150, 30);
        Font userfieldFont = new Font("Arial", Font.BOLD, 15);
        Border border1 = BorderFactory.createLineBorder(Color.GREEN);
        userField.setBorder(border1);
        userField.setFont(userfieldFont);
        fL.add(userField);
		
		//creating jlabel password;
        password = new JLabel("Password:");
        password.setBounds(460, 170, 150, 30);
        Font passwordFont = new Font("Verdana", Font.PLAIN, 15);
        password.setFont(passwordFont);
        password.setForeground(Color.black);
        fL.add(password);
		
		//creating jlabel password field
        passField = new JPasswordField();
        passField.setBounds(545, 170, 150, 30);
        Font passfieldFont = new Font("Arial", Font.BOLD, 22);
        Border border2 = BorderFactory.createLineBorder(Color.GREEN);
        passField.setBorder(border2);
        passField.setFont(passfieldFont);
        passField.setEchoChar('*');
        fL.add(passField);
		
		//creating loging button
        loginButton = new JButton("Login");
        loginButton.setBounds(480, 210, 75, 30);
        Font loginbuttonFont = new Font("Arial", Font.BOLD, 15);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.BLUE);
        loginButton.setFont(loginbuttonFont);
        fL.add(loginButton);
        loginButton.addActionListener(this);


        //creating forgot password button
        forgotPass = new JButton("Forgot Pass");
        forgotPass.setBounds(580,210,150,30);
        Font forgotPassFont = new Font("Arial", Font.BOLD, 15);
        forgotPass.setForeground(Color.WHITE);
        forgotPass.setBackground(Color.BLUE);
        forgotPass.setFont(forgotPassFont);
        fL.add(forgotPass);
        forgotPass.addActionListener(this);

        //creating signup button
        signUp = new JButton("SignUp");
        signUp.setBounds(480,260,90,30);
        Font signUpFont = new Font("Arial", Font.BOLD, 15);
        signUp.setForeground(Color.WHITE);
        signUp.setBackground(Color.BLUE);
        signUp.setFont(signUpFont);
        fL.add(signUp);
        signUp.addActionListener(this);

        //creating Exit button
        Exit = new JButton("Exit");
        Exit.setBounds(580,260,90,30);
        Font ExitFont = new Font("Arial", Font.BOLD, 15);
        Exit.setForeground(Color.WHITE);
        Exit.setBackground(Color.BLUE);
        Exit.setFont(ExitFont);
        fL.add(Exit);
        Exit.addActionListener(this);   
    }

    
    public void actionPerformed(ActionEvent e) {
        String user = userField.getText();
        String pass = passField.getText();
        boolean userEmpty = user.isEmpty();
        boolean passEmpty = pass.isEmpty();
        if (e.getSource() == loginButton) 
		{

            if (user.equals("fahim") && pass.equals("1234")) 
			{
                fL.setVisible(false);
                new Dashboard1();
            }  
			else if (userEmpty == true || passEmpty == true) 
			{
                showMessageDialog(null, "Please Enter UserName and Password");
            }
			else 
			{
                showMessageDialog(null, "Invalid Username and Password!");
            }

        }
        if(e.getSource() == Exit)
        {
            System.exit(0);   
        }   
    }    
}