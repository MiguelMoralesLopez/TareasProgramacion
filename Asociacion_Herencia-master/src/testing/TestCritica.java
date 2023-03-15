package testing;

import modelo.javabean.Critica;
import modelo.javabean.Lector;

public class TestCritica {

	public static void main(String[] args) {
		Lector l1 = new Lector("Sheila", "Española", 31);
		Critica c1 = new Critica(9, "01/03/2023", "Muy buena", l1);
		
		//to String
		System.out.println(c1.getPuntuacion());
		System.out.println(c1.getComentario());
		System.out.println(c1.getFecha());
		
		//Nombre del lector
		System.out.println(c1.getLector().getNombre());
		
		//Edad del lector
		System.out.println(c1.getLector().getEdad());
		
		//Nacionalidad del lector
		System.out.println(c1.getLector().getNacionalidad());

	}

}
