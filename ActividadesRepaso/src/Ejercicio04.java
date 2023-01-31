import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double x = 0;
		System.out.println("Introduce un número");
		x = leer.nextDouble();
		while (x > 0) {
			double cuadrado = Math.pow(x, 2);
			System.out.println(cuadrado);
			System.out.println("Introduce otro número, el programa finaliza si es un número negativo.");
			x = leer.nextDouble();
			
		}
		
		leer.close();
	}

}
