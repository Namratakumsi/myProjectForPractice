package Collectiontopics;
import java.util.ArrayList;
public class Sample8
	{
	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		for(int i=0;i<l1.size();i++)
		{
			Object a1=l1.get(i);
			System.out.println(a1);
		}
	}
}