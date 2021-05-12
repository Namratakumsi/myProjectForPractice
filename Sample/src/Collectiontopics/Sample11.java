package Collectiontopics;
import java.util.ArrayList;
import java.util.Vector;
public class Sample11
	{
	public static void main(String[] args) 
	{
		Vector l1=new Vector(3);
		l1.add("pizza");
		l1.add("cheese");
		l1.add("chilly flakes");
		ArrayList l2=new ArrayList(l1);
		l2.add('A');
		l2.add('B');
		System.out.println(l1);
		System.out.println(l2);
		}
	}

