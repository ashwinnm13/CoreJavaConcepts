//this is a class used to extend abstract class
package Day16;

public class Son extends Parent
{
	String sname;
	public Son()
	{
		super();
	}
	
	public Son(String name,String sname)
	{
		super(name);
		this.sname = sname;
	}

	@Override
	public void career()
	{
		System.out.println("I want to be a CyberSecurity Specialist!");
	}
	
	@Override
	public void details()
	{
		System.out.println("Parent Name: "+name);
		System.out.println("Son's Name: "+sname);
		career();
	}
}
