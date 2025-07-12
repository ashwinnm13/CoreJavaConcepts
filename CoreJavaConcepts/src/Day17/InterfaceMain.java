package Day17;

public class InterfaceMain {

	public static void main(String[] args) 
	{

		Car c = new Car();
		c.start();
		c.acc();
		c.brake();
		c.stop();
		
	//  Engine car = new Car();
	//  car.a; // this can't be accessed because Engine doesn't contain "a"
	    
    //  Media car2 = (Media) new Car();
    //  car2.stop(); //This object stops the car instead of stopping Media Player
		
		//After NewCar
		
		System.out.println("-----------------------------------------------");
		NewCar c3 =  new NewCar();
		
		c3.startCar();
		c3.startMusic();
		c3.stopMusic();
		c3.accelerateCar();
		c3.upgradeEngine();
		c3.startCar();
		c3.downgradeEngine();
		c3.startCar();
	
  		
		
	}

}
