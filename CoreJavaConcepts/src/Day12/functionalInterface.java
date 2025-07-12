package Day12;

public class functionalInterface {

	public static void main(String[] args) 
	{
		//Normal Interface Implementation
		Notifier m1 = new EmailNotifier();
		m1.sendmsg("Hello User!!");
		
		System.out.println("-------------------------------------------");
		
		//Using Lambda Expression 
		Notifier m2 = (msg) -> System.out.println("Message Sent: "+msg);
		m2.sendmsg("Hello user using lambda expression");
		
		

	}

}
