package Day4;

public class BikeMain {

	public static void main(String[] args) 
	{
		
          Bike b1 = new Bike();
          Bike b2 = new Bike("Yamaha",3,"FZ-Midship");
          
          Bike b3= new Bike();
          b3.setBrand("Royal Enfield");
          b3.setId(7);
          b3.setModel("ThunderBird");    
          
          System.out.println(b1);
          System.out.println(b2);
          System.out.println(b3);
	}

}
