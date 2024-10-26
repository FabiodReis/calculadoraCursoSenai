import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		int senha;
		String usuario;

		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		System.out.println("Digite o nome de usuario: ");
		usuario = entrada1.nextLine();

		System.out.println("Digite a senha do usuario: ");
		senha = entrada2.nextInt();

		if (usuario.equals("Administrador") && senha == 1234) {
			System.out.println("Acesso" + " ao sistema ");
		} // if

		else {
			System.out.println("Acesso negado, usuario ou senha incorreto");
		} // else

		// detalhe: texto se compara utilizando "equals"

		// Verificacao duas etapas
		if (usuario.equals("Administrador")) {
		}

		if (senha == 1234) {
			System.out.println("Acesso ao sistema");
		} else {
			System.out.println("Acesso negado, senha incorreta");
		}

	}

}
