package oops.finaltopic;

public class TestApp1 
{
//	final int no = 100;
	
	final int no;
	
	public TestApp1() 
	{
		no = 100;
	}
	public TestApp1(int no) 
	{
		this.no = no;
	} 
	public static void main(String[] args) 
	{
		TestApp1  obj = new TestApp1(1000);
		
		System.out.println("No : " + obj.no);
		
	}
}
