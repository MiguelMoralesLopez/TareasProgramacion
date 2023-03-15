package modelo.daojdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Cliente;
import modelo.javabean.Oficina;

public class ClienteDaoImplMy8 extends AbstractDaoMy8 implements ClienteDao{

	
	@Override
	public boolean alta(Cliente cliente) {
		return false;
	}

	@Override
	public int altaCliente(Cliente cliente) {
		sql = "insert into clientes values(?,?,?,?,?,?)";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cliente.getIdCliente());
			ps.setString(2, cliente.getNombre());
			ps.setString(3, cliente.getAplellidos());
			ps.setString(4, cliente.getDireccion());
			ps.setString(5, cliente.getEmail());
			ps.setInt(6, cliente.getOficina().getIdOficina());
			filas = ps.executeUpdate();
			filas=1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Cliente buscarUno(String idCliente) {
		sql = "select * from clientes where id_cliente = ?";
		Cliente cl = null;
		OficinaDao odao = new OficinaDaoImplMy8();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, idCliente);
			rs = ps.executeQuery();
			if (rs.next()) {
				cl = new Cliente();
				cl.setIdCliente(rs.getString("id_cliente"));
				cl.setNombre(rs.getString("nombre"));
				cl.setAplellidos(rs.getString("apellidos"));
				cl.setDireccion(rs.getString("direccion"));
				cl.setEmail(rs.getString("email"));
				cl.setOficina(odao.buscarUna(rs.getInt("id_oficina")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cl;
	}

	@Override
	public List<Cliente> buscarTodos() {
		sql = "select * from clientes";
		List<Cliente> lista = new ArrayList<>();
		OficinaDao odao = new OficinaDaoImplMy8();
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				Cliente cl = new Cliente();
				cl = new Cliente();
				cl.setIdCliente(rs.getString("id_cliente"));
				cl.setNombre(rs.getString("nombre"));
				cl.setAplellidos(rs.getString("apellidos"));
				cl.setDireccion(rs.getString("direccion"));
				cl.setEmail(rs.getString("email"));
				cl.setOficina(odao.buscarUna(rs.getInt("id_oficina")));
				lista.add(cl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Cliente> buscarClientesOficina(int idOficina) {
		sql = "select * from clientes where id_oficina = ?";
		List<Cliente> lista = new ArrayList<>();
		OficinaDao odao = new OficinaDaoImplMy8();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idOficina);
			
			rs = ps.executeQuery();
			Oficina oficina = odao.buscarUna(idOficina);
			if (oficina == null)
				return lista;
			while (rs.next()) {
				Cliente cl = new Cliente();
				cl = new Cliente();
				cl.setIdCliente(rs.getString("id_cliente"));
				cl.setNombre(rs.getString("nombre"));
				cl.setAplellidos(rs.getString("apellidos"));
				cl.setDireccion(rs.getString("direccion"));
				cl.setEmail(rs.getString("email"));
				cl.setOficina(oficina);
				lista.add(cl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

}
