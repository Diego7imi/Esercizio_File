import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Parsing {

	final static String Delimeter = ",";
	
	public static void main(String[] args) 
	{
		String fileToParse = "employee.csv";
		BufferedReader fileReader = null;
		
		try 
		{
			String line = "";
			fileReader = new BufferedReader(new FileReader(fileToParse)); 
			while((line = fileReader.readLine()) != null)
			{
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void companyCSVtoVector(String line)
	{
		
	}

}
