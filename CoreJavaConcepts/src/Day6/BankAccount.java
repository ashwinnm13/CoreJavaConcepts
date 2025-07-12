//This class is to demonstrate Method Overriding
package Day6;

public class BankAccount 
{
	protected String name;
	protected double balance;
	
	public BankAccount(String name, double balance) 
	{
		super();
		this.name = name;
		this.balance = balance;
	}
	
	public void CalculateIntrest()
	{
		System.out.println("No intrests for general bank accounts");
	}
	
	public void display()
	{
		System.out.println("-------------------------");
		System.out.println("Account Holder: "+name);
		System.out.println("Balance: "+balance);
	}

}
