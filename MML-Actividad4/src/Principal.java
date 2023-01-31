public class Principal {

	public static void main(String[] args) {
		
		/*
		 * Crear un objeto de la clase Empleado llamando al constructor con todos los parámetros y 
		 * asignándoles valor a cada atributo.
		 */
		Empleado emp1 = new Empleado(17, "Juan","Ficticio Ejercicio" , null, 25000, 500, 'h', 404);
		
		/*
		 * Escribir por consola(syso), los datos de esta empleado llamando a los métodos de la clase 
		 * que hemos propuesto; un syso por cada método de la clase.
		 */
		System.out.println("Salario Bruto: " + emp1.salarioBruto());
		System.out.println("Salario mensual en 14 pagas: " + emp1.salarioMensual(14));
		System.out.println("Sexo: " + emp1.literalSexo());
		System.out.println("Email: " + emp1.obtenerEmail());
		System.out.println("Nombre completo: " + emp1.nombreCompleto());
		
		//syso para separar variables
		System.out.println("----------------------------------------");
		
		/*
		 * Crear un objeto vacío, y rellenar cada dato usando los métodos set.
		 * Invocar en el syso a la variable de este empleado
		 */
		Empleado emp2 = new Empleado();
		emp2.setIdEmpleado(25);
		emp2.setNombre("María");
		emp2.setApellidos("Pica Piedra");
		emp2.setEmail(emp2.obtenerEmail());
		emp2.setSalario(20000);
		emp2.setComplemento(150);
		emp2.setSexo('M');
		emp2.setIdDepartamento(404);
		System.out.println(emp2);
	}
	
}