package Day7;

public class Student extends Person
{
	String name = "David";
	
    public Student()
    {
    	super();
    	System.out.println("Student Constructor called");
    }
    
    public Student(String name)
    {
    	this.name = name;
    }
    
    @Override
    public void displayName()
    {
    	super.displayName();//calls base class method
    	System.out.println("Student Name: "+name);
    	System.out.println("Base Class name: "+super.name);
    }
	
}
