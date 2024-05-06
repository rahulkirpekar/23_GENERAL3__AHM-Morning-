package oops.co;

import java.util.Scanner;

public class Student 
{
	// 1) Dm's
	int rno;
	String name;
	int std;
	
	// 2) Mf's
	public void scanData() 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno + " " +name + " " + std);
	}
	// 3) main method
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		
		System.out.println("a array object : " + a);
		
		Student s[] = new Student[5];
		System.out.println("s array object : " + s);

		for(int i = 0 ; i< s.length ; i++) 
		{
			s[i] = new Student();
			System.out.println("s["+i+"] : " + s[i]);
//			s[i].scanData();
		}
//		for(int i = 0 ; i< s.length ; i++) 
//		{
//			s[i].dispData();
//		}
		
//		Student s = new Student();
		
//		Student s1 = null;
//		s1 = new Student();
		
//		Student s1 = new Student(), s2 = new Student(),s3 = new Student();

//		s1.scanData();
//		s2.scanData();
//		s3.scanData();

//		s1.dispData();
//		s2.dispData();
//		s3.dispData();
	}
}
