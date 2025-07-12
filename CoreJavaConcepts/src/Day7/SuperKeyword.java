package Day7;

public class SuperKeyword {

	public static void main(String[] args) 
	{
        Student s1 = new Student();
        s1.displayName();
        
        System.out.println("------------------------------");
        Student s2 = new Student("John");//parameterized assignment
        s2.displayName();
        

	}

}
