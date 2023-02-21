package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Directores;

public class TestConexionMyWorkbench {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/banco?serverTimezone=UTC";
		String user = "root";
		String pass = "1235";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexión establecida");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Conexión NO establecida");
		}
		String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Directores directores = null;
		
		sql = "select * from directores where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 12);
			rs = ps.executeQuery();
			if (rs.next()) {
				directores = new Directores();
				directores.setId(rs.getInt(1));
				directores.setNombre(rs.getString("Nombre"));
				directores.setApellidos(rs.getString(3));
				directores.setSueldo(rs.getFloat(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(directores);
		System.out.println("");
		System.out.println("Ahora la tabla completa");
		
		
		sql = "select * from directores";
		List<Directores> lista = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Directores direc1 = new Directores();
				direc1 = new Directores();
				direc1.setId(rs.getInt(1));
				direc1.setNombre(rs.getString("Nombre"));
				direc1.setApellidos(rs.getString(3));
				direc1.setSueldo(rs.getFloat(4));
				lista.add(direc1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Directores ele: lista)
			System.out.println(ele);
	}

}
