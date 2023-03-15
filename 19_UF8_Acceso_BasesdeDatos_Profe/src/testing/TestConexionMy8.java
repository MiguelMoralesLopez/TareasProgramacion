package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.javabeans.Familia;

public class TestConexionMy8 {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/productosbd?serverTimezone=UTC";
		String username = "root";
		String pwd = "root";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, pwd);
			System.out.println("Conexion establecida");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Conexion NOOOO establecida");
		}
		
		String sql = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		sql = "select * from familias where codigo = ?";
		Familia familia = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 2);
			rs = ps.executeQuery();
			if (rs.next()) {
				familia = new Familia();
				familia.setIdFamilia(rs.getInt(1));
				familia.setDescripcion(rs.getString("descripcion"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(familia);
		
		sql = "select * from familias";
		List<Familia> lista = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			 
			rs = ps.executeQuery();
			while (rs.next()) {
				Familia familia1 = new Familia();
				 
				familia1.setIdFamilia(rs.getInt(1));
				familia1.setDescripcion(rs.getString("descripcion"));
				
				lista.add(familia1);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Familia ele: lista)
			System.out.println(ele);
		
	}

}
