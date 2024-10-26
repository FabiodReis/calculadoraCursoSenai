import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*
		 * verficação usuario e senha Controlador, Operador --> 1234
		 */
		int senha;
		String usuario;

		// Verificação em duas etapas

		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		System.out.println("Digite o usuario");
		usuario = entrada1.nextLine();

		// vereficando o usuario

		if (usuario.equals("Controlador") || usuario.equals("Operador")) {
			System.out.println("Digite a senha: ");
			senha = entrada2.nextInt();
			if (senha == 1234) {
				System.out.println("Acesso ao sistema");
			} else {
				System.out.println("acesso negado, senha incorreta");
			}
		} // if

		else {
			System.out.println("Usuario Incorreto");
		} // else

	}

}
