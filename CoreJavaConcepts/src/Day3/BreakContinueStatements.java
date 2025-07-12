package Day3;

public class BreakContinueStatements {

	public static void main(String[] args)
	{
		System.out.println("Using break in a loop:");
        for (int i = 1; i <= 10; i++) 
        {
            if (i == 5) 
            {
                System.out.println("Break at i = " + i);
                break; // exits the loop when i == 5
            }
            System.out.println("i = " + i);
        }

        System.out.println("\nUsing continue in a loop:");
        for (int i = 1; i <= 10; i++) 
        {
            if (i == 5) 
            {
                System.out.println("Skip i = " + i);
                continue; // skips the rest of the loop when i == 5
            }
            System.out.println("i = " + i);
        }
	}

}
