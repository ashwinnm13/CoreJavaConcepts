package Day15;

import java.text.DecimalFormat;

public class PrettyPrinting {

	public static void main(String[] args) 
	{

		String name = "Shivam Dube";
		int age = 18;
		double marks = 91.23663;
		
		    System.out.println("----- Using printf() -----");
	        System.out.printf("Name: %-10s ,Age: %02d ,Marks: %.2f\n", name, age, marks);

	        // 2. String.format() - Store formatted string
	        String formatted = String.format("Hello %s, your score is %.1f", name, marks);
	        System.out.println("Using String.format(): " + formatted);

	        // 3. Table formatting
	        System.out.println("\n----- Pretty Printed Table -----");
	        System.out.printf("%-12s %-10s %-5s\n", "Name", "City", "Age");
	        System.out.println("----------------------------------");
	        System.out.printf("%-12s %-10s %-5d\n", "Ravi", "Chennai", 22);
	        System.out.printf("%-12s %-10s %-5d\n", "Meera", "Delhi", 19);
	        System.out.printf("%-12s %-10s %-5d\n", "John", "Mumbai", 25);

	        // 4. DecimalFormat - Custom numeric formatting
	        System.out.println("\n----- DecimalFormat Example -----");
	        DecimalFormat df = new DecimalFormat("#,###.00");
	        double price = 1234567.891;
	        System.out.println("Formatted Price: ₹" + df.format(price));

		

	}

}
