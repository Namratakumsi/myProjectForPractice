package Objectclasstopic;

public class Demo2 
	{
	static int number(String x)
	{
	int no=Integer.parseInt(x);
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println("143");
	}
	}
