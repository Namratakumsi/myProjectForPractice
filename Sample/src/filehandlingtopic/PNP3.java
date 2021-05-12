package filehandlingtopic;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
public class PNP3 
	{
	public static void main(String[] args) throws Exception 
	{
		File f1=new File("D:\\qsp.txt");
		FileReader fr=new FileReader(f1);
		char[] arr=new char[(int)f1.length()];
		fr.read(arr);
		String s1=new String(arr);
		System.out.println("data is written");
	}
	}
