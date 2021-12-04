import java.util.Scanner;
import java.io.*;
public class GestioneRegistroEta {

	public static void main(String[] args) 
	{
		
		String nomefile, risp;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("BENVENUTO NEL PROGRAMMA GESTIONE REGISTRO");
		System.out.print("\nInsersci nome file registro: ");
		nomefile = input.next();
		
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
			}
		}while(!risp.equals("e"));
		
		
		
		input.close();
	}

}
