//This class is demonstrate the application of static keyword
package Day10;

public class Office
{
	private String name;
	private int id;
	
	private static String officeName = "Technology";

	public Office()
	{
		name = "Unknown";
		id = 0;

	}

	public Office(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public static void changeOfficeName (String newName)
	{
		officeName = newName;
	}
	
	public void display()
	{
		System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Company: " + officeName);
        System.out.println("-----------------------");
	}
	
	

}
