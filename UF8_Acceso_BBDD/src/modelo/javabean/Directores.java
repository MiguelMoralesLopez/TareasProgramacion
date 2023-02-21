package modelo.javabean;

import java.util.Objects;

public class Directores {
	private int id;
	private String nombre;
	private String apellidos;
	private float sueldo;
	
	public Directores() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directores other = (Directores) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Directores [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sueldo=" + sueldo + "]";
	}

}
