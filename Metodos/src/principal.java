import java.util.Scanner;

public class principal {
	public static void somar() {
		// pedir dois numeros para o usuario e
		// ebibir a soma dos numeros

		int num1, num2;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		System.out.println("Digite o Primeiro numero: ");
		num1 = entrada1.nextInt();

		System.out.println(" digite o Segundo numero");
		num2 = entrada2.nextInt();
		System.out.println(" A soma de " + (num1 + "+" + "" + num2) + " = " + (num1 + num2));

	}

	public static void Subtrair() {

		int num1, num2;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		System.out.println("Digite o Primeiro numero: ");
		num1 = entrada1.nextInt();

		System.out.println(" digite o Segundo numero");
		num2 = entrada2.nextInt();
		System.out.println(" A subtracao de " + (num1 + "-" + "" + num2) + " = " + (num1 - num2));

	}

	public static void Multiplicar() {

		int num1, num2;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		System.out.println("Digite o Primeiro numero: ");
		num1 = entrada1.nextInt();

		System.out.println(" digite o Segundo numero");
		num2 = entrada2.nextInt();
		System.out.println(" A multiplicacao de " + (num1 + "x" + "" + num2) + " = " + (num1 * num2));

	}

	public static void Dividir() {
		int num1, num2;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		System.out.println("Digite o Primeiro numero: ");
		num1 = entrada1.nextInt();

		System.out.println(" digite o Segundo numero");
		num2 = entrada2.nextInt();
		System.out.println(" A divisao de " + (num1 + "/" + "" + num2) + " = " + (num1 / num2));

	}

	public static void calcauladora() {

	}

	public static void main(String[] args) {
		// Calculadora
		System.out.println("Calculadora SENAI - Java");
		System.out.println("-------------------------------");

		int opcao;
		Scanner entrada1 = new Scanner(System.in);
		while (true) {
			System.out.println("Digite sua opcao para calculo ou \" 0 \"  para sair \n");
			System.out.println(
					"1-  para Somar \n" + "2- para Subtrair \n" + "3- para Multiplicar \n" + "4- para Dividir \n");
			opcao = entrada1.nextInt();

			switch (opcao) {

			case 1:
				somar();
				break;

			case 2:
				Subtrair();

			case 3:
				Multiplicar();

				break;

			case 4:
				Dividir();

				break;

			default:
				System.out.println(" Fechando calculadora");
			}

			break;

		} // while

	}

}
