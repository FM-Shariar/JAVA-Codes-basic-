import java.lang.*;
import java.util.Scanner;
public class Starta
{
	public static void main(String[] args)
	{

      Scanner Input=new Scanner(System.in);
	  
	  String m,n,o;
	  double p;
	  int q,r;
  
	   Book obj[]=new Book[5];
	   
	   for(int i=0;i<5;i++)
	   {
			
		    obj[i]=new Book();
			
		    System.out.print("Enter Book isbn -");
		    m=Input.next();
		    obj[i].setIsbn(m);
		   
		   
		    System.out.print("Enter Book Title -");
		    n=Input.next();
		    obj[i].setBookTitle(n);
		   
		    System.out.print("Enter Author Name -");
		    o=Input.next();
		    obj[i].setAuthorName(o);
		   
		    System.out.print("Enter Book price -");
			p=Input.nextDouble();
		    obj[i].setPrice(p);  
			 
		    System.out.print("Enter Added Quantity -");
			q=Input.nextInt();
			obj[i].addQuantity(q);
			 
			 
			System.out.print("Enter Sold Quantity -");
			r=Input.nextInt();
			obj[i].addQuantity(r);

		   System.out.println("");
	   }
		   
		 
		
		for(int i=0;i<5;i++)
		{
			System.out.println("");
		    System.out.println("BOOK - "+(i+1));
		    obj[i].showDetails( );
		}
		
		
		 
	}
}