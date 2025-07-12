package Day2;

public class BitwiseOperators {

	public static void main(String[] args) 
	{
      
		int m = 5, n = 3;  // Binary: 0101 and 0011
        System.out.println("--Bitwise Operators--");
        System.out.println("m & n = " + (m & n));   // AND: 0001 = 1
        System.out.println("m | n = " + (m | n));   // OR: 0111 = 7
        System.out.println("m ^ n = " + (m ^ n));   // XOR: 0110 = 6
        System.out.println("~m = " + (~m));         // NOT: inversion of bits
        
        //m=5=0101 -left shift->> 1010 (10) --> 5*2=10
        System.out.println("m << 1 = " + (m << 1)); // shift left(multiply by 2)
        
        //m=5=0101 -right shift->> 0010 (2) --> 5/2=2
        System.out.println("m >> 1 = " + (m >> 1)); // shift Right(divide by 2)

	}

}
