//This is an abstract class 
package Day16;

//If any one or more method in java is "abstract",the class should also be declared "abstract" 
public abstract class Parent
{
	String name;
	abstract void career();
	abstract void details();
	
	static void sample()
	{
		System.out.println("I'm in a static Block of Abstract Class");
	}
	
	public Parent()
	{
		System.out.println("I'm Parent");
	}
	
	public Parent(String name)
	{
		this.name = name;
	}
	
	

}
