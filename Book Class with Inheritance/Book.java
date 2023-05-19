import java.lang.*;
public class Book
{
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

	 
	public Book()
	{
		 System.out.println("Non paramerterized constructor called!!!");
	}
	
	public Book(String isbn,String bookTitle,String authorName,double price,int availableQuantity)
	{
		System.out.println("Paramerterized constructor called!!!");
		this.isbn=isbn;
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.price=price;
		this.availableQuantity=availableQuantity;
		 
	}
	 
	 public void setIsbn(String isbn)
	{
		this.isbn=isbn;
	}
    public void setBookTitle(String bookTitle)
    {
		this.bookTitle=bookTitle;
	}
    public void setAuthorName(String authorName)
    {
		this.authorName=authorName;
	}
    public void setPrice(double price)
    {
		this.price=price;
	}
    public void setAvaiableQuantity(int availableQuantity)
    {
		this.availableQuantity=availableQuantity;
	}
    public String getIsbn()
	{
		return isbn;
	}
    public String getBookTitle()
	{
		return bookTitle;
	}
	public String getAuthorName()
	{
		return authorName;
	}
	public double getPrice()
	{
		return price;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}

	public void addQuantity(int amount)
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
    public void sellQuantity(int amount)
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


    public void showDetails( )
    {
		System.out.println("Book ISBN               :"+isbn);
		System.out.println("Book Book Title         :"+bookTitle);
		System.out.println("Book Author Name        :"+authorName);
		System.out.println("Book Price              :"+price);
		System.out.println("Book Available Quantity :"+availableQuantity);
	
    }
}