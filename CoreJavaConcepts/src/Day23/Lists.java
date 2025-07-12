package Day23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

	public static void main(String[] args) 
	{
		 List<String> list1 = new ArrayList<>();
		 
		 list1.add("Rohit");
		 list1.add("Virat");
		 list1.add("Dhawan");
		 list1.add("Rahul");
		 
		 System.out.println("Array List: "+list1);
		 
		 List<Integer> list2 = new LinkedList<Integer>();
		 
		 list2.add(12);
		 list2.add(432);
		 list2.add(22);
		 list2.add(3);
		 
		 System.out.println("Linked List: "+list2);
		 
		 System.out.println("Last Element: "+list2.getLast());
	}

}
