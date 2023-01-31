import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int x = 0;
		System.out.println("Introduce un número.");
		x = leer.nextInt();
		String numero = String.valueOf(x);
		int cifras = numero.length();
		System.out.println("El número " + x + " tiene " + cifras + " cifras.");
		leer.close();
		
		

	}

}
