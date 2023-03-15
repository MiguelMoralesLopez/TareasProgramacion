package testing;

import modelo.javabean.Autor;
import modelo.javabean.Critica;
import modelo.javabean.Lector;
import modelo.javabean.Libro;
import modelo.javabean.LineaEditorial;

public class TestLineaEditorial {

	public static void main(String[] args) {
		Lector l1 = new Lector("Sheila", "Española", 31);
		Autor a1= new Autor("Paco", "Francesa", "Pacopipas");
		Critica c1 = new Critica(9, "01/03/2023", "Muy buena", l1);
		Libro lib1 = new Libro("Amapolas", "02/06/0986", "Drama", "Español", 8.1, a1, c1);
		LineaEditorial le1 = new LineaEditorial("Anaya", "jsgh452", lib1);
		
		// to String
		System.out.println(le1.getNombre());
		System.out.println(le1.getReferencia());
		
		//Sacar el titulo del libro
		System.out.println(le1.getLibro().getTitulo());
		
		//Sacar la nacionalidad del autor
		System.out.println(le1.getLibro().getAutor().getNacionalidad());
		
		//Sacar la fecha de la critica
		System.out.println(le1.getLibro().getCritica().getFecha());
		
		//Sacar la nacionalidad del lector
		System.out.println(le1.getLibro().getCritica().getLector().getNacionalidad());

	}

}
