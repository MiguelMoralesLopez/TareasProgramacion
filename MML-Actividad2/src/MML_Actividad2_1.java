import java.util.Scanner;

public class MML_Actividad2_1 {

	public static void main(String[] args) {

		// Lectura de teclado vía Scanner.
		Scanner leer = new Scanner(System.in);

		// Definición de variables de los lados del triángulo.
		int lado1 = 0, lado2 = 0, lado3 = 0;
		System.out.println("Teclea tres numeros");

		lado1 = leer.nextInt();
		lado2 = leer.nextInt();
		lado3 = leer.nextInt();

		leer.close();

		System.out.println("Los numeros leídos son " + lado1 + ", " + lado2 + " y " + lado3);

		// Definición de variables de comprobación de cada tipo de triángulo.
		boolean evaluacion, equilatero, isosceles;
		
		evaluacion = (lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1;
		equilatero = (lado1 == lado2) && (lado2 == lado3);
		isosceles = (lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3);

		// Condiciones para imprimir cada tipo de triángulo en base a los lados leídos.
		if (evaluacion != true) {
			System.out.println("El triángulo no es válido.");
		} else {
			if (equilatero == true) {
				System.out.println("El triángulo es válido y es equilátero.");
			} else if (isosceles == true) {
				System.out.println("El triángulo es válido y es isósceles.");
			} else {
				System.out.println("El triángulo es válido y escaleno");
			}
		}
	}
}