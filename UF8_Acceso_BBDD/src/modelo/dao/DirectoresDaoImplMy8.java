package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import modelo.javabean.Directores;

public class DirectoresDaoImplMy8 implements DirectoresDao {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	
	public DirectoresDaoImplMy8() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco?serverTimezone=UTC","root", "1235");
			System.out.println("Conexión establecida");
		} catch (SQLException e) {
			System.out.println("Conexión NO establecida");
			e.printStackTrace();
		}
	}
	@Override
	public List<Directores> buscarTodas() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Directores buscarUna(int id) {
		sql = "select * from familias where id = ?";
		Directores director = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				director = new Directores();
				director.setId(rs.getInt(1));
				director.setNombre(rs.getString(2));
				director.setApellidos(rs.getString(3));
				director.setSueldo(rs.getFloat(4));
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return director;
	}
	@Override
	public int altaDirector(Directores director) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
