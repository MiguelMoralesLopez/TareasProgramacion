import java.util.Scanner;

public class Ejercicio05LeerDatosConsola {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int lado1 = 0, lado2 = 0, lado3 = 0;
		System.out.println("Teclea tres numeros");
		
		lado1 = leer.nextInt();
		lado2 = leer.nextInt();
		lado3 = leer.nextInt();
		
		leer.close();
		
		System.out.println("Los numeros leídos son " + lado1 + ", " + lado2 + " y " + lado3);
		
		
		/*
		 * para el equilatero lado1 = lado2 && lado2 = lado3
		 * para el isosceles lado1 = lado2 || lado1 = lado3 || lado2 = lado3
		 * para escaleno lado1 != lado 2 && lado1 != lado3 && lado2 != lado3
		 */
		

	}

}
