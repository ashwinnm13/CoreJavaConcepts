package Day18;

public class NestedInterface 
{

	public interface Nest
	{
		boolean isOdd(int n);
	}
	
}


class Impl implements NestedInterface.Nest
{
	@Override
	public boolean isOdd(int n)
	{
		//return (n&1) == 1;
		
		if(n%2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}