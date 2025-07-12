package Day22;

public class People2 implements Cloneable
{
	int age;
	String name;
	int[] arr;
	
	public People2(int age, String name)
	{
		this.age = age;
		this.name = name;
		this.arr = new int[]{2,3,4,56,63};
	}
	
	
	//Object Cloning method
	public Object clone() throws CloneNotSupportedException 
	{
		//Shallow Copying:
		//the cloned non-primitives will point to the original non-primitive, i.e New non-primitives are not created
		People2 twin = (People2)super.clone(); // shallow copying of objects
		
		
		//Deep Cloning:
		//the cloned non-primitives will not point to the original non-primitive, i.e New non-primitives are created separately
		twin.arr = new int[twin.arr.length];
		for(int i = 0 ; i<twin.arr.length ;i++)
		{
			twin.arr[i] = this.arr[i];
		}
		
		return twin;
	}

}
