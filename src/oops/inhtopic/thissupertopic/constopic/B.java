package oops.inhtopic.thissupertopic.constopic;

public class B extends A
{
	int no2;
	B()
	{
//		super(100);
		no2=20;
		System.out.println("B :: Default Constructor");
	}
	B(int no2)
	{
//		super(100);
		this.no2=no2;
		System.out.println("B :: Para Constructor");
	}
	void disp() 
	{
		System.out.println("No1 : " + no1 +" \t "+"NO2 : " + no2);
	}
	public static void main(String[] args) 
	{
		B obj = new B(200);
		obj.disp();
	}
}