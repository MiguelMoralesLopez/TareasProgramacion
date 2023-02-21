package testing;

import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Profesor;

public class Principal {
	
	public static void main(String[] args) {
	//Crea un objeto Profesor, un objeto Alumno y un objeto Administrativo.
	Profesor p1 = new Profesor();
	Profesor p2 = new Profesor("45555555", "Paco Martín", "Calle del Pez", "977777777", "Matemáticas");
	
	Alumno al1 = new Alumno();
	Alumno al2 = new Alumno("45555557", "Pablo Mármol", "Calle Sol 1", "9876544312", "1º DAW");
	
	Administrativo ad1 = new Administrativo();
	Administrativo ad2 = new Administrativo("47777777", "Marta Martinez", "Calle del agua", "985214763", "Captación de alumnos");
	
	//Ejecuta el método toString() sobre cada uno de ellos.
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	System.out.println(al1.toString());
	System.out.println(al2.toString());
	System.out.println(ad1.toString());
	System.out.println(ad2.toString());
	
	//Ejecuta el método trabajar() sobre cada uno de ellos.
	System.out.println(p2.trabajar());
	System.out.println(al2.trabajar());
	System.out.println(ad2.trabajar());
	
	//Ejecuta el método llamar(Persona p) para que el alumno llame al profesor.
	System.out.println(al2.llamar(p2));
	
	//Ejecuta el método ponerNotas() del objeto Profesor.
	System.out.println(p2.ponerNotas());
	
	//Ejecuta el método hacerExamen() del objeto Alumno.
	System.out.println(al2.hacerExamen());
	
	//Ejecuta el método gestionarMatricula() del objeto Administrativo.
	System.out.println(ad2.gestionarMatrícula());
		
	}
}
