package modelo.javabean;

import java.util.Objects;

public class Oficina {
	
	//atributos privados
	private int idOficina;
	private String nombre, direccion,ciudad, telefono;
	
	
	/*
	 * Constructores
	 */
	
	public Oficina() {
		super();
	}


	public Oficina(int idOficina, String nombre, String direccion, String telefono) {
		super();
		this.idOficina = idOficina;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	

	public Oficina(int idOficina, String nombre, String direccion, String ciudad, String telefono) {
		super();
		this.idOficina = idOficina;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.telefono = telefono;
	}


	/*
	 * getter and setter
	 */
	public int getIdOficina() {
		return idOficina;
	}


	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	/*
 * redefinir métodos de Object
 */
	


	@Override
	public int hashCode() {
		return Objects.hash(idOficina);
	}


	@Override
	public String toString() {
		return "Oficina [idOficina=" + idOficina + ", nombre=" + nombre + ", direccion=" + direccion + ", ciudad="
				+ ciudad + ", telefono=" + telefono + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Oficina))
			return false;
		Oficina other = (Oficina) obj;
		return idOficina == other.idOficina;
	}
	
	
	
	
	
	
	
	

}
