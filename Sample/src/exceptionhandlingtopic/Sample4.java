package exceptionhandlingtopic;

public class Sample4 
	{
	public static void main(String[] args)
	{
		System.out.println("***main starts***");
		try
		{
			int i=1/0;
			System.out.println("hello");
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled...");
		}
		System.out.println("***main ends***");
	}
	}
