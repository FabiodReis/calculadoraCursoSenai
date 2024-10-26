import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Maior e Menor

		int numero1, numero2;

		// Pedir para o usuario digitar dois numero
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2 = entrada2.nextInt();

		if (numero1 > numero2) {
			System.out.println("o numero" + numero1 + " Eh maior que" + numero2);
		} // if

		if (numero2 > numero1) {
			System.out.println("O numero 2 eh " + numero2 + " Eh maior que " + numero1);
		}

		if (numero1 == numero2) {
			System.out.println("Os numero " + "e" + numero2 + " Sao iguais");
		}

	}

}
