import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		int idade;
		int crianca;
		int adolescente;
		int adulto;
		int idosa;

		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		idade = entrada1.nextInt();

		System.out.println("Voce eh: ");

		if (idade <= 13) {
			System.out.println("crianca");
		}
		if (idade > 13 && (idade < 20)) {
			;
		System.out.println("Adolescente");}

		if (idade >= 20 && (idade <= 60)) {
			System.out.println("Adulto");
		}

		if (idade > 60) {
			System.out.println("Idosa");
		}

	}

}
