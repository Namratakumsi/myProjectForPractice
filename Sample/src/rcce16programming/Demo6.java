package rcce16programming;

public class Demo6 
	{
	public static void main(String[] args) 
	{
		char ch='A';
		for(int i=1;i<=6;i++)
		{
		if(i<=3)
		System.out.print(ch+""+"*");
		if(i<=4)
		System.out.print(ch+""+"#");
		ch++;
		}
	}
}
