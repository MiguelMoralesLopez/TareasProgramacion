package modelo.javabean;

public class Autor extends Persona{
	private String seudonimo;

	public Autor() {
		super();
	}

	public Autor(String nombre, String nacionalidad, String seudonimo) {
		super(nombre, nacionalidad);
		this.seudonimo = seudonimo;
	}

	public String getSeudonimo() {
		return seudonimo;
	}

	public void setSeudonimo(String seudonimo) {
		this.seudonimo = seudonimo;
	}

	//toString cogiendo inheriteds fields
	@Override
	public String toString() {
		return "Autor [seudonimo=" + seudonimo + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}
	
	
	
	
}
