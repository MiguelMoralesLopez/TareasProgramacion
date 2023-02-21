package modelo.javabean;

public class Profesor extends Persona {
	
	private String competencias;
	
	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}
	

	public Profesor() {
		super();
	}

	
	public String getCompetencias() {
		return competencias;
	}


	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}


	@Override
	public String toString() {
		return "Profesor [competencias=" + competencias + ", getNif()=" + getNif() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + "]";
	}

	//Métodos propios
	
	@Override
	public String trabajar() {
		return "El profesor " + this.getNombre() + " va a impartir su clase.";
	}
	
	public String ponerNotas() {
		return"El profesor " + this.getNombre() + " va a corregir los exámenes.";
	}
}
