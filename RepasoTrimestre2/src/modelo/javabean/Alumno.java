package modelo.javabean;

public class Alumno extends Persona {
	
	private String curso;
	
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}

	public Alumno() {
		super();
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", getNif()=" + getNif() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + "]";
	}
	//Métodos propios
	@Override
	public String trabajar() {
		return "El alumno " + this.getNombre() + " va a estudiar para el curso " + this.getCurso() + ".";
	}
	
	public String hacerExamen() {
		return "El alumno " + this.getNombre() + " va a hacer su examen.";
	}
}
