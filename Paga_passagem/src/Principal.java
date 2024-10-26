import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int idade_passageiro;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade_passageiro = entrada.nextInt();

		if (idade_passageiro < 6) {
			System.out.println("Usuario nao paga");
		} else if (idade_passageiro > 59) {
			System.out.println("Usuario nao paga");
		}

		else {
			System.out.println("Usuario paga");
		}

	}

}
