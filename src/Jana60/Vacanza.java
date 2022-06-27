package Jana60;
import java.time.LocalDate;
public class Vacanza {
//attributi
	private String destinazione;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	public Vacanza(String destinazione, LocalDate dataInizio, LocalDate dataFine) {
		super();
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
	 
	
}
