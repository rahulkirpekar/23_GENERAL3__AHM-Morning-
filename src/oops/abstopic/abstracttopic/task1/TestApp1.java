package oops.abstopic.abstracttopic.task1;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Vehicle vehicle = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below choice : ");
		System.out.println("1) For TwVehicle");
		System.out.println("2) For LmvVehicle");
		System.out.println("3) For HmvVehicle");
		
		int choice = sc.nextInt();
		
		switch (choice) 
		{
					// polymorphic object ---> Runtime Polymorphism
			case 1: // Upcasting
					vehicle =  new TwVehicle();
					vehicle.getSpec();
//					vehicle.getTWInfo();//C.E
					
					// Downcasting
					TwVehicle tw = (TwVehicle)vehicle;
					tw.getTWInfo();
					break;
					
			case 2: vehicle =  new LmvVehicle();
					vehicle.getSpec();
					break;
					
			case 3: vehicle =  new HmvVehicle();
					vehicle.getSpec();
					break;
		}
	}
}