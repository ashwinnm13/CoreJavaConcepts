package Day14;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) 
	{
	      
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		
		System.out.print("Enter number of columns: ");
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		
		System.out.println("Enter array elements : ");
		for(int i = 0; i<row ; i++)
		{
			for(int j=0 ; j<col ; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Printing Array elements: ");
		for(int i = 0; i<row ; i++)
		{
			for(int j=0 ; j<col ; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
    
		sc.close();

	}

}
