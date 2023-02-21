package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

public class Instituto implements InstitutoDao {
	private ArrayList<Persona> lista;

	public Instituto(ArrayList<Persona> lista) {
		super();
		this.lista = lista;
		cargarDatos();
	}
	
	public void cargarDatos() {
		lista.add(new Alumno("45555557", "Pablo Mármol", "Calle Sol 1", "9876544312", "1º DAW"));
		lista.add(new Profesor("45555555", "Paco Martín", "Calle del Pez", "977777777", "Matemáticas"));
		lista.add(new Administrativo("47777777", "Marta Martinez", "Calle del agua", "985214763", "Captación de alumnos"));
	}

	@Override
	public boolean altaPersona(Persona persona) {
		if (lista.contains(persona))
			return false;
		else 
			lista.add(persona);
			return true;
	}

	@Override
	public Persona buscarPersona(String nif) {
		for (Persona ele: lista) {
			if (ele.getNif().equals(nif)) 
				return ele;
		}
		return null;
	}

	@Override
	public List<Persona> buscarTodas() {
		return lista;
	}

	@Override
	public boolean eliminarPersona(Persona persona) {
		return lista.remove(persona);
	}

	@Override
	public List<Persona> buscarPersonaPorTipo(String tipoPersona) {
		List<Persona> aux = new ArrayList<>();
		for (Persona ele: lista) {
			if (tipoPersona.equalsIgnoreCase("Profesor") && ele instanceof Profesor) {
				aux.add(ele);
			} else if (tipoPersona.equalsIgnoreCase("Alumno") && ele instanceof Alumno) {
				aux.add(ele);
			} else if (tipoPersona.equalsIgnoreCase("Administrativo") && ele instanceof Administrativo) {
				aux.add(ele);
			}
		}
		return aux;
	}
	

}
