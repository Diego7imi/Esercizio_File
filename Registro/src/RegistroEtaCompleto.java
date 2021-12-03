import java.util.Vector;
public class RegistroEtaCompleto {
	
	Vector<NomeEta> studenti = new Vector<NomeEta>();
	
	public RegistroEtaCompleto(Vector<NomeEta> studente)
	{
		this.studenti = studente;
	}
	
	
	public boolean AggiungiStudente(String nome, int eta)
	{
		
		return true;
	}
	
	public void VisualizzaRegistro()
	{
		System.out.println("Registro\n");
		for(NomeEta n : studenti)
			System.out.println("Nome: " + n.nome + " Età: " + n.eta);
	}
}
