import java.lang.*;
public class Bank
{
	public String bname;
	public Employee employees[];
	Bank(String bname,int number)
	{
		this.bname=bname;
		employees=new Employee[number];
	}
	public void insertEmployee(Employee e)
	{
		boolean flag=false;
		
		for (int i=0;i<employees.length;i++)
		{
			if (employees[i]==null)
			{
				employees[i]=e;
				flag=true;
				break;
			}
			
		}
		if (flag==true)
		{
			System.out.println("Inserted Employee!");
		}
		else 
		{
			System.out.println("Insertion Failed!");
		}
	}
    public void removeEmployee(Employee e)
	{
		boolean flag=true;
		for (int i=0;i<employees.length;i++)
		{
			if (employees[i]==e)
			{
				employees[i]=null;
				break;
			}
		}
		if (flag==true)
		{
			System.out.println("Removed Employee!");
		}
		else 
		{
			System.out.println("Removing Failed!");
		}
	}
	 public void searchEmployee(Employee e)
	{
		boolean flag=false;
		for (int i=0;i<employees.length;i++)
		{
			if (employees[i]==e)
			{
				flag=true;
				break;
			}
		}
		if (flag=true)
		{
			System.out.println("Employee Detected!");
		}
		else 
		{
			System.out.println("Employee not found!");
		}
	}
	public void displayEmployee()
	{
		int j=0;
		System.out.println("");
		System.out.println("Bank Name - "+bname);

		for (int i=0;i<employees.length;i++)
		{
			j+=1;
			if (employees[i]!=null)
			{
			System.out.println("Showing Details For Employee - "+j);
			employees[i].details();
			}
			else 
			{
				System.out.println("No Employee At Employee - "+j);
			}
		}
	}
	
}