package modelo.daojdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Cliente;
import modelo.javabean.Cuenta;

public class CuentaDaoImplMy8 extends AbstractDaoMy8 implements CuentaDao{

	@Override
	public int alta(Cuenta cuenta) {
		sql = "insert into cuentas values(?,?,?,?,?)";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, cuenta.getIdCuenta());
			ps.setString(2, cuenta.getTipoCuenta());
			ps.setDouble(3, cuenta.getSaldo());
			ps.setString(4, cuenta.getCliente().getIdCliente());
			ps.setDate(5, cuenta.getFechaAlta());
			
			filas = ps.executeUpdate();
			filas=1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Cuenta buscarUno(int idCuenta) {
		sql = "select * from cuentas where id_cuenta = ?";
		Cuenta ct = null;
		ClienteDao cdao = new ClienteDaoImplMy8();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idCuenta);
			rs = ps.executeQuery();
			if (rs.next()) {
				ct = new Cuenta();
				ct.setIdCuenta(rs.getInt("id_cuenta"));
				ct.setTipoCuenta(rs.getString("tipo_cuenta"));
				ct.setSaldo(rs.getDouble("saldo"));
				ct.setCliente(cdao.buscarUno(rs.getString("id_cliente")));
				ct.setFechaAlta(rs.getDate("fecha_alta"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ct;
	}

	@Override
	public List<Cuenta> buscarTodos() {
		sql = "select * from cuentas";
		 
		List<Cuenta> lista = new ArrayList<>();
		ClienteDao cdao = new ClienteDaoImplMy8();
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				Cuenta ct = new Cuenta();
				ct.setIdCuenta(rs.getInt("id_cuenta"));
				ct.setTipoCuenta(rs.getString("tipo_cuenta"));
				ct.setSaldo(rs.getDouble("saldo"));
				ct.setCliente(cdao.buscarUno(rs.getString("id_cliente")));
				ct.setFechaAlta(rs.getDate("fecha_alta"));
				lista.add(ct);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Cuenta> buscarPorClientes(String idCliente) {
		sql = "select * from cuentas where id_cliente = ?";
		 
		List<Cuenta> lista = new ArrayList<>();
		ClienteDao cdao = new ClienteDaoImplMy8();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, idCliente);
			rs = ps.executeQuery();
			while (rs.next()) {
				Cuenta ct = new Cuenta();
				ct.setIdCuenta(rs.getInt("id_cuenta"));
				ct.setTipoCuenta(rs.getString("tipo_cuenta"));
				ct.setSaldo(rs.getDouble("saldo"));
				ct.setCliente(cdao.buscarUno(rs.getString("id_cliente")));
				ct.setFechaAlta(rs.getDate("fecha_alta"));
				
				lista.add(ct);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Cuenta> buscarPorClientesPrefijo(String prefijoIdCliente) {
		sql = "select * from cuentas where id_cliente like ?";
		 
		List<Cuenta> lista = new ArrayList<>();
		ClienteDao cdao = new ClienteDaoImplMy8();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, prefijoIdCliente + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				Cuenta ct = new Cuenta();
				ct.setIdCuenta(rs.getInt("id_cuenta"));
				ct.setTipoCuenta(rs.getString("tipo_cuenta"));
				ct.setSaldo(rs.getDouble("saldo"));
				ct.setCliente(cdao.buscarUno(rs.getString("id_cliente")));
				ct.setFechaAlta(rs.getDate("fecha_alta"));
				
				lista.add(ct);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public double sumaSaldos() {
		sql = "select sum(saldo) as suma from cuentas";
		double suma = 0;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				suma = rs.getDouble("suma");
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return suma;
	}

}
