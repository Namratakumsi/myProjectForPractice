package filehandlingtopic;

import java.io.File;

public class PNP1 
	{
	public static void main(String[] args) 
	{
	File f1=new File("D:\\java");
	if(f1.mkdirs())
	{
	System.out.println("folder is created...");
	}
	else
	{
	System.out.println("folder is not created");
	}
	if(f1.exists())
	{
	System.out.println("folder exsist...");
	}
	else
	{
		System.out.println("folder doesn't exsist...");
	}
	if(f1.delete())
	{
		System.out.println("folder deleted...");
	}
	else
	{
		System.out.println("folder not deleted...");
	}
}
	}
