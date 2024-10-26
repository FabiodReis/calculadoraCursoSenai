import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*
		 *  Faça um porograma que peça login e senha ao usuario
		 *  enquanto o usuario não digitar a senha corretamente,
		 *  o programa deve continuar pedindo a senha,
		 *  quando o usuario acertar o login e senha, exibir
		 *  mensagem "Acesso ao sistema concedido"
		 *  Login --> Admin, Senha --> 1234
		 */

		String login = "";
		String senha = "";
		
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		while(!login.equals("Admin") || !senha.equals("1234") ) {
			System.out.println("Digite o seu login: ");
			login = entrada1.nextLine();
			System.out.println("Digite a sua senha: ");
			senha = entrada2.nextLine();
		}
		
		System.out.println("Acesso ao sistema concedido");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
