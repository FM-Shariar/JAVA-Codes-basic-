import java.lang.*;
import java.util.Scanner;

 

public class InputDemo
{
    public static void main(String args[])
    {
        int i;
        double d;
        String b;
        char c;
        
        Scanner sc = new Scanner(System.in);
        
        //nextLine() is a method of Scanner class that is used to take String input.
        //but it has a limitation. It will only work properly if the input is taken before anyother input
        //So, the next block of code will do just fine.
        
        
        
        
        
        System.out.println("Please enter an integer: ");
        //nextInt() is a method of Scanner class that is used to take integer input.
        i = sc.nextInt();                                
        System.out.println("You have Entered: "+ i);
        
        System.out.println("Please enter a String: ");
        b = sc.nextLine();
        System.out.println("You have Entered: "+ b);
        
        System.out.println("Please enter a double: ");
        //nextDouble() is a method of Scanner class that is used to take double input.
        d = sc.nextDouble();                            
        System.out.println("You have Entered: "+ d);

 


        //next() is a method of Scanner class that is used to take String input.
        //but it also has a limitation. It can only take a word not a sentence.
        
        
        /*System.out.print("Please enter a String: ");
        s = sc.next();
        System.out.println("You have Entered: "+ s);*/
        
        
        System.out.println("Please enter a char: ");
        c = sc.next().charAt(0);
        //taking a char input.        
        System.out.println("You have entered: "+c);
		
		
        
        
        
    }
}