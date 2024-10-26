import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//

		int media;
		;
		int nota1;
		int nota2;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		while (true) {

			System.out.println("Digite a primeira nota: ");
			nota1 = entrada1.nextInt();
			if (nota1 >= 0 && nota1 <= 10) {
				System.out.println("");
			} else {
				System.out.println("Erro");
			}

			System.out.println("Digite a segunda nota: ");
			nota2 = entrada2.nextInt();
			if (nota2 >= 0 && nota2 <= 10) {

				media = (nota1 + nota2) / 2;
				System.out.println("A media eh: " + media);
				break;

			} // if

			else {
				System.out.println("Erro");

			}
		} // while

	}

}
