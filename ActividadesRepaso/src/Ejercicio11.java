import java.util.Scanner;

public class Ejercicio11 {
	public static String entredos(int x, int y) {
		for (int i = x; i <= y; i++) {
			System.out.println(i);
		}
		return"";
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("Introduce un número.");
		x = leer.nextInt();
		System.out.println("Introduce otro número.");
		y = leer.nextInt();
		System.out.println(entredos(x,y));
		leer.close();
	}

}
