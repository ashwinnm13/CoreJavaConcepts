package Day1;

public class PrimitiveDatatypes {

	public static void main(String[] args) {
		byte byteValue = 100;
        System.out.println("byte: " + byteValue);

        // 2. short - 16-bit integer (-32,768 to 32,767)
        short shortValue = 32000;
        System.out.println("short: " + shortValue);

        // 3. int - 32-bit integer (-2^31 to 2^31-1)
        int intValue = 100000;
        System.out.println("int: " + intValue);

        // 4. long - 64-bit integer (-2^63 to 2^63-1)
        long longValue = 10000000000L; // Note the 'L' at the end
        System.out.println("long: " + longValue);

        // 5. float - 32-bit floating point
        float floatValue = 5.75f; // Note the 'f' at the end
        System.out.println("float: " + floatValue);

        // 6. double - 64-bit floating point
        double doubleValue = 19.99;
        System.out.println("double: " + doubleValue);

        // 7. char - 16-bit Unicode character
        char charValue = 'A';
        System.out.println("char: " + charValue);

        // 8. boolean - true or false
        boolean booleanValue = true;
        System.out.println("boolean: " + booleanValue);
   

	}

}
