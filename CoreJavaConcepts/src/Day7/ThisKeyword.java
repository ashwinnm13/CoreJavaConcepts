package Day7;

public class ThisKeyword {

	public static void main(String[] args) 
	{
		System.out.println("1)Construstor chaining and Show Details");
		Employee e1 = new Employee();
		e1.show();
		System.out.println("--------------------------------------------");
		
		System.out.println("2)Parameterized Constructor and Method Calling");
		Employee e2 = new Employee("Kane Williamson",1,100000.00);
		e2.show();
		System.out.println("--------------------------------------------");

		
		System.out.println("3)Method Chaining");
		Employee e3 = new Employee().setName("Trent Boult").setId(3).setSalary(25000.00);
		e3.show();
		System.out.println("--------------------------------------------");

        System.out.println("4)Return the current object");
        Employee ret = e3.getSelf();
        System.out.println("Object returned using getSelf: "+ret);
        ret.show();
	}

}
