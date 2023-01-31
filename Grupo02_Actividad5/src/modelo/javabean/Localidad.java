package modelo.javabean;

import java.util.Objects;

public class Localidad {
	
	//Definición de atributos privados de la clase.
	private int idLocalidad;
	private String direccion, ciudad, pais;
	
	//Constructor general.
	public Localidad() {
		super();
	}
	
	//Constructor con atributos.
	public Localidad(int idLocalidad, String direccion, String ciudad, String pais) {
		super();
		this.idLocalidad = idLocalidad;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
	}
	
	//Redefinición de objects.
	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", direccion=" + direccion + ", ciudad=" + ciudad + ", pais="
				+ pais + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idLocalidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Localidad other = (Localidad) obj;
		return idLocalidad == other.idLocalidad;
	}

	public int getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

}
