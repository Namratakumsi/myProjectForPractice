package Collectiontopics;
import java.util.ArrayList;
public class Sample5 
	{
	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		l1.add(1);
		l1.add('A');
		l1.add(30);
		l1.add("hello");
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		l1.remove("hello");
		System.out.println(l1);
	}
}
