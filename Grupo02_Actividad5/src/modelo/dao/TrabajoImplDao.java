package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Trabajo;

public class TrabajoImplDao implements IntTrabajoDao {
	
	private String nombre;
	private ArrayList <Trabajo> listaTrabajos;
	
	public TrabajoImplDao(String nombre) {
		this.nombre = nombre;
		listaTrabajos = new ArrayList<>();
		cargarDatos();
		
	}
	public void cargarDatos() {
		listaTrabajos.add(new Trabajo("141", "Nóminas", 17000, 19000));
		listaTrabajos.add(new Trabajo("142", "Contrataciones", 18000, 20000));
		listaTrabajos.add(new Trabajo("143", "Contabilidad", 19000, 21000));
		listaTrabajos.add(new Trabajo("144", "Coordinador area", 20000, 22000));
		listaTrabajos.add(new Trabajo("145", "Supervisor", 21000, 23000));
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean alta(Trabajo trabajo) {
		if (listaTrabajos.contains(trabajo))
			return false;
		else
			return listaTrabajos.add(trabajo);
	}
	@Override
	public boolean eliminarUno(Trabajo trabajo) {
		if (listaTrabajos.contains(trabajo))
			return listaTrabajos.remove(trabajo);
		else
			return false;
	}
	@Override
	public boolean modificarUno(Trabajo trabajo) {
		int posicion = listaTrabajos.indexOf(trabajo);
		if (posicion == -1)
			return false;
		else
			listaTrabajos.set(posicion, trabajo);
		return true;
	}
	@Override
	public Trabajo buscarUno(String idTrabajo) {
		Trabajo trBuscar = new Trabajo();
		trBuscar.setIdTrabajo(idTrabajo);
		int posicion = listaTrabajos.indexOf(trBuscar);
		if (posicion == -1)
			return null;
		else
			return listaTrabajos.get(posicion);
	}
	
}
