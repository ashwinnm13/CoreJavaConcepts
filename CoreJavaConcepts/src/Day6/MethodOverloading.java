package Day6;

public class MethodOverloading {

	public static void main(String[] args) 
	{

		Addition a = new Addition();
		System.out.println(a.add(10,20));
		System.out.println(a.add(3.14,5.36));
		System.out.println(a.add(10,20,30));
		System.out.println(a.add("Method"," Overloading"));
		
	}

}
