import java.util.Scanner;

public class Ejercicio09 {
	
	public static int maximo(int x, int y) {
		int z = 0;
		if (x > y) {
			z = x;
		} else {
			z = y;
		}
		return z;
	}
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("Introduce un número.");
		x = leer.nextInt();
		System.out.println("Introduce otro número");
		y = leer.nextInt();
		System.out.println("El máximo es: " + maximo(x,y));
		leer.close();
		

	}

}
