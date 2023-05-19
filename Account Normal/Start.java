import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Account a1 = new Account();
		a1.setAno(111);
		a1.setBalance(500);
		a1.showDetails();
		a1.withdraw(100);
		System.out.println("Balance: "+a1.getBalance());
		
		Account a2 = new Account(222, 700);
		a2.deposit(300);
		a2.showDetails();
		
		a1.transferMoney(a2,100);
		a1.showDetails();
		a2.showDetails();
		
		
	}
}