package autoroute;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompagnieAutoroute {

	private List<Route> listRoute=new ArrayList<Route>();
	public List<Route> getListRoute() {
		return listRoute;
	}
	public void setListRoute(List<Route> listRoute) {
		this.listRoute = listRoute;
	}
	public List<Tarif> getListTarif() {
		return listTarif;
	}
	public void setListTarif(List<Tarif> listTarif) {
		this.listTarif = listTarif;
	}
	private List<Tarif> listTarif=new ArrayList<Tarif>();

	
	public BigDecimal obtenirTarif(Porte porte1, Porte porte2){
		if(getTarifExacte(porte1, porte2) == null) {
			return getTarifCalcule(porte1, porte2).getPrix();
		}else {
			return getTarifExacte(porte1, porte2).getPrix();
		}
	}

	
	private Tarif getTarifCalcule(Porte entree, Porte sortie) {
		int min = entree.getNumeroDeporte();
		int max = sortie.getNumeroDeporte();
		BigDecimal prix = new BigDecimal(0);
		
		for(Tarif t: listTarif) {
			if(t.getEntree().getNumeroDeporte()>= min && t.getSortie().getNumeroDeporte()<=max) {
				prix = prix.add(t.getPrix());
			}
		}
		Tarif tarif = new Tarif(entree, sortie, prix);
		
		return tarif;
	}
	
	public Tarif getTarifExacte(Porte pe, Porte ps) {
		for(int i=0; i<listTarif.size(); i++) {
			if((listTarif.get(i).getEntree()==pe)&&(listTarif.get(i).getSortie()==ps)){
				return listTarif.get(i);
			}
		}
		return null;
	}
	public void ajouterRoute(Route route) {
		this.listRoute.add(route);
	}
	public void ajouterTarif(Tarif tarif) {
		this.listTarif.add(tarif);
	}

}
