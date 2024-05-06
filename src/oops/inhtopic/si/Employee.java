package oops.inhtopic.si;

import java.util.Scanner;

public class Employee extends Person
{
	int id;
	String dsgn;
	int salary;
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(id + " " + name + " " + salary + " " + dsgn);
	}
	
}
