package Day10;

public class StaticKeyword {

	public static void main(String[] args)
	{
        Office emp1 = new Office("Rahul",6);
        emp1.display();
        
        Office emp2 = new Office("Mahesh",8);
        
        //static variable can be accessed only by using the respective class name only--> can't be accessed by using objects
        Office.changeOfficeName("Electronics");
        emp2.display();

        Office emp3 = new Office();
        emp3.display();
        
        
       //fun();
       
	}

static void fun()
{
	//greet(); // because greet depends on object of the (main) class-->{ make the non static one to static }
	
	StaticKeyword g = new StaticKeyword();
    g.greet(); // Non static one needs an reference to access .
    
    
	
}

void greet()
{
	System.out.println("Hello");
}
}