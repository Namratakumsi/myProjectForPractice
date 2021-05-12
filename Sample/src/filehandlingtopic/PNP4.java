package filehandlingtopic;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PNP4
	{
	
	public static void main(String[] args) throws IOException 
	{
	File f1=new File("D:\\qsp.text");
	FileWriter fw=new FileWriter(f1);
	BufferedWriter BW=new BufferedWriter(fw);
	BW.write("hi");
	BW.newLine();
	BW.write("hooo");
	BW.flush();
	System.out.println("data is written");
	}
	}

