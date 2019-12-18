package autoroute;

import java.util.ArrayList;
import java.util.List;

public class Route {
	
	List<Porte> portes=new ArrayList<Porte>();

	

	@Override
	public String toString() {
		return "Route [listPorte=" + portes+ "]";
	}



	public List<Porte> getPortes() {
		return portes;
	}



	public void setPortes(List<Porte> portes) {
		this.portes = portes;
	}



	public void addPorte(Porte p) {
		portes.add(p);
	}
	
	
 
}
