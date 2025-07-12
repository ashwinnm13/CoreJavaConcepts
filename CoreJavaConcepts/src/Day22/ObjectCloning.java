package Day22;

import java.util.Arrays;

public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		People p1 = new People(25,"Arshdeep");
		People p2 = new People(p1);
		
		p1.display();
		p2.display();
		
		People2 p = new People2(25,"Arshdeep");
		People2 twin = (People2) p.clone();
		
		System.out.println(Arrays.toString(twin.arr));
		
		//changes in cloned array will not affect the original from where it was cloned(only non-primitives)
		twin.arr[0] = 50;
		
		System.out.println("------------------------------------------");
		System.out.println("Deep Copying");
		System.out.println("Original Array: "+Arrays.toString(p.arr));
		System.out.println("Twin Array: "+Arrays.toString(twin.arr));
		
		
		
		
		

	}

}
