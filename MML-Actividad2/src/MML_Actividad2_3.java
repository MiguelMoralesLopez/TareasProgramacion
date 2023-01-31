import java.util.Scanner;

public class MML_Actividad2_3 {
	
	/*
	 * Método que recibe una variable int para evaluar el salario, devolviendo una variable String
	 * para imprimirla con dicha evaluación.
	 */
	public static String literalSalario(int salario ) {
		if (salario < 25000) {
			return "Salario bajo";
		} else if (salario >= 25000 && salario <= 40000) {
			return "Salario medio";
		} else {
			return "Salario alto";
		}
	}
	
	/*
	 * Método para evaluar el sexo del usuario en base a los datos que introduce
	 * por consola. Recibe una variable String y devuelve otra variable del mismo
	 * tipo.
	 */
	public static String literalSexo(String sexo ) {
		
		if (sexo.equals("M") || sexo.equals("m")) {
			return "Mujer";
		} else if (sexo.equals("H") || sexo.equals("h")) {
			return "Hombre";
		} else {
			return "Sexo Erróneo";
		}
	}
	
	/*
	 * Método principal. Pide al usuario que introduzca sus datos y los procesa usando los 
	 * métodos anteriormente definidos.
	 */
	public static void main(String[] args) {
		
		String nombre = "";
		String sexo = "";
		int salario = 0;
		int contadorNombres = 0;
		int sumaSalarios = 0;
		double mediaSalarios = 0.0;
		
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un nombre. Teclea fin para salir.");
			nombre = leer.next();
			
			if (!nombre.toUpperCase().equals("FIN")) {
				System.out.println("Introduce tu salario.");			
				salario = leer.nextInt();
				System.out.println("Introduce la letra inicial de tu sexo.");
				sexo = leer.next();
				
				contadorNombres++;
				sumaSalarios += salario;
				mediaSalarios = sumaSalarios / contadorNombres;
				System.out.println("Tu nombre es: " + nombre);
				System.out.println(literalSalario(salario));
				System.out.println(literalSexo(sexo));
			}		
		} while (!nombre.toUpperCase().equals("FIN"));
		
		leer.close();
		
		System.out.println("Cantidad de nombres introducidos: " + contadorNombres);
		System.out.println("La suma de los salarios es: " + sumaSalarios);
		System.out.println("La media de dichos salarios es: " + mediaSalarios);		
	}
}	