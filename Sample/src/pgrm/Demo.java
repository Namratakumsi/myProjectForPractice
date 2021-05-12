package pgrm;
public class Demo
{
	public static void main(String[] args)
	{
	String s1="javamava";
	String rev=" ";
	char[] arr=s1.toCharArray();
	for(int i=arr.length-1;i>=0;i--)
	{
		rev=rev+arr[i];
	}
	if(s1.equals(rev));
	{
		System.out.println("palindrome");
	}
	}
}


