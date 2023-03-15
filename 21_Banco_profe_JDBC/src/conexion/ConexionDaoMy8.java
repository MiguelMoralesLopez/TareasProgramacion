package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDaoMy8 {
	private static String url,username,password;
	private static Connection conn;
	
	private ConexionDaoMy8() {
		url="jdbc:mysql://localhost:3306/banco_fp_23?serverTimezone=UTC";
		username="root";
		password="1235";
		
		try {
			conn=DriverManager.getConnection(url, username, password);
			System.out.println("Ok");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("No");
		}
	}
	
	
	public static Connection getConexion() {
		if (conn==null) {
			new ConexionDaoMy8();
		}
		return conn;
	}

}
