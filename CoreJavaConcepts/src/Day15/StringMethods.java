package Day15;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args)
	{

		//Equals and ==
		String name1 ="Dhoni";
		String name2 ="Dhoni";
		
		System.out.println("In String Literals");
		System.out.println("Equals: "+name1.equals(name2));
		System.out.println("Using == operator: " + (name1 == name2));

		System.out.println();
		
		String a = new String("Kohli");
		String b = new String("Kohli");
		
		System.out.println("In String Objects");
		System.out.println("Equals: "+a.equals(b));
		System.out.println("Using == operator on onject: "+ (a==b));
		
		System.out.println();
		
		//Length of a String
		System.out.println("Length of a: "+a.length());
		
		System.out.println();
		
		//UpperCase and LowerCase
		System.out.println("To UpperCase: "+name1.toUpperCase());
		System.out.println("To LowerCase: "+name1.toLowerCase());

		System.out.println();
		
		//To find Character At Index 
		System.out.println("Character at Index 3: "+a.charAt(3));
		
		System.out.println();
		
		//To find substring
		String name3 = "AbrahamBenjamindeVilliers";
		System.out.println("Substring from 7 to 11: "+name3.substring(7,15));
		
		System.out.println();
		
		//To find the Index of a Character
		System.out.println("Index of character j: "+name3.indexOf('j'));
		
		System.out.println();
		
		//To trim the String
		String spaced = "   Brendon McCullum   ";
        System.out.println("Trimmed: " + spaced.trim());  
        
        //To convert String to Character Array
        String array = "SunilGavaskar";
        System.out.println("Character Array: "+Arrays.toString(array.toCharArray()));
		
        System.out.println();
        
        //Split a String
        String demo = "Kapil Dev";
        System.out.println("Splitted Array: "+Arrays.toString(demo.split(" ")));
        
        
		
	}

}
