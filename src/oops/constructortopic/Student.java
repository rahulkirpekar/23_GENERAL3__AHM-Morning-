package oops.constructortopic;

public class Student 
{
	// 1) Data Members / Instance Variables
	int rno;//0
	String name;//null
	int std;//0
	
	
	// Default Constructor
	public Student() 
	{
		System.out.println("START :: Default Constructor");
		
		System.out.println("Before Initialise : " + rno + " " +name + " " + std);
		
		rno=1;
		name="rahul";
		std=12;

		System.out.println("After Initialise : " + rno + " " +name + " " + std);

		System.out.println("EXIT :: Default Constructor");
	}
	
	// parameterised Constructor
	public Student(int rno,String name,int std) 
	{
		System.out.println("START :: PARA Constructor");
		System.out.println("Before Initialise : " + this.rno + " " +this.name + " " + this.std);
		this.rno = rno;
		this.name = name;
		this.std = std;
		System.out.println("After Initialise : " + rno + " " +name + " " + std);
		System.out.println("EXIT :: PARA Constructor");
	}	
	
	// copy constructor
	public Student(Student s) 
	{
		System.out.println("START :: COPY Constructor");
		System.out.println("Before Initialise : " + rno + " " +name + " " + std);
		rno = s.rno;
		name = s.name;
		std = s.std;
		System.out.println("After Initialise : " + rno + " " +name + " " + std);
		System.out.println("EXIT :: COPY Constructor");
	}	
	public static void main(String[] args) 
	{
		Student s1 = new Student(2,"Ankur",12);
		
//		Student s2 = new Student(s1);
		
		System.out.println("s1==> " + s1.rno + " " + s1.name + " " + s1.std);
//		System.out.println("s2==> " + s2.rno + " " + s2.name + " " + s2.std);
		
	}
}
