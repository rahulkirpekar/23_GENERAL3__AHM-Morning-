package oops.inhtopic.thissupertopic;

public class B extends A
{
	int no1;
	int no2;
	
	void disp() 
	{
		System.out.println("Child disp()");
	}
	void addFun() 
	{
		this.disp();
		super.disp();
		
//		int no1=10;
//		super.no1 = 10;
//		no2 = 20;
//		int ans = this.no1 + no2;
//		System.out.println("Addition : " + ans);
	}
	public static void main(String[] args) 
	{
		B obj = new B();
		
		obj.addFun();
	}
}
