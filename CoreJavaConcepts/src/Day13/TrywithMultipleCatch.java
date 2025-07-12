package Day13;

public class TrywithMultipleCatch {

	@SuppressWarnings("null")
	public static void main(String[] args) 
	{

		int i =0;
		@SuppressWarnings("unused")
		int j=0;
		
		int num[] = new int[5];
		
		String str = null;
		
		try
		{
			//Throws Arithmetic Exception
			j=20/i;
			
			//Throws ArrayIndexOutofBound Exception
			System.out.println(num[5]);
			
			//Throws NullPointer Exception
			System.out.println(str.length());
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Not in the array bound");
		}
		catch(NullPointerException e)
		{
			System.out.println("It's Null");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		
		System.out.println("Exceptions are handled");

	}

}
