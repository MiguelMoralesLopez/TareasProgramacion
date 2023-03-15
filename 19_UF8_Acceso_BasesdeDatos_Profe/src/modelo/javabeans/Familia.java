package modelo.javabeans;

public class Familia {
	private int idFamilia;
	private String descripcion;
	
	
	public Familia() {
		super();
	}


	public int getIdFamilia() {
		return idFamilia;
	}


	public void setIdFamilia(int idFamilia) {
		this.idFamilia = idFamilia;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idFamilia;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Familia))
			return false;
		Familia other = (Familia) obj;
		if (idFamilia != other.idFamilia)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Familia [idFamilia=" + idFamilia + ", descripcion=" + descripcion + "]";
	}
	
	

}
