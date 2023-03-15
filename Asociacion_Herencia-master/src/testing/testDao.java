package testing;

import modelo.dao.LibroDaoImplList;
import modelo.javabean.Autor;
import modelo.javabean.Critica;
import modelo.javabean.Lector;
import modelo.javabean.Libro;

public class testDao {

	public static void main(String[] args) {
		LibroDaoImplList libImpl = new LibroDaoImplList();
		//Como para crear un libro hace falta crear un autor, una critica y un lector, al que hacen referencia, los creamos antes.
		Lector l1 = new Lector("Sheila", "Española", 31);
		Autor a1= new Autor("Paco", "Francesa", "Pacopipas");
		Critica c1 = new Critica(9, "01/03/2023", "Muy buena", l1);
		
		// Dar de alta un libro
		System.out.println(libImpl.altaLibro(new Libro("Pets", "02/10/1916", "Accion", "Ingles", 9.1, a1, c1)));
		System.out.println("");
		
		
		//Buscar todos
		for(Libro ele : libImpl.buscarTodos()) {
			System.out.println(ele);
		}
		System.out.println("");
		
		//Buscar un libro
		System.out.println(libImpl.buscarUno("Pets"));
		System.out.println("");
		
		//Buscar por genero
		System.out.println(libImpl.buscarPorGenero("Accion"));
		
		

	}

}
