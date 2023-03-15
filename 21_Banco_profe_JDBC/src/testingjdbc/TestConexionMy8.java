package testingjdbc;

import java.sql.Connection;

import conexion.ConexionDaoMy8;

public class TestConexionMy8 {

	public static void main(String[] args) {
		Connection conn1 = ConexionDaoMy8.getConexion();
		Connection conn2 = ConexionDaoMy8.getConexion();
		
		System.out.println(conn1);
		System.out.println(conn2);
		

	}

}
