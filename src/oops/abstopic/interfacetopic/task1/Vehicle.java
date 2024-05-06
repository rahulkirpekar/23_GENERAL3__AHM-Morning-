package oops.abstopic.interfacetopic.task1;
 
// interface---Abstract method
public  interface Vehicle 
{
	public static final int no = 100 ;// public static final ---Constant variable
	
	void getSpec();//public abstract 
	
	static void test1() 
	{
		System.out.println("test1--static");
	}
	default void test2() 
	{
		System.out.println("test2--default");
		test3();
	}
	private void test3() 
	{
		System.out.println("test3--private");
	}
}
