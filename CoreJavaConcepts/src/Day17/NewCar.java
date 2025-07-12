package Day17;

public class NewCar
{
	private Engine engine;
	private Media media = new CDPlayer();
	
	public NewCar()
	{
		engine = new PowerEngine();
	}
	
	public NewCar(Engine engine)
	{
		this.engine=engine;
	}
	
	public void startCar()
	{
		engine.start();
	}
	
	public void stopCar()
	{
		engine.stop();
	}
	
	public void accelerateCar()
	{
		engine.acc();	
	}
	
	public void startMusic()
	{
		media.start();
	}
	
	public void stopMusic()
	{
		media.stop();
	}
	
	public void upgradeEngine()
	{
		this.engine = new ElectricEngine();
	}

	public void downgradeEngine()
	{
		this.engine = new PowerEngine();
	}
}
