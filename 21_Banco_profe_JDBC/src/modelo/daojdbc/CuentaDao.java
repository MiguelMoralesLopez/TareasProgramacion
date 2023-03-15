package modelo.daojdbc;

import java.util.List;

import modelo.javabean.Cuenta;

public interface CuentaDao {
	int alta(Cuenta cuenta);
	Cuenta buscarUno(int idCuenta);
	List<Cuenta> buscarTodos();
	List<Cuenta> buscarPorClientes(String idCliente);
	List<Cuenta> buscarPorClientesPrefijo(String prefijoIdCliente);
	double sumaSaldos();
	

}
