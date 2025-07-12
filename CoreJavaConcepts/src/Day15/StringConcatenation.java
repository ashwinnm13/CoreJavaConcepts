package Day15;

public class StringConcatenation {

	public static void main(String[] args)
	{

		//Char + Char = Addition of ASCII values. 
		System.out.println('a'+'b');
		
		System.out.println();
		
		//String + String = String Concatenation.
		System.out.println("a"+"b");
		
		System.out.println();
		
		//Character + Integer
		System.out.println('a'+3); //97+3 = 100
		System.out.println((char)('a'+3));//100(ASCII) = d
		
		System.out.println();
		
		//String + integer
		System.out.println("a"+1);//integer to Integer()

	}

}
