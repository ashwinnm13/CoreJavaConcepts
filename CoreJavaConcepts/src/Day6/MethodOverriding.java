package Day6;

public class MethodOverriding {

	public static void main(String[] args) 
	{
       BankAccount b = new BankAccount("Zoya",1000.00);
       
       b.display();
       b.CalculateIntrest();
       
       SavingsAccount s = new SavingsAccount("Prathip",5000.47);
       
       s.display();
       s.CalculateIntrest();
      
       
       

	}

}
