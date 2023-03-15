package testing;

import modelo.dao.FamiliaDao;
import modelo.dao.FamiliaDaoImplMy8;

public class TestModeloDao {

	public static void main(String[] args) {
		FamiliaDao fdao = new FamiliaDaoImplMy8();
		System.out.println(fdao.buscarUna(4));

	}

}
