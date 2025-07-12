package Day20;

public class Student implements Comparable<Student>
{

	int rollno;
	float marks;
	

	public Student(int rollno, float marks) 
	{
		this.rollno = rollno;
		this.marks = marks;
	}

//	@Override
//	public int compareTo(Student o)
//	{
//		//Sort method checks compareTo method which to compare and sort
//		System.out.println("Checking this method before sorting");
//		//Casting the float to integer to return integer
//		
//		//Casting syntax --> RequiredType variable = (RequiredType)(Arithmetic Process) 
//		
//		int diff = (int)(this.marks - o.marks);		
//		return diff;
//		
////		int diff = -(int)(this.marks - o.marks); //Print list in Descending order
////		return diff;
//	}

	 @Override
	    public int compareTo(Student other) 
	 {
	        return Float.compare(this.marks, other.marks); // ascending order
	 }
	@Override
	public String toString() 
	{
		return  marks + "";
	}
  
	
}
