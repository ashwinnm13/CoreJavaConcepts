package Day19;

import java.util.List;
import java.util.ArrayList;

public class WildCardsExample<T extends Number> 
{

    // Accepts only List<Number> exactly (not List<Integer>, List<Double>, etc.)
    public void getList(List<Number> list) 
    {
        System.out.println("Number Type only Accepted: " + list);
    }

    // Accepts List of any subclass of Number: Integer, Double, etc.
    public void getList2(List<? extends Number> list) 
    {
        System.out.println("Subclasses of Number Class Accepted: " + list);
    }

    public static void main(String[] args) 
    {
        WildCardsExample<Integer> list1 = new WildCardsExample<>();

        // Creating different types of Number lists
        List<Number> numberList = new ArrayList<>();
        numberList.add(10); // Integer is a subclass of Number
        numberList.add(10.5); // Double is a subclass of Number

        List<Integer> intList = new ArrayList<>();
        intList.add(20);
        intList.add(30);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(2.71);

        // Valid - Exact match with List<Number>
        list1.getList(numberList);

        // list1.getList(intList); // Not allowed because it's List<Integer>, not List<Number>

        list1.getList2(intList);
        list1.getList2(doubleList);
        list1.getList2(numberList); // This is also valid
    }
}
