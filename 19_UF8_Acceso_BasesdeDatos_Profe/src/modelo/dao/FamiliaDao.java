package modelo.dao;

import java.util.List;

import modelo.javabeans.Familia;

public interface FamiliaDao {
	
	List<Familia> buscatTodas();
	Familia buscarUna(int idFamilia);
	int altaFamilia(Familia familia);
	

}
