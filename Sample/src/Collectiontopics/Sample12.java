package Collectiontopics;
import java.util.PriorityQueue;
public class Sample12
	{
	public static void main(String[] args) 
	{
		PriorityQueue l1=new PriorityQueue();
		l1.add(810);
		l1.add(510);
		l1.add(1306);
		l1.add(20);
		System.out.println("***peeking***");
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println("***polling***");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);
	}
	}
		
		