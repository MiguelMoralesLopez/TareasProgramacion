package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Empleado;

public class GestionEmpresaImplDao implements IntGestionEmpresa{
	
		
	private String nombre;
	private ArrayList<Empleado> personal;
	
	//Constructor del objeto Empresa.
	public GestionEmpresaImplDao(String nombre) {
		this.nombre = nombre;
		personal = new ArrayList<>();
		cargarDatos();
	}
	
	//Método privado para cargar datos iniciales en el ArrayList.
	private void cargarDatos() {
		
		DepartamentoImplDao dpto1 = new DepartamentoImplDao("Departamentos");
		TrabajoImplDao tr1 = new TrabajoImplDao("Trabajos");
		personal.add(new Empleado(141001, "Pedro", "Mármol Sílice", null, 'H', 19500.00, 75.00, 
				tr1.buscarUno("144"), dpto1.buscarUno(201)));
		personal.add(new Empleado(141002, "María", "Álvarez Domínguez", null, 'M', 20500.00, 120.00,
				tr1.buscarUno("143"), dpto1.buscarUno(202)));
		personal.add(new Empleado(141003, "José Antonio", "Pardo Pérez", null, 'H', 19750.00, 50.00,
				tr1.buscarUno("142"), dpto1.buscarUno(202)));
		personal.add(new Empleado(141004, "Laura", "Cuevas Espejo", null, 'M', 22500.00, 150.00,
				tr1.buscarUno("142"), dpto1.buscarUno(202)));
		personal.add(new Empleado(141005, "Pedro", "Pica Piedra", null, 'H', 22450.00, 100.00,
				tr1.buscarUno("141"), dpto1.buscarUno(203)));
	}
	
	//Getter y Setter.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Implementación de métodos abstractos del interface.
	@Override
	public boolean alta(Empleado empleado) {
		if (personal.contains(empleado))
			return false;
		else
			return personal.add(empleado);
	}

	@Override
	public boolean eliminarUno(Empleado empleado) {
		if (personal.contains(empleado))
			return personal.remove(empleado);
		else
			return false;
	}
	//Modifica el registro de uno de los empleados en base al atributo seleccionado como distintivo de la clase.
	@Override
	public boolean modificarUno(Empleado empleado) {
		//Busca la posición de un empleado en el ArrayList en base a su idEmpleado (o el atributo distintivo)
		int posicion = personal.indexOf(empleado);
		//Si existe, la posición nunca va a ser -1
		if (posicion == -1)
			//Al no existir, devuelve false
			return false;
		else
			//Si existe coincidencia (posicion >= 0) modifica el registro del arrayList con el 
			//empleado que se pasa como argumento del método.
			personal.set(posicion, empleado);
			return true;
		
	}

	@Override
	public ArrayList<Empleado> buscarPorSexo(char sexo) {
		ArrayList<Empleado> aux = new ArrayList<>();
        for (Empleado ele: personal) {
                if (ele.getGenero() == sexo)
                aux.add(ele);
        }
            return aux;
	}

	@Override
	public Empleado buscarUno(int idEmpleado) {
		Empleado empBuscar = new Empleado();
		empBuscar.setIdEmpleado(idEmpleado);
		int posicion = personal.indexOf(empBuscar);
		if (posicion == -1)
			return null;
		else
			return personal.get(posicion);
	}

	@Override
	public ArrayList<Empleado> buscarTodos() {
		
		return personal;
	}

	@Override
	public double masaSalarial() {
		//Se crea un acumulador.
		int masa = 0;
		//Se crea un bucle que recorra el array sacando el salario bruto y las comisiones de cada empleado.
        for (Empleado ele: personal) {
        	//Se suman esas cantidades al acumulador.
            masa += ele.getSalario() + ele.getComision();
        }
		//Devuelve la masa salarial del ArrayList.
		return masa;
	}

	@Override
	public ArrayList<Empleado> buscarPorDepartamento(int idDepartamento) {
		ArrayList<Empleado> aux = new ArrayList<>();
        for (Empleado ele: personal) {
                if (ele.getDepartamento().getIdDepar() == idDepartamento)
                aux.add(ele);
        }
            return aux;
	}

	@Override
	public ArrayList<Empleado> buscarPorTrabajo(String idTrabajo) {
		ArrayList<Empleado> aux = new ArrayList<>();
        for (Empleado ele: personal) {
                if (ele.getTrabajo().getIdTrabajo() == idTrabajo)
                aux.add(ele);
        }
            return aux;
	}

	@Override
	public ArrayList<Empleado> buscarPorPais(String pais) {
		ArrayList<Empleado> aux = new ArrayList<>();
        for (Empleado ele: personal) {
                if (ele.getDepartamento().getLocalidad().getPais() == pais)
                aux.add(ele);
        }
            return aux;
	}

	
}
