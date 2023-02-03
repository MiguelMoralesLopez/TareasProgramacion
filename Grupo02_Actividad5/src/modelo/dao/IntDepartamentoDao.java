package modelo.dao;

import modelo.javabean.Departamento;

public interface IntDepartamentoDao {
	boolean alta(Departamento departamento);
	boolean eliminarUno(Departamento departamento);
	boolean modificarUno(Departamento departamento);
	Departamento buscarUno(int idDepartamento);

}
