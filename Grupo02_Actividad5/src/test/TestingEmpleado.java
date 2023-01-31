package test;

import modelo.javabean.Departamento;
import modelo.javabean.Empleado;
import modelo.javabean.Localidad;
import modelo.javabean.Trabajo;

public class TestingEmpleado {

	public static void main(String[] args) {
		//Creación de objetos para test
		Localidad loc1 = new Localidad(001, "Avenida del Sol, 17", "Madrid", "España");
		Departamento dpto1 = new Departamento(017, "RRHH", loc1);
		Trabajo trb1 = new Trabajo("1547", "Nóminas", 19500.00, 23500.00);
		Empleado emp1 = new Empleado(141007, "Pablo", "Mármol Sílice", null, 'H', 19750.00, 150, trb1, dpto1);
		
		//Obtención de información del empleado "emp1" sin usar el método toString
		//Nombre
		System.out.println("Nombre: " + emp1.getNombre());
		//Apellidos
		System.out.println("Apellidos: " + emp1.getApellidos());
		//Género
		System.out.println("Género: " + emp1.literalSexo());
		//Departamento
		System.out.println("Departamento: " + emp1.getDepartamento().getDescripcion());
		//Trabajo
		System.out.println("Trabajo: " + emp1.getTrabajo().getDescripcion());
		//Dirección
		System.out.println("Dirección: " + emp1.getDepartamento().getLocalidad().getDireccion());
		//Ciudad
		System.out.println("Ciudad: " + emp1.getDepartamento().getLocalidad().getCiudad());
		//Pais
		System.out.println("Pais: " + emp1.getDepartamento().getLocalidad().getPais());
		
		//Extraer del empleado su trabajo y su departamento en variables de su tipo.
		Trabajo trabajoPrueba = emp1.getTrabajo();
		System.out.println(trabajoPrueba);
		Departamento dptoPrueba = emp1.getDepartamento();
		System.out.println(dptoPrueba);

	}

}
