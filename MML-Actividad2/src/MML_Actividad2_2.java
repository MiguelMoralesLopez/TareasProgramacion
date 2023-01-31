import java.util.Scanner;

public class MML_Actividad2_2 {

	public static void main(String[] args) {
		
		// Se definen las variables y se genera el número aleatorio.
		double numRandom = Math.random() * 40 + 1;
		int numLeido = 0;
		int intento = 0;
		
		System.out.println("Se ha generado un número entre 1 y 40, a ver cuántos intentos necesitas para adivinarlo...");
		
		// Se crea el método Scanner para poder leer los número introducidos.
		Scanner leer = new Scanner(System.in);

		// Bucle para contabilizar el número de intentos del usuario.
		do {
			numLeido = leer.nextInt();
			if (numLeido != (int) numRandom) {
				if (numLeido < numRandom) {
					System.out.println("El número introducido es menor al que tienes que adivinar.");
				} else {
					System.out.println("El número introducido es mayor al que tienes que adivinar.");
				}
			} else {
				System.out.println("¡Enhorabuena has acertado!");
				System.out.println("Número de intentos: " + intento);
			}
			intento = intento + 1;
		} while (numLeido != (int) numRandom);
		leer.close();
	}
}
