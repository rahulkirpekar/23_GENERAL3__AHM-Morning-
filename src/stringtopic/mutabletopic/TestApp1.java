package stringtopic.mutabletopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// IMMutable Operation on String 
		String name = "rahul";
		
		System.out.println(name + "---" + name.hashCode());
		
		name = name.concat(" kirpekar");
		
		// Mutable Operation on String 
//		StringBuilder sb = new StringBuilder("rahul");
		StringBuffer sb = new StringBuffer("rahul");
		
		
		System.out.println(name + "---" + name.hashCode());
		
//		System.out.println(sb + " " +sb.hashCode());
//		sb.append(" Kirpekar");
//		System.out.println(sb + " " +sb.hashCode());
	}
}
