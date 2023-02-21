package modelo.javabean;

/**
 * 
 * @author Miguel Morales
 *
 */
public abstract class Persona {
	private String nif;
	private String nombre;
	private String direccion;
	private String telefono;
	
	/**
	 * 
	 * @param nif
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 */
	
	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public Persona() {
		super();
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
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

	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}
	
	/**
	 * 
	 * @param p
	 * @return
	 */
	public String llamar (Persona p) {
		
		return this.getNombre() + " llamando a " + p.getNombre();
	}
	
}
