import java.lang.*;

 

public class Student
{
public String name;
public int id;
public static void main(String[] args)
{
Student s1 = new Student();
s1.name = "John";
s1.id = 123;

System.out.println(s1.name);
System.out.println(s1.id);

Student s[] = new Student[3];
s[0] = s1;

Student s2 = new Student();
s2.name = "Wick";
s2.id = 456;
s[2] = s2;
for(int i = 0;i<s.length;i++)
{
if(s[i] != null)
{
System.out.println("s["+i+"].name: "+s[i].name);
System.out.println("s["+i+"].id: "+s[i].id);
}
else
{
System.out.println("s["+i+"].name: NULL HERE");
System.out.println("s["+i+"].id: NULL HERE");
}
}

Student s3 = new Student();
s3.name = "Sam";
s3.id = 789;

for(int i =0; i<s.length;i++)
{
if(s[i] == null)
{
s[i] = s3;
}
else
{

}
}
for(int i = 0;i<s.length;i++)
{
if(s[i] != null)
{
System.out.println("s["+i+"].name: "+s[i].name);
System.out.println("s["+i+"].id: "+s[i].id);
}
else
{
System.out.println("s["+i+"].name: NULL HERE");
System.out.println("s["+i+"].id: NULL HERE");
}
}

}
}