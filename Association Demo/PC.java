import java.lang.*;
public class PC
{
	private String Brand;
	private double Price;
	
	public PC (String Brand,double Price)
	{
		this.Brand=Brand;
		this.Price=Price;
	}
	public void showDetails()
	{
		System.out.println("Brand -"+Brand);
		System.out.println("Price -"+Price);
	}
}