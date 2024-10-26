import java.util.Scanner;

public class principal {

	// Informações do desenvolvedor
	public static void informacoes_desenvolvedor() {
		System.out.println("Nome do desenvolvedor: Fabio Reis");
		System.out.println("Empresa: SENAI Mogi das Cruzes");
	}

	// informaçoes do curso
	public static void informacoes_curso() {
		System.out.println("Nome do curso: Programacao em JAVA");
		System.out.println("Carga horaria 80h");
	}

	public static void main(String[] args) {

		// Exibindo as informações do desenvolvedor

		// informacoes_desenvolvedor();

		// Exibindo informaçoes dos curso
		// informacoes_curso();
//vereficar o encerramento do programa
		int opcao;
		Scanner entrada1 = new Scanner(System.in);

		while (true) {
			informacoes_desenvolvedor();
			informacoes_curso();
			System.out.println("Deseja encerrar o programa");
			System.out.println("Digite 1 para sim");
			opcao = entrada1.nextInt();
			if (opcao == 1) {
				break;
			}

		} // while

	}

}
