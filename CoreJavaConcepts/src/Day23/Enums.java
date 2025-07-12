package Day23;

public class Enums
{
	enum Month implements A
	{
		January , February , March , April , May , June , July , August , September , October , November , December;
		
		Month()
		{
			System.out.println("Constructor Invoked "+this+" Month");
		}

		@Override
		public void hello() 
		{
           System.out.println("Hello from Enum!!");

		}
	}
	

	public static void main(String[] args) 
	{

		Month month ;
		month = Month.March;
		
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		//Print all values.
		for(Month mon : Month.values())
		{
			System.out.print(mon+", ");
		}
		System.out.println();
		
		System.out.println("Ordinal: "+month.ordinal());
		
		month.hello();

	}

}
