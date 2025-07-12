package Day14;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int size;
		
		//Get array size
		System.out.println("Enter array size : ");
		size = sc.nextInt();
		
		//Array Initialization Syntax
		int[] arr = new int[size];
		
		//Get array values
		for(int i=0 ; i<size ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//Print Array values
		System.out.println("Print array using for loop:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
		//Print values using toString 
		System.out.println("Print array using toString:");
		System.out.println(Arrays.toString(arr));
		
		//Print values using for each loop
		System.out.println("Print array using for each loop:");
		for(int num : arr)
		{
			System.out.print(num + " ");
		}
		

        sc.close();
	}

}
