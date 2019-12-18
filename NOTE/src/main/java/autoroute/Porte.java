package autoroute;

public class Porte {
	
	private Integer numeroDeporte;

	public Integer getNumeroDeporte() {
		return numeroDeporte;
	}

	public void setNumeroDeporte(Integer numeroDeporte) {
		this.numeroDeporte = numeroDeporte;
	}

	public Porte(Integer numeroDeporte) {
		this.numeroDeporte = numeroDeporte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDeporte == null) ? 0 : numeroDeporte.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Porte other = (Porte) obj;
		if (numeroDeporte == null) {
			if (other.numeroDeporte != null)
				return false;
		} else if (!numeroDeporte.equals(other.numeroDeporte))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Porte [numeroDeporte=" + numeroDeporte + "]";
	}

}
