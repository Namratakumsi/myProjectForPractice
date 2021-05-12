package Objectclasstopic;

public class Demo5 
	{
	public static void main(String[] args) 
	{
		int no=12346;
		int sum=0;
		{
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==0)
			{
				sum=sum+(rem*rem);
			}
			else
			{
				sum=sum+(rem*rem*rem);
			}			
			no=no/10;
		
		
	}
		System.out.println(sum);
}
}
	}