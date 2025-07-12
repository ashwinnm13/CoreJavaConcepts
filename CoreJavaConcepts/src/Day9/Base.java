//This class is to demonstrate Access specifiers in java - public , private , protected 
package Day9;

public class Base 
{
	int defaultVar = 10;
	public int publicVar = 20;
	protected int protectedVar = 30;
	private int privateVar = 40;
	
	public void publicMethod()
	{
		System.out.println("Public Method");
	}

	private void privateMethod()
	{
		System.out.println("Private Method");
	}

	protected void protectedMethod()
	{
		System.out.println("Protected Method");
	}

	void defaultMethod()
	{
		System.out.println("Default Method");
	}
	
	public void display()
	{
		System.out.println("Inside the class");
		
		System.out.println(defaultVar);
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(privateVar);
		publicMethod();
		protectedMethod();
		privateMethod();
		defaultMethod();
		
	}
}
