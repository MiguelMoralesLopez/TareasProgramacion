import java.util.Scanner;

public class Ejercicio10 {
	public static int maximo3(int x, int y, int z) {
		int a = 0;
		if (x > y && x > z) {
			a = x;
		} else if (y > x && y > z) {
			a = y;
		} else {
			a = z;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		System.out.println("Introduce un número.");
		x = leer.nextInt();
		System.out.println("Introduce otro número.");
		y = leer.nextInt();
		System.out.println("Introduce un último número.");
		z = leer.nextInt();
		System.out.println("El máximo es: " + maximo3(x,y,z));
		leer.close();

	}

}
