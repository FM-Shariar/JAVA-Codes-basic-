import java.lang.*;
public class Book
{
    String isbn;
    String bookTitle;
    String authorName;
    double price;
    int availableQuantity;

	 
	Book()
	{
		 System.out.println("Non paramerterized constructor called!!!");
	}
	
	Book(String isbn,String bookTitle,String authorName,double price,int availableQuantity)
	{
		this.isbn=isbn;
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.price=price;
		this.availableQuantity=availableQuantity;
		 
	}
	 
	 void setIsbn(String isbn)
	{
		this.isbn=isbn;
	}
     void setBookTitle(String bookTitle)
    {
		this.bookTitle=bookTitle;
	}
     void setAuthorName(String authorName)
    {
		this.authorName=authorName;
	}
    void setPrice(double price)
    {
		this.price=price;
	}
     void setAvaiableQuantity(int availableQuantity)
    {
		this.availableQuantity=availableQuantity;
	}
    String getIsbn()
	{
		return isbn;
	}
    String getBookTitle()
	{
		return bookTitle;
	}
	String getAuthorName()
	{
		return authorName;
	}
	double getPrice()
	{
		return price;
	}
	int getAvailableQuantity()
	{
		return availableQuantity;
	}

	void addQuantity(int amount)
	{
	if(amount>=0)
		{
			availableQuantity=availableQuantity+amount;
		}
	else
		{
			System.out.println("Wrong amount!!");
		}
	}
    void sellQuantity(int amount)
	{
	if(amount>0)
		{
			availableQuantity=availableQuantity-amount;
		}
	else
		{
			System.out.println("Wrong amount!!");
		}
	}


    void showDetails( )
    {
		System.out.println("Book ISBN               :"+isbn);
		System.out.println("Book Book Title         :"+bookTitle);
		System.out.println("Book Author Name        :"+authorName);
		System.out.println("Book Price              :"+price);
		System.out.println("Book Available Quantity :"+availableQuantity);
	
    }
}