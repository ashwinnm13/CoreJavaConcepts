package Day10;

public class InnerClass
{
	
	// Class "Test" depends on Objects of "InnerClass".
	// To create Test class objects . It should be declared "static" -> to avoid class dependence of Test to InnerClass 
	
     static class Test 
	{
		String name ;
		int id;
		
		public Test(String name , int id)
		{
			this.name = name;
			this.id = id;
		}
	}

	public static void main(String[] args) 
	{

		Test a = new Test("Dhoni",7);
		
		Test b = new Test("Kohli",18);
		
		System.out.println(a.name + " jersey no: " +a.id);
		
		System.out.println(b.name + " jersey no: " +b.id);


	}

}
