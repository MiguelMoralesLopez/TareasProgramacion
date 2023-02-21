package modelo.javabean;

public class Administrativo extends Persona {
	
	private String tareas;
	
	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}
	
	
	public Administrativo() {
		super();
	}
	

	public String getTareas() {
		return tareas;
	}


	public void setTareas(String tareas) {
		this.tareas = tareas;
	}


	@Override
	public String toString() {
		return "Administrativo [tareas=" + tareas + ", getNif()=" + getNif() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + "]";
	}

	//Métodos propios
	@Override
	public String trabajar() {
		
		return "El administrativo " + this.getNombre() + " va a realizar estas tareas: " + this.getTareas() + ".";
	} 
	
	public String gestionarMatrícula() {
		
		return "El administrativo " + this.getNombre() + " va a gestionar una matrícula.";
	}
}
