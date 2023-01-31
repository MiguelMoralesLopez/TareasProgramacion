
public class Ejercicio04OperadoresMatematicos {

	public static void main(String[] args) {
		int num1 = 7, num2 = 15, resultado = 0;
		double resultado2 = 0;
		
		resultado = num1 + num2;
		System.out.println("El resultado es " + resultado);
		System.out.println("resultado es " + (num1 + num2));
		
		resultado = num2 / num1;
		System.out.println("division: " + resultado);
		resultado2 = num2 / num1;
		System.out.println(resultado2);
		
		System.out.println(num1 < num2 && resultado > 0);

	}

}
