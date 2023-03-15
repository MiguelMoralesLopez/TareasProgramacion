package testing;

import modelo.javabean.Autor;

public class TestAutor {

	public static void main(String[] args) {
		Autor a1= new Autor("Paco", "Francesa", "Pacopipas");
		
		//toString
		System.out.println(a1.getNombre());
		System.out.println(a1.getSeudonimo());
		System.out.println(a1.getNacionalidad());

	}

}
