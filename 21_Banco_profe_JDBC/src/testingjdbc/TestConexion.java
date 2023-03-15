package testingjdbc;

import modelo.daojdbc.OficinaDao;
import modelo.daojdbc.OficinaDaoImplMy8;
import modelo.javabean.Oficina;

public class TestConexion {

	public static void main(String[] args) {
		OficinaDao odao = new OficinaDaoImplMy8();
		Oficina of = odao.buscarUna(9001);
		if (of != null)
		
			System.out.println(of.getNombre());
		else
			System.out.println("Oficina nooo encontrada");
		Oficina of2 = new Oficina(9003, "Sevilla2", "nuez 65","sevilla", "678900543");
//		System.out.println(odao.altaOficina(of2));
	//	System.out.println(odao.eliminarOficina(9005));
		of.setCiudad("cordoba");
	//	System.out.println(odao.modificarOficina(of));
		System.out.println("BUSCAR TODOS");
		for (Oficina ele: odao.buscarTodos())
			System.out.println(ele);
		
		System.out.println("BUSCAR prefijo");
		for (Oficina ele: odao.buscarPorPrefijo("644"))
			System.out.println(ele);
		/*
		System.out.println("BUSCAR por ciudad -> madrid");
		for (Oficina ele: odao.buscarPorCiudad("sevilla"))
			System.out.println(ele);
	*/	

	}

}
