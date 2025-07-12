package Day1;

class Student
{
	String name;
	int id;
	
	Student(String sname , int id)
	{
		this.name = sname;
		this.id = id;
	}
	
	public void displayInfo()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
	}
	
}

public class ReferenceDataTypes {

	public static void main(String[] args) 
    {
		//s1 is reference object of Student class
         Student s1 = new Student("Dhoni",7);
         
         //s2 is other reference pointing to the same object s1
         Student s2 = s1;
         
         System.out.println("--Before Changing--");
         s1.displayInfo();
         s2.displayInfo();
         
         s2.name="Virat Kohli";
         s2.id = 18;
         System.out.println();
         System.out.println("--After Changing--");
         s1.displayInfo();
         s2.displayInfo();
         
         
     
     }

}
