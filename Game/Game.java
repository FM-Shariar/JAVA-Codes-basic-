import java.lang.*;
import java.util.Scanner;
public class Game
{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
    int n=0;
	int count=0;
    int target=545;
	
	System.out.print("Guess a number between 1-1000 - ");
	n=sc.nextInt();
	while (target != n)
	{
		if (n>target)
		{
			System.out.print("Opps!Try again with a lesser value - ");
			n=sc.nextInt();
			count=count+1;
		}
		else
		{
			System.out.print("Opps!Try again with a higher value - ");
			n=sc.nextInt();
			count=count+1;
		}
	}
	while(n==target)
    {System.out.println("Congrats! You got it.");
     count=count+1;
     System.out.println("Total tries - "+count+" times.");
    break;}
	
	
	
}
}