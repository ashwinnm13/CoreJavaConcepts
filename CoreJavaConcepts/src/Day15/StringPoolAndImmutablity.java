package Day15;

public class StringPoolAndImmutablity {

	public static void main(String[] args) 
	{

//		* String Pool 
//		a points to apple which is in string pool of heap memory.
		String a = new String("apple");
		
//		b also has same value as a. Therefore b also points to apple already in the string pool of a.
//		No need of object creation once again -->Memory Optimization.
		String b =  new String("apple");
		
		System.out.println("BeforeChanging");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		System.out.println();
		
//		* Immutability of String 
//		If the value of one variable is changed it will not change the other variable's value pointing to it.

		a="orange";
	    System.out.println("After Changing");
		System.out.println("a: "+a);
		System.out.println("b: "+b);

	}

}
