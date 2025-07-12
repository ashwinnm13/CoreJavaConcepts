package Day12;

public class EmailNotifier implements Notifier
{

	public void sendmsg(String message)
	{
		System.out.println("Message sent: "+message);
	}
}
