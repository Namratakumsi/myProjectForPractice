package Objectclasstopic;

public class Demo1 
	{
	static void number()
	{
		int no=143;
			int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println(sum);
		}
	public static void main(String[] args) 
	{
		number();
	}
}
