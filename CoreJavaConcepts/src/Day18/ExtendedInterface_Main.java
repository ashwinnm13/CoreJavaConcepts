package Day18;

public class ExtendedInterface_Main implements B 
{

	@Override
	public void method1() 
	{
		System.out.println("I'm from Method 1");	
	}

	@Override
	public void method2() 
	{
		System.out.println("I'm from Method 2");
	}
	
	
	public static void main(String[] args) 
	{
		ExtendedInterface_Main obj = new ExtendedInterface_Main();
		
		obj.method1();
		obj.method2();
      

	   //Static Methods cannot be inherited 
       //obj.greet();
		
		//We can only call a static method via Interface Name
		A.greet();
	}

}
