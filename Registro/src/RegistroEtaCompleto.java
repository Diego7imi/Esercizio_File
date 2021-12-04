import java.util.Vector;
import java.io.*;
public class RegistroEtaCompleto {
	
	private String nomefile;
	private Vector<NomeEta> studenti = new Vector<NomeEta>();
	private boolean modificato = false;
	
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
	
	public void visualizza()
	{
		System.out.println();
		if(studenti.isEmpty())
			System.out.println("Il registro e' vuoto!");
		else
		{
			System.out.println("REGISTRO DELLE ETA'");
			for(NomeEta ne : studenti)
				System.out.println(ne);
		}
	}
	
	public void inserisci(String nome, int eta)
	{
		NomeEta ne = new NomeEta(nome, eta);
		if(studenti.contains(ne))
			System.out.println(nome + " già presente");
		else
		{
			studenti.add(ne);
			modificato = true;
		}
	}
	
	public int incrementaEta(String nome)
	{
		for(NomeEta ne : studenti)
			if(ne.getNome().equals(nome))
			{
				ne.IncrementaEta();
				modificato = true;
				return ne.getEta();
			}
		return -1;
	}
	
	public boolean daSalvare()
	{
		return modificato;
	}
	
	public boolean salva()
	{
		if(daSalvare())
		{
			try
			{
				ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(nomefile)));
				out.writeObject(studenti);
				out.close();
				modificato = false;
				return true;
			} catch (IOException e)
			{
				System.out.println("ERRORE di I/O");
				System.out.println(e);
				return false;
			}
		}
		else return false;
	}
}
