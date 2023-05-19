import java.lang.*;
public class Employee
{
	public String ename;
	public int e_id;
	
	public Employee(String ename,int e_id)
	{
		this.ename=ename;
		this.e_id=e_id;
	}
	public void details()
	{
		System.out.println("Empolyee Name - "+ename);
		System.out.println("Empolyee ID - "+e_id);
	}
}