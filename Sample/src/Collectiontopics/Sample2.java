package Collectiontopics;
import java.util.ArrayList;
public class Sample2 
	{
	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20.56);
		l1.add('A');
		l1.add("hello");
		System.out.println(l1.toString());
		l1.add(2,true);
		System.out.println(l1);
	}
}

