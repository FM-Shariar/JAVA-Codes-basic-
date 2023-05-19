import java.lang.*;
public class SavingsAccount extends Account
{
	private int year;
	public SavingsAccount(int ano, double balance, int year)
	{
		super(ano, balance);
		System.out.println("Parameterized SavingsAccount");
		this.year = year;
	}
	public void display()
	{
		super.display();
		System.out.println("Year: "+year);
	}
}