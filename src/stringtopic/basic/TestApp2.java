package stringtopic.basic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		//			   01234
//		String name = "royal";
//		for (int i = 0; i < name.length(); i++) 
//		{
//			System.out.println("name.charAt("+i+") :  " + name.charAt(i));
//		}
//--------------------------------------------------------------------
//		String name1 = "Rakesh";
//		String name2 = "Pandya";
						// rakesh Pandya
//		String name3 = name1.concat(name2);
//		System.out.println("name3 : " + name3);
//		System.out.println("name1.compareTo(name2) : " + name1.compareTo(name2));
//--------------------------------------------------------------------
//		String stmt = "This is Java which is developed James Gosling";
//		System.out.println("stmt.contains(\"Python\") : "  + stmt.contains("James"));
//--------------------------------------------------------------------
//		String stmt = "This is Java which is developed James Gosling";
//		System.out.println(stmt.endsWith("James"));
//--------------------------------------------------------------------
//		String name1 = "royal";
//		String name2 = "Royal";
//		System.out.println("name1.equals(name2) : " + name1.equals(name2));
//		System.out.println("name1.equalsIgnoreCase(name2) : " + name1.equalsIgnoreCase(name2));
//--------------------------------------------------------------------
//		int no1 =10;
//		float no2 = 20.234f;
//		String stmt = String.format("\n\nNo1 : %d\nNo2 : %f", no1,no2);
//		System.out.println("stmt : " + stmt);
//--------------------------------------------------------------------
//		String name1 ="ABC";
//		byte b[] = name1.getBytes();
//		for (int i = 0; i < b.length; i++) 
//		{
//			System.out.println(name1.charAt(i)+"---"+b[i]);
//		} 
//--------------------------------------------------------------------
//					   012345678901234567890123456789012345678901234 	
//		String stmt = "This is Java which is developed James Gosling";
//		System.out.println(stmt.lastIndexOf("is"));
//--------------------------------------------------------------------
//		char c[] = new char[5]; 
//		stmt.getChars(8, 12, c, 0);
//		for (int i = 0; i < c.length; i++) 
//		{
//			System.out.println(c[i]);
//		} 
//--------------------------------------------------------------------
//		String name1 = "rahul";
//		String name2 = new String("rahul").intern();
//		System.out.println("name1==name2 : " + (name1==name2));
//--------------------------------------------------------------------
//		String name1 = " ";
//		System.out.println("name1.isBlank() : " + name1.isBlank());
//		System.out.println("name1.isEmpty() : " + name1.isEmpty());
//--------------------------------------------------------------------
//		split()         0   1    2   3
//		String stmt = "This is Java which is developed James Gosling";
//		String words[] = stmt.split("\\s");
//		for (int i = 0; i < words.length; i++) 
//		{
//			System.out.println(words[i]);
//		}
//--------------------------------------------------------------------		
//		startsWith()         
		
//		String stmt = "This is Java which is developed James Gosling";
//		System.out.println(stmt.startsWith("This"));
		
//		substring()         
//		String value1 = stmt.substring(8);
//		String value2 = stmt.substring(8, 12);
//		System.out.println("value2 : " + value2);
		
		
		
//		toCharArray()   
//		char v [] = stmt.toCharArray();
//		for (int i = 0; i < v.length; i++) 
//		{
//			System.out.println(v[i]);
//		}
		
		
//		toLowerCase()         
//		toUpperCase()         

//		System.out.println("stmt.toLowerCase() : " + stmt.toLowerCase());
//		System.out.println("stmt.toUpperCase() : " + stmt.toUpperCase());
		
		
//		trim()   
		
//		String v = " java tech ";
//		System.out.println("v.length() : " +v.length());
//		v = v.trim();
//		System.out.println("v.length() : " +v.length());
		
//		valueOf()

		int  no1 = 100;
		int  no2 = 200;
		
		String str1 = String.valueOf(no1);
		String str2 = String.valueOf(no2);
		
		System.out.println(str1+str2);
	
		// String---concened type
//		parseXXX();
		
//		str1 = str1+"a";
		
		no1=  Integer.parseInt(str1);
		no2=  Integer.parseInt(str2);
		
		System.out.println(no1+no2);
		
		
		
		
	}
}
