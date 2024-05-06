package oops.abstopic.interfacetopic.task1;
import java.util.Scanner;
public class TestApp2 
{
	public static void getVehicleInfo(Vehicle vehicle) 
	{
		vehicle.getSpec();
		
		if (vehicle instanceof TwVehicle) 
		{
			// Downcasting
//			TwVehicle tw = (TwVehicle)vehicle;
//			tw.getTWInfo();
			
			((TwVehicle)vehicle).getTWInfo();
			
			
		} else if(vehicle instanceof LmvVehicle)
		{
			// Downcasting
//			LmvVehicle lmv = (LmvVehicle)vehicle;
//			lmv.getLMVInfo();
			
			((LmvVehicle)vehicle).getLMVInfo();
		}
		else if(vehicle instanceof HmvVehicle)
		{
			// Downcasting
			HmvVehicle hmv = (HmvVehicle)vehicle;
			hmv.getHMVInfo();

			((HmvVehicle)vehicle).getHMVInfo();
		}
	}
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
			case 1: vehicle = new TwVehicle();
					getVehicleInfo(vehicle);
					break;
					
			case 2: vehicle = new LmvVehicle();
					getVehicleInfo(vehicle);
					break;
					
			case 3:  vehicle = new HmvVehicle();
					 getVehicleInfo(vehicle);
					break;
		}
		
		Vehicle.test1();//static
		vehicle.test2();//default
	}
}