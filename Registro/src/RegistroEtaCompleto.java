import java.util.Vector;
import java.io.*;
public class RegistroEtaCompleto {
	
	private String nomefile;
	private Vector<NomeEta> studenti = new Vector<NomeEta>();
	
	public RegistroEtaCompleto(String nomefile)
	{
		this.nomefile = nomefile;
		try {
			ObjectInputStream file = new ObjectInputStream(new BufferedInputStream(new FileInputStream(nomefile)));
			studenti = (Vector<NomeEta>) file.readObject();
			file.close();
		}catch(FileNotFoundException e)
		{
			
		}catch(ClassNotFoundException e)
		{
			
		}catch(IOException e)
		{
			
		}
	}
}
