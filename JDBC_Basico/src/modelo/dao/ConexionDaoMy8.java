package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDaoMy8 {
	
	private static String url, user, pass;
	private static Connection conn;
	
	private ConexionDaoMy8() {
		
		url = "jdbc:mysql://localhost:3306/banco?serverTimezone=UTC";
		user = "root";
		pass = "1235";
		conn = null;
		try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexión establecida");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Conexión NO establecida");
		}
		
	}
	public static Connection getConnection(){
		if (conn == null) {
			new ConexionDaoMy8();
		}
		return conn;
		}
}
