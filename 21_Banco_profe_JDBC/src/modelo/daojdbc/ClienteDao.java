package modelo.daojdbc;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Cliente;

public interface ClienteDao {
	
	boolean alta(Cliente cliente);
	int altaCliente(Cliente cliente);
	Cliente buscarUno(String idCliente);
	List<Cliente> buscarTodos();
	List<Cliente> buscarClientesOficina(int idOficina);

}
