
public class pruebaWhile {

	public static void main(String[] args) {
		String apellidos = "Ejemplo Test";
		String primerApellido = "";
		int numLetras = apellidos.length();
		int x = 0;
		while (numLetras != x) {
			char y = apellidos.charAt(x);
			if (y != 32) {
				primerApellido += y;
				x++;
			} else {
				x = numLetras;
			}
		}
		System.out.println(primerApellido.toLowerCase());
		
	}

}
