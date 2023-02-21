package testing;

import modelo.javabean.Persona;

public class Test {

	public static void main(String[] args) {
		Persona p1 = new Persona("NIF", "Paco Pico", "Calle del Sol", "56565") {
		};
		Persona p2 = new Persona("NIF", "Pili Peña", "Calle de la Luna", "56565") {
		};
		System.out.println(p1.llamar(p2));
	}

}
