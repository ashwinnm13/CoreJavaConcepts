//This program is to demonstrate throw keyword in exception handling
package Day13;

public class Atm 
{
	public void withdraw(double amount, double balance)
	{
		try
		{
		if(amount > balance)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("Withdrawl Successful!");
			double rem = balance - amount;
			System.out.println("Balance After Withdrawl: Rs."+ rem);
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Insufficient balance");
		}
	}

}
