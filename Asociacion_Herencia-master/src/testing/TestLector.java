package testing;

import modelo.javabean.Lector;

public class TestLector {

	public static void main(String[] args) {
		Lector l1 = new Lector("Sheila", "Española", 31);
		
		// metodo toString
		System.out.println(l1.getNombre());
		System.out.println(l1.getEdad());
		System.out.println(l1.getNacionalidad());
		
		//metodo escribir critica
		System.out.println(l1.escribirCritica());

	}

}
