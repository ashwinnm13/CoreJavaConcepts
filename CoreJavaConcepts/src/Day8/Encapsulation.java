package Day8;

import java.util.Scanner;

public class Encapsulation {

	public static void main(String[] args)
	{
        
		Scanner sc = new Scanner(System.in);
		
		User u1 = new User("David","David@123");
		
		System.out.println("Enter Username: ");
		String uname = sc.nextLine();
		
		System.out.println("Enter Password: ");
		String pwd = sc.nextLine();
		
		if(u1.getUsername().equals(uname) && u1.getPassword().equals(pwd))
		{
			System.out.println("LOGIN SUCCESSFULL");
			System.out.println("--POST YOUR IDEAS--");
		}
		else
		{
			System.out.println();
			System.out.println("INVALID PASSWORD");
			System.out.println("--CHECK DETAILS ONCE AGAIN--");
		}
		sc.close();

	}

}
