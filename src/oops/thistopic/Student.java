package oops.thistopic;

public class Student 
{
	int rno;
	String name;
	int std;
	int marks;
	String schoolName;

	public Student() 
	{
		System.out.println("Hi I am Default Constructor");
	}
	public Student(int rno, String name, int std) 
	{
		this();
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public Student(int rno, String name, int std, int marks) 
	{
		this(rno, name, std);
		this.marks = marks;
	}
	public Student(int rno, String name, int std, int marks, String schoolName) 
	{
		this(rno, name, std, marks);
		this.schoolName = schoolName;
	}
	void disp() 
	{
		System.out.println(rno+" "+name+" "+std+" " +marks+" "+schoolName);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12, 20, "DPS");
		
		s1.disp();
	}
}