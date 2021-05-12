package Programming;
public class Sample12 
	{
	public static void main(String[] args) 
	{
		String s1="ammaomakaka";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a')
			{
				count++;
			}
			}
			System.out.println(count);
		}
	}

