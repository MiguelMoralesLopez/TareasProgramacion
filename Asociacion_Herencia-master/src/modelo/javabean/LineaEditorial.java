package modelo.javabean;

public class LineaEditorial {
	private String nombre, referencia;
	private Libro libro;

	public LineaEditorial() {
		super();
	}

	public LineaEditorial(String nombre, String referencia, Libro libro) {
		super();
		this.nombre = nombre;
		this.referencia = referencia;
		this.libro = libro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	
	@Override
	public String toString() {
		return "LineaEditorial [nombre=" + nombre + ", referencia=" + referencia + ", libro=" + libro + "]";
	}
	
	
	
	
	
}
