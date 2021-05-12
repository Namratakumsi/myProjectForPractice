package exceptionhandlingtopic;

public class Sample1 
	{
	public static void main(String[] args) 
	{
		System.out.println("**main starts***");
		try
		{
			int i=1/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("caught");
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled...");
		}
		System.out.println("***main ends***");
	}
}
