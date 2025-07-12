//This class is to demonstrate Access specifiers in java - public , private , protected 
package Day9;

public class SubClass extends Base
{

	public void test()
	{
		System.out.println(publicVar);         
        System.out.println(protectedVar);       
        // System.out.println(defaultVar);      
        // System.out.println(privateVar);      
        publicMethod();                       
        protectedMethod(); 
	}
}
