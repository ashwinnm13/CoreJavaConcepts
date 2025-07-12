package Day22;

public class People implements Cloneable
{
	int age;
	String name;
	
	public People(int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	
	public People(People other)
	{
		this.age = other.age;
		this.name = other.name;
	}
	
	
	public void display()
	{
		System.out.println("Name: "+name +"; Age: "+age);
	}
	
	//Object Cloning method
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
}
