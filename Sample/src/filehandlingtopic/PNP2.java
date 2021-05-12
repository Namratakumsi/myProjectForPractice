package filehandlingtopic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PNP2
	{
	
	public static void main(String[] args) throws IOException 
	{
	File f1=new File("D:\\qsp.text");
	FileWriter fw=new FileWriter(f1);
	fw.write("hello");
	fw.write("cool");
	fw.flush();
	System.out.println("data is written");
	}
	}
