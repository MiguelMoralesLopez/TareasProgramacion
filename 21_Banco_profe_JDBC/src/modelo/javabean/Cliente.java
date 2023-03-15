package modelo.javabean;

import java.util.Objects;

public class Cliente {
	
	private String idCliente, nombre, aplellidos, direccion,email;
	private Oficina oficina;
	
	public Cliente() {
		super();
	}

	public Cliente(String idCliente, String nombre, String aplellidos, String direccion, String email,
			Oficina oficina) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.aplellidos = aplellidos;
		this.direccion = direccion;
		this.email = email;
		this.oficina = oficina;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAplellidos() {
		return aplellidos;
	}

	public void setAplellidos(String aplellidos) {
		this.aplellidos = aplellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", aplellidos=" + aplellidos + ", direccion="
				+ direccion + ", email=" + email + ", oficina=" + oficina + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cliente))
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(idCliente, other.idCliente);
	}
	
	
	
	
	
	
	
	
	
	

}
