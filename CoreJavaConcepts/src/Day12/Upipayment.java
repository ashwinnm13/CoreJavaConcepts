//this program is to demonstrate Interface in java
package Day12;

public class Upipayment implements payment
{

	private String upi_id ;
	
	public Upipayment(String upi_id)
	{
		this.upi_id = upi_id;
	}
	
	
	public void pay(double amount)
	{
		System.out.println();
		System.out.println("PAYMENT THROUGH UPI");
		System.out.println("Paid: ₹" + amount + " UPIid: " + upi_id);
		System.out.println("-----------------------------------------------------------------");
		
	}
}
