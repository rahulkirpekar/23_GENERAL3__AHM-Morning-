package stringtopic.basic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		char value = (char)System.in.read();//r--65--r
//		char value = sc.next().charAt(0);
		
		System.out.println("Value : " + value);
		
//		String name = sc.next();// Single word
//		String name = sc.nextLine();// Multiple word
		
//		System.out.println("Name : " + name);
		
	}
}
