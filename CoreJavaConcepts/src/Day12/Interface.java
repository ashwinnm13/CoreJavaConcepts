package Day12;

public class Interface {

	public static void main(String[] args) 
	{

		payment p1 = new Upipayment("bharath@123");
		payment p2 = new Cardpayment("13545131");
		
		p1.pay(25000.12);
		p2.pay(50000.25);

	}

}
