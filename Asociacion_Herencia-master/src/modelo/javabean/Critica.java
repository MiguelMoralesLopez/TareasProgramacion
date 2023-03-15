package modelo.javabean;

public class Critica {
	private int puntuacion;
	private String fecha;
	private String comentario;
	private Lector lector;
	
	
	public Critica() {
		super();
	}


	public Critica(int puntuacion, String fecha, String comentario, Lector lector) {
		super();
		this.puntuacion = puntuacion;
		this.fecha = fecha;
		this.comentario = comentario;
		this.lector = lector;
	}


	public int getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	public Lector getLector() {
		return lector;
	}


	public void setLector(Lector lector) {
		this.lector = lector;
	}
	
	

}
