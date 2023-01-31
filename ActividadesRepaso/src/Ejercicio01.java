import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int dd, mm, yyyy = 0;
		System.out.println("Introduce un día.");
		dd = leer.nextInt();
		System.out.println("Introduce un mes.");
		mm = leer.nextInt();
		System.out.println("Introduce un año.");
		yyyy = leer.nextInt();
		System.out.println("La fecha introducida es: " + dd + "-" + mm + "-" + yyyy);
		
		boolean mes30, mes31, mes28, mes29, abis, mes;
		mes = mm <= 12;
		mes30 = dd <= 30 && (mm == 4 || mm == 6 || mm == 9 || mm == 11);
		mes31 = dd <= 31 && (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 ||mm == 10 ||mm == 12);
		mes28 = dd <= 28 && mm == 2;
		abis = (yyyy % 4 == 0) && ((yyyy % 100 != 0) || (yyyy % 400 == 0));
		mes29 = dd <= 29 && mm == 2 && abis;
		
		boolean annook = mes && (mes30 || mes31 || mes28 || mes29);
		
		if (annook) {
			System.out.println("Año correcto.");
		} else {
			System.out.println("Año incorrecto.");
		}
		leer.close();
	}

}
