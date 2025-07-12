package Day16;

public class AbstractClass
{
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		Son s = new Son("Govind","Kohli");
		s.details();
		s.sample();//calls static method 
		
		System.out.println("-----------------------------");
		
		Daughter d = new Daughter("Ramesh","Mithali");
		d.details();
		d.sample();//calls static method
		
		System.out.println("-----------------------------");
		
		//We can't create object for an abstract class(i.e Parent)
		//Parent class reference and Subclass class object
		Parent p1 = new Son("Rahul","Dhawan");
		p1.details();
		
		System.out.println("-----------------------------");
		
		Parent p2 = new Daughter("Tripati","Maheswari");
		p2.details();
		
		
	}

}
