//this is a class used to extend abstract class
package Day16;

public class Daughter extends Parent
{
	String dname;
	public Daughter()
	{
		super();
	}
	
	public Daughter(String name,String dname)
	{
		super(name);
		this.dname = dname;

	}

	@Override
	public void career()
	{
		System.out.println("I want to be a Data Analyst!");
	}
	
	@Override
	public void details()
	{
		System.out.println("Parent: "+name);
		System.out.println("Son: "+dname);
		career();
	}

}
