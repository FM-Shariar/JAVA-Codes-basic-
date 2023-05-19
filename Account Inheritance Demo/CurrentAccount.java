import java.lang.*;

public class CurrentAccount extends Account
{
	private double limit;
	public CurrentAccount(int ano, double balance, double limit)
	{
		super(ano, balance);
		System.out.println("Parameterized CurrentAccount");
		this.limit = limit;
	}
	public void display()
	{
		super.display();
		System.out.println("Limit: "+limit);
	}
}