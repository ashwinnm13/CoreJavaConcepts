package Day14;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	       
		   //Declare ArrayList using String Wrapper class
	       ArrayList<String> list = new ArrayList<>();
	       
	       System.out.print("Enter the number of elements: ");
	       int n = sc.nextInt();
	       sc.nextLine();
	       
	       System.out.println("Enter the strings: ");
	       for(int i = 0 ; i<n ;i++)
	       {
	    	   String str = sc.nextLine();
	    	   list.add(str);
	       }
	       
	       System.out.print("Print Array: ");
	       for(String words : list)
	       {
	    	   System.out.print(words+" ");
	       }
	       
	       sc.close();
	       
	}

}
