import java.util.Scanner;

public class MenuOpciones {
	
	public static String conversorDecimal(int numDecimal) {
		/*
		 * Este método convierte el número decimal a binario. 
		 * Primero obtiene los números que forman el binario mediante una serie de divisiones,
		 * para después invertir el orden de los números y así imprimir el binario correcto.
		 */
		String numBinario, numBinario2;
		int numDecimal2 = 0;
		numDecimal2 = numDecimal;
		numBinario = "";
		numBinario2 = "";
		while (numDecimal2/2 != 1) {
			numBinario2 += String.valueOf(numDecimal2%2);
			numDecimal2 /= 2;
		}
		numBinario2 += String.valueOf(numDecimal2%2);
		numBinario2 += String.valueOf(numDecimal2/2);
		
		for (int i = numBinario2.length()-1; i>= 0; i--)
			numBinario += numBinario2.charAt(i);
		
		return "El número " + numDecimal + " en binario es: " + numBinario;
	}
	
	public static String calculadora(double num1, double num2, String operador) {
		double resultado = 0;
		//Switch con opciones según operador para la calculadora.
		switch(operador) {
		case "+":
			resultado = (num1 + num2);
			break;
		case "-":
			resultado = (num1 - num2);
			break;
		case "*":
			resultado = (num1 * num2);
			break;
		case "/":
			resultado = (num1 / num2);
			break;
		case "%":
			resultado = (num1 % num2);
			break;
		default:
			break;
		}
		return num1 + " " + operador + " " + num2 + " = " + resultado;
	}
	
	public static String analizadorFrase(String palabraLeida) {
		String consonantes = "";
		String vocales = "";
		int numeroLetras = palabraLeida.length();
		char x = ' ';
		//Bucle for para analizar la palabra introducida y extraer vocales y consonantes en base a su valor ASCII.
		for (int i = 0; i < numeroLetras; i++) {
            x = palabraLeida.charAt(i);

            if ((x == 97) || (x == 111) || (x==101) || (x==105) || (x==117)) {
            	vocales+=x;
            } else {
                consonantes+=x;
            }
        }
		
		return palabraLeida + "     " + consonantes + "     " + vocales + "     " + numeroLetras ;
	}
	
	public static void main(String[] args) {
		int opcion = 0;
		Scanner leer = new Scanner(System.in);
		
		while (!(opcion >= 4)) {
			System.out.println("*********** MENU ***********");
			System.out.println("----------------------------");
			System.out.println("1. Conversor decimal-binario");
			System.out.println("2. Calculadora");
			System.out.println("3. Analizador de frase");
			System.out.println("4. Salir");
			System.out.println(" ");
			System.out.println("Introduce una opción: ");
			
			opcion = leer.nextInt();
			//Switch para elegir entre las opciones del menú.
			switch(opcion) {
			case 1:
				int numDecimal = 0;
				System.out.println("Introduce un numero decimal");
				numDecimal = leer.nextInt();
				System.out.println(conversorDecimal(numDecimal));
				break;
			case 2:
				double num1 = 0, num2 = 0;
				String operador = "";
				System.out.println("Introduce el primer número.");
				num1 = leer.nextInt();
				System.out.println("Introduce el segundo número.");
				num2 = leer.nextInt();
				System.out.println("Introduce un operador (+,-,*,/,%)");
				operador = leer.next();
				System.out.println(calculadora(num1, num2, operador));
				break;
			case 3:
				String palabraLeida = " ";
				System.out.println("Introduce una palabra: ");
				palabraLeida = leer.next();
				System.out.println("PALABRA     CONSONANTES     VOCALES     LONGITUD");
				System.out.println("------------------------------------------------");
				System.out.println(analizadorFrase(palabraLeida));
				break;
			case 4:
				System.out.println("Adiós");
				break;
			default:
				System.out.println("Introduce una opción válida.");
			}
		}
		leer.close();
	}

}
