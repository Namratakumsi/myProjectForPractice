package Collectiontopics;
import java.util.ArrayList;
public class Sample9
	{
	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		l1.add("men");
		l1.add("women");
		l1.add("kids");
		l1.add("toys");
		if(l1.contains("kids"))
		{
			System.out.println("it has kids");
		}
		else
		{
			System.out.println("doesn't have kids");
		}
	}
}
