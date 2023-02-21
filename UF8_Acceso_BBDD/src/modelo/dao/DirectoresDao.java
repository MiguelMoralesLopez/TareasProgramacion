package modelo.dao;

import java.util.List;

import modelo.javabean.Directores;

public interface DirectoresDao {
	
	List<Directores> buscarTodas();
	Directores buscarUna(int id);
	int altaDirector(Directores director);

}
