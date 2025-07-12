//this program is to demonstrate Interface in java
package Day12;

public class Cardpayment implements payment
{

	private String cardno;
	
	public Cardpayment(String cardno)
	{
		this.cardno = cardno;
	}
	
	public void pay(double amount)
	{
		System.out.println();
		System.out.println("PAYMENT THROUGH CARD");
		System.out.println("Paid: ₹" + amount + " CardNo: ****" + cardno.substring(cardno.length()-4));
		System.out.println("-----------------------------------------------------------------");
	}
	
}
