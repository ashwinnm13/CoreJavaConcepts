package Day3;

public class ControlStatements {

	public static void main(String[] args) 
	{
        System.out.println("--FOR LOOP--");
        for(int i=1;i<=10;i++)
        {
        	System.out.print(i+" ");
        }
        
        System.out.println("\n--WHILE LOOP--");
        int j=1;
        while(j<=10)
        {
        	System.out.print(j+" ");
        	j++;
        }
        
        System.out.println("\n--DO WHILE LOOP--");
        int k=1;
        
        do
        {
        	System.out.print(k+" ");
        	k++;
        }
        while(k<=10);
        

	}

}
