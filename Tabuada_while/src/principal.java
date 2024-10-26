import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//

		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("Digite o numero: ");
		numero = entrada.nextInt();

		System.out.println("A tabuada eh: " + numero);
		int numtab = 1;
		while (numtab < 11) {
			int resultado = numero * numtab;
			System.out.println(numero + " x " + numtab + " = " + resultado);
			numtab++;
		}

	}

}
