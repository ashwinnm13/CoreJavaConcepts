//This class is to demonstrate Method Overriding
package Day6;

public class SavingsAccount extends BankAccount 
{
    private double intrestRate = 0.06;
    
    public SavingsAccount(String name,double balance)
    {
    	super(name,balance);
    }
    
    @Override
    public void CalculateIntrest()
    {
    	double intrest = balance * intrestRate;
    	System.out.println("Saving Account Intrest: Rs."+intrest);
    }
       
}
