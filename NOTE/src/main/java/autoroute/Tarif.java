package autoroute;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Tarif {
	
	private Porte entree;
	private Porte sortie;
	private BigDecimal prix;
	private LocalDateTime dateValidite;
	public Porte getEntree() {
		return entree;
	}
	public void setEntree(Porte entree) {
		this.entree = entree;
	}
	public Porte getSortie() {
		return sortie;
	}
	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}
	public BigDecimal getPrix() {
		return prix;
	}
	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}
	public LocalDateTime getDateValidite() {
		return dateValidite;
	}
	public void setDateValidite(LocalDateTime dateValidite) {
		this.dateValidite = dateValidite;
	}
	
	public Tarif(Porte entree, Porte sortie, BigDecimal prix) {
		super();
		this.entree = entree;
		this.sortie = sortie;
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Tarif [entree=" + entree + ", sortie=" + sortie + ", prix=" + prix + ", dateValidite=" + dateValidite
				+ "]";
	}
	

}
