//This class is to demonstrate the application of this keyword
package Day7;

public class Employee 
{
   private String name;
   private int id;
   private double salary;
   
   //this()->Constructor chaining
   public Employee()
   {
	   //parameters
	   this("Unknown",0,0.00);
	   System.out.println("Default Constructor invoked..");
   }

   //this.variable->Refer instance variable
  public Employee(String name, int id, double salary)
  {
	this.name = name;
	this.id = id;
	this.salary = salary;
 	System.out.println("Parameterized Constructor invoked");
  }
  
  //this.method()->Call Methods
  public void show()
  {
	  this.greet();
	  System.out.println("Name: "+name);
	  System.out.println("ID: "+id);
	  System.out.println("Salary: "+salary);
  }
  
  public void greet()
  {
	  System.out.println("Welcome "+ this.name +" !");
  }
  
  //Method Chaining
  public Employee setName(String name)
  {
	  this.name = name;
	  return this;
  }
  public Employee setId(int id)
  {
	  this.id = id;
	  return this;
  }
  
  public Employee setSalary(double salary)
  {
	  this.salary = salary;
	  return this;
  }
  
  //return this to return the current object 
  public Employee getSelf()
  {
	  return this;
  }
   
   
}
