import java.util.Scanner;

public class Ejercicio03A {
// Igual que el 3 normal pero metiendo nosotros los números por consola.
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int leido = 0;
		int producto = 1;
		int contadorimp = 0;
		while (contadorimp != 10) {
			System.out.println("Introduce otro número, llevas " + contadorimp + " números impares.");
			leido = leer.nextInt();
			if (leido % 2 != 0) {
				contadorimp++;
				producto *= leido;
			}
		}
		System.out.println(producto);
		leer.close();
	}

}
