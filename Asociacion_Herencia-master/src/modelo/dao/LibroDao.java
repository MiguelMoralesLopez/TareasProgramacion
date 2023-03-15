package modelo.dao;

import java.util.List;

import modelo.javabean.Libro;

public interface LibroDao {
	public boolean altaLibro(Libro libro);
	public boolean bajaLibro(Libro libro);
	public Libro buscarUno(String titulo);
	public List<Libro> buscarPorGenero(String genero);
	public List<Libro> buscarTodos();

}
