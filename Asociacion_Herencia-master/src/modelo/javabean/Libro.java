package modelo.javabean;

import java.util.Objects;

public class Libro {
	private String titulo, añoPublicacion, genero, idioma;
	private double puntuacionMedia;
	private Autor autor;
	private Critica critica;
	
	
	public Libro() {
		super();
	}


	public Libro(String titulo, String añoPublicacion, String genero, String idioma, double puntuacionMedia,
			Autor autor, Critica critica) {
		super();
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		this.genero = genero;
		this.idioma = idioma;
		this.puntuacionMedia = puntuacionMedia;
		this.autor = autor;
		this.critica = critica;
	}



	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAñoPublicacion() {
		return añoPublicacion;
	}


	public void setAñoPublicacion(String añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public double getPuntuacionMedia() {
		return puntuacionMedia;
	}


	public void setPuntuacionMedia(double puntuacionMedia) {
		this.puntuacionMedia = puntuacionMedia;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}



	public Critica getCritica() {
		return critica;
	}


	public void setCritica(Critica critica) {
		this.critica = critica;
	}



	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", añoPublicacion=" + añoPublicacion + ", genero=" + genero + ", idioma="
				+ idioma + ", puntuacionMedia=" + puntuacionMedia + ", autor=" + autor + ", critica=" + critica + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(titulo, other.titulo);
	}

	
	

	
	
	

}
