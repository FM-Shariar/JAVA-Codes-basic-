import java.lang.*;
public class Person
{
	private String Name;
	private int Age;
	private PC pc;

	
	public Person(String Name,int Age,PC pc)
	{
		this.Name=Name;
		this.Age=Age;
		this.pc=pc;
	}
	public void showDetails()
	{
		System.out.println("Name -"+Name);
		System.out.println("Age -"+Age);
        pc.showDetails();
	}
}