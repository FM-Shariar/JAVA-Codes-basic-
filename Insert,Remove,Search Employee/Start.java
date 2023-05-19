import java.lang.*;
public class Start
{
	public static void main(String []args)
	{
		Employee e1=new Employee("Rahim",45);
		Employee e2=new Employee("Karim",46);
		Employee e3=new Employee("Tamim",47);
		Employee e4=new Employee("Rahman",48);
		Employee e5=new Employee("Hafiz",49);

		Bank b1=new Bank("Janata Bank",5);

		b1.insertEmployee(e1);
		b1.insertEmployee(e2);
		b1.insertEmployee(e3);
		b1.insertEmployee(e4);
		b1.insertEmployee(e5);
		b1.displayEmployee();
		System.out.println("");
		b1.removeEmployee(e3);
		b1.displayEmployee();
		b1.searchEmployee(e4);
	}
}