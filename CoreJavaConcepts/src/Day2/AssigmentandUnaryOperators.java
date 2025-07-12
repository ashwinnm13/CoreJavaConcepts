package Day2;

public class AssigmentandUnaryOperators {

	public static void main(String[] args) 
	{
		 int a = 10;
	        System.out.println("Value of a = " + a);

	        a += 5; // a = a + 5
	        System.out.println("a += 5: " + a); // 15

	        a -= 3; // a = a - 3
	        System.out.println("a -= 3: " + a); // 12

	        a *= 2; // a = a * 2
	        System.out.println("a *= 2: " + a); // 24

	        a /= 4; // a = a / 4
	        System.out.println("a /= 4: " + a); // 6

	        a %= 4; // a = a % 4
	        System.out.println("a %= 4: " + a); // 2

	        // Unary Operators
	        int x = 5;
	        System.out.println("Value of x = " + x);

	        System.out.println("Unary +x = " + (+x));  // +5
	        System.out.println("Unary -x = " + (-x));  // -5

	        System.out.println("x++ = " + (x++)); // Post-increment: use x, then x = x+1
	        System.out.println("Post-increment of x = " + x); // x becomes 6

	        System.out.println("Pre-increment of x= " + (++x)); // Pre-increment: x = 1+x, then use → 7

	        System.out.println("x-- = " + (x--)); // Post-decrement: use x, then x = x-1 → 7
	        System.out.println("Post-decrement of x= " + x); // x becomes 6

	        System.out.println("Pre-decrement of x= " + (--x)); // Pre-decrement: x = x-1, then use → 5

	        // Logical NOT
	        boolean flag = true;
	        System.out.println("\nOriginal flag = " + flag);
	        System.out.println("NOT= " + (!flag)); // Inverse

	}

}
