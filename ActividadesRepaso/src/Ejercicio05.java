import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int x = 0, pares = 0, impares = 0, sumapares = 0, sumaimpares = 0;
		System.out.println("Introduce un número.");
		x = leer.nextInt();
		while (x != 0) {
			if (x % 2 == 0) {
				pares++;
				sumapares += x;
			} else {
				impares++;
				sumaimpares +=x;
			}
			System.out.println("Introduce otro número.");
			x = leer.nextInt();
		}
		System.out.println("Has introducido " + pares + " número pares, que suman: " + sumapares);
		System.out.println("Has introducido " + impares + " número impares, que suman: " + sumaimpares);
		leer.close();
	}

}
