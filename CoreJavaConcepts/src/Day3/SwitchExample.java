package Day3;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation: ");
		char op = sc.next().charAt(0);
		
		System.out.println("Enter A: ");
		int a = sc.nextInt();
		
		System.out.println("Enter B: ");
		int b = sc.nextInt();
		int res;
		
		switch(op)
		{
		  case '+':
			res = a+b;
			System.out.println("ADD: "+res);
			break;
			
		  case '-':
		    res = a-b;
			System.out.println("SUBRACT: "+res);
			break;
			
		  case '*':
			  res = a*b;
			  System.out.println("MULTIPLICATION: "+res);
			  break;
			  
		  case '/':
			  res= a/b;
			  System.out.println("DIVISION: "+res);
			  break;
			  
		  default :
			  System.out.println("Invalid Operation");
		}
      sc.close();
	}

}
