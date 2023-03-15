package testing;

import java.util.ArrayList;

import modelo.dao.Instituto;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

public class Testing {

	public static void main(String[] args) {
		
		ArrayList<Persona> lista = new ArrayList<>();
		Instituto ins1 = new Instituto(lista);
		
		//buscar todas 
		for (Persona ele: lista) {
			System.out.println(ele);
		}
		
		//alta
		System.out.println("");
		System.out.println("Test Alta");
		lista.add(new Profesor("784512D", "Persona alta", "Calle del Alta 1", "784512963", "Literatura"));
		for (Persona ele: lista) {
			System.out.println(ele);
		}
		//eliminar
		System.out.println("");
		System.out.println("Test Eliminar");
		ins1.eliminarPersona(ins1.buscarPersona("784512D"));
		for (Persona ele: lista) {
			System.out.println(ele);
		}
		//buscar por nif
		System.out.println("");
		System.out.println("Test buscar por nif");
		System.out.println(ins1.buscarPersona("45555557"));
		//buscar por tipo
		System.out.println("");
		System.out.println("Test buscar por tipo");
		for (Persona  ele: ins1.buscarPersonaPorTipo("Alumno")) {
			System.out.println(ele);
		}
		
	}

}
