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
			studenti = (Vector<NomeEta>)file.readObject();
			file.close();
		}catch(FileNotFoundException e)
		{
			System.out.println("ATTENZIONE: Il file " + nomefile + " non esiste");
			System.out.println("Sarà creato al primo salvataggio");
			System.out.println();
		}catch(ClassNotFoundException e)
		{
			System.out.println("Errore di lettura");
			System.out.println(e);
		}catch(IOException e)
		{
			System.out.println("ERRORE di I/O");
			System.out.println(e);
		}
	}
}
