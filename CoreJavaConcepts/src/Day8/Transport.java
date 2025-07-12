//This class is to demonstrate abstraction using abstract class--Transport System using Abstraction
package Day8;

public abstract class Transport
{
	protected String mode;
	
   public Transport(String mode)
	{
		this.mode = mode;
	}
   
   public abstract void drive();
   public abstract void travel();
   
   public void display()
   {
	   System.out.println("Transport Mode: "+mode);
   }

}
