import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		SavingsAccount sa1 = new SavingsAccount(123, 800, 2);
		System.out.println("sa1.balance: "+sa1.getBalance());
		sa1.deposit(200);
		sa1.withdraw(300);
		
		SavingsAccount sa2 = new SavingsAccount(222, 100, 2);
		sa1.sendMoney(sa2, 500);
		
		System.out.println("sa1.balance: "+sa1.getBalance());
		System.out.println("sa2.balance: "+sa2.getBalance());

		CurrentAccount ca1 = new CurrentAccount(333, 750, 1000);
		CurrentAccount ca2 = new CurrentAccount(444, 650, 1500);
		ca1.deposit(200);
		ca1.withdraw(700);
		ca2.sendMoney(ca1, 500);
		
		System.out.println("ca1.balance: "+ca1.getBalance());
		System.out.println("ca2.balance: "+ca2.getBalance());
		
		sa1.display();
		sa2.display();
		ca1.display();
		ca2.display();

		
	}
}