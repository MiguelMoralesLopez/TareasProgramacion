package modelo.daojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexion.ConexionDaoMy8;

public class AbstractDaoMy8 {
	
	protected Connection conn;
	protected PreparedStatement ps;
	protected ResultSet rs;
	protected String sql;
	protected int filas;
	
	
	public AbstractDaoMy8() {
		conn = ConexionDaoMy8.getConexion();
	}


}
