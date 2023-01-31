
public class Empleado {
	/*
	 * Definición de atributos privados.
	 */
	private int idEmpleado;
	private String nombre;
	private String apellidos;
	private String email;
	private double salario;
	private double complemento;
	private char sexo;
	private int idDepartamento;
		
	/*
	 * Definición del constructor por defecto
	 */
	public Empleado () {
		
	}
	/*
	 * Definición del constructor con todos los parámetros
	 */
	public Empleado(int idEMpleado, String nombre, String apellidos, String email, double salario, double complemento, 
			char sexo, int idDepartamento) {
		super();
		this.idEmpleado = idEMpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.salario = salario;
		this.complemento = complemento;
		this.sexo = sexo;
		this.idDepartamento = idDepartamento;
	}
	/*
	 * Getters y setters
	 */
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComplemento() {
		return complemento;
	}
	public void setComplemento(double complemento) {
		this.complemento = complemento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	
	/*
	 * Modificación del método toString()
	 */
	public String toString() {
		return "Los datos del empleado son: \n" + "idEmpleado: " + idEmpleado + "\n" + "Departamento: "
				+ idDepartamento + "\n" + "Nombre y apellidos: " + nombre + " " + 
				apellidos + "\n" + "Sexo: " + sexo + "\n" + "Email: " + email + "\n" + 
				"Salario: " + salario + "\n" + "Complemento: " + complemento;
	}
	/*
	 * Métodos propios de la clase
	 */
	public double salarioBruto() {
		return salario += complemento;
	}
	
	public double salarioMensual (int meses) {
		double salarioMensual = (salario + complemento) / meses;
		return salarioMensual;
	}
	
	public String literalSexo() {
		String literalSexo = "";
		String stringSexo = String.valueOf(sexo);
		if (stringSexo.equalsIgnoreCase("h")) {
			literalSexo = "Hombre";
		} else if (stringSexo.equalsIgnoreCase("m")) {
			literalSexo = "Mujer";
		} else {
			literalSexo = "Sexo erroneo";
		}
		return literalSexo ;
	}
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
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}
}
