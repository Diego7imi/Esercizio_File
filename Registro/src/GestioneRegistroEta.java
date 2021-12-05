import java.util.Scanner;
import java.io.*;
public class GestioneRegistroEta {

	public static void main(String[] args) 
	{
		
		String nomefile, risp, nome;
		int eta;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("BENVENUTO NEL PROGRAMMA GESTIONE REGISTRO");
		System.out.print("\nInserisci nome file registro: ");
		nomefile = input.nextLine();
		//System.out.print(nomefile);
		
		RegistroEtaCompleto re = new RegistroEtaCompleto(nomefile);
		
		do 
		{
			System.out.println("\nA) Visualizza registro");
			System.out.println("B) Aggiungi elemento");
			System.out.println("C) Incrementa eta'");
			System.out.println("D) Salva dati");
			System.out.println("E) Esci");
			System.out.print("Scelta: ");
			risp = input.next();
			
			switch(risp)
			{
			case "a":
				re.visualizza();
				break;
			case "b":
				System.out.print("Inserisci nome: ");
				nome = input.next();
				System.out.print("Inserisci eta': ");
				eta = input.nextInt();
				re.inserisci(nome, eta);
				break;
			case "c":
				System.out.print("Inserisci nome: ");
				nome = input.next();
				re.incrementaEta(nome);
				break;
			case "d":
				if(re.daSalvare())
					if(re.salva())
						System.out.println("\nModifica salvata con successo!");
					else System.out.println("File già aggiornato");
				else System.out.println("Non c'è stata alcuna modifica da salvare");
				break;
			case "e":
				System.out.println("Arrivederci");
				break;
				default: System.out.println("Lettera non riconosciuta");
			}
		}while(!risp.equals("e"));
		
		
		
		input.close();
	}

}
