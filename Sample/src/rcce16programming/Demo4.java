package rcce16programming;

public class Demo4 
	{
	public static void main(String[] args) 
	{
		char ch='A';
		for(int i=26;i>=1;i--)
		{
			System.out.print(ch+""+i+" ");
			ch++;
			if(i==10||i==20)
			{
				System.out.println();
			}
		}
	}
}
