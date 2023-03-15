package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import modelo.javabeans.Familia;

public class FamiliaDaoImplMy8 implements FamiliaDao{
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	
	public FamiliaDaoImplMy8() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productosbd?serverTimezone=UTC",
					  "root", "root");
			System.out.println("conexion establecida");
		} catch (SQLException e) {
			System.out.println("NOOO establecida");
			e.printStackTrace();
		}
	}

	@Override
	public List<Familia> buscatTodas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Familia buscarUna(int idFamilia) {
		sql = "select * from familias where codigo = ?";
		Familia familia = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idFamilia);
			rs = ps.executeQuery();
			if (rs.next()) {
				familia = new Familia();
				familia.setIdFamilia(rs.getInt(1));
				familia.setDescripcion(rs.getString(2));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return familia;
	}

	@Override
	public int altaFamilia(Familia familia) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
