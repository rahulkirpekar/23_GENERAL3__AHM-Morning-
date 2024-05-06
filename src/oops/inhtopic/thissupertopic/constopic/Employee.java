package oops.inhtopic.thissupertopic.constopic;

public class Employee extends Person
{
	int id;
	int salary;
	String dsgn;
	String orgName;
	
	public Employee(int id, String name, int salary) 
	{
		super(name);
		this.id = id;
		this.salary = salary;
	}
	public Employee(int id, String name, int salary, String dsgn) 
	{
		this(id, name, salary);
		this.dsgn = dsgn;
	}
	public Employee(int id, String name, int salary, String dsgn, String orgName) 
	{
		this(id, name, salary, dsgn);
		this.orgName = orgName;
	}
	public void dispData() 
	{
		System.out.println(id+" " + name + " " + salary +" " + dsgn +" " + orgName);
	}
	public static void main(String[] args) 
	{
		Employee e1  = new Employee(1, "rahul", 122);
		Employee e2  = new Employee(2, "kunal", 102,"SE");
		Employee e3  = new Employee(3, "Ankur", 142,"Dr","ABC");

		e1.dispData();
		e2.dispData();
		e3.dispData();
		
	}
}