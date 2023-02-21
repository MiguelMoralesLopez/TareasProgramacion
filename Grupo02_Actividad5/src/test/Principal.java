package test;

import modelo.dao.*;
import modelo.javabean.*;

public class Principal{

	public static void main(String[] args) {
		
		//Creamos la empresa y realizamos la carga inicial de datos.
		GestionEmpresaImplDao empr1 = new GestionEmpresaImplDao("EmpresaPrueba");
		//Establezco el email de los empleados usando el método propio de la clase.
		for (Empleado ele: empr1.buscarTodos()) {
			ele.setEmail(ele.obtenerEmail());
		}
		//Comprobamos que se haya cargado todo correctamente.
		System.out.println("Comprobar carga de datos.");
		for (Empleado ele: empr1.buscarTodos()) {
			System.out.println(ele);
		}
		/*
		 * Prueba para añadir un empleado a la lista de personal.
		 * Se intentará subir un duplicado que no deberia aparecer
		 * al comprobar después y un empleado nuevo, que si debería añadirse.
		 */
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Añadir nuevo empleado");
		Empleado emp1 = new Empleado(141001, "Andrés", "Ramirez Peña", null, 'H',
				18000.00, 100, null, null);
		emp1.setEmail(emp1.obtenerEmail());
		Empleado emp2 = new Empleado(141006, "Roberto", "García Peña", null, 'H',
				18000.00, 100, null, null);
		emp2.setEmail(emp2.obtenerEmail());
		
		System.out.println("Intento añadir un empleado duplicado, por lo que da false: " + empr1.alta(emp1));
		System.out.println("Añado un empleado nuevo, resultado: true. " + empr1.alta(emp2));
		
		for (Empleado ele: empr1.buscarTodos()) {
			System.out.println(ele);
		}
		/*
		 * Eliminación de registro de empleados. Se eliminará el empleado 141006 creado en 
		 * el ejemplo anterior.
		 */
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Eliminación de registro de empleados.");
		System.out.println("Elimino el empleado 141006 que añadí previamente. " + empr1.eliminarUno(emp2));
		for (Empleado ele: empr1.buscarTodos()) {
			System.out.println(ele);
		}
		/*
		 * Prueba de modificar uno. Se modificará el registro del empleado 141001, cambiando
		 * sus datos por los de la variable emp1 creada en la línea 24.
		 */
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Modificar uno de los registros. Se usará el usuario duplicado de antes.");
		empr1.modificarUno(emp1);
		for (Empleado ele: empr1.buscarTodos()) {
			System.out.println(ele);
		}
		
		System.out.println("-----------------------------------------------------------------");
		/*
		 * Se prueba a buscar el empleado con id 141001.
		 */
		System.out.println("Buscar un empleado de la plantilla.");
		System.out.println("Se busca el empleado con id 141001.");
		System.out.println(empr1.buscarUno(141001));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Masa salarial.");
		System.out.println(empr1.masaSalarial());
		
	}

}
