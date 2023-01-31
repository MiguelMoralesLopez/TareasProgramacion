package modelo.javabean;

import java.util.Objects;

public class Empleado {
	
	//Definición de atributos.
	private int idEmpleado;
	private String nombre, apellidos, email;
	private char genero;
	private double salario, comision;
	private Trabajo trabajo;
	private Departamento departamento;
	
	//Constructor por defecto.
	public Empleado() {
		super();
	}
	
	//Constructor con atributos.
	public Empleado(int idEmpleado, String nombre, String apellidos, String email, char genero, double salario,
			double comision, Trabajo trabajo, Departamento departamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.genero = genero;
		this.salario = salario;
		this.comision = comision;
		this.trabajo = trabajo;
		this.departamento = departamento;
	}
	
	//Definición del método toString, hash y método equals.
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email="
				+ email + ", genero=" + genero + ", salario=" + salario + ", comision=" + comision + ", trabajo="
				+ trabajo + ", departamento=" + departamento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}

	//Getters y Setters.
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public double salarioBruto (double salario, double comision) {
		return salario + comision;
	}
	
	//Definición de métodos propios.
	//Método para obtener el email.
	public String obtenerEmail() {
		String primerApellido = "";
		char primeraLetraNombre = nombre.toLowerCase().charAt(0);
		int numeroLetrasApellido = apellidos.length();
		for (int i = 0; i < numeroLetrasApellido; i++) {
			char x = apellidos.charAt(i);
			if (x != 32) {
				primerApellido += x;
			} else {
				i = numeroLetrasApellido;
			}
		}
		email = primeraLetraNombre + primerApellido.toLowerCase() + "@empresa.es";
		return email;
	}
	
	//Método para obtener el literal del género.
	public String literalSexo() {
		String literalSexo = "";
		String stringSexo = String.valueOf(genero);
		if (stringSexo.equalsIgnoreCase("h")) {
			literalSexo = "Hombre";
		} else if (stringSexo.equalsIgnoreCase("m")) {
			literalSexo = "Mujer";
		} else {
			literalSexo = "Sexo erroneo";
		}
		return literalSexo ;
	}
	
	//Método para obtener el salario mensual.
	public double salarioMensual (int meses) {
		double salarioMensual = (salario + comision) / meses;
		return salarioMensual;
	}
	
	//Método para obtener el nombre completo del empleado.
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}
	
}