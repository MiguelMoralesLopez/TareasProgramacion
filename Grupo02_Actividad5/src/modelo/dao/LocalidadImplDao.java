package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Localidad;

public class LocalidadImplDao implements IntLocalidadesDao {
	
	private String nombre;
	private ArrayList<Localidad> localidades;
	
	public LocalidadImplDao (String nombre) {
		this.nombre = nombre;
		localidades = new ArrayList<>();
		cargarDatos();
	}
	
	public void cargarDatos() {
		localidades.add(new Localidad(111, "Calle del Sol, 17", "Madrid", "España"));
		localidades.add(new Localidad(112, "Calle de Mercurio, 27", "Cáceres", "España"));
		localidades.add(new Localidad(113, "Calle de Venus, 32", "Sevilla", "España"));
		localidades.add(new Localidad(114, "Rue Coraçao, 1", "Lisboa", "Portugal"));
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean alta(Localidad localidad) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarUno(Localidad localidad) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarUno(Localidad localidad) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Localidad buscarUno(int idLocalidad) {
		Localidad locBuscar = new Localidad();
		locBuscar.setIdLocalidad(idLocalidad);
		int posicion = localidades.indexOf(locBuscar);
		if (posicion == -1)
			return null;
		else
			return localidades.get(posicion);
	}
	
}
