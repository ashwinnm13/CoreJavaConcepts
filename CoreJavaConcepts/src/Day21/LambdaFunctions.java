package Day21;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<5;i++)
		{
			arr.add(i+1);
		}
		
		//item -> for each element in an array list return the following output 
		//arr.forEach((item) -> System.out.print(item*2+" "));
		
		Consumer<Integer> fun = (item) -> System.out.print(item*2+" ");
		arr.forEach(fun);
		
		System.out.println();
		
		ArithmeticOperation sum = (a,b)->(a+b);
		ArithmeticOperation sub = (a,b)->(a-b);
		ArithmeticOperation mul = (a,b)->(a*b);
		ArithmeticOperation div = (a,b)->(a/b);
		
		
		LambdaFunctions myCalc = new LambdaFunctions();
		
		System.out.println("Sum: "+myCalc.Operate(1, 3, sum));
		System.out.println("Difference: "+myCalc.Operate(20, 13, sub));
		System.out.println("Multiplication: "+myCalc.Operate(12, 43, mul));
		System.out.println("Division: "+myCalc.Operate(12, 3, div));
					
	}
	
	private int Operate(int a , int b , ArithmeticOperation op)
	{
		return op.operation(a, b);
	}
	

}

interface ArithmeticOperation
{
	int operation(int a, int b);
}
