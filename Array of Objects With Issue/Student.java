import java.lang.*;
public class Student
{
    private String name;
    private int id;
   
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setName("Tony Stark");
        s1.setId(123);
       
       
        Student s2 = new Student();
        s2.setName("Bruce Wayne");
        s2.setId(456);
       
        Student s3 = new Student();
        s3.setName("Peter Parker");
        s3.setId(789);
       
        Student students[] = new Student[]{s1, s2, s3};
        for(int i=0; i<students.length;i++)
        {
            System.out.println("students["+i+"].Name: "+students[i].getName());
            System.out.println("students["+i+"].ID: "+students[i].getId());
        }
        for(int i=0; i<students.length;i++)
        {
            if(students[i] == s2)
            {
                students[i] = null;
                System.out.println("Found and Deleted");
            }
            else
            {
                System.out.println("Not Found");
            }
        }
        for(int i=0; i<students.length;i++)
        {
            if(students[i] != null)
            {
                System.out.println("students["+i+"].Name: "+students[i].getName());
                System.out.println("students["+i+"].ID: "+students[i].getId());
            }
            else
            {
                System.out.println("students["+i+"].Name: NULL ");
                System.out.println("students["+i+"].ID: NULL");
            }
           
        }
       
    }
}