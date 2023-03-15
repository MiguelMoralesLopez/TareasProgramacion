package modelo.javabean;

import java.sql.Date;
import java.util.Objects;

public class Cuenta {
	private int idCuenta;
	private String tipoCuenta;
	private double saldo;
	private Cliente cliente;
	private Date fechaAlta;
	
	
	public Cuenta() {
		super();
	}


	


	public Date getFechaAlta() {
		return fechaAlta;
	}





	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}





	public Cuenta(int idCuenta, String tipoCuenta, double saldo, Cliente cliente, Date fechaAlta) {
		super();
		this.idCuenta = idCuenta;
		this.tipoCuenta = tipoCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
		this.fechaAlta = fechaAlta;
	}





	public int getIdCuenta() {
		return idCuenta;
	}


	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}


	public String getTipoCuenta() {
		return tipoCuenta;
	}


	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	


	@Override
	public String toString() {
		return "Cuenta [idCuenta=" + idCuenta + ", tipoCuenta=" + tipoCuenta + ", saldo=" + saldo + ", cliente="
				+ cliente + ", fechaAlta=" + fechaAlta + "]";
	}





	@Override
	public int hashCode() {
		return Objects.hash(idCuenta);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cuenta))
			return false;
		Cuenta other = (Cuenta) obj;
		return idCuenta == other.idCuenta;
	}
	
	public void ingresar(double cantidad) {
		saldo += cantidad;
	}
	
	public void extraer(double cantidad) {
		saldo -= cantidad;
	}
	
	

}
