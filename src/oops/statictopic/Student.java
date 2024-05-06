package oops.statictopic;

import java.util.Scanner;

public class Student 
{
	int rno;
	String name;
	int std;
	static String schoolName;
	
	public static  void setSchoolName(String schoolName) 
	{
		Student.schoolName = schoolName;
	}
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name ");
		name = sc.nextLine();
		System.out.println("Enter Std ");
		std = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno + " " + name + " "  +std + " " + schoolName);
	}
	public static void main(String[] args) 
	{
		Student.setSchoolName("DPS");

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		s1.scanData();
		s2.scanData();
		s3.scanData();
		s4.scanData();
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
		s4.dispData();
	}
}