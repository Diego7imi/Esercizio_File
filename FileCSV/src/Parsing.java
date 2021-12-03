import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Parsing {

	final static String Delimeter = ",";
	
	public static void main(String[] args) 
	{
		String fileToParse = "C:\\Users\\Diego\\git\\Esercizio_File\\FileCSV\\src\\employee.csv";
		BufferedReader fileReader = null;
		
		try 
		{
			String line = "";
			fileReader = new BufferedReader(new FileReader(fileToParse)); 
			while((line = fileReader.readLine()) != null)
			{
				companyCSVtoVector(line);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				fileReader.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void companyCSVtoVector(String line)
	{
		String tokens[] = line.split(Delimeter);
		Vector<String> companyResult = new Vector<String>();
		
		for(int i=0; i<tokens.length; i++)
		{
			companyResult.add(tokens[i].trim());
		}
		
		System.out.println("Raw line:"+line);
		System.out.println("Vector:"+companyResult);
		System.out.println("");
	}
}
