package modelo.javabean;

public class Lector extends Persona {
	private int edad;

	public Lector() {
		super();
	}

	public Lector(String nombre, String nacionalidad, int edad) {
		super(nombre, nacionalidad);
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Lector [edad=" + edad + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}
	
	//Metodo propio
	public String escribirCritica() {
		return "Mi nombre es " + nombre + ", mi edad : " + edad + " y el libro me ha gustado mucho ";
	}

}
