
public class EjemplosTemario {

	public static void main(String[] args) {
		int c=0;
		int sw=-1;
		do {
			c=c+1;
			sw=-sw;
			if (sw==1) {
				System.out.println("Hola");
			}
			else {
				System.out.println("Adiós");
			}
		}
		while (c<10);
	}

}
