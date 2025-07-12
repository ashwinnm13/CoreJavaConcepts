package Day15;


public class StringbuilderConcept {

	public static void main(String[] args) 
	{

		//StringBuilder is a mutable ,it’s faster and memory-efficient for string manipulation compared to String.		
		StringBuilder b = new StringBuilder();
		
		//Print a to z
		for(int i = 0 ; i < 26 ; i++)
		{
		   char ch = (char)('a'+i);
		   b.append(ch);
			
		}
		System.out.println("Output: "+b.toString());
		
		System.out.println("Length: "+b.length());
		
		System.out.println("Reverse: "+b.reverse());
	

	}

}
