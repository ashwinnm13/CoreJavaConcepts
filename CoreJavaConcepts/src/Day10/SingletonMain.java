package Day10;

public class SingletonMain {

	public static void main(String[] args)
	{

		 // In a Singleton class object is created only once -> That is why constructor ran only one time 
		 
         Singleton obj1 = Singleton.getInstance();
         
         Singleton obj2 = Singleton.getInstance();   
         
         Singleton obj3 = Singleton.getInstance();
         
         //All the reference variable will point to the same object
         
         System.out.println("-------------------------------------");
         
         System.out.println("All reference variable points to the same object");
         System.out.println(obj1);
         System.out.println(obj2);
         System.out.println(obj3);
         
         

	}

}
