//This interface is demonstrate functional Interface
package Day12;

@FunctionalInterface
public interface Notifier 
{
	
	void sendmsg(String message);
	
	//Functional Interface is an special interface which has only one abstract method.
	//void send();

}
