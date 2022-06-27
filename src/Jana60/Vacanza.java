package Jana60;
import java.time.LocalDate;
public class Vacanza {
//attributi
	private String destinazione;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	public Vacanza(String destinazione, LocalDate dataInizio, LocalDate dataFine) throws Exception {
		super();
		
		validazioneDate(dataInizio,dataFine);
		 
		this.destinazione = destinazione;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}
	public String getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	public LocalDate getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}
	public LocalDate getDataFine() {
		return dataFine;
	}
	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}
	//crea questi metodi
	 //- destinazione, data inizio e data fine non possono essere null
	 //- la data inizio non può essere già passata
	 //- la data fine non può essere prima della data inizio
	public void validazioneDate (LocalDate dataInizio,LocalDate dataFine) {
		if(dataInizio == null && dataFine == null) {
			throws new Exception ("Le date inserite non sono vlaide");
			
		}
	/*public void dataInizioNonValida(LocalDate dataInizio) {
		if(dataInizio > LocalDate)
	}*/
	
	public void 
	}
}
