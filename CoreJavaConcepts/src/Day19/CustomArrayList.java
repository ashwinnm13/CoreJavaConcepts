package Day19;

import java.util.Arrays;

public class CustomArrayList 
{

	//Array list Variables
	private int[] data;
	private static int DEFAULT_SIZE =10;
	private int size = 0;
	
	public CustomArrayList()
	{
		this.data = new int[DEFAULT_SIZE];
	}
	
	private boolean isFull()
	{
		return size == data.length;
	}
	
	private void resize()
	{
		int temp[] = new int[data.length * 2];
		
		//copy the values of old array into new array(temp[])
		for(int i=0 ; i<data.length ;i++)
		{
			temp[i] = data[i];
		}
		
		data = temp;
	}
	
	
	public void add(int num)
	{
		if(isFull())
		{
			resize();
		}
		
		//to store the element into next index values
		data[size++] = num;
	}
	
	public int remove()
	{
		
		int removed = data[size--];
		return removed;
	}
	
	public int getValue(int index)
	{
		return data[index];
	}
	
	public int sizeOf()
	{
		return size;
	}
	
	public void setValue(int value , int index)
	{
		data[index] = value;
	}

	@Override
	public String toString() {
		return "data=" + Arrays.toString(data) + ", size=" + size ;
	}
	
	public static void main(String[] args)
	{
		CustomArrayList list = new CustomArrayList();
		list.add(3);
		list.add(5);
		list.add(35);
		list.add(342);
		
		System.out.println(list.toString());
		
		//When we print the array it contains the number removed . But it not a part of array list
		list.remove();
		
		//When we add after removing the final element , I will override the previously removed number ( 45 replaces 342)
		list.add(45);
		
		System.out.println(list.toString());
		
	    System.out.println("The number is: "+list.getValue(2));
		
	    list.setValue(57 , 7);
	    
	    System.out.println(list.toString());
	    
	    System.out.println("The size of the List: "+ list.sizeOf());
	    
	    list.setValue(100, 9);
	    System.out.println(list.toString());

	    //It will check for remaining unfilled places
	    list.add(78);
	    System.out.println(list.toString());
	    
	    list.add(1);
	    list.add(554);
	    list.add(23);
	    list.add(24);
	    list.add(600);
	    list.add(65);
	    
	    //After adding elements after default size it becomes =twice
	    System.out.println(list.toString());
	    
	    
	}
	
}
