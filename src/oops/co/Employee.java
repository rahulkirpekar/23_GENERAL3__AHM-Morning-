package oops.co;

import java.util.Scanner;
public class Employee 
{
	int id;
	String name;
	int salary;
	
	void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		id= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name= sc.nextLine();
		System.out.println("Enter Salary: ");
		salary= sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(id + " " + name + " " + salary);
	}
}
