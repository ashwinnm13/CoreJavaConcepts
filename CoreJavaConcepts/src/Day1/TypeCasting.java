package Day1;

public class TypeCasting {

	public static void main(String[] args) 
	{
		 //Implicit TypeCasting -> small datatype to large datatype
         int integer = 200;
         long longinteger = integer;
         float floatnumber = longinteger;
         
         System.out.println("---IMPLICIT CASTING---");
         System.out.println("Intger: "+integer);
         System.out.println("LongInt: "+longinteger);
         System.out.println("Float: "+floatnumber);

         //Explicit TypeCasting -> Large datatype to small datatype
         
         double doubint = 9.78;
         int number = (int) doubint;
         System.out.println("---EXPLICIT CASTING---");
         System.out.println("Double Value: "+doubint);
         System.out.println("Integer: "+number);
         
         //Potential Data loss
         
         int bigInt =130;
         byte castedByte = (byte) bigInt;//It is out of range (-128 to 127)
         System.out.println("---Data Loss---");
         System.out.println("CastedByte: "+castedByte);
         
         
	}

}
