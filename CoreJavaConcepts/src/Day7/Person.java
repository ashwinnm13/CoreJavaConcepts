//This program is to demonstrate the application of super keyword
package Day7;

public class Person
{
	public String name = "NULL";
	
	public Person()
	{
		super();
		System.out.println("Person Contructor Called..");
	}
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public void displayName()
	{
		System.out.println("Name: "+name);
	}

}
