package Day20;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args)
	{
		
	   Student David = new Student(10 ,95.992f);
	   Student John = new Student(12 , 99.986f);
	  
	   //Adding some more objects
	   Student Daniel = new Student(13 , 87.562f);
	   Student Riya = new Student(45 , 65.864f);
	   Student Blessy = new Student(31 , 100.000f);
	   
	   
	   // obj1.compareTo(obj2)
	   // obj1 > obj2 -->  1
	   // obj1 < obj2 --> -1
	   // obj1 = obj2 -->  0
	   
	   if(David.compareTo(John) > 0)
	   {
		   System.out.println("David has more marks ");
	   }
	   else if(David.compareTo(John) < 0)
	   {
		   System.out.println("John has more marks");
	   }
	   else
	   {
		   System.out.println("Both has equal marks");
	   }
	   
	   System.err.println("-----------------------------------------------------------------------------");
	   
	   Student[] list = { David , John , Daniel , Riya , Blessy };
	   
	   System.out.println("Marks: "+Arrays.toString(list));
	   
	   System.err.println("-----------------------------------------------------------------------------");
	   
	   Arrays.sort(list);//checks compareTo() method in Student Class
	   
	   
	   System.out.println("Basic Sorting Method: "+Arrays.toString(list));
	   System.out.println();
	   //Another sorting method
	   Arrays.sort(list, new Comparator<Student>()
			   {
		            @Override
		            public int compare(Student o1 , Student o2)
		            {
		            	return Float.compare(o1.marks, o2.marks);
		            }
		   
			   });
	  
	   System.out.println("Sort Parameter Method(Ascending Order): "+Arrays.toString(list));
	   System.err.println();

	   Arrays.sort(list, new Comparator<Student>()
	   {
            @Override
            public int compare(Student o1 , Student o2)
            {
            	return - Float.compare(o1.marks, o2.marks);//round off and compare problem
            }
   
	   });

      System.out.println("Sort Parameter Method(Descending Order): "+Arrays.toString(list));
      System.err.println();

	   
	   //Sorting using Lambda Functions
	   Arrays.sort(list , (o1,o2) -> (int)(o1.marks - o2.marks));
	   System.out.println("Sorted using Lambda Functions: "+Arrays.toString(list));
	   
	   System.err.println("-----------------------------------------------------------------------------");
	}

}
