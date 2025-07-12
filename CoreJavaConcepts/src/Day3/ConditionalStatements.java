package Day3;

public class ConditionalStatements
{

	public static void main(String[] args)
	{
		int number = -5; 

        // if statement
        if (number > 0) // -5>0 -> false
        {
            System.out.println("The number is positive.");
        }

        // if-else statement
        if (number < 0)
        {
            System.out.println("The number is negative.");
        } 
        else
        {
            System.out.println("The number is not negative.");
        }

        // if-else-if-else ladder
        if (number > 0) 
        {
            System.out.println("The number is greater than zero.");
        } 
        else if (number < 0) 
        {
            System.out.println("The number is less than zero.");
        } 
        else 
        {
            System.out.println("The number is zero.");
        }
	

	}

}
