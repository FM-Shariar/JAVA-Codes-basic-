import java.lang.*;
public class Start
{
	public static void main(String[] args)
	{
		BookShop bs = new BookShop("RAFIQ BOOK HOUSE");
		
		TextBook t1=new TextBook("49-4561-T","Concrete Mathematics: A Foundation for Computer Science","Ronald L. Graham",1320.00,56,7);
		TextBook t2=new TextBook("49-4562-T","The Princeton Companion to Mathematics","Timothy Gowers",2425.65,230,8);
		TextBook t3=new TextBook("49-4563-T","Mathematical Methods in the Physical Sciences","Mary L. Boas",1530.65,123,8);
		TextBook t4=new TextBook("49-4564-T","Linear Algebra and Its Applications","Gilbert Strang",2570.95,115,8);
		TextBook t5=new TextBook("49-4565-T","Probability Theory: The Logic of Science","E.T. Jaynes",1415.00,140,9);
		
		bs.insertTextBook(t1);
		bs.insertTextBook(t2);
		bs.insertTextBook(t3);
		bs.insertTextBook(t4);
		bs.insertTextBook(t5);
		bs.showAllTextBooks();
	    
		bs.removeTextBook(t3);
	    bs.showAllTextBooks();
		
		bs.searchTextBook("49-4564-T");
		
		StoryBook s1=new StoryBook("50-5001-S","The Very Hungry Caterpillar","Eric Carle",1400.99,20,"Children's picture book ");
		StoryBook s2=new StoryBook("50-5002-S","Green Eggs and Ham","Dr. Seuss",500.25,50,"Children's book");
		StoryBook s3=new StoryBook("50-5003-S","Charlie and the Chocolate Factory","Roald Dahl",2500.60,60,"Children's novel");
		StoryBook s4=new StoryBook("50-5004-S","The Best of Pippi Longstocking","Astrid Lindgren",320.90,90,"Children's books");
		StoryBook s5=new StoryBook("50-5005-S","The Secret Garden","Frances Hodgson Burnett",300.00,100,"Novel");
		
		bs.insertStoryBook(s1);
		bs.insertStoryBook(s2);
		bs.insertStoryBook(s3);
		bs.insertStoryBook(s4);
		bs.insertStoryBook(s5);
		bs.showAllTextBooks();
		
		bs.removeStoryBook(s5);
		bs.showAllStoryBooks();
		
		bs.searchStoryBook("50-5004-S");
	
	}
}