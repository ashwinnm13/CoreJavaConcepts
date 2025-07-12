package Day10;

public class Singleton 
{

	private  Singleton()
	{
		System.out.println("I am the constructor of Singleton Class");
	}
	
	private static Singleton instance;
	
	public static Singleton getInstance()
	{
		if(instance == null)// If object is not created , create an instance
		{
			instance = new Singleton();
		}
		
		return instance;// else return type is object
	}
}
