package oops.polymorphism.cp;

// Method Overloadding ---CompileTime Polymorphism
//--------------------------------------------------
//1) method args count
//2) method args--type exact match
//3) method---Type pramotion Rule

public class TestApp1 
{
	// zero args
	public void addFun() 
	{
		System.out.println("Zero Args :: addFun()");
	}
	// TWO args--int
	public void addFun(int no1,int no2) 
	{
		System.out.println("TWO Args--int :: addFun(int no1,int no2)");
		System.out.println("no1 : " + no1);		
		System.out.println("no2 : " + no2);
	}
	// TWO args---double
	public void addFun(double no1,double no2) 
	{
		System.out.println("TWO Args--double :: addFun(int no1,int no2)");
	}
	// THREE args
	public void addFun(int no1,int no2,int no3) 
	{
		System.out.println("THREE Args :: addFun(int no1,int no2,int no3)");
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		
		obj.addFun();
		obj.addFun('a','b');
	}
}