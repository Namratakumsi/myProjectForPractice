package Programming;
public class Sample13 
{
	public static void main(String[] args) 
	{
	int count=0;
	String s1="qspdspespispqsp";
	for(int i=0;i<=s1.length()-3;i++)
	{
		String s2=s1.substring(i,i++);
				if(s2.equals("qsp"));
		{
			count++;
		}
	}
		System.out.println("count");
	}
}

