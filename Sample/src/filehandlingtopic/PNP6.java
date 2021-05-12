package filehandlingtopic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PNP6
	{
	
	public static void main(String[] args) throws IOException 
	{
	File f1=new File("D:\\qsp.text");
	FileReader fr=new FileReader(f1);
	BufferedReader br =new BufferedReader(fr);
	br.read();
	br.readLine();
	br.read();
	System.out.println("data is written");
	}
	}

	
