package Day9;

public class AccessSpecifier 
{
	public static void main(String[] args) 
	{
		Base b1 = new Base();
		
		b1.defaultMethod();
		b1.publicMethod();
		b1.protectedMethod();
	//   b1.privateMethod();  
		
		System.out.println(b1.defaultVar);
		System.out.println(b1.publicVar);
		System.out.println(b1.protectedVar);
	//	System.out.println(b1.privateVar);
		
	}

}
