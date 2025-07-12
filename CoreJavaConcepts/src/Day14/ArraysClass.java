package Day14;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args)
	{
		int[] arr = { 24 , 11 , 4 , 7 , 20};
		
		System.out.println("Unsorted Array: "+Arrays.toString(arr));
		
		//Sorting of Array
		Arrays.sort(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));

        //Binary search of an array ->Sorting is required before binary search
		int indexValue = Arrays.binarySearch(arr, 7);
		System.out.println("Loaction of the number 7 is: "+indexValue);
	
		//Copying an existing array elements to new array
		int[] newarr = Arrays.copyOf(arr, 7);
		System.out.println("Copied Array: "+Arrays.toString(newarr));
		
		//Filling an array
		Arrays.fill(newarr,5,7,80);
		System.out.println("After filling: "+Arrays.toString(newarr));
	

	}

}
