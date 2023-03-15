package testing;

import modelo.javabean.Autor;
import modelo.javabean.Critica;
import modelo.javabean.Lector;
import modelo.javabean.Libro;

public class TestLibro {

	public static void main(String[] args) {
		Lector l1 = new Lector("Sheila", "Española", 31);
		Autor a1= new Autor("Paco", "Francesa", "Pacopipas");
		Critica c1 = new Critica(9, "01/03/2023", "Muy buena", l1);
		Libro lib1 = new Libro("Amapolas", "02/06/0986", "Drama", "Español", 8.1, a1, c1);
		
		//toString
		System.out.println(lib1.getGenero());
		System.out.println(lib1.getTitulo());
		
		//nombre del autor del libro
		System.out.println(lib1.getAutor().getNombre());
		
		//Comentario de critica del libro
		System.out.println(lib1.getCritica().getComentario());
		
		//Edad del lector del libro
		System.out.println(lib1.getCritica().getLector().getEdad());

	}

}
