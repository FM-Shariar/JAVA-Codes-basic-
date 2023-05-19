import java.lang.*;

public class Account
{
	private int ano;
	private double balance;
	
	public Account()
	{
		System.out.println("Empty Constructor");
	}
	public Account(int ano, double balance)
	{
		System.out.println("Parameterized Constructor");
		this.ano=ano;
		this.balance=balance;
	}
	public void setAno(int ano)
	{
		this.ano=ano;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public int getAno()
	{
		return ano;
	}	
	public double getBalance()
	{
		return balance;
	}
	
	public void withdraw(double amount)
	{
		if(balance >= amount && amount>0)
		{
			balance = balance-amount;
			System.out.println("Withdrawal Successfull");
		}
		else
		{
			System.out.println("Withdrawal Unsuccessful");
		}
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance = balance+amount;
			System.out.println("Deposit Successfull");
		}
		else
		{
			System.out.println("Deposit Unsuccessful");
		}
	}
	
	public void transferMoney(Account a,double amount)
	{
		withdraw(amount);
		a.deposit(amount);
		
		//System.out.println("Account balance: "+getBalance());
		//System.out.println("Account balance: "+a.getBalance());
	}
	public void showDetails()
	{
		System.out.println("Account no: "+ano);
		System.out.println("Account balance: "+balance);
	}
}