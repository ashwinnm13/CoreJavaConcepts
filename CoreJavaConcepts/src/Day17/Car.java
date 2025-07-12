package Day17;

public class Car implements Brake , Engine, Media
{
	int a =10;

	@Override
	public void start()
	{
		System.out.println("Engine Started");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Engine Stopped");
	}
	
	@Override
	public void acc()
	{
		System.out.println("Engine accelerating");
	}

	@Override
	public void brake() 
	{
       System.out.println("Applying Brake");
		
	}

}
