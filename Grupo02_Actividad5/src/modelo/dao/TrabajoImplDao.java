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
	@Override
	public boolean alta(Trabajo trabajo) {
		if (listaTrabajos.contains(trabajo))
			return false;
		else
			return listaTrabajos.add(trabajo);
	}
	@Override
	public boolean eliminarUno(Trabajo trabajo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean modificarUno(Trabajo trabajo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Trabajo buscarUno(int idTrabajo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
