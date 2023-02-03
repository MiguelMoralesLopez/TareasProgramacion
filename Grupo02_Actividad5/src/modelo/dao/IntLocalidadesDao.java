package modelo.dao;

import modelo.javabean.Localidad;

public interface IntLocalidadesDao {
	boolean alta(Localidad localidad);
	boolean eliminarUno(Localidad localidad);
	boolean modificarUno(Localidad localidad);
	Localidad buscarUno(int idLocalidad);
}
