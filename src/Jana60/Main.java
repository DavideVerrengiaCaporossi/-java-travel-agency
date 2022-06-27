package Jana60;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("inserisci la destinazione");
		String destinazione = scan.nextLine();
		
		System.out.println("inserisci la data di inizio vacanza");
		int giornoInizio = scan.nextInt();
		int meseInizio = scan.nextInt();
		int annoInizio = scan.nextInt();
		LocalDate dataInizio = LocalDate.of(annoInizio,meseInizio,giornoInizio);
		 
		System.out.println("inserisci la data di fine vacanza");
		int giornoFine = scan.nextInt();
		int meseFine = scan.nextInt();
		int annoFine = scan.nextInt();
		LocalDate dataFine= LocalDate.of(annoFine,meseFine,giornoFine);
		
		
	}
}
