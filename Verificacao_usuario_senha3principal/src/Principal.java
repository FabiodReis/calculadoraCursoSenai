import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Verificar usuario e senha no estilo netflix Administrador --> 9876 Operador
		 * --> 1234
		 */
		int senha;
		String usuario;
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite o usuario: ");
		usuario = entrada1.nextLine();
		System.out.println("Digite senha: ");
		senha = entrada2.nextInt();

		if (usuario.equals("Administrador") && senha == 9876) {
			System.out.println("Acesso ao sistema, usuario master");
		} else if (usuario.equals("Controlador") && senha == 1234) {
			System.out.println("Acesso ao sistema");
		} else {
			System.out.println("Acesso negado");
		}

	}

}
