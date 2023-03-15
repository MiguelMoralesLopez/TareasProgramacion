package modelo.daojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Oficina;

public class OficinaDaoImplMy8 extends AbstractDaoMy8 implements OficinaDao{
	
	
	
	

	@Override
	public int altaOficina(Oficina oficina) {
		sql = "insert into oficinas values(?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, oficina.getIdOficina());
			ps.setString(2, oficina.getNombre());
			ps.setString(3, oficina.getDireccion());
			ps.setString(4, oficina.getCiudad());
			ps.setString(5, oficina.getTelefono());
			
			filas = ps.executeUpdate();
			filas = 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int eliminarOficina(int idOficina) {
		sql= "delete from oficinas where id_oficina = ?";
		filas =0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idOficina);
			filas = ps.executeUpdate();
			filas = 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int modificarOficina(Oficina oficina) {
		sql = "update oficinas set nombre = ?,"
				+ " direccion = ? ,"
				+ " ciudad = ? ,"
				+ " telefono = ? "
				+ " where id_oficina = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(5, oficina.getIdOficina());
			ps.setString(1, oficina.getNombre());
			ps.setString(2, oficina.getDireccion());
			ps.setString(3, oficina.getCiudad());
			ps.setString(4, oficina.getTelefono());
			
			filas = ps.executeUpdate();
			filas = 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Oficina buscarUna(int idOficina) {
		sql = "select * from oficinas where id_oficina = ?";
		Oficina of = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idOficina);
			rs = ps.executeQuery();
			if (rs.next()) {
				of = new Oficina();
				of.setIdOficina(rs.getInt("id_oficina"));
				of.setCiudad(rs.getString("ciudad"));
				of.setDireccion(rs.getString("direccion"));
				of.setNombre(rs.getString("nombre"));
				of.setTelefono(rs.getString("telefono"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return of;
		
	}

	@Override
	public List<Oficina> buscarTodos() {
		sql = "select * from oficinas";
		List<Oficina> lista = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				Oficina of = new Oficina();
				 
				of.setIdOficina(rs.getInt("id_oficina"));
				of.setCiudad(rs.getString("ciudad"));
				of.setDireccion(rs.getString("direccion"));
				of.setNombre(rs.getString("nombre"));
				of.setTelefono(rs.getString("telefono"));
				lista.add(of);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Oficina> buscarPorPrefijo(String prefijo) {
		sql = "select * from oficinas where telefono like ?";
		List<Oficina> lista = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, prefijo + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				Oficina of = new Oficina();
				 
				of.setIdOficina(rs.getInt("id_oficina"));
				of.setCiudad(rs.getString("ciudad"));
				of.setDireccion(rs.getString("direccion"));
				of.setNombre(rs.getString("nombre"));
				of.setTelefono(rs.getString("telefono"));
				lista.add(of);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Oficina> buscarPorCiudad(String ciudad) {
		sql = "select * from oficinas where ciudad = ?";
		List<Oficina> lista = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, ciudad);
			rs = ps.executeQuery();
			while (rs.next()) {
				Oficina of = new Oficina();
				 
				of.setIdOficina(rs.getInt("id_oficina"));
				of.setCiudad(rs.getString("ciudad"));
				of.setDireccion(rs.getString("direccion"));
				of.setNombre(rs.getString("nombre"));
				of.setTelefono(rs.getString("telefono"));
				lista.add(of);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

}
