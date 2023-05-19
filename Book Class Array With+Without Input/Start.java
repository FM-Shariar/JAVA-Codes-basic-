import java.lang.*;
public class Start
{
	public static void main(String[] args)
	{
		
	    Book a=new Book("45-343-1","The Handmaid's Tale","Margaret Atwood",900.00,45);
		Book b=new Book("45-343-2","A Wrinkle in Time","Madeleine L'Engle",1500.00,100);
		Book c=new Book("45-343-3","Thirteen Reasons Why","Jay Asher",1300.00,30);
		Book d=new Book("45-343-4","American Gods","Neil Gaiman",600.00,60);
		Book e=new Book("45-343-5","It","Stephen King",400.00,90);
		
		Book arr[]=new Book[5];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=e;
		
		for (int i =0;i<5;i++)
		{
			System.out.println("");
			arr[i].showDetails();
		}
		
	}
	
}		
		
		
		
		
		
		

		
		
		 
	
