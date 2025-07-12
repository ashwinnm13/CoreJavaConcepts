package Day13;

public class CustomException {

    public static void main(String[] args) {
        int i = 0;

        try {
            if (i == 0)
            {
                throw new MyException("Can't divide by zero");
            }
            int result = 25 / i;
            System.out.println("Result: " + result);
        } 
        catch (MyException e) 
        {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
