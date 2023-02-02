package modelo.dao;

import modelo.javabean.Trabajo;

public interface IntTrabajoDao {
	boolean alta(Trabajo trabajo);
	boolean eliminarUno(Trabajo trabajo);
	boolean modificarUno(Trabajo trabajo);
	Trabajo buscarUno(int idTrabajo);
	
}
