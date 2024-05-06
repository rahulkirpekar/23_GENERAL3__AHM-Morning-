package oops.thistopic;

public class Employee 
{
	int id;
	String name;
	int salary;
//	method/constructor
	public Employee(int id,String name,int salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void disp() 
	{
		int salary=100;
		System.out.println(id  +" " + name +" "+ salary);
	}
	public static void main(String[] args) 
	{
		Employee e = new Employee(1, "rahul", 1200);
		e.disp();
	}
}