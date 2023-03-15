package testingjdbc;


import modelo.daojdbc.ClienteDao;
import modelo.daojdbc.ClienteDaoImplMy8;
import modelo.daojdbc.OficinaDao;
import modelo.daojdbc.OficinaDaoImplMy8;
import modelo.javabean.Cliente;
import modelo.javabean.Oficina;

public class TestClienteDao {

	public static void main(String[] args) {
		ClienteDao cdao = new ClienteDaoImplMy8();
		OficinaDao odao = new OficinaDaoImplMy8();
//		Cliente cliente = new Cliente("1555555A", "carlos", "martinez", "cadiz", "c@a.es",
//				odao.buscarUna(9001));
//		System.out.println(cdao.altaCliente(cliente));
	//	System.out.println(cdao.buscarUno("12222222A"));
		
		for (Cliente ele: cdao.buscarClientesOficina(9001))
			System.out.println(ele);

	}

}
