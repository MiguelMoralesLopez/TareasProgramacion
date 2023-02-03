package modelo.dao;

import java.util.ArrayList;
import modelo.javabean.Departamento;

public class DepartamentoImplDao implements IntDepartamentoDao {
	
	private String nombre;
	private ArrayList<Departamento> listaDepartamentos;
	
	public DepartamentoImplDao (String nombre) {
		this.nombre = nombre;
		listaDepartamentos = new ArrayList<>();
		cargarDatos();
	}
	
	public void cargarDatos() {
		LocalidadImplDao loc1 = new LocalidadImplDao("Localidades");
		listaDepartamentos.add(new Departamento(201, "RRHH", loc1.buscarUno(111)));
		listaDepartamentos.add(new Departamento(202, "RRHH", loc1.buscarUno(111)));
		listaDepartamentos.add(new Departamento(203, "RRHH", loc1.buscarUno(112)));
		listaDepartamentos.add(new Departamento(204, "RRHH", loc1.buscarUno(113)));
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean alta(Departamento departamento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarUno(Departamento departamento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarUno(Departamento departamento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Departamento buscarUno(int idDepartamento) {
		Departamento dpBuscar = new Departamento();
		dpBuscar.setIdDepar(idDepartamento);
		int posicion = listaDepartamentos.indexOf(dpBuscar);
		if (posicion == -1)
			return null;
		else
			return listaDepartamentos.get(posicion);
	}
	

}
