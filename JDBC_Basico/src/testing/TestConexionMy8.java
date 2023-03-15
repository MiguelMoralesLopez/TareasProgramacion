package testing;

import java.sql.Connection;

import modelo.dao.ConexionDaoMy8;

public class TestConexionMy8 {

	public static void main(String[] args) {
		Connection conn1 = ConexionDaoMy8.getConnection();
		Connection conn2 = ConexionDaoMy8.getConnection();
		
		System.out.println(conn1);
		System.out.println(conn2);
		
		
	}

}
