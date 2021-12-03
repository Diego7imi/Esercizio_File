
public class NomeEta {
	
	private String nome;
	private int eta;
	
	NomeEta(String nome, int eta)
	{
		this.nome = nome;
		this.eta = eta;
	}
	
	public String getNome() {return nome;}
	public int getEta() {return eta;}
	
	public void IncrementaEta() {eta++;}
	
	public String toString()
	{
		return "Nome: " + nome + " " + eta + "anni";
	}
}
