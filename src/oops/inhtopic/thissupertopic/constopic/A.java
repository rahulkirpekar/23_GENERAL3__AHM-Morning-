package oops.inhtopic.thissupertopic.constopic;

public class A 
{
	int no1;
	A()
	{
		no1=10;
		System.out.println("A :: Default Constructor");
	}
	A(int no1)
	{
		this.no1=no1;
		System.out.println("A :: Para Constructor");
	}
}
