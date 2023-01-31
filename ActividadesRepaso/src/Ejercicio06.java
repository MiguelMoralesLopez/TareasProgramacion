import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int hh = 0;
		int mm = 0;
		int ss = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce una hora de 0 a 23.");
		hh = leer.nextInt();
		System.out.println("Introduce un minuto de 0 a 59.");
		mm = leer.nextInt();
		System.out.println("Introduce un segundo de 0 a 59.");
		ss = leer.nextInt();
		System.out.println("La hora es " + hh + ":" + mm + ":" + ss);
		
		ss += 1;
		
		if (ss > 59) {
			mm += 1;
			ss = 0;
		}
		if (mm > 59) {
			hh += 1;
			mm = 0;
		}
		if (hh > 23) {
			hh = 0;
		}
		System.out.println("La hora, un segundo después es " + hh + ":" + mm + ":" + ss);
		leer.close();
	}

}
