package Day10;

public class StaticBlock 
{
	static int a = 5;
	static int b ;
	
	
	static 
	{
		System.out.println("From Static Block");
		System.out.println("I will execute only once before the creation of object!!");
		b = a*5;
	}

	public static void main(String[] args)
	{
		System.out.println();

		@SuppressWarnings("unused")
		StaticBlock obj1 = new StaticBlock();
		
		System.out.println("A = "+StaticBlock.a + "|" +"B = "+ StaticBlock.b);
		
		StaticBlock.b += 3;
		System.out.println("A = "+StaticBlock.a + "|" +"B = "+ StaticBlock.b);
		
		@SuppressWarnings("unused") 
		StaticBlock obj2 = new StaticBlock();
		
		System.out.println("A = "+StaticBlock.a + "|" +"B = "+ StaticBlock.b);
	

	}

}
