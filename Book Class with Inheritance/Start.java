import java.lang.*;
public class Start
{
	public static void main(String []args)
	{
		System.out.println("");
		StoryBook s1=new StoryBook("45-66-11","Twilight","Stephenie Meyer",3500.0,50,"Vampire-romance novel");
		
		System.out.println("");
		s1.showDetails();
		s1.addQuantity(40);
		s1.sellQuantity(20);
		System.out.println("After Adding & Selling.");
		s1.showDetails();
		System.out.println("");
		
		
		TextBook  t1=new TextBook("50-46-40","A Brief History of Time","Stephen Hawking",3000.0,20,9);
		
		System.out.println("");
		t1.showDetails();
		t1.addQuantity(50);
		t1.sellQuantity(10);
		System.out.println("After Adding & Selling.");
		t1.showDetails();
		System.out.println("");
		
		StoryBook s2=new StoryBook();
		
		s2.setIsbn("45-66-12");
		s2.setBookTitle("The Host");
		s2.setAuthorName("Stephenie Meyer");
		s2.setPrice(2000.0); 
		s2.setAvaiableQuantity(24);
		s2.setCategory("Science fiction romance novel");
		
		System.out.println("");
		s2.showDetails();
		s2.addQuantity(30);
		s2.sellQuantity(15);
		System.out.println("After Adding & Selling.");
		s2.showDetails();
		
		System.out.println("");
		TextBook  t2=new TextBook(); 
		
		t2.setIsbn("50-46-41");
		t2.setBookTitle("Mathematics for Machine Learning");
		t2.setAuthorName("M. P. Deisenroth");
		t2.setPrice(2050.0); 
		t2.setAvaiableQuantity(56);
		t2.setStandard(7);
		
		System.out.println("");
		t2.showDetails();
		t2.addQuantity(35);
		t2.sellQuantity(25);
		System.out.println("After Adding & Selling.");
		t2.showDetails();
		System.out.println("");
		
		
		
	}
}