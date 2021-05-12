package pgm;

public class Sample1 {
	public static void main(String[] args)
	{
		String s1="Hello";
		System.out.println(s1.charAt(4));
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		String s2="javamava";
		System.out.println(s2.substring(4));
		System.out.println(s2.substring(2,6));
		System.out.println(s2.contains("Ja"));
		System.out.println(s2.replace('a','o'));
		System.out.println(s2.concat("job"));
	}
}
