import java.util.Scanner;

public class Ejercicio08 {
	public static String nVeces(int x) {
		for (int i = 0; i < x; i++) {
			System.out.println("Módulo ejecutádose.");
		}
		return "";
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int x = 0;
		System.out.println("Introduce un número.");
		x = leer.nextInt();
		System.out.println(nVeces(x));
		leer.close();
		

	}

}
