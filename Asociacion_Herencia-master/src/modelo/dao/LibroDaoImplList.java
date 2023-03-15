package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Autor;
import modelo.javabean.Critica;
import modelo.javabean.Lector;
import modelo.javabean.Libro;

public class LibroDaoImplList implements LibroDao{
	private List<Libro> lista;
	Lector l1 = new Lector("Sheila", "Española", 31);
	Autor a1= new Autor("Paco", "Francesa", "Pacopipas");
	Critica c1 = new Critica(9, "01/03/2023", "Muy buena", l1);
	
	

	public LibroDaoImplList() {
		super();

		lista = new ArrayList<>();
		cargarDatos();
	}
	
	public void cargarDatos() {
		lista.add(new Libro("Amapolas", "02/06/0986", "Drama", "Español", 8.1, a1, c1));
	}

	@Override
	public boolean altaLibro(Libro libro) {
		if(lista.contains(libro)) {
		return false;
		}
		else return lista.add(libro);
	}

	@Override
	public boolean bajaLibro(Libro libro) {
		return lista.remove(libro);
	}

	/**
	 * Para el elemento(ele) de una lista de Libros, si el ele.getTitulo es igual al titulo que se pasa por parametro, mostrar ele
	 * sino, mostrar null.
	 */
	@Override
	public Libro buscarUno(String titulo) {
		Libro libroBuscado = new Libro();
		libroBuscado.setTitulo(titulo);
		int posicion = lista.indexOf(libroBuscado);
		if (posicion == -1)
			return null;
		else
			return lista.get(posicion);
	}

	/**
	 * Primero se crea un arraylist con una lista auxiliar a la que se le añadiran los elementos que coincidan, en este caso, los libros con
	 * el titulo que se pasa por parametro.
	 * Para un elemento(ele) de una lista de libros, si ele.getGenero es igual al genero que nos pasen por parametro
	 * aux.add(ele) se añade a la lista auxiliar el elemento. Y se retorna la lista auxiliar.
	 */
	@Override
	public List<Libro> buscarPorGenero(String genero) {
		List<Libro> aux = new ArrayList<>();
		for (Libro ele: lista) {
			if (ele.getGenero().equalsIgnoreCase(genero))
				aux.add(ele);
		}
		return aux;
	}

	/**
	 * Te retorna la lista
	 */
	@Override
	public List<Libro> buscarTodos() {
		return lista;
		}
	}


