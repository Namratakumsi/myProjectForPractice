package rcce16programming;

public class Sample4 
{
	public static void main(String[] args)
	{
	String s1="hello";
	String s2="hello";
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	
	String s3=new String("hi");
	String s4=new String("hi");
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
	}
}
