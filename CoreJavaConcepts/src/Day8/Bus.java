//This class is to demonstrate abstraction using abstract class--Transport System using Abstraction
package Day8;

public class Bus extends Transport 
{
	private int passengerno ;
	
	public Bus(int passengerno)
	{
		super("Bus");
		this.passengerno = passengerno;
	}
	
	@Override
	public void drive()
	{
	 System.out.println("Bus is moving with "+passengerno+" number of passengers.");	
	}

	@Override
	public void travel()
	{
		System.out.println("Bus is travelling to Bangalore.");
	}
}
